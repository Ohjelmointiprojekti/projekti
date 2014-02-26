/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tietokanta;

import java.sql.*;
import java.util.*;

/**
 *
 * @author s1100928
 */
public class Tietokantayhteys {

    public static void main(String[] args) throws SQLException {
        new Avaayhteystietokantaan();
    }

    private static class Avaayhteystietokantaan {

        public Avaayhteystietokantaan() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/ohjelmointiprojekti";
            Properties prop = new Properties();

            prop.setProperty("user", "root");
            prop.setProperty("password", "");
            Driver d = new com.mysql.jdbc.Driver();
            Connection con = d.connect(url, prop);
            if (con == null) {
                System.out.println("connection failed");
                return;
            }
            PreparedStatement testkysely = con.prepareStatement("select * from asiakas");
            ResultSet testtulos = testkysely.executeQuery();

            DatabaseMetaData dm = con.getMetaData();
            String dbversion = dm.getDatabaseProductVersion();
            String dbname = dm.getDatabaseProductName();
            System.out.println("name:" + dbname);
            System.out.println("version:" + dbversion);

            while (testtulos.next()) {
                int henkiloId = testtulos.getInt(1);
                String etunimi = testtulos.getString(2);
                String sukunimi = testtulos.getString(3);
                int syntymavuosi = testtulos.getInt(4);
                System.out.println("asiakasID: " + henkiloId + " Etunimi: " + etunimi + " Sukunimi: " + sukunimi
                        + " Ikä: " + syntymavuosi);
            }
            testtulos.close();
            testkysely.close();
            con.close();
        }
    }
}
