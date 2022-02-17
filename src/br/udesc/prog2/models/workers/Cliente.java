/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.workers;

import br.udesc.prog2.models.Pessoa;
import br.udesc.prog2.exceptions.TelefoneInvalidError;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente extends Pessoa {
    private Date dataNascimento;
    private String cpf;
    private int cep;
    
    public Cliente(String nome) {
        super(nome);
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public String getNome(){
        return this.nome;
    }
    
     
    public String getCpf() {
        return this.cpf;
    }
    

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

 
    @Override
    public void setTelefone(String telefone) {
        String pattern = "^\\([1-9]{2}\\)(?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$";    
        try {
            
            if (telefone.matches(pattern)) {
                System.out.println("telefone invalido!");
                telefone = telefone;
                System.out.println("telefone: "+telefone);
             } else {
                   System.out.println("telefone valido!");
                   throw new TelefoneInvalidError("O número de telefone não condiz com o padrão (dd)xxxxx-xxxx");
            }
        } catch(TelefoneInvalidError e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
