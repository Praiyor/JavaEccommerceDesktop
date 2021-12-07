/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views;

import br.udesc.prog2.dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.udesc.prog2.models.Produto;
import br.udesc.prog2.models.errors.ExceptionDadosIncompletos;
import br.udesc.prog2.models.errors.ExceptionPrecoMaiorZero;

/**
 *
 * @author rfcjo
 */
public class CriarProdutoView extends javax.swing.JFrame {
    /**
     * Creates new form CriarProdutoView
     */
    public CriarProdutoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        inputNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputCategoria = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        inputRecomendado = new javax.swing.JTextField();
        labelRecomendado = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        labelQuantidadeIdeal = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        InputPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextArea();
        inputQuantidadeIdeal = new javax.swing.JSpinner();
        inputQuantidade = new javax.swing.JSpinner();
        labelRS = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuProduto = new javax.swing.JMenu();
        bntMenuMontarPc = new javax.swing.JMenu();
        btnMenuContainerConta = new javax.swing.JMenu();
        btnMenuLogin = new javax.swing.JMenuItem();
        btnMenuRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNome.setText("Nome");

        btnSalvar.setBackground(new java.awt.Color(191, 75, 75));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Adicionar");
        btnSalvar.setActionCommand("Cadastar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Cadastrar Produto");

        labelCategoria.setText("Categoria");

        labelDescricao.setText("Descrição");

        labelRecomendado.setText("Recomendado");

        labelQuantidade.setText("Quantidade");

        labelQuantidadeIdeal.setText("Quantidade ideal");

        labelPreco.setText("Preço:");

        InputPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPrecoActionPerformed(evt);
            }
        });

        inputDescricao.setColumns(20);
        inputDescricao.setRows(5);
        jScrollPane1.setViewportView(inputDescricao);

        inputQuantidade.setPreferredSize(new java.awt.Dimension(70, 26));

        labelRS.setText("R$");

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

        btnMenuProduto.setText("Produtos");
        btnMenuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuProdutoMouseClicked(evt);
            }
        });
        btnMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProdutoActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnMenuProduto);

        bntMenuMontarPc.setText("Montar Pc");
        bntMenuMontarPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMenuMontarPcActionPerformed(evt);
            }
        });
        jMenuBar1.add(bntMenuMontarPc);

        btnMenuContainerConta.setText("Conta");

        btnMenuLogin.setText("Login");
        btnMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuLoginActionPerformed(evt);
            }
        });
        btnMenuContainerConta.add(btnMenuLogin);

        btnMenuRegistrar.setText("Registrar-se");
        btnMenuContainerConta.add(btnMenuRegistrar);

        jMenuBar1.add(btnMenuContainerConta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCategoria)
                    .addComponent(labelNome)
                    .addComponent(labelDescricao)
                    .addComponent(labelRecomendado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelQuantidadeIdeal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputQuantidadeIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(inputNome)
                    .addComponent(inputCategoria)
                    .addComponent(inputRecomendado, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRecomendado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRecomendado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeIdeal)
                    .addComponent(inputQuantidadeIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(InputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRS))
                .addGap(38, 38, 38)
                .addComponent(btnSalvar)
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPrecoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try {
            if(!InputPreco.getText().equals("") 
                && !inputCategoria.getText().equals("") 
                && !inputDescricao.getText().equals("") 
                && !inputNome.getText().equals("") 
                && inputQuantidade.getValue() != null 
                && inputQuantidadeIdeal.getValue() != null 
                && !inputRecomendado.getText().equals(""))
            {
                try {
                    if(Double.parseDouble(InputPreco.getText()) > 0) {
                        adicionarProduto(inputNome.getText(), inputDescricao.getText(), inputCategoria.getText(), (Integer) inputQuantidade.getValue(), Double.parseDouble(InputPreco.getText()), (Integer) inputQuantidadeIdeal.getValue());

                    } else {
                        throw new ExceptionPrecoMaiorZero(this, "Preço deve ser maior que zero");
                        }
                } catch(ExceptionPrecoMaiorZero error) {
                            error.printStackTrace();
                }
                    
            } else {
                throw new ExceptionDadosIncompletos(this, "Preencha todos os dados");
            }
        } catch(ExceptionDadosIncompletos e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLoginActionPerformed
        // TODO add your handling code here:
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuLoginActionPerformed

    private void btnMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProdutoActionPerformed
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuProdutoActionPerformed

    private void bntMenuMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMenuMontarPcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntMenuMontarPcActionPerformed

    private void btnMenuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuProdutoMouseClicked
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuProdutoMouseClicked

    private void adicionarProduto(String nome, String descricao, String categoria, int quantidade, double preco, int quantidadeIdeal) {
        // String nome, String descricao, String categoria, int quantidade, double preco, int quantidadeIdeal
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto prod = new Produto(nome, descricao, categoria, quantidade, preco, quantidadeIdeal);

        HomeView home = new HomeView();
        home.addProdutoInLista(prod);
        JOptionPane.showMessageDialog(this, "Adicionou produto.");
        System.out.println("Adicionou produto:"+prod.toString());
        home.setVisible(true);
        new CriarProdutoView().setVisible(false);
    }

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputPreco;
    private javax.swing.JMenu bntMenuMontarPc;
    private javax.swing.JMenu btnMenuContainerConta;
    private javax.swing.JMenuItem btnMenuLogin;
    private javax.swing.JMenu btnMenuProduto;
    private javax.swing.JMenuItem btnMenuRegistrar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField inputCategoria;
    private javax.swing.JTextArea inputDescricao;
    private javax.swing.JTextField inputNome;
    private javax.swing.JSpinner inputQuantidade;
    private javax.swing.JSpinner inputQuantidadeIdeal;
    private javax.swing.JTextField inputRecomendado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelQuantidadeIdeal;
    private javax.swing.JLabel labelRS;
    private javax.swing.JLabel labelRecomendado;
    // End of variables declaration//GEN-END:variables
}
