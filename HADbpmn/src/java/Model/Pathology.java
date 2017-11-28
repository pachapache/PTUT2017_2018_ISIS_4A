package Model;

import java.util.ArrayList;


public class Pathology {
    private String name;
    private ArrayList<Intervention> interventions;
    
    public Pathology(String name, ArrayList<Intervention> interventions) {
        this.name = name;
        this.interventions = interventions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Intervention> getInterventions() {
        return interventions;
    }

    public void setInterventions(ArrayList<Intervention> interventions) {
        this.interventions = interventions;
    }
    
    
    
}
