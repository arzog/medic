package iram.sgbd.model;

public class Medicament {
    private int code;
    private String nom;
    private String dosage;

    public Medicament(int code, String nom, String dosage) {
        this.code = code;
        this.nom = nom;
        this.dosage = dosage;
    }

    public int getCode() {
        return code;
    }
    public String getNom() {
        return nom;
    }
    public String getDosage() {
        return dosage;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
