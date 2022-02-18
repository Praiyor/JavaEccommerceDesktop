/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controller;

import br.udesc.prog2.dao.ComponenteDAO;
import br.udesc.prog2.model.tabel.ComponenteTableModel;
import br.udesc.prog2.views.workers.HomeView;
import br.udesc.prog2.views.workers.MontarPcView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pichau
 */
public class ControllerManterTudo {
    
    private HomeView telaInicial;
    private ControllerListarComponentes controllerListarComponente;
    
    private ComponenteTableModel componenteTableModel;
    
    
    public ControllerManterTudo(HomeView telaInicial){
        this.telaInicial = telaInicial;
        
        inicializarTelaManterComponente();
        
        inicializarAcaoBotoes();
        
    }
    
    
    
    
    
    public void inicializarAcaoBotoes(){
        telaInicial.adicionarAcaoTelaMontarPc(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerListarComponente.exibir();
            }
        });
        
    }
    
    
    public void inicializarTelaManterComponente(){
        componenteTableModel = new ComponenteTableModel(ComponenteDAO.getTodosComponentes());
        controllerListarComponente = new ControllerListarComponentes(new MontarPcView(), componenteTableModel);
    }
    
    
    
    public void exibirTelaInicial(){
        telaInicial.exibirTela();
    }
    
    public void exibirTelaMontarPc() {
        controllerListarComponente.exibir();
    }
    
    
}
