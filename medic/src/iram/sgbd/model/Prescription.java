package iram.sgbd.model;

import java.util.List;

public class Prescription {
    private int id;
    private List<Medicament> medicaments;

    public Prescription(int id, List<Medicament> medicaments) {
        this.id = id;
        this.medicaments = medicaments;
    }

    public int getId() {return id;}
    public List<Medicament> getMedicaments() {return medicaments;}

    public void setMedicaments(List<Medicament> medicaments) {this.medicaments = medicaments;}
}
