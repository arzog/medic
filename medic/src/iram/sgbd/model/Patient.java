package iram.sgbd.model;

public class Patient {
    private int niss;
    private String nom;
    private String prénom;

    public Patient(int niss, String nom, String prénom) {
        this.niss = niss;
        this.nom = nom;
        this.prénom = prénom;
    }

    public int getNiss() {return niss;}
    public String getNom() {return nom;}
    public String getPrénom() {return prénom;}

    public void setNom(String nom) {this.nom = nom;}
    public void setPrénom(String prénom) {this.prénom = prénom;}
}
