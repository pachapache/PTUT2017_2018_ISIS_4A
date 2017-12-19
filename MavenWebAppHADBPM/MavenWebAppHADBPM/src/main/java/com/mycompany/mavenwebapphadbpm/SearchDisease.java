/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenwebapphadbpm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

public class SearchDisease extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // JSON File Creation     
        int cpt = 1;
        //String diseases = "{";
        String json = "{\n" +
                "    \"diseases\": [\n";
        
        // Intialisation
        //File file = new File("//home//lexr//Documents//4A//S1//PTUT//HCO.owl"); //Alexandre
        File file = new File("C:\\Users\\Pauline\\Dropbox\\Ontoflow\\CodeSabrina\\Ontologies\\HCBPMNOntology\\HCO.owl");

        Ontology onto = new Ontology(file);
        OWLReasoner reasoner = onto.useReasoner(onto.getOntology());
        
        ArrayList<String> diseaseList = onto.getPatientInOntology(reasoner, "Disease");
        
        for (String disease : diseaseList) {
            
            json += "{\"id\": \"" + cpt + "\",";
            json +="        \"name\": \""+ disease +"\"\n}";
            if (!(cpt == diseaseList.size()))
                    json+=",";
            cpt++;
        }
        // Close the json file
        json += "      ]\n" +
                "}";
        //patients += "}";
        System.out.println(json);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println(json);
            
        }
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
