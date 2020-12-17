package iram.sgbd.model;

import java.sql.Date;

public class Consultation {
    private int numConsult;
    private Date dateConsult;

    public Consultation(int numConsult, Date dateConsult) {
        this.numConsult = numConsult;
        this.dateConsult = dateConsult;
    }

    public int getNumConsult() {return numConsult;}
    public Date getDateConsult() {return dateConsult;}

    public void setDateConsult(Date dateConsult) {this.dateConsult = dateConsult;}
}
