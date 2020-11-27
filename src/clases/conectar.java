/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbjuzgado";
    
    public conectar (){
        conn = null; 
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection (url, user, pass);
        if (conn != null){
            System.out.println ("La conexión se estalecio bien con la DB");
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println ("Error al conectar con la BD" + e);
        }
    }
    //este metodo nos retorna la conexion 
    public Connection getConnection (){
        return conn;
    }
    
    //metodo para desconectar 
    public void desconectar (){
        conn = null;
        if (conn == null){
            System.out.println ("Se desconecto de la DB");
        }
    }
}
