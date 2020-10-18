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
        desabilitado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoGrupoPesquisa = new javax.swing.ButtonGroup();
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
        btnVoltar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        lblPesquisarPor = new javax.swing.JLabel();
        rdoNome = new javax.swing.JRadioButton();
        rdoCPF = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JPanel();
        lblIconeCadastrar = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        lblIconeEditar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        btnRemover = new javax.swing.JPanel();
        lblIconeRemover = new javax.swing.JLabel();
        lblRemover = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JPanel();
        lblIconePesquisar = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();

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

        btnVoltar.setBackground(new java.awt.Color(0, 85, 166));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Voltar");
        btnVoltar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnl_fundo.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

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

        lblPesquisarPor.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPesquisarPor.setForeground(new java.awt.Color(40, 40, 40));
        lblPesquisarPor.setText("Pesquisar por:");
        pnl_fundo.add(lblPesquisarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        rdoNome.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoPesquisa.add(rdoNome);
        rdoNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoNome.setText("Nome");
        rdoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoNomeMouseClicked(evt);
            }
        });
        rdoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNomeActionPerformed(evt);
            }
        });
        pnl_fundo.add(rdoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        rdoCPF.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoPesquisa.add(rdoCPF);
        rdoCPF.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoCPF.setText("CPF");
        rdoCPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoCPFMouseClicked(evt);
            }
        });
        pnl_fundo.add(rdoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        lblNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(40, 40, 40));
        lblNome.setText("Nome");
        pnl_fundo.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 60, -1));

        lblCPF.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(40, 40, 40));
        lblCPF.setText("CPF");
        pnl_fundo.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 40, -1));

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

        lblIconeCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/add.png"))); // NOI18N
        btnCadastrar.add(lblIconeCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        lblCadastrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrar.setText("Cadastrar");
        btnCadastrar.add(lblCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

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

        lblIconeEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/editarIcon.png"))); // NOI18N
        btnEditar.add(lblIconeEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        lblEditar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        btnEditar.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

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

        lblIconeRemover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/removerIcon.png"))); // NOI18N
        btnRemover.add(lblIconeRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        lblRemover.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblRemover.setForeground(new java.awt.Color(255, 255, 255));
        lblRemover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemover.setText("Remover");
        btnRemover.add(lblRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

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

        lblIconePesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconePesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/lupa.png"))); // NOI18N
        btnPesquisar.add(lblIconePesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        lblPesquisar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesquisar.setText("Pesquisar");
        btnPesquisar.add(lblPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 70, -1));

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

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        setColor(btnVoltar);
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        resetColor(btnVoltar);
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        //VOLTAR PARA O MENU PRINCIPAL
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        //VOLTAR PARA O MENU PRINCIPAL
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_fecharMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        //VOLTAR PARA A TELA DE LOGIN
        new TelaLogin().setVisible(true);
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
        int linhaSelecionada = tblConsulta.getSelectedRow();

        if (linhaSelecionada > 0) {
            int result = JOptionPane.showConfirmDialog(this, "Deseja exluir o cliente selecionado?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                DefaultTableModel clientes = new DefaultTableModel();
                clientes = (DefaultTableModel) tblConsulta.getModel();
                clientes.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
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
        int linhaSelecionada = tblConsulta.getSelectedRow();

        if (linhaSelecionada > 0) {
            //ACESSA A TELA DE EDITAR CLIENTE
            new TelaClientesEditar().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Cliente", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
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
        if (txtNome.getText().length() < 30) {
            if (txtNome.getText().matches("^[0-9].*")) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Permitido somente letras no campo \"Nome\"!");
            }
        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 30 caracteres.");
        }
    }//GEN-LAST:event_txtNomeKeyTyped
    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        //ACESSA A TELA DE CADASTRO DE CLIENTES
        new TelaClientesCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btn_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseClicked
        //ACESSA A TELA PRODUTOS
        new TelaProdutos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_produtosMouseClicked

    private void btn_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseClicked
        //ACESSA A TELA DE RELATÓRIOS
        new TelaRelatorios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_relatoriosMouseClicked

    private void rdoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNomeActionPerformed

    }//GEN-LAST:event_rdoNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    //ALTERAR A COR DO OBJETO AO PASSAR O MOUSE
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(40, 40, 40));
    }

    //VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA
    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 85, 166));
    }

    private boolean desabilitado() {
        btnCadastrar.setEnabled(false);
        txtCPF.setEnabled(false);
        txtNome.setEnabled(false);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnLimpar.setEnabled(false);
        return false;
    }

    private void habilitado() {
        if (rdoNome.isSelected()) {
            txtCPF.setEnabled(false);
            txtNome.setEnabled(true);
            btnEditar.setEnabled(true);
            btnRemover.setEnabled(true);
            btnPesquisar.setEnabled(true);
            btnLimpar.setEnabled(true);
        } else if (rdoCPF.isSelected()) {
            txtNome.setEnabled(false);
            txtCPF.setEnabled(true);
            btnEditar.setEnabled(true);
            btnRemover.setEnabled(true);
            btnPesquisar.setEnabled(true);
            btnLimpar.setEnabled(true);
        }
    }

    private boolean validarFormulario() {

        if (rdoNome.isSelected() == false && rdoCPF.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Selecione uma opção de busca!", "Erro!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
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
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JLabel btn_fechar;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel btn_produtos;
    private javax.swing.JPanel btn_relatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblIconeCadastrar;
    private javax.swing.JLabel lblIconeEditar;
    private javax.swing.JLabel lblIconePesquisar;
    private javax.swing.JLabel lblIconeRemover;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblPesquisarPor;
    private javax.swing.JLabel lblRemover;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_barraLateral;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JRadioButton rdoCPF;
    private javax.swing.ButtonGroup rdoGrupoPesquisa;
    private javax.swing.JRadioButton rdoNome;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
