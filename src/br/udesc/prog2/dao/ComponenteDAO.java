/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.products.Componente;
import br.udesc.prog2.models.products.Pc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichau
 */
public class ComponenteDAO {
    
    private static void criarTabela() {
        Connection conexao = ConexaoDB.getConnection();
        System.out.println(conexao);
           String sqlCreate = "CREATE TABLE IF NOT EXISTS COMPONENTE"
                + "(nome VARCHAR(50) PRIMARY KEY,"
                + "categoria VARCHAR(50),"
                + "status VARCHAR(50),"
                + "nomePc VARCHAR(50),"  
                + "FOREIGN KEY(nomePc) REFERENCES Pc(nome))";
        
    Statement stmt = null;
        try {
            stmt = conexao.createStatement();
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean salvarComponente(Componente comp){
        Connection conexao = ConexaoDB.getConnection();
        String sql ="INSERT INTO COMPONENTE (nome, categoria, status, nomePc) VALUES(?, ?, ?, ?)";
        PreparedStatement pstmt;
        
        try{
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, comp.getNome());
            pstmt.setString(2, comp.getCategoria());
            pstmt.setString(3, comp.getStatus());
            pstmt.setString(4, comp.getPc().getNome());
            
            pstmt.execute();
            
            System.out.println("Componenete salvo com sucesso");
            return true;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    
    }
    
    public static boolean atualizarComponente(Componente comp){
        Connection conexao = ConexaoDB.getConnection();
        String sql ="UPDATE COMPONENTE SET nome=?, categoria=?, status=?, nomePc=? WHERE nome=?";
        PreparedStatement pstmt;
        
        try{
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, comp.getNome());
            pstmt.setString(2, comp.getCategoria());
            pstmt.setString(3, comp.getStatus());
            pstmt.setString(4, comp.getPc().getNome());
            pstmt.setString(5, comp.getNome());
            
            pstmt.execute();
            
            System.out.println("Componente atualizado com sucesso");
            return true;
    }   catch (SQLException e) {
           System.out.println(e.getMessage());
           return false;
        }
    }
    
    public static List<Componente> getTodosComponentes(){
        List<Componente> comps = new ArrayList<>();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "SELECT * FROM COMPONENTE";
        Statement stmt;
        
        try{
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            while(resultado.next()){
                String nome = resultado.getString("nome");
                String categoria = resultado.getString("categoria");
                String status = resultado.getString("status");
                String nomePc = resultado.getString("nomePc");
                
                Pc pc = new Pc(nomePc);
                
                Componente comp = new Componente(nome, categoria, status);
                comp.setPc(pc);
                
                ;
                
                comps.add(comp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return comps;
    }
    
     public static boolean excluirComponente(String nome){
        Connection conexao = ConexaoDB.getConnection();
        String sql = "DELETE FROM COMPONENTE WHERE nome = ?";
        PreparedStatement pstmt;

        try {
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.execute();
            System.out.println("Componente apagado com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}   
    

