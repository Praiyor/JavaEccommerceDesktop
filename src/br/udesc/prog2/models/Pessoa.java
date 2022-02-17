/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models;

public abstract class Pessoa implements Comparable<Pessoa> {
    protected String nome;
    protected String sobrenome;
    protected String email;
    protected String telefone;
    protected String senha;

    public Pessoa(String nome) {
        this.nome = nome;
       
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }
    
    public String getNome() {
        return nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }


    public String getEmail() {
        return email;
    }


    public String getTelefone() {
        return telefone;
    }
    

    public abstract void setTelefone(String telefone);
    
    @Override
    public int compareTo(Pessoa p) {
        if(!p.getEmail().equals(email)) {
            // Pode criar Cliente
            return 1;
        } else {
            // Não pode criar Cliente
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
}
