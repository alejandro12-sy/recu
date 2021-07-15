/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author SERGESAN PCS2021
 */
public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@3.235.192.74:1521:ORCL";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String USER = "CAPCITACION";
    private static final String PASS = "123456";
    private static Connection cx = null;
    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO: handle exception
            System.out.println("Error: " + e);
        }

        return cx;
    }

    public void desconectar() {
        try {

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    
}
