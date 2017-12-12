package com.example.foo.com.example.foo;

import static org.semanticweb.owlapi.util.OWLAPIStreamUtils.asUnorderedSet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

/**
 * This class will represent the DAO of the app HADBPM
 * @author lexr
 */
public class Ontology {

	int nbIndPatient = 0;
	int nbTot = 0;
	OWLClass patient = null;
	private OWLOntology onto = null;
	private String owlIRI = "";
	private OWLOntologyManager man = null;
	
	/**
	 * Constructor
	 * @param file The ontology file
	 */
	public Ontology(File file) {
		// Create the ontology manager
		man = OWLManager.createOWLOntologyManager();
		try {
			onto = man.loadOntologyFromOntologyDocument(file);
		} catch (OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Get the IRI of the owl file
		owlIRI = onto.getOntologyID().getOntologyIRI().get().toString();
	}
	
	public OWLOntology getOntology() {
		return onto;
	}
	
	/**
	 * Create a reasoner for the ontology
	 * 
	 * @param o the ontology on wich the reasoner will compute
	 * @return The settled reasoner
	 */
	public OWLReasoner useReasoner(OWLOntology o) {

		// Call the factory to use a reasoner
		OWLReasonerFactory orf = new StructuralReasonerFactory();
		// Create the reasoner for the ontology
		OWLReasoner reasoner = orf.createReasoner(o);
		// Look for inferences in the ontology
		reasoner.precomputeInferences();

		return reasoner;

	}

	
	/**
	 * In the ontology get each individual and display for each of them the Object
	 * property value inferred by the reasoner
	 * 
	 * @param onto
	 * @param reasoner
	 */
	public void getAllIndividual(OWLReasoner reasoner) {
		onto.individualsInSignature().forEach(i -> onto.objectPropertiesInSignature().forEach(p -> {
			NodeSet<OWLNamedIndividual> individualValues = reasoner.getObjectPropertyValues(i, p);
			Set<OWLNamedIndividual> values = asUnorderedSet(individualValues.entities());
			String head = "The property values for " + p + " for individual " + i + " are: \n";
			System.out.println(head);
			for (OWLNamedIndividual ind : values) {
				String rs = "\t" + ind + "\n";
				System.out.println(rs);
			}
		}));
	}
	
	/**
	 * In the ontology get each individual and display for each of them the Data
	 * property value inferred by the reasoner
	 * 
	 * @param reasoner
	 * @throws IOException 
	 */
	public void displayAllIndividualProperties(OWLReasoner reasoner) throws IOException {
		// Create a file for the property value of an individual
		File propValue = new File("propertiesValues.txt");
		FileWriter propValueWriter = new FileWriter(propValue);

		onto.individualsInSignature().forEach(i -> onto.dataPropertiesInSignature().forEach(p -> {
			Set<OWLLiteral> individualValues = reasoner.getDataPropertyValues(i, p);
			Set<OWLLiteral> values = asUnorderedSet(individualValues.parallelStream());
			String head = "The property values for " + p + " for individual " + i + " are: \n";
			// System.out.println(head);
			try {
				propValueWriter.write(head);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (OWLLiteral ind : values) {

				String rs = "\t" + ind + "\n";
				// System.out.println(rs);
				try {
					propValueWriter.write(rs);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}));
	}
	
	/**
	 * 
	 * Display all the individual from a class
	 * 
	 * @param reasoner
	 * @param nameOfOntologyClass the Name of the ontology class in which the indivuals are
	 */
	public ArrayList<String> getPatientInOntology(OWLReasoner reasoner, String nameOfOntologyClass) {
		ArrayList<String> liste = new ArrayList<>();
		onto.classesInSignature().forEach(c -> {
			if (c.getIRI().getFragment().equals(nameOfOntologyClass)) {
				patient = c;
			}
		});
		
		// Display all the individual 
		for (OWLNamedIndividual cls : reasoner.getInstances(patient).getFlattened()) {
			//System.out.println(cls.getIRI().getFragment());
			liste.add(cls.getIRI().getFragment().toString());
		}
		
		return liste;
	}
	
	/**
	 * Get All the properties for an individual an displays the values
	 * 
	 * @param reasoner
	 *            Reasoner that will make the inferences
	 * @param individual
	 *            The String Name of the Individual
	 */
	public HashMap<String, String> getIndividualProperties(OWLReasoner reasoner, String individual) {
		HashMap<String, String> properties = new HashMap<>();
		// Test to retrieve a particular value for a particular individual (WORKING)
		onto.individualsInSignature().forEach(i -> onto.dataPropertiesInSignature().forEach(p -> {
			// Put each individual in a set
			Set<OWLLiteral> individualValues = reasoner.getDataPropertyValues(i, p);
			// Read the value corresponding to the DataProperty and put it in a set
			Set<OWLLiteral> values = asUnorderedSet(individualValues.parallelStream());
			// Display the property for the individual
			if (i.getIRI().toString().equals(owlIRI + "#" + individual)) {
				String head = "The property values for " + p + " for individual " + i + " are: \n";
				//System.out.println(head);
				for (OWLLiteral ind : values) {
					String rs = "\t" + ind + "\n";
					properties.put(p.getIRI().getFragment().toString(), ind.toString());
					//System.out.println(rs);
					//properties.add(p.getIRI().getFragment());
				}
				//System.out.println(p);
				
				
			}
		}));

		return properties;
	}
	
	/**
	 * TODO
	 * @param data the array with all the data that will be inserted in the owl document
	 */
	public void addPatientIndividual(Object[] data) {
		OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		OWLDataFactory df = OWLManager.getOWLDataFactory();

		// Actor's IRI
		OWLClass actorIRI = df.getOWLClass(IRI.create(owlIRI + "#Patient"));

		// Patient individual
		OWLIndividual patient = df.getOWLNamedIndividual(IRI.create(owlIRI + "#Richard"));
		// Disease individual
		OWLIndividual disease = df.getOWLNamedIndividual(owlIRI + "#Anaemia");
		// Create the property which is already in the owl the name of the patient to the individual
		OWLObjectProperty hasDisease = df.getOWLObjectProperty(owlIRI + "#hasDisease");
		// Link the disease to the patient
		OWLObjectPropertyAssertionAxiom axiomHasDisease = df.getOWLObjectPropertyAssertionAxiom(hasDisease, patient, disease);
		// Create the axiom
		AddAxiom addAxiomHasDesease = new AddAxiom(onto, axiomHasDisease);
	    // Apply the axiom to the ontology
	    manager.applyChange(addAxiomHasDesease);
	    
	    
	    
	    // Add data Properties to the individual
	    OWLDataProperty hasAge = df.getOWLDataProperty(IRI.create(owlIRI + "#hasAge"));
	    // Link the patient to the has Age and the value
	    OWLDataPropertyAssertionAxiom axiomHasAge = df.getOWLDataPropertyAssertionAxiom(hasAge, patient, 52);
	    AddAxiom addAxiomHasAge = new AddAxiom(onto, axiomHasAge);
	    // Apply the changes
	    manager.applyChange(addAxiomHasAge);
	    
	    
	    
	    // Save the ontology
	    try {
	    	// Create a blank file
	    	File f = new File("//home//lexr//Documents//testowl.xml");
	    	// Link the blank file to an IRI
		    IRI documentIRI = IRI.create(f);
		    // Save the new ontology
	    	manager.saveOntology(onto, new OWLXMLDocumentFormat(), documentIRI);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	
	/**
	 * Give all the OWL Classes of the document file
	 * 
	 * @return A list with all the Classes that are in the owl file
	 */
	public ArrayList<OWLClass> getAllClasses() {
		ArrayList<OWLClass> list = new ArrayList<>();
		for (OWLClass cls : onto.getClassesInSignature()) {
			list.add(cls);
		}
		return list;
	}
	
	
	

	

	
	
}
