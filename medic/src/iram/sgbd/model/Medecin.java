package iram.sgbd.model;

public class Medecin {
    private int inami;
    private String nom;
    private String prenom;

    public Medecin(int inami, String nom, String prenom) {
        this.inami = inami;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getInami() {return inami;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}

    public void setNom(String nom) {this.nom = nom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
}
