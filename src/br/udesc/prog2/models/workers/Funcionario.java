/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.workers;

import br.udesc.prog2.exceptions.TelefoneInvalidError;
import br.udesc.prog2.models.positions.Cargo;
import br.udesc.prog2.models.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Funcionario extends Pessoa{
    
    private Map<String, Cargo> cargo = new HashMap<>();
    private int salario;
    // 1 = Montador, 2= Adminstrador
    private int privilegio;
    private boolean disponivel = true;
    
    
    public Funcionario(String nome, String sobrenome, String email, String senha) {
        super(nome);
    }
    public Funcionario(String nome, String sobrenome, String email, String senha, Cargo cargo, int salario, int privilegio) {
        super(nome);
        
        this.cargo.put(String.valueOf(cargo.getId()), cargo);
        this.salario = salario;
        this.privilegio = privilegio;
    }
    
    
    public int getSalario() {
        return this.salario;
    }
    
    public int getPrivilegio() {
        return this.privilegio;
    }
    
    public boolean getDisponivel() {
         return this.disponivel;   
    }
    public void setDisponivel(boolean disponivel) {
         this.disponivel = disponivel;
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
        return super.getNome();
    }


    
    
    
    
}
