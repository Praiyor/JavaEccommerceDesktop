/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controller.cadastro;

import br.udesc.prog2.dao.ComponenteDAO;
import br.udesc.prog2.models.products.Componente;
import br.udesc.prog2.views.products.CriarComponenteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pichau
 */
public class ControllerCadastrarComponente {
    
    private CriarComponenteView telaCriarComponente;
    private Componente modeloComponente;
    
    public ControllerCadastrarComponente(CriarComponenteView telaCadastrarComponente, Componente ComponenteModelo){
        this.telaCriarComponente = telaCadastrarComponente;
        this.modeloComponente = ComponenteModelo;
        
    }
    
     public void adicionarAcoes(){
         telaCriarComponente.adicionarAcaoBtnCriarComponente(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 salvarComponente();
                 System.out.println(ComponenteDAO.getTodosComponentes());
             }
         });
     }
     
     public void salvarComponente(){
        modeloComponente = new Componente(telaCriarComponente.getNome(), telaCriarComponente.getCategoria(), telaCriarComponente.getStatus());
        modeloComponente.setPc(telaCriarComponente.getPc());
        if(ComponenteDAO.salvarComponente(modeloComponente)){
            telaCriarComponente.exibirMensagem("Componente salvo com sucesso" + modeloComponente);
            telaCriarComponente.limparTela();
        }
        else
            telaCriarComponente.exibirMensagem("Já existe este Pc");
    }
        
            
    public void exibir(){
        telaCriarComponente.exibirTela();
    }
    
    public CriarComponenteView getTelaCadastrarComponente(){
        return telaCriarComponente;
    }
}
