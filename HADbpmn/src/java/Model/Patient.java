package Model;

import java.util.ArrayList;
import java.util.Date;

public class Patient {
    
    private String hasName;
    private String hasFirstName;
    private Sexe hasSex;
    private Date hasBirth;
    private String hasPlaceOfBirth;
    private int hasSocialSecurityNumber;
    private String hasReferenceNumberID;
    private String hasAdress;
    private int hasPhoneNumber;
    private String hasEmail;
    private MaritalStatus hasMaritalStatus; 
    private Boolean isInternet;
    private int hasWeight;
    private int hasSize;
    private Boolean isValide;
    private String hasAllergies;
    private ArrayList<Pathology> hasDisease;
    private String hasPrevious;
    private Boolean hasValideFamily;
    private Boolean isAccesiblePlace;
    private String hasInformation;

    public Patient(String name, String firstName, Sexe sexe, Date birth, String placeBirth, int socialSecurityNumber, String ipp, String adress, int phoneNumber, MaritalStatus maritalStatus, String email, Boolean isInternet, int weight, int size, Boolean isValide, String allergies, ArrayList<Pathology> pathology, String antecedents, Boolean validEntourage, Boolean placeAccesible, String notes) {
        this.hasName = name;
        this.hasFirstName = firstName;
        this.hasSex = sexe;
        this.hasBirth = birth;
        this.hasPlaceOfBirth = placeBirth;
        this.hasSocialSecurityNumber = socialSecurityNumber;
        this.hasReferenceNumberID = ipp;
        this.hasAdress = adress;
        this.hasPhoneNumber = phoneNumber;
        this.hasEmail = email;
        this.isInternet = isInternet;
        this.hasWeight = weight;
        this.hasSize = size;
        this.isValide = isValide;
        this.hasAllergies = allergies;
        this.hasDisease = pathology;
        this.hasPrevious = antecedents;
        this.hasValideFamily = validEntourage;
        this.isAccesiblePlace = placeAccesible;
        this.hasInformation = notes;
    }

    public String getName() {
        return hasName;
    }

    public void setName(String name) {
        this.hasName = name;
    }

    public String getFirstName() {
        return hasFirstName;
    }

    public void setFirstName(String firstName) {
        this.hasFirstName = firstName;
    }
    
    public Sexe getSexe() {
        return hasSex;
    }

    public void setSexe(Sexe sexe) {
        this.hasSex = sexe;
    }

    public Date getBirth() {
        return hasBirth;
    }

    public void setBirth(Date birth) {
        this.hasBirth = birth;
    }

    public String getPlaceBirth() {
        return hasPlaceOfBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.hasPlaceOfBirth = placeBirth;
    }

    public int getSocialSecurityNumber() {
        return hasSocialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.hasSocialSecurityNumber = socialSecurityNumber;
    }

    public String getIpp() {
        return hasReferenceNumberID;
    }

    public void setIpp(String ipp) {
        this.hasReferenceNumberID = ipp;
    }

    public String getAdress() {
        return hasAdress;
    }

    public void setAdress(String adress) {
        this.hasAdress = adress;
    }

    public int getPhoneNumber() {
        return hasPhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.hasPhoneNumber = phoneNumber;
    }
    
    
    public MaritalStatus getMaritalStatus() {
        return hasMaritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.hasMaritalStatus = maritalStatus;
    }

    public String getEmail() {
        return hasEmail;
    }

    public void setEmail(String email) {
        this.hasEmail = email;
    }

    public Boolean getIsInternet() {
        return isInternet;
    }

    public void setIsInternet(Boolean isInternet) {
        this.isInternet = isInternet;
    }

    public int getWeight() {
        return hasWeight;
    }

    public void setWeight(int weight) {
        this.hasWeight = weight;
    }

    public int getSize() {
        return hasSize;
    }

    public void setSize(int size) {
        this.hasSize = size;
    }

    public Boolean getIsValide() {
        return isValide;
    }

    public void setIsValide(Boolean isValide) {
        this.isValide = isValide;
    }

    public String getAllergies() {
        return hasAllergies;
    }

    public void setAllergies(String allergies) {
        this.hasAllergies = allergies;
    }

    public ArrayList<Pathology> getPathology() {
        return hasDisease;
    }

    public void setPathology(ArrayList<Pathology> pathology) {
        this.hasDisease = pathology;
    }

    public String getAntecedents() {
        return hasPrevious;
    }

    public void setAntecedents(String antecedents) {
        this.hasPrevious = antecedents;
    }

    public Boolean getValidEntourage() {
        return hasValideFamily;
    }

    public void setValidEntourage(Boolean validEntourage) {
        this.hasValideFamily = validEntourage;
    }

    public Boolean getPlaceAccesible() {
        return isAccesiblePlace;
    }

    public void setPlaceAccesible(Boolean placeAccesible) {
        this.isAccesiblePlace = placeAccesible;
    }

    public String getNotes() {
        return hasInformation;
    }

    public void setNotes(String notes) {
        this.hasInformation = notes;
    }
    
}
