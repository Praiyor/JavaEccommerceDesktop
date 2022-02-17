/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.products.Pc;
import br.udesc.prog2.models.workers.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class PcDAO {
    
    private static void criarTabela() {
        Connection conexao = ConexaoDB.getConnection();
        System.out.println(conexao);
        String sqlCreate = "CREATE TABLE IF NOT EXISTS PC"
                + "(nome VARCHAR(50) PRIMARY KEY,"
                + "nomeCliente VARCHAR(50),"
                + "FOREIGN KEY(nomeCliente) REFERENCES Cliente(nome))";
        
    Statement stmt = null;
        try {
            stmt = conexao.createStatement();
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean salvarPc(Pc pc){
        Connection conexao = ConexaoDB.getConnection();
        String sql ="INSERT INTO PC (nome, nomeCliente) VALUES(?, ?)";
        PreparedStatement pstmt;
        
        try{
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, pc.getNome());
            pstmt.setString(2, pc.getCliente().getNome());
            
            pstmt.execute();
            
            System.out.println("Pc salvo com sucesso");
            return true;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
}
    
    public static boolean atualizarPc(Pc pc){
        Connection conexao = ConexaoDB.getConnection();
        String sql ="UPDATE PC SET nome=?, nomeCliente=? WHERE nome=?";
        PreparedStatement pstmt;
        
        try{
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, pc.getNome());
            pstmt.setString(2, pc.getCliente().getNome());
            pstmt.setString(3, pc.getNome());
            
            pstmt.execute();
            
            System.out.println("Pc atualizado com sucesso");
            return true;
    }   catch (SQLException e) {
           System.out.println(e.getMessage());
           return false;
        }
    }
    
    public static List<Pc> getTodosPcs(){
        List<Pc> pcs = new ArrayList<>();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "SELECT * FROM PC";
        Statement stmt;
        
        try{
            stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            while(resultado.next()){
                String nome = resultado.getString("nome");
                String nomeCliente = resultado.getString("nomeCliente");
                
                Cliente cliente = new Cliente(nomeCliente);
                
                Pc p = new Pc(nome);
                p.setCliente(cliente);
                
                pcs.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return pcs;
    }
    
    public static boolean excluirPc(String nome){
        Connection conexao = ConexaoDB.getConnection();
        String sql = "DELETE FROM PC WHERE nome = ?";
        PreparedStatement pstmt;

        try {
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.execute();
            System.out.println("Pc apagado com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
