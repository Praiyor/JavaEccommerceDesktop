/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.main;

import br.udesc.prog2.controller.ControllerManterTudo;
import br.udesc.prog2.dao.CargoDAO;
import br.udesc.prog2.dao.ClienteDAO;
import br.udesc.prog2.dao.FuncionarioDAO;
import br.udesc.prog2.dao.PedidoDAO;
import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.dao.SetorDAO;
import java.util.ArrayList;
import java.util.Collections;
import br.udesc.prog2.models.positions.Cargo;
import br.udesc.prog2.models.workers.Cliente;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.workers.Funcionario;
import br.udesc.prog2.models.workers.FuncionarioComparatorNome;
import br.udesc.prog2.models.workers.FuncionarioComparatorPrivilegio;
import br.udesc.prog2.models.positions.Setor;
import br.udesc.prog2.views.workers.HomeView;
import br.udesc.prog2.views.ProdutosView;
import java.util.Optional;
import java.sql.Connection;
/**
 *
 * @author rfcjo
 */
public class App {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public static void main(String[] args) {
        
        ControllerManterTudo controller = new ControllerManterTudo(new HomeView());
        controller.exibirTelaInicial();
        Cliente cliente = new Cliente("Igor");
                
       // HomeView homeView = new HomeView();
       // homeView.mostrarTela();           
        
        //Collections.sort(listaFuncionario, new FuncionarioComparatorNome());
        //System.out.println("Lista De Funcionario ordenada por Nome: \n"+listaFuncionario);
        
        //Collections.sort(listaFuncionario, new FuncionarioComparatorPrivilegio());
        
        //System.out.println("Lista De Funcionario ordenada por privilegio: \n"+listaFuncionario);

        
        // pedido.ordenarProdutosPorNome();
        //System.out.println("Ordenador por nome:\n"+pedido.toString());
        
        
}    
    
    public static void popularSistema() {
        //ClienteDAO clienteDAO = new ClienteDAO();
        //clienteDAO.setClientes();
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
//        produtoDAO.setProdutos();
        produtos = produtoDAO.getProdutos();
//        SetorDAO setorDAO = new SetorDAO();
//        setorDAO.setSetor();
        // 0 = Produção, 1 = Adminstrativo
        // 0,1 = Montador, 2,3 = Adminstrador
        
//        CargoDAO cargoDAO = new CargoDAO();
//        cargoDAO.setCargosMontador(setorDAO.getSetores().get(0));
//        cargoDAO.setCargosAdminstrador(setorDAO.getSetores().get(1));
//        
//        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//        
//        funcionarioDAO.setFuncionariosMontador(cargoDAO.getCargosMontador(setorDAO.getSetores().get(0))); // 0, 1
//        funcionarioDAO.setFuncionariosAdminstrador(cargoDAO.getCargosAdminstrador(setorDAO.getSetores().get(1))); // 2,3
//        
//        
//        PedidoDAO pedidoDAO = new PedidoDAO();
//        if(clienteDAO.getClientes().get(0) != null && funcionarioDAO.getFuncionarios().get(0) != null) {
//            pedidoDAO.setPedidos(clienteDAO.getClientes().get(0), produtoDAO.getProdutos(), EStatus.em_andamento, funcionarioDAO.getFuncionarios().get(0));
//        
//        }
//        
//        System.out.println(clienteDAO.getClientes());
//        System.out.println("------------------------");
//        System.out.println("------------------------");
//        System.out.println(setorDAO.getSetores());
//        System.out.println("------------------------");
//        System.out.println(cargoDAO.getCargos());
//        System.out.println("------------------------");
//        System.out.println(funcionarioDAO.getFuncionarios());
//        System.out.println("------------------------");
//        System.out.println(pedidoDAO.getPedidos());
        
        
        
    }
    
}
