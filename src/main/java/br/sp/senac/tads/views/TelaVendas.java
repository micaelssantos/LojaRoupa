/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads.views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JefersonOliveira
 */
public class TelaVendas extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaBase
     */
    
    //MATRIZ PARA ARMAZENAR OS PRODUTOS CADASTRADOS
    String[][] matrizProdutos = new String[5][5];
    
    public TelaVendas() {
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

        pnlFundo = new javax.swing.JPanel();
        pnlBarraTitulo = new javax.swing.JPanel();
        btn_fechar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnConcluir = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnlClientes = new javax.swing.JPanel();
        lblNomeCli = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlProdutos = new javax.swing.JPanel();
        lblNomeCli1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNomeCli2 = new javax.swing.JLabel();
        txtQtdEstoque = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblNomeCli3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pnlItens = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        lblCompra = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 85, 166));
        pnlBarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_fechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btn_fechar.setForeground(new java.awt.Color(255, 255, 255));
        btn_fechar.setText("X");
        btn_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fecharMouseClicked(evt);
            }
        });
        pnlBarraTitulo.add(btn_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        btn_minimizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btn_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_minimizar.setText("_");
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        pnlBarraTitulo.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_usuario.setText("Nova venda");
        pnlBarraTitulo.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 40));

        pnlFundo.add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        btnCancelar.setBackground(new java.awt.Color(0, 85, 166));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cancelar");
        btnCancelar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlFundo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 90, 40));

        btnConcluir.setBackground(new java.awt.Color(0, 85, 166));
        btnConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConcluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConcluirMouseExited(evt);
            }
        });
        btnConcluir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Concluir");
        btnConcluir.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnlFundo.add(btnConcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

        pnlClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true), "Selecione o cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18))); // NOI18N
        pnlClientes.setForeground(new java.awt.Color(40, 40, 40));
        pnlClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeCli.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNomeCli.setForeground(new java.awt.Color(40, 40, 40));
        lblNomeCli.setText("Nome do cliente");
        pnlClientes.add(lblNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtCliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtCliente.setBorder(null);
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });
        pnlClientes.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, -1));
        pnlClientes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 10));

        btnConfirmar.setBackground(new java.awt.Color(0, 85, 166));
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseExited(evt);
            }
        });
        btnConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Confirmar");
        btnConfirmar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlClientes.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 90, 40));

        pnlFundo.add(pnlClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 150));

        pnlProdutos.setBackground(new java.awt.Color(255, 255, 255));
        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true), "Produtos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18), new java.awt.Color(40, 40, 40))); // NOI18N
        pnlProdutos.setForeground(new java.awt.Color(40, 40, 40));
        pnlProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeCli1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNomeCli1.setForeground(new java.awt.Color(40, 40, 40));
        lblNomeCli1.setText("Produto");
        pnlProdutos.add(lblNomeCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtProduto.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(40, 40, 40));
        txtProduto.setBorder(null);
        pnlProdutos.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, -1));
        pnlProdutos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 10));

        lblNomeCli2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNomeCli2.setForeground(new java.awt.Color(40, 40, 40));
        lblNomeCli2.setText("Quantidade em estoque");
        pnlProdutos.add(lblNomeCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtQtdEstoque.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtQtdEstoque.setForeground(new java.awt.Color(40, 40, 40));
        txtQtdEstoque.setBorder(null);
        pnlProdutos.add(txtQtdEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 310, -1));
        pnlProdutos.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 10));

        lblNomeCli3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNomeCli3.setForeground(new java.awt.Color(40, 40, 40));
        lblNomeCli3.setText("Quantidade");
        pnlProdutos.add(lblNomeCli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtQtd.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtQtd.setForeground(new java.awt.Color(40, 40, 40));
        txtQtd.setBorder(null);
        pnlProdutos.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, -1));
        pnlProdutos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 310, 10));

        btnPesquisar.setBackground(new java.awt.Color(0, 85, 166));
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
        });
        btnPesquisar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Pesquisar");
        btnPesquisar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlProdutos.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 40));

        btnLimpar1.setBackground(new java.awt.Color(0, 85, 166));
        btnLimpar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpar1MouseExited(evt);
            }
        });
        btnLimpar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Limpar");
        btnLimpar1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlProdutos.add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 40));

        btnInserir.setBackground(new java.awt.Color(0, 85, 166));
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInserirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInserirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInserirMouseExited(evt);
            }
        });
        btnInserir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Inserir");
        btnInserir.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlProdutos.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 40));

        pnlFundo.add(pnlProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 350, 280));

        pnlItens.setBackground(new java.awt.Color(255, 255, 255));
        pnlItens.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true), "Itens", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18))); // NOI18N
        pnlItens.setForeground(new java.awt.Color(40, 40, 40));
        pnlItens.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblItens.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblItens.setForeground(new java.awt.Color(40, 40, 40));
        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Produto", "Qtd", "Valor Unit.", "Total"
            }
        ));
        tblItens.setGridColor(new java.awt.Color(40, 40, 40));
        tblItens.setSelectionBackground(new java.awt.Color(0, 85, 166));
        jScrollPane1.setViewportView(tblItens);
        if (tblItens.getColumnModel().getColumnCount() > 0) {
            tblItens.getColumnModel().getColumn(0).setResizable(false);
            tblItens.getColumnModel().getColumn(1).setResizable(false);
            tblItens.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlItens.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 410));

        pnlFundo.add(pnlItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 400, 440));

        lblCompra.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblCompra.setForeground(new java.awt.Color(40, 40, 40));
        lblCompra.setText("Valor total da compra:");
        pnlFundo.add(lblCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        lblTotal.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(40, 40, 40));
        lblTotal.setText("R$ 0,00");
        pnlFundo.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));

        getContentPane().add(pnlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConcluirMouseEntered
        setColor(btnConcluir);
    }//GEN-LAST:event_btnConcluirMouseEntered

    private void btnConcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConcluirMouseExited
        resetColor(btnConcluir);
    }//GEN-LAST:event_btnConcluirMouseExited

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        
        //VOLTAR PARA O MENU PRINCIPAL
        TelaMenu menu = new TelaMenu();
        menu.show();
        this.dispose();
        
    }//GEN-LAST:event_btn_fecharMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnConcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConcluirMouseClicked
        ValidarProduto();
        ValidarCliente(); 
        
    }//GEN-LAST:event_btnConcluirMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
    
        //VOLTAR PARA O MENU PRINCIPAL
        TelaMenu menu = new TelaMenu();
        menu.show();
        this.dispose();        

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        ValidarCliente();
        
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseEntered
        setColor(btnConfirmar);
    }//GEN-LAST:event_btnConfirmarMouseEntered

    private void btnConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseExited
        resetColor(btnConfirmar);
    }//GEN-LAST:event_btnConfirmarMouseExited

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        ValidarProduto();
        
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        setColor(btnPesquisar);
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        resetColor(btnPesquisar);
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnLimpar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpar1MouseClicked

    private void btnLimpar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpar1MouseEntered
        setColor(btnLimpar1);
    }//GEN-LAST:event_btnLimpar1MouseEntered

    private void btnLimpar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpar1MouseExited
        resetColor(btnLimpar1);
    }//GEN-LAST:event_btnLimpar1MouseExited

    private void btnInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseClicked
        ValidarProduto();
        
    }//GEN-LAST:event_btnInserirMouseClicked

    private void btnInserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseEntered
        setColor(btnInserir);
    }//GEN-LAST:event_btnInserirMouseEntered

    private void btnInserirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseExited
        resetColor(btnInserir);
    }//GEN-LAST:event_btnInserirMouseExited

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        //Se o nome digitado for menor que 50
        if (txtCliente.getText().length() < 50) {
            //verifica se foi digitado número
            if (txtCliente.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                txtCliente.setText("");
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 50", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCliente.setText("");
        }

    }//GEN-LAST:event_txtClienteKeyTyped

    /**
     * @param args the command line arguments
     */
    
    
         
    //ALTERAR A COR DO OBJETO AO PASSAR O MOUSE
    public void setColor(JPanel panel){
    
        panel.setBackground(new java.awt.Color(40, 40, 40));
        
    }
    
    //VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA
    public void resetColor(JPanel panel){
    
        panel.setBackground(new java.awt.Color(0, 85, 166));
        
    }
    
    private boolean ValidarCliente()
    {
       
        if (this.txtCliente.getText().equalsIgnoreCase("")) 
        {
            JOptionPane.showMessageDialog(this, "Campo Nome do Cliente é obrigatório.");
            return false;
        }
        
        return true;
    }
    private boolean ValidarProduto()
    {
       if (this.txtProduto.getText().equalsIgnoreCase("")) 
       {
        JOptionPane.showMessageDialog(this, "Campo Produto é obrigatório.");
         return false;
        }
        
        if (this.txtQtd.getText().equalsIgnoreCase("")) 
        {
            JOptionPane.showMessageDialog(this, "A quantidade deve ser informada.");
            return false;
        }
        if (this.txtQtdEstoque.getText().equalsIgnoreCase("")) 
        {
            JOptionPane.showMessageDialog(this, "A quantidade em estoque deve ser informada.");
            return false;
        }
        
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnConcluir;
    private javax.swing.JPanel btnConfirmar;
    private javax.swing.JPanel btnInserir;
    private javax.swing.JPanel btnLimpar1;
    private javax.swing.JPanel btnPesquisar;
    private javax.swing.JLabel btn_fechar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblNomeCli;
    private javax.swing.JLabel lblNomeCli1;
    private javax.swing.JLabel lblNomeCli2;
    private javax.swing.JLabel lblNomeCli3;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlItens;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JTable tblItens;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtQtdEstoque;
    // End of variables declaration//GEN-END:variables
}