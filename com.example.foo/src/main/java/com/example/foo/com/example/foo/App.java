package com.example.foo.com.example.foo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.reasoner.InferenceType;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.InferredAxiomGenerator;
import org.semanticweb.owlapi.util.InferredEquivalentClassAxiomGenerator;
import org.semanticweb.owlapi.util.InferredOntologyGenerator;
import org.semanticweb.owlapi.util.InferredSubClassAxiomGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws OWLOntologyStorageException,
	OWLOntologyCreationException {
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		
		File file = new File("d:\\Users\\admin\\Desktop\\cours\\ptut\\HCO.owl");
		
		OWLOntology o = man.loadOntologyFromOntologyDocument(file);
		
		System.out.println(o);
}

    
    
}
