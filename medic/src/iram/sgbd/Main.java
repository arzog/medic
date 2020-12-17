package iram.sgbd;

import iram.sgbd.patterns.sinlgeton.DBConnexion;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        //region singleton
        Connection connection = DBConnexion.getInstance();
        //endregion
    }
}
