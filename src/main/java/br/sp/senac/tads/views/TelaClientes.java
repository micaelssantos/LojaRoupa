/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads.views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class TelaClientes extends javax.swing.JFrame {

    /**
     * Creates new form TelaBase
     */
    public TelaClientes() {
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

        pnl_fundo = new javax.swing.JPanel();
        pnl_barraLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        btn_produtos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_relatorios = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdoNome = new javax.swing.JRadioButton();
        rdoCPF = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barraLateral.setBackground(new java.awt.Color(0, 85, 166));
        pnl_barraLateral.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        pnl_barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/user.png"))); // NOI18N
        pnl_barraLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 40, 40));

        lbl_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuario.setText("ADMIN");
        pnl_barraLateral.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, -1, 40));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/logout.png"))); // NOI18N
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        pnl_barraLateral.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        btn_produtos.setBackground(new java.awt.Color(0, 85, 166));
        btn_produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_produtosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_produtosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_produtosMouseExited(evt);
            }
        });
        btn_produtos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/produtosIcon.png"))); // NOI18N
        btn_produtos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Produtos");
        btn_produtos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        pnl_barraLateral.add(btn_produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 50));

        btn_clientes.setBackground(new java.awt.Color(40, 40, 40));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/clientesIcon.png"))); // NOI18N
        btn_clientes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clientes");
        btn_clientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        pnl_barraLateral.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 50));

        btn_relatorios.setBackground(new java.awt.Color(0, 85, 166));
        btn_relatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_relatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_relatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_relatoriosMouseExited(evt);
            }
        });
        btn_relatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/relatoriosIcon.png"))); // NOI18N
        btn_relatorios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Relatórios");
        btn_relatorios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        pnl_barraLateral.add(btn_relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, 50));

        pnl_fundo.add(pnl_barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        btnLimpar.setBackground(new java.awt.Color(0, 85, 166));
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimparMouseExited(evt);
            }
        });
        btnLimpar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Limpar");
        btnLimpar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnl_fundo.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 90, 40));

        btn_voltar.setBackground(new java.awt.Color(0, 85, 166));
        btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_voltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_voltarMouseExited(evt);
            }
        });
        btn_voltar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Voltar");
        btn_voltar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnl_fundo.add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

        btn_fechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btn_fechar.setForeground(new java.awt.Color(40, 40, 40));
        btn_fechar.setText("X");
        btn_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fecharMouseClicked(evt);
            }
        });
        pnl_fundo.add(btn_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        btn_minimizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btn_minimizar.setForeground(new java.awt.Color(40, 40, 40));
        btn_minimizar.setText("_");
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        pnl_fundo.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(40, 40, 40));
        jLabel10.setText("Pesquisar por:");
        pnl_fundo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        rdoNome.setBackground(new java.awt.Color(255, 255, 255));
        rdoNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoNome.setText("Nome");
        rdoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoNomeMouseClicked(evt);
            }
        });
        pnl_fundo.add(rdoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        rdoCPF.setBackground(new java.awt.Color(255, 255, 255));
        rdoCPF.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoCPF.setText("CPF");
        rdoCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoCPFMouseClicked(evt);
            }
        });
        pnl_fundo.add(rdoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(40, 40, 40));
        jLabel11.setText("Nome");
        pnl_fundo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 60, -1));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(40, 40, 40));
        jLabel13.setText("CPF");
        pnl_fundo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 40, -1));

        txtNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(40, 40, 40));
        txtNome.setBorder(null);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        pnl_fundo.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 280, -1));

        txtCPF.setBorder(null);
        txtCPF.setForeground(new java.awt.Color(40, 40, 40));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pnl_fundo.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 190, -1));
        pnl_fundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 280, 10));
        pnl_fundo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 190, 10));

        tblConsulta.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Sexo"
            }
        ));
        tblConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblConsulta.setGridColor(new java.awt.Color(40, 40, 40));
        tblConsulta.setSelectionBackground(new java.awt.Color(0, 85, 166));
        jScrollPane1.setViewportView(tblConsulta);
        if (tblConsulta.getColumnModel().getColumnCount() > 0) {
            tblConsulta.getColumnModel().getColumn(0).setResizable(false);
            tblConsulta.getColumnModel().getColumn(1).setResizable(false);
            tblConsulta.getColumnModel().getColumn(2).setResizable(false);
        }

        pnl_fundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 500, 250));

        btnCadastrar.setBackground(new java.awt.Color(0, 85, 166));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/add.png"))); // NOI18N
        btnCadastrar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Cadastrar");
        btnCadastrar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

        pnl_fundo.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, 70));

        btnEditar.setBackground(new java.awt.Color(0, 85, 166));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/editarIcon.png"))); // NOI18N
        btnEditar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Editar");
        btnEditar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

        pnl_fundo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 80, 70));

        btnRemover.setBackground(new java.awt.Color(0, 85, 166));
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverMouseExited(evt);
            }
        });
        btnRemover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/removerIcon.png"))); // NOI18N
        btnRemover.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Remover");
        btnRemover.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

        pnl_fundo.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 80, 70));

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

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/lupa.png"))); // NOI18N
        btnPesquisar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Pesquisar");
        btnPesquisar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

        pnl_fundo.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 80, 70));

        getContentPane().add(pnl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseEntered
        setColor(btn_produtos);
    }//GEN-LAST:event_btn_produtosMouseEntered

    private void btn_produtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseExited
        resetColor(btn_produtos);
    }//GEN-LAST:event_btn_produtosMouseExited

    private void btn_relatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseEntered
        setColor(btn_relatorios);
    }//GEN-LAST:event_btn_relatoriosMouseEntered

    private void btn_relatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseExited
        resetColor(btn_relatorios);
    }//GEN-LAST:event_btn_relatoriosMouseExited

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseEntered
        setColor(btn_voltar);
    }//GEN-LAST:event_btn_voltarMouseEntered

    private void btn_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseExited
        resetColor(btn_voltar);
    }//GEN-LAST:event_btn_voltarMouseExited

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        //VOLTAR PARA O MENU PRINCIPAL
        TelaMenu menu = new TelaMenu();
        menu.show();
        this.dispose();
        
    }//GEN-LAST:event_btn_voltarMouseClicked

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        //VOLTAR PARA O MENU PRINCIPAL
        TelaMenu menu = new TelaMenu();
        menu.show();
        this.dispose();

    }//GEN-LAST:event_btn_fecharMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        //VOLTAR PARA A TELA DE LOGIN
        TelaLogin login = new TelaLogin();
        login.show();
        this.dispose();

    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        setColor(btnCadastrar);
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        resetColor(btnCadastrar);
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        setColor(btnEditar);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        resetColor(btnEditar);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseEntered
        setColor(btnRemover);
    }//GEN-LAST:event_btnRemoverMouseEntered

    private void btnRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseExited
        resetColor(btnRemover);
    }//GEN-LAST:event_btnRemoverMouseExited

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        setColor(btnPesquisar);
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        resetColor(btnPesquisar);
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked

        // TODO add your handling code here:
        //resgata o indice da linha selecionada
        int indiceLinha = tblConsulta.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) tblConsulta.getModel();
        //passo o indice da linha a ser removida
        modelo.removeRow(indiceLinha);

    }//GEN-LAST:event_btnRemoverMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        limparCampos();
        
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseEntered
        setColor(btnLimpar);
    }//GEN-LAST:event_btnLimparMouseEntered

    private void btnLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseExited
        resetColor(btnLimpar);
    }//GEN-LAST:event_btnLimparMouseExited

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        //ACESSA A TELA DE CADASTRO DE PRODUTO
        TelaClientesEditar cliente = new TelaClientesEditar();
        cliente.show();
        this.dispose();

    }//GEN-LAST:event_btnEditarMouseClicked

    private void rdoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoNomeMouseClicked
        if (rdoNome.isSelected()) {
            habilitado();
        }

    }//GEN-LAST:event_rdoNomeMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        if (validarFormulario()) {
            
        }
        
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void rdoCPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoCPFMouseClicked
        if (rdoCPF.isSelected()) {
            habilitado();
        }
        
    }//GEN-LAST:event_rdoCPFMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        if (txtNome.getText().length()<30) {
            if (txtNome.getText().matches("^[0-9].*")) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Permitido somente letras no campo \"Nome\"!");
            }
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 30 caracteres.");
        }

    }//GEN-LAST:event_txtNomeKeyTyped

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked

        //ACESSA A TELA DE CADASTRO DE CLIENTES
        TelaClientesCadastro cad = new TelaClientesCadastro();
        cad.show();
        this.dispose();

    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btn_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseClicked
        //ACESSA A TELA PRODUTOS
        TelaProdutos produto = new TelaProdutos();
        produto.show();
        this.dispose();

    }//GEN-LAST:event_btn_produtosMouseClicked

    private void btn_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseClicked
        //ACESSA A TELA DE RELATÓRIOS
        TelaRelatorios relatorios = new TelaRelatorios();
        relatorios.show();
        this.dispose();
        
    }//GEN-LAST:event_btn_relatoriosMouseClicked

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
    
        private boolean desabilitado() {
        txtCPF.setEnabled(false);
        txtNome.setEnabled(false);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnLimpar.setEnabled(false);
        tblConsulta.setEnabled(false);
        return false;
    }

    private boolean habilitado() {
        if (rdoNome.isSelected()) {
            txtCPF.setEnabled(false);
            txtNome.setEnabled(true);
            btnEditar.setEnabled(true);
            btnRemover.setEnabled(true);
            btnPesquisar.setEnabled(true);
            btnLimpar.setEnabled(true);
            tblConsulta.setEnabled(true);
            return true;
        } else if (rdoCPF.isSelected()) {
            txtNome.setEnabled(false);
            txtCPF.setEnabled(true);
            btnEditar.setEnabled(true);
            btnRemover.setEnabled(true);
            btnPesquisar.setEnabled(true);
            btnLimpar.setEnabled(true);
            tblConsulta.setEnabled(true);
            return true;
        }
        return false;
    }
    
    private boolean validarFormulario() {

        if (rdoNome.isSelected() && txtNome.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo \"Nome\" está vazio!");
            return false;
        }
        if (rdoCPF.isSelected() && this.txtCPF.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(this, "O campo \"CPF\" está vazio");
            return false;
        }
        return true;
    }
    
//função limpar para limpar campos

    private void limparCampos() {
        txtNome.setText("");
        txtCPF.setText("");
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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCadastrar;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnLimpar;
    private javax.swing.JPanel btnPesquisar;
    private javax.swing.JPanel btnRemover;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JLabel btn_fechar;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel btn_produtos;
    private javax.swing.JPanel btn_relatorios;
    private javax.swing.JPanel btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_barraLateral;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JRadioButton rdoCPF;
    private javax.swing.JRadioButton rdoNome;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}