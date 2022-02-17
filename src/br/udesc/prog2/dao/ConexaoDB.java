/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author joaomarcus
 */
public class ConexaoDB {

    private static Connection conexao = null;
    
    private static String url = "jdbc:mysql://localhost:3306/eccommerceDesktop";
    private static String username = "root";
    private static String password = "root";

    
    public static Connection conectar() {
        String driver=  "com.mysql.cj.jdbc.Driver";
        try {
            //Class.forName(driver);
            conexao = DriverManager.getConnection(url, username, password);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return conexao;
    }
    
        public static void desconectarDB() {
        if(conexao != null) {
            try {
                conexao.close();
            } catch(SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public static Connection getConnection() {
        if(conexao == null) {
            
            conectar();
        }
        
        return conexao;

    }
}
