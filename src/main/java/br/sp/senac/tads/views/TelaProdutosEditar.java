package br.sp.senac.tads.views;

import br.sp.senac.tads.controller.ProdutoController;
import br.sp.senac.tads.model.Produto;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
*
* @author joliveira
* @see br.sp.senac.tads.controller.ProdutoController
* @see br.sp.senac.tads.model.Produto
* 
*/

public class TelaProdutosEditar extends javax.swing.JFrame {
    
    ProdutoController produto = new ProdutoController();
    Produto produtoBean = new Produto();

    public TelaProdutosEditar() {
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
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblEditarProduto = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JPanel();
        lblLimpar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        btnConcluir = new javax.swing.JPanel();
        lblConcluir = new javax.swing.JLabel();
        lblCodProduto = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        srlDescricao = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblQuantidade = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 85, 166));
        pnlBarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(255, 255, 255));
        lblFechar.setText("X");
        lblFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });
        pnlBarraTitulo.add(lblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        lblMinimizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setText("_");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        pnlBarraTitulo.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        lblEditarProduto.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblEditarProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEditarProduto.setText("Editar produto");
        pnlBarraTitulo.add(lblEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 40));

        pnlFundo.add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

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

        lblLimpar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblLimpar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpar.setText("Limpar");
        btnLimpar.add(lblLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlFundo.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 90, 40));

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

        lblCancelar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("Cancelar");
        btnCancelar.add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

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

        lblConcluir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblConcluir.setForeground(new java.awt.Color(255, 255, 255));
        lblConcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConcluir.setText("Concluir");
        btnConcluir.add(lblConcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnlFundo.add(btnConcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

        lblCodProduto.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCodProduto.setForeground(new java.awt.Color(40, 40, 40));
        lblCodProduto.setText("---");
        pnlFundo.add(lblCodProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        lblCategoria.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(40, 40, 40));
        lblCategoria.setText("* Categoria");
        pnlFundo.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        lblMarca.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(40, 40, 40));
        lblMarca.setText("* Marca");
        pnlFundo.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        lblModelo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(40, 40, 40));
        lblModelo.setText("* Modelo");
        pnlFundo.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        lblDescricao.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(40, 40, 40));
        lblDescricao.setText("* Descrição");
        pnlFundo.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        srlDescricao.setAutoscrolls(true);

        txtDescricao.setColumns(10);
        txtDescricao.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(40, 40, 40));
        txtDescricao.setRows(5);
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyTyped(evt);
            }
        });
        srlDescricao.setViewportView(txtDescricao);

        pnlFundo.add(srlDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 270, 100));

        lblQuantidade.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(40, 40, 40));
        lblQuantidade.setText("* Quantidade");
        pnlFundo.add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lblValor.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(40, 40, 40));
        lblValor.setText("* Valor");
        pnlFundo.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        txtNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(40, 40, 40));
        txtNome.setBorder(null);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        pnlFundo.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 280, -1));

        txtMarca.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(40, 40, 40));
        txtMarca.setBorder(null);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        pnlFundo.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, -1));

        txtQuantidade.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(40, 40, 40));
        txtQuantidade.setBorder(null);
        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });
        pnlFundo.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 180, -1));

        txtCategoria.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(40, 40, 40));
        txtCategoria.setBorder(null);
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        pnlFundo.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 230, -1));

        txtModelo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(40, 40, 40));
        txtModelo.setBorder(null);
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        pnlFundo.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 230, -1));

        txtValor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtValor.setForeground(new java.awt.Color(40, 40, 40));
        txtValor.setBorder(null);
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        pnlFundo.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 140, -1));
        pnlFundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 280, 10));
        pnlFundo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 230, 10));
        pnlFundo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 10));
        pnlFundo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 230, 10));
        pnlFundo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 180, 10));
        pnlFundo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 140, 10));

        lblProduto.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(40, 40, 40));
        lblProduto.setText("Cod. Produto:");
        pnlFundo.add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        lblNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(40, 40, 40));
        lblNome.setText("* Nome");
        pnlFundo.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

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
    
    /**Método que acessa a tela de produtos*/
    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        new TelaProdutos().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblFecharMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    /**Método conclui o processo de edição do produto*/
    private void btnConcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConcluirMouseClicked
        
        if (validaCamposVazios()) {
            
            produtoBean.setId(Integer.parseInt(lblCodProduto.getText()));
            produtoBean.setNome(txtNome.getText());
            produtoBean.setCategoria(txtCategoria.getText());
            produtoBean.setMarca(txtMarca.getText());
            produtoBean.setModelo(txtModelo.getText());
            produtoBean.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            produtoBean.setValorUnitario(Double.parseDouble(txtValor.getText()));
            produtoBean.setDescricao(txtDescricao.getText());
            
            int resultado = JOptionPane.showConfirmDialog(this, "Deseja mesmo alterar o produto?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
               
            if (resultado == JOptionPane.YES_OPTION) {
                produto.alterarController(produtoBean);
                
                limpaCampos();

                new TelaProdutos().setVisible(true);
                this.dispose();
                
            } 
            
        }
        
    }//GEN-LAST:event_btnConcluirMouseClicked

    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseEntered
        setColor(btnLimpar);
    }//GEN-LAST:event_btnLimparMouseEntered

    private void btnLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseExited
        resetColor(btnLimpar);
    }//GEN-LAST:event_btnLimparMouseExited

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        limpaCampos();
        
    }//GEN-LAST:event_btnLimparMouseClicked
    
    /**Método que acessa a tela de produtos*/
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        new TelaProdutos().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarMouseClicked
    
    /**Método que valida o tipo de dado no campo de NOME*/
    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (txtNome.getText().length() < 30) {
            
            /**verifica se foi digitado número*/
            if (txtNome.getText().matches("^[0-9].*")) {
                evt.consume();
                
                /**caso tenha sido número, retorna que não é permitido número no campo*/
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                txtNome.setText("");
                
            }
            
        } else {
            
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 30", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_txtNomeKeyTyped

    /**Método que valida o tipo de dado no campo de CATEGORIA*/
    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        if (txtCategoria.getText().length() < 15) {
            
            /**verifica se foi digitado número*/
            if (txtCategoria.getText().matches("^[0-9].*")) {
                evt.consume();
                
                /**caso tenha sido número, retorna que não é permitido número no campo*/
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                txtCategoria.setText("");
            }
            
        } else {
            
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 15", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_txtCategoriaKeyTyped
    
    /**Método que valida o tipo de dado no campo de MARCA*/
    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        if (txtMarca.getText().length() < 20) {
            
            /**verifica se foi digitado número*/
            if (txtMarca.getText().matches("^[0-9].*")) {
                evt.consume();
                
                /**caso tenha sido número, retorna que não é permitido número no campo*/
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                txtMarca.setText("");
            }
            
        } else {
            
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 20", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_txtMarcaKeyTyped
    
    /**Método que valida o tipo de dado no campo de MODELO*/
    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        if (txtModelo.getText().length() < 15) {
            
            /**verifica se foi digitado número*/
            if (txtModelo.getText().matches("^[0-9].*")) {
                evt.consume();
                
                /**caso tenha sido número, retorna que não é permitido número no campo*/
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                txtModelo.setText("");
                
            }
            
        } else {
            
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 15", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_txtModeloKeyTyped
    
    /**Método que valida o tipo de dado no campo de QUANTIDADE*/
    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        if (txtQuantidade.getText().length() < 5) {

            String caracteres = "0987654321";

            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();

            }

        } else {
            
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 5", "Erro", JOptionPane.ERROR_MESSAGE);
            txtQuantidade.setText("");

        }

    }//GEN-LAST:event_txtQuantidadeKeyTyped
    
    /**Método que valida o tipo de dado no campo de VALOR*/
    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        if (txtValor.getText().length() < 7) {

            String caracteres = "0987654321,";

            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();

            }

        } else {
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 7", "Erro", JOptionPane.ERROR_MESSAGE);
            txtValor.setText("");

        }

    }//GEN-LAST:event_txtValorKeyTyped

    /**Método que valida o tipo de dado no campo de DESCRIÇÃO*/
    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyTyped
        if (txtDescricao.getText().length() < 250) {
            
        } else {
            
            /**caso seja maior, estoura o limite de caracteres*/
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 250", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_txtDescricaoKeyTyped
    
    /**Método que minimiza a tela*/
    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lblMinimizarMouseClicked
    
    
    /**Método que faz a conversão do campo QUANTIDADE de String para Inteiro*/
    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        try {
            
            if (!this.txtQuantidade.getText().equalsIgnoreCase("")) {
                
                /**efetua a conversão para inteiro*/
                Integer.parseInt(txtQuantidade.getText());

            }

        /**caso não consiga, exibe mensagem de erro de conversão */ 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo Quantidade", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            txtQuantidade.setText("");

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_txtQuantidadeFocusLost
    
    /**Método que faz a conversão do campo VALOR de String para Double*/
    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        try {
            if (!this.txtValor.getText().equalsIgnoreCase("")) {
                
                /**efetua a conversão para double e converte a vírgula em ponto*/
                Double.parseDouble(txtValor.getText().replace(",", "."));

            }

        /**caso não consiga, exibe mensagem de erro de conversão */
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo Valor", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            txtValor.setText("");

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_txtValorFocusLost
    
    /*
    * @param prodBean - Objeto do tipo Produto
    *
    * Método que preenche todos os campos da tela com os dados do produto que irá ser editado
    */
    public void preencheCampos(Produto prodBean) {
        
        ArrayList<Produto> listaProduto = produto.consultarController(prodBean);
        
        int i = 0;

        for (Object obj : listaProduto) {
            Produto produto = (Produto) obj;
            
            lblCodProduto.setText(Integer.toString(produto.getId()));
            txtNome.setText(produto.getNome());
            txtCategoria.setText(produto.getCategoria());
            txtMarca.setText(produto.getMarca());
            txtModelo.setText(produto.getModelo());
            txtQuantidade.setText(Integer.toString(produto.getQuantidade()));
            txtValor.setText(Double.toString(produto.getValorUnitario()));
            txtDescricao.setText(produto.getDescricao());
            i++;

        }

    }
    
    /**Método que verifica se os campos da tela estão vazios*/
    private boolean validaCamposVazios() {
        if (this.txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome!");
            return false;
        }
        if (this.txtCategoria.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Categoria!");
            return false;
        }
        if (this.txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Marca!");
            return false;
        }
        if (this.txtModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Modelo!");
            return false;
        }
        if (this.txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Quantidade!");
            return false;
        }
        if (this.txtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Valor!");
            return false;
        }
        if (this.txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Descrição!");
            return false;
        }
        
        return true;
        
    }

    /**Método que limpas os campos da tela*/
    private void limpaCampos() {
        txtNome.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
    }

    /**Método que altera a cor de um objeto ao passar o mouse por cima*/
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(40, 40, 40));
    }

    /**Método que restaura para a cor original do objeto ao tirar o mouse de cima*/
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
            java.util.logging.Logger.getLogger(TelaProdutosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutosEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutosEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnConcluir;
    private javax.swing.JPanel btnLimpar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblConcluir;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEditarProduto;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblLimpar;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane srlDescricao;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
