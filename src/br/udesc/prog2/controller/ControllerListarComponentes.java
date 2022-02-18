/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controller;

import br.udesc.prog2.controller.cadastro.ControllerCadastrarComponente;
import br.udesc.prog2.controller.cadastro.ControllerCadastrarPc;
import br.udesc.prog2.dao.ComponenteDAO;
import br.udesc.prog2.model.tabel.ComponenteTableModel;
import br.udesc.prog2.models.products.Componente;
import br.udesc.prog2.models.products.Pc;
import br.udesc.prog2.views.products.CriarComponenteView;
import br.udesc.prog2.views.products.CriarPcView;
import br.udesc.prog2.views.workers.MontarPcView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Pichau
 */
public class ControllerListarComponentes {
    
    
    private MontarPcView telaMontarPc;
    private ComponenteTableModel componenteTableModel;
    
    private ControllerCadastrarPc controllerCadastrarPc;
    private ControllerCadastrarComponente controllerCadastrarComponente;
    private ControllerListarComponentes controllerListarComponente;
    
    public ControllerListarComponentes(MontarPcView telaMontarPc, ComponenteTableModel componenteTableModel){
        this.telaMontarPc = telaMontarPc;
        this.componenteTableModel = componenteTableModel;
        inicializarTelaCadastrarPc();
        inicializarTelaCadastrarComponente();
        //setTableModel();
        iniciarAcaoBotoes();
        adicionarEventos();
        atualizarListaAoSalvarComponente();
        
        controllerCadastrarPc.adicionarAcoes();
    }
    
    public void setTableModel(){
        telaMontarPc.setTableModel(this.componenteTableModel);
    }


    public void iniciarAcaoBotoes(){
        telaMontarPc.adicionarAcaoBtnCriarPcs((ActionEvent e) -> {
            controllerCadastrarPc.exibir();
        });
        
        telaMontarPc.adicionarAcaoBtnCriarComponentes(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerCadastrarComponente.exibir();
            }
        });
    }
    
    public void inicializarTelaCadastrarPc(){
        controllerCadastrarPc = new ControllerCadastrarPc(new CriarPcView(), new Pc(""));
    }
    public void inicializarTelaCadastrarComponente(){
        controllerCadastrarComponente = new ControllerCadastrarComponente(new CriarComponenteView(), new Componente("", "", ""));
    }
         
    public void adicionarBotaoExcluir(){
        telaMontarPc.adicionarAcaoBtnExcluirItem((ActionEvent e) -> {
            excluirComponente();
        });
        
    }
    
    public void atualizarDados(){
        componenteTableModel.fireTableDataChanged();
        componenteTableModel.setComponentes(ComponenteDAO.getTodosComponentes());
        System.out.println("Atualizando..");
    }
    
    
    public void excluirComponente(){
        String nome = telaMontarPc.getNomeLinhaSelecionada();
        if(ComponenteDAO.excluirComponente(nome)){
            telaMontarPc.exibirMensagem("Item excluido com sucesso");
            atualizarDados();
        }
        else {
            telaMontarPc.exibirMensagem("Não foi possível excluir o Item");
        }
    }
    
    public void adicionarEventos(){
        telaMontarPc.adicionarEventoAlteracaoTabela(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(TableModelEvent.UPDATE == e.getType()){
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                       ComponenteTableModel model = (ComponenteTableModel)e.getSource();
                       String nome = (String)model.getValueAt(row, 0);
                       Componente componente = componenteTableModel.getComponentes().get(row);
                       System.out.println(componente);
                       ComponenteDAO.atualizarComponente(componente);
                       atualizarDados();
                   }
                }
            }
        });
    }
    
    public void exibir(){
        telaMontarPc.exibirTela();
    }
    public void exibirTelaCadastrarPc() {
        controllerCadastrarPc.exibir();
    }
    public void exibirTelaCadastrarComponente() {
        controllerCadastrarComponente.exibir();
    }
    
    public void atualizarListaAoSalvarComponente(){
        controllerCadastrarComponente.getTelaCadastrarComponente().adicionarAcaoBtnCriarComponente((ActionEvent e) -> {
            controllerListarComponente.atualizarDados();
        });
    }
    
    
}
