/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views.workers;

import br.udesc.prog2.views.accounts.LoginView;
import br.udesc.prog2.views.accounts.RegistrarView;
import br.udesc.prog2.views.products.EditarProdutoView;
import br.udesc.prog2.views.products.CriarProdutoView;
import br.udesc.prog2.views.products.RemoverProdutoView;
import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.main.App;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import br.udesc.prog2.models.workers.Cliente;
import br.udesc.prog2.models.products.Produto;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author rfcjo
 */
public class HomeView extends javax.swing.JFrame {
    private ArrayList<Produto> listaProdutos;
    private DefaultTableModel model;
    
    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();
        model = (DefaultTableModel) tbPrincipal.getModel();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        adicionarLinhasInicias(produtoDAO.getProdutos());
    }
    
    public void adicionarAcaoTelaMontarPc(ActionListener acao){
    btnMontarPc.addActionListener(acao);
    }

    public void adicionarLinhasInicias(ArrayList<Produto> produtos) {
   
        for(int i =0; i< produtos.size();i++) {
            Object[] obj = {produtos.get(i).getNome(), produtos.get(i).getCategoria(), String.valueOf(produtos.get(i).getQuantidade()), String.valueOf(produtos.get(i).getPreco())};
            model.addRow(obj);
            
        }

        model.fireTableRowsUpdated(ERROR, ERROR);
        
    }
    
    public void exibirTela(){
        setVisible(true);
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        buscaContainer = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnAddProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrincipal = new javax.swing.JTable();
        btnEditProduto = new javax.swing.JButton();
        btnRmProduto = new javax.swing.JButton();
        btnMontarPc = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenuItem();
        btnRegistrar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(650, 559));

        buscaContainer.setBackground(new java.awt.Color(204, 204, 204));
        buscaContainer.setMaximumSize(new java.awt.Dimension(500, 500));
        buscaContainer.setMinimumSize(null);
        buscaContainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaContainerActionPerformed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setForeground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/udesc/prog2/assets/images/magnifying-glass.png"))); // NOI18N
        btnPesquisa.setMaximumSize(new java.awt.Dimension(500, 500));
        btnPesquisa.setMinimumSize(null);
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnAddProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnAddProduto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAddProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduto.setText("Criar Produto");
        btnAddProduto.setBorderPainted(false);
        btnAddProduto.setMaximumSize(new java.awt.Dimension(500, 500));
        btnAddProduto.setMinimumSize(null);
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        jScrollPane1.setMaximumSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setMinimumSize(null);

        tbPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Categoria", "Quantidade", "Preço", "editar", "deletar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbPrincipal.setMaximumSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setViewportView(tbPrincipal);

        btnEditProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnEditProduto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEditProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProduto.setText("Editar Produto");
        btnEditProduto.setBorderPainted(false);
        btnEditProduto.setMaximumSize(new java.awt.Dimension(500, 500));
        btnEditProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdutoActionPerformed(evt);
            }
        });

        btnRmProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnRmProduto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRmProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnRmProduto.setText("Remover Produto");
        btnRmProduto.setBorderPainted(false);
        btnRmProduto.setMaximumSize(new java.awt.Dimension(500, 500));
        btnRmProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmProdutoActionPerformed(evt);
            }
        });

        btnMontarPc.setText("Montar Pc");
        btnMontarPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontarPcActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setText("Produtos");
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosMouseClicked(evt);
            }
        });
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnProdutos);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Conta");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jMenu4.add(btnLogin);

        btnRegistrar.setText("Registrar-se");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jMenu4.add(btnRegistrar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMontarPc)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buscaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRmProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRmProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMontarPc)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaContainerActionPerformed
        // TODO add your handling code here:
                System.out.println("Oi1");

    }//GEN-LAST:event_buscaContainerActionPerformed

    
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
                System.out.println("Oi2");

    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        // TODO add your handling code here:
        new CriarProdutoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistrarView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseClicked
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosMouseClicked

    private void btnEditProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdutoActionPerformed
        // TODO add your handling code here:
        new EditarProdutoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditProdutoActionPerformed

    private void btnRmProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmProdutoActionPerformed
        // TODO add your handling code here:
        System.out.println("entrou");
        new RemoverProdutoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRmProdutoActionPerformed

    private void btnMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarPcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMontarPcActionPerformed

    public void mostrarTela() {
        setVisible(true);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //tablePrincipal.add(new Object[]{)
               
        
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnEditProduto;
    private javax.swing.JMenuItem btnLogin;
    private javax.swing.JButton btnMontarPc;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JMenuItem btnRegistrar;
    private javax.swing.JButton btnRmProduto;
    private javax.swing.JTextField buscaContainer;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPrincipal;
    // End of variables declaration//GEN-END:variables

}
