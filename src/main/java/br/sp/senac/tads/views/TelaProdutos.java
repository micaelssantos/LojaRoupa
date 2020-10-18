package br.sp.senac.tads.views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TelaProdutos extends javax.swing.JFrame {

    public TelaProdutos() {
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
        pnlBarraLateral = new javax.swing.JPanel();
        lblIconeUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        btnProdutos = new javax.swing.JPanel();
        lblIconeProdutos = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        lblIconeClientes = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        btnRelatorios = new javax.swing.JPanel();
        lblIconeRelatorios = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        sclProdutos = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JPanel();
        lblIconeCadastrar = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        lblIconeEditar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        btnRemover = new javax.swing.JPanel();
        lblIconeRemover = new javax.swing.JLabel();
        lblRemover = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraLateral.setBackground(new java.awt.Color(0, 85, 166));
        pnlBarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/user.png"))); // NOI18N
        pnlBarraLateral.add(lblIconeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 40, 40));

        lblUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("ADMIN");
        pnlBarraLateral.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, -1, 40));

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/logout.png"))); // NOI18N
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        pnlBarraLateral.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        btnProdutos.setBackground(new java.awt.Color(40, 40, 40));
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconeProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblIconeProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/produtosIcon.png"))); // NOI18N
        btnProdutos.add(lblIconeProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblProdutos.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setText("Produtos");
        btnProdutos.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        pnlBarraLateral.add(btnProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 50));

        btnClientes.setBackground(new java.awt.Color(0, 85, 166));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconeClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblIconeClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/clientesIcon.png"))); // NOI18N
        btnClientes.add(lblIconeClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblClientes.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setText("Clientes");
        btnClientes.add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        pnlBarraLateral.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 50));

        btnRelatorios.setBackground(new java.awt.Color(0, 85, 166));
        btnRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRelatoriosMouseExited(evt);
            }
        });
        btnRelatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconeRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblIconeRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/relatoriosIcon.png"))); // NOI18N
        btnRelatorios.add(lblIconeRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblRelatorios.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorios.setText("Relatórios");
        btnRelatorios.add(lblRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        pnlBarraLateral.add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, 50));

        pnlFundo.add(pnlBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

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

        lblVoltar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(255, 255, 255));
        lblVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar.setText("Voltar");
        btnVoltar.add(lblVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnlFundo.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

        btnFechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(40, 40, 40));
        btnFechar.setText("X");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        pnlFundo.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        btnMinimizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(40, 40, 40));
        btnMinimizar.setText("_");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        pnlFundo.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        tblProdutos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Categoria", "Modelo", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblProdutos.setGridColor(new java.awt.Color(40, 40, 40));
        tblProdutos.setSelectionBackground(new java.awt.Color(0, 85, 166));
        sclProdutos.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setResizable(false);
            tblProdutos.getColumnModel().getColumn(1).setResizable(false);
            tblProdutos.getColumnModel().getColumn(2).setResizable(false);
            tblProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        pnlFundo.add(sclProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 540, 290));

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
        btnCadastrar.add(lblIconeCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        lblCadastrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrar.setText("Cadastrar");
        btnCadastrar.add(lblCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 80, -1));

        pnlFundo.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 80));

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
        btnEditar.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 80, -1));

        pnlFundo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 80));

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
        btnRemover.add(lblRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 80, -1));

        pnlFundo.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, 80));

        lblPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/pesquisarIcon.png"))); // NOI18N
        lblPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesquisarMouseClicked(evt);
            }
        });
        pnlFundo.add(lblPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        txtPesquisar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(40, 40, 40));
        txtPesquisar.setBorder(null);
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyTyped(evt);
            }
        });
        pnlFundo.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 360, 20));
        pnlFundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 360, 10));

        getContentPane().add(pnlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        setColor(btnClientes);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        resetColor(btnClientes);
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseEntered
        setColor(btnRelatorios);
    }//GEN-LAST:event_btnRelatoriosMouseEntered

    private void btnRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseExited
        resetColor(btnRelatorios);
    }//GEN-LAST:event_btnRelatoriosMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_btnMinimizarMouseClicked

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

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        //VOLTAR PARA O MENU PRINCIPAL
        new TelaMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        //VOLTAR PARA A TELA DE LOGIN
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

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

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked
        int linhaSelecionada = tblProdutos.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this, "Deseja exluir o item selecionado?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                DefaultTableModel produtos = new DefaultTableModel();
                produtos = (DefaultTableModel) tblProdutos.getModel();
                produtos.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int linhaSelecionada = tblProdutos.getSelectedRow();
        if (linhaSelecionada >= 0) {
            //ACESSA A TELA DE EDIÇÃO DE PRODUTO
            new TelaProdutosEditar().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarMouseClicked
    private void txtPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyTyped
        //VALIDAÇÃO DE BUSCA POR NOME DO PRODUTO
        if (txtPesquisar.getText().matches("^[0-9].*")) {
            evt.consume();
            //caso tenha sido número, retorna que não é permitido número no campo
            JOptionPane.showMessageDialog(this, "Não é permitido números neste campo", "Erro", JOptionPane.ERROR_MESSAGE);
            txtPesquisar.setText("");
        }
    }//GEN-LAST:event_txtPesquisarKeyTyped

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        //ACESSA A TELA DE CADASTRO DE PRODUTO
        new TelaProdutosCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        //ACESSA A TELA CLIENTES
        new TelaClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseClicked
        //ACESSA A TELA DE RELATÓRIOS
        new TelaRelatorios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatoriosMouseClicked

    private void lblPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesquisarMouseClicked
        if (this.txtPesquisar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Insira o Nome do Produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblPesquisarMouseClicked

    //ALTERAR A COR DO OBJETO AO PASSAR O MOUSE
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(40, 40, 40));
    }

    //VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA
    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 85, 166));
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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCadastrar;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel btnProdutos;
    private javax.swing.JPanel btnRelatorios;
    private javax.swing.JPanel btnRemover;
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblIconeCadastrar;
    private javax.swing.JLabel lblIconeClientes;
    private javax.swing.JLabel lblIconeEditar;
    private javax.swing.JLabel lblIconeProdutos;
    private javax.swing.JLabel lblIconeRelatorios;
    private javax.swing.JLabel lblIconeRemover;
    private javax.swing.JLabel lblIconeUsuario;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblRemover;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel pnlBarraLateral;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane sclProdutos;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
