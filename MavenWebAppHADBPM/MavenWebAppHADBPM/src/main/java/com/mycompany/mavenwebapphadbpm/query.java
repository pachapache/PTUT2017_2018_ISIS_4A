package com.mycompany.mavenwebapphadbpm;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxEditorParser;
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.ParserException;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.util.BidirectionalShortFormProvider;
import org.semanticweb.owlapi.util.BidirectionalShortFormProviderAdapter;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

public class query {

    public void query() throws Exception {

    }

    public static void main(String[] args) throws Exception {

        query b = new query();

        // Look for the diseases of a patient
        String patientDisease = "isDiseaseOfPatient value Joelle";

        // Retrieve the patients that have a specified disease
        String disease4patients = "hasDisease value Undernutrition";

        
        // Ces deux requêtes permettent d'obtenir les durées pour les actions
        // Liste des Fréquences (instances) pour la maladie sélectionnée
        String frequenceActions = "isFrequencyDiseaseForAction value VesicularPeritonitis";
        // Une fois ce résultat obtenu il faut faire le traitement suivant
        String frequences = "isFrequencyOfAction value "; // Permet d'obtenir l fréquence d'action

        
        
        // liste les actions (instances) pour la maladie sélectionnée
        String listeActions = "isInvolvedToCareDisease value VesicularPeritonitis";
        // Une fois le résultat obtenu, il faut faire le traitement suivant
        String rs = "isFrequencyActionForDisease value";
        // Puis 
        String fin = "isFrequencyOfAction value";

        // Affiche les informations
        b.DLQuery(patientDisease); // TEST
       /* b.DLQuery(disease4patients); //TEST
        
        b.DLQuery(patientDisease);
        */
        
//        b.DLQuery(actionFrequences); // Affiche les informations pour la vesicularPeritonitis
//        b.DLQuery(actions);
//        b.DLQuery(actions2);
//        b.DLQuery(rs);
//        b.DLQuery(fin);

        //query a = new query();
        
        // 1 - Exécuter la première requête
        // Sur les résultats faire une requête
        
        
        
        
        
    }
    
    
    public void listeActions(String rq, query b) throws OWLOntologyCreationException {
        // Exécute la requête
        b.DLQuery(rq);
        
        
    }
    
    

    void DLQuery(String query) throws OWLOntologyCreationException {
        OWLOntologyManager om = OWLManager.createOWLOntologyManager();

        File file = new File("//home//lexr//Documents//4A//S1//PTUT//HCO.owl");

        OWLOntology pressInnovOntology = om.loadOntologyFromOntologyDocument(file);

        OWLReasoner reasoner = new Reasoner.ReasonerFactory().createReasoner(pressInnovOntology);
        ShortFormProvider shortFormProvider = new SimpleShortFormProvider();
        DLQueryPrinter dlQueryPrinter = new DLQueryPrinter(new DLQueryEngine(reasoner, shortFormProvider), shortFormProvider);
        dlQueryPrinter.askQuery(query);
        
        
        dlQueryPrinter.ask(query);
        
        

    }

    
    class DLQueryEngine {

        private final OWLReasoner reasoner;
        private final DLQueryParser parser;

        public DLQueryEngine(OWLReasoner reasoner, ShortFormProvider shortFormProvider) {
            this.reasoner = reasoner;
            parser = new DLQueryParser(reasoner.getRootOntology(), shortFormProvider);
        }

        public Set<OWLClass> getSuperClasses(String classExpressionString, boolean direct) {
            if (classExpressionString.trim().length() == 0) {
                return Collections.emptySet();
            }
            OWLClassExpression classExpression = parser
                    .parseClassExpression(classExpressionString);
            NodeSet<OWLClass> superClasses = reasoner
                    .getSuperClasses(classExpression, direct);
            return superClasses.getFlattened();
        }

