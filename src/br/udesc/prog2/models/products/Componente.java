/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.products;

/**
 *
 * @author Pichau
 */
public class Componente {
    
    private String nome;
    private Pc pc;
    private String categoria;
    private String status;
    
    public Componente(String nome, String categoria, String status){
    this.nome = nome;
    this.categoria = categoria;
    this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pc getPc() {
        return pc;
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Componente{" + "nome=" + nome + ", pc=" + pc + ", categoria=" + categoria + ", status=" + status + '}';
    }
    
    
}
