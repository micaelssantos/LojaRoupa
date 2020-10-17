/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads.views;

import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaBase
     */
    public TelaMenu() {
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
        pnl_barraTitulo = new javax.swing.JPanel();
        btn_fechar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        btn_vendas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_produtos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_relatorios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barraTitulo.setBackground(new java.awt.Color(0, 85, 166));
        pnl_barraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_fechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btn_fechar.setForeground(new java.awt.Color(255, 255, 255));
        btn_fechar.setText("X");
        btn_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fecharMouseClicked(evt);
            }
        });
        pnl_barraTitulo.add(btn_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        btn_minimizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btn_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_minimizar.setText("_");
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_barraTitulo.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/user.png"))); // NOI18N
        pnl_barraTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 40, 40));

        lbl_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuario.setText("Bem vindo, ADMIN");
        pnl_barraTitulo.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, -1, 40));

        btn_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/logout.png"))); // NOI18N
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        pnl_barraTitulo.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 40));

        pnl_fundo.add(pnl_barraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        btn_vendas.setBackground(new java.awt.Color(0, 85, 166));
        btn_vendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_vendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_vendasMouseExited(evt);
            }
        });
        btn_vendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vendas");
        btn_vendas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/vendas.png"))); // NOI18N
        btn_vendas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_fundo.add(btn_vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 170, 180));

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

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Produtos");
        btn_produtos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/produtos.png"))); // NOI18N
        btn_produtos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_fundo.add(btn_produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 170, 180));

        btn_clientes.setBackground(new java.awt.Color(0, 85, 166));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clientes");
        btn_clientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/clientes.png"))); // NOI18N
        btn_clientes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_fundo.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 170, 180));

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

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Relatórios");
        btn_relatorios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/relatorios.png"))); // NOI18N
        btn_relatorios.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_fundo.add(btn_relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 170, 180));

        btn_sair.setBackground(new java.awt.Color(0, 85, 166));
        btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sairMouseExited(evt);
            }
        });
        btn_sair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sair");
        btn_sair.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        pnl_fundo.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

        getContentPane().add(pnl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_vendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendasMouseEntered
        setColor(btn_vendas);
    }//GEN-LAST:event_btn_vendasMouseEntered

    private void btn_vendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendasMouseExited
        resetColor(btn_vendas);
    }//GEN-LAST:event_btn_vendasMouseExited

    private void btn_produtosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseEntered
        setColor(btn_produtos);
    }//GEN-LAST:event_btn_produtosMouseEntered

    private void btn_produtosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseExited
        resetColor(btn_produtos);
    }//GEN-LAST:event_btn_produtosMouseExited

    private void btn_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseEntered
        setColor(btn_clientes);
    }//GEN-LAST:event_btn_clientesMouseEntered

    private void btn_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseExited
        resetColor(btn_clientes);
    }//GEN-LAST:event_btn_clientesMouseExited

    private void btn_relatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseEntered
        setColor(btn_relatorios);
    }//GEN-LAST:event_btn_relatoriosMouseEntered

    private void btn_relatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseExited
        resetColor(btn_relatorios);
    }//GEN-LAST:event_btn_relatoriosMouseExited

    private void btn_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseEntered
        setColor(btn_sair);
    }//GEN-LAST:event_btn_sairMouseEntered

    private void btn_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseExited
        resetColor(btn_sair);
    }//GEN-LAST:event_btn_sairMouseExited

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        //ENCERRA A APLICAÇÃO
        System.exit(0);
    }//GEN-LAST:event_btn_sairMouseClicked

    private void btn_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fecharMouseClicked
        //ENCERRA A APLICAÇÃO
        System.exit(0);
        
    }//GEN-LAST:event_btn_fecharMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked

        //VOLTAR PARA A TELA DE LOGIN
        TelaLogin login = new TelaLogin();
        login.show();
        this.dispose();

    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtosMouseClicked
        //ACESSA A TELA DE PRODUTOS
        TelaProdutos produtos = new TelaProdutos();
        produtos.show();
        this.dispose();

    }//GEN-LAST:event_btn_produtosMouseClicked

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        //ACESSA A TELA DE CLIENTES
        TelaClientes clientes = new TelaClientes();
        clientes.show();
        this.dispose();

    }//GEN-LAST:event_btn_clientesMouseClicked

    private void btn_vendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendasMouseClicked
        //ACESSA A TELA DE VENDAS
        TelaVendas venda = new TelaVendas();
        venda.show();
        this.dispose();

    }//GEN-LAST:event_btn_vendasMouseClicked

    private void btn_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_relatoriosMouseClicked
        //ACESSA A TELA DE RELATÓRIOS
        TelaRelatorios relatorio = new TelaRelatorios();
        relatorio.show();
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JLabel btn_fechar;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JPanel btn_produtos;
    private javax.swing.JPanel btn_relatorios;
    private javax.swing.JPanel btn_sair;
    private javax.swing.JPanel btn_vendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_barraTitulo;
    private javax.swing.JPanel pnl_fundo;
    // End of variables declaration//GEN-END:variables
}