        public Set<OWLClass> getEquivalentClasses(String classExpressionString) {
            if (classExpressionString.trim().length() == 0) {
                return Collections.emptySet();
            }
            OWLClassExpression classExpression = parser
                    .parseClassExpression(classExpressionString);
            Node<OWLClass> equivalentClasses = reasoner.getEquivalentClasses(classExpression);
            Set<OWLClass> result = null;
            if (classExpression.isAnonymous()) {
                result = equivalentClasses.getEntities();
            } else {
                result = equivalentClasses.getEntitiesMinus(classExpression.asOWLClass());
            }
            return result;
        }

        public Set<OWLClass> getSubClasses(String classExpressionString, boolean direct) {
            if (classExpressionString.trim().length() == 0) {
                return Collections.emptySet();
            }
            OWLClassExpression classExpression = parser
                    .parseClassExpression(classExpressionString);
            NodeSet<OWLClass> subClasses = reasoner.getSubClasses(classExpression, direct);
            return subClasses.getFlattened();
        }

        public Set<OWLNamedIndividual> getInstances(String classExpressionString,
                boolean direct) {
            if (classExpressionString.trim().length() == 0) {
                return Collections.emptySet();
            }
            OWLClassExpression classExpression = parser
                    .parseClassExpression(classExpressionString);
            NodeSet<OWLNamedIndividual> individuals = reasoner.getInstances(classExpression,
                    direct);
            return individuals.getFlattened();
        }
    }
    
    
    

    class DLQueryParser {

        private final OWLOntology rootOntology;
        private final BidirectionalShortFormProvider bidiShortFormProvider;

        public DLQueryParser(OWLOntology rootOntology, ShortFormProvider shortFormProvider) {
            this.rootOntology = rootOntology;
            OWLOntologyManager manager = rootOntology.getOWLOntologyManager();
            Set<OWLOntology> importsClosure = rootOntology.getImportsClosure();
            // Create a bidirectional short form provider to do the actual mapping.
            // It will generate names using the input
            // short form provider.
            bidiShortFormProvider = new BidirectionalShortFormProviderAdapter(manager,
                    importsClosure, shortFormProvider);
        }

        public OWLClassExpression parseClassExpression(String classExpressionString) {
            OWLDataFactory dataFactory = rootOntology.getOWLOntologyManager()
                    .getOWLDataFactory();
            ManchesterOWLSyntaxEditorParser parser = new ManchesterOWLSyntaxEditorParser(
                    dataFactory, classExpressionString);
            parser.setDefaultOntology(rootOntology);
            OWLEntityChecker entityChecker = new ShortFormEntityChecker(bidiShortFormProvider);
            parser.setOWLEntityChecker(entityChecker);
            return parser.parseClassExpression();
        }
    }

    
    
    
    class DLQueryPrinter {

        private final DLQueryEngine dlQueryEngine;
        private final ShortFormProvider shortFormProvider;

        public DLQueryPrinter(DLQueryEngine engine, ShortFormProvider shortFormProvider) {
            this.shortFormProvider = shortFormProvider;
            dlQueryEngine = engine;
        }

        
        
        public void askQuery(String classExpression) {
            if (classExpression.length() == 0) {
                System.out.println("No class expression specified");
            } else {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\nQUERY:   ").append(classExpression).append("\n\n");

                    Set<OWLNamedIndividual> individuals = dlQueryEngine.getInstances(
                            classExpression, true);
                    System.out.println(sb.toString());
                    for (OWLNamedIndividual i:individuals) {
                        System.out.println(i.getIRI().getRemainder().get());
                    }
                    
                } catch (ParserException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        
        
        
        
        
        
        public ArrayList<String> ask(String classExpression) {
            ArrayList<String> rs = null;
            if (classExpression.length() == 0) {
                System.out.println("No class expression specified");
            } else {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\nQUERY:   ").append(classExpression).append("\n\n");

                    Set<OWLNamedIndividual> individuals = dlQueryEngine.getInstances(
                            classExpression, true);
                    
                    for (OWLNamedIndividual i:individuals) {
                        rs.add(i.getIRI().getRemainder().get());
                    }
                    //rs = listEntities("Instances", individuals, sb);
                    System.out.println(sb.toString());
                } catch (ParserException e) {
                    System.out.println(e.getMessage());
                }
            }
            return rs;
        }
        
        
        
        
        
        


        
        
    }
}
