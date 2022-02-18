/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.controller.cadastro;

import br.udesc.prog2.dao.PcDAO;
import br.udesc.prog2.models.products.Pc;
import br.udesc.prog2.views.products.CriarPcView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pichau
 */
public class ControllerCadastrarPc {
    
    private CriarPcView criarPcView;
    private Pc modeloPc;
    
    public ControllerCadastrarPc(CriarPcView telaCadastrarPc, Pc pcModelo){
        this.criarPcView = telaCadastrarPc;
        this.modeloPc = pcModelo;
        
    }
    
    public void adicionarAcoes(){
        criarPcView.adicionarAcaoBtnCriarPc(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarPc();
                System.out.println(PcDAO.getTodosPcs());
            }
        });
    }
    
    public void salvarPc(){
        modeloPc = new Pc(criarPcView.getNome());
        modeloPc.setCliente(criarPcView.getCliente());
        if(PcDAO.salvarPc(modeloPc)){
            criarPcView.exibirMensagem("Pc salvo com sucesso" + modeloPc);
            criarPcView.limparTela();
        }
        else
            criarPcView.exibirMensagem("Já existe este Pc");
    }
    
    
    
    public void exibir(){
        criarPcView.exibirTela();
    }
     public CriarPcView getCriarPcView() {
        return criarPcView;
    }    
}
