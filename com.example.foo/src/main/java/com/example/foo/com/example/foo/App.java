package com.example.foo.com.example.foo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map.Entry;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

/**
 * Hello world!
 *
 */
public class App {

	OWLNamedIndividual i = null;

	public static void main(String[] args)
			throws OWLOntologyStorageException, OWLOntologyCreationException, IOException {
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();

		// File file = new File("d:\\Users\\admin\\Desktop\\cours\\ptut\\HCO.owl");
		// File file = new
		// File("//home//lexr//Dropbox//Ontoflow//CodeSabrina//Ontologies//HCBPMNOntology//HCO.owl");
		File file = new File("//home//lexr//Documents//4A//S1//PTUT//HCO.owl");


		System.out.println("\t\t\tAffiche les classes du document");

		OWLClass acteur = null;	
		
		Ontology onto = new Ontology(file);
		
		OWLReasoner reasoner = onto.useReasoner(onto.getOntology());
			
		// WORKING !!!!
		
		// Retrieve all the classes of the ontology
		System.out.println("\t\t\tToutes les classes de l'ontologie");
		for (OWLClass cls : onto.getAllClasses() ){
			System.out.println(cls.getIRI().getFragment());
		}
		
		ArrayList<String> liste = onto.getPatientInOntology(reasoner, "Actor");
		// Affiche toutes les propriétés d'un patient
		System.out.println("\t\t\tListes des propriétés d'un patient (Joelle)");
		for (String patient : liste) {
			if (patient.equals("Joelle" )) {
				HashMap<String, String> propMap = onto.getIndividualProperties(reasoner, patient);
				//ArrayList<String> prop = onto.getIndividualProperties(reasoner, patient);
//				for(String p : prop) {
//					System.out.println(p);
//				}
				
				for (Entry<String, String> values:propMap.entrySet()) {
					System.out.println("Clé : " + values.getKey() + " valeur :" + values.getValue());
				}
			}
			
		}
		
		// WORKING !!!! Insert a new patient in the ontology
		Object[] objects = null;
		//onto.addPatientIndividual(objects);
		
		
		
	}

	

}