/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.products;

import br.udesc.prog2.models.workers.Cliente;

/**
 *
 * @author Pichau
 */
public class Pc {
    
    private String nome;
    private Cliente cliente;
    
    
    public Pc(String nome){
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
    