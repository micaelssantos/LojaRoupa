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
public class TelaBase extends javax.swing.JFrame {

    /**
     * Creates new form TelaBase
     */
    public TelaBase() {
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
        btn_voltar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barraLateral.setBackground(new java.awt.Color(0, 85, 166));
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

        btn_clientes.setBackground(new java.awt.Color(0, 85, 166));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
        });
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
            java.util.logging.Logger.getLogger(TelaBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBase().setVisible(true);
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
    private javax.swing.JPanel btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_barraLateral;
    private javax.swing.JPanel pnl_fundo;
    // End of variables declaration//GEN-END:variables
}
