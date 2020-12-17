package iram.sgbd.patterns.sinlgeton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {

    private String url = "jdbc:mysql://localhost:3306/medic?autoReconnect=true&useSSL=false";
    private String user = "phpMyAdmin";
    private String pswd = "";
    private static Connection conn;

    private volatile static DBConnexion single;

    private DBConnexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pswd);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("erreur lors de l'initialisation de la connexion");
        }
    }

    public static Connection getInstance(){
        if(single==null){
            synchronized (Connection.class){
                if(single==null){
                    single = new DBConnexion();
                }
            }
        }
        return conn;
    }
}
