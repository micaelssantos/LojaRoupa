package br.sp.senac.tads.views;

import br.sp.senac.tads.controller.LoginController;
import br.sp.senac.tads.model.Login;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author joliveira
 * @see br.sp.senac.tads.controller.LoginController
 * @see br.sp.senac.tads.model.Login
 *
 */
public class TelaLoginInicial extends javax.swing.JFrame {

    LoginController logController = new LoginController();
    Login logBean = new Login();

    public TelaLoginInicial() {
        initComponents();
        setIcon(this);

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
        lblBemVindo = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarraTitulo.setBackground(new java.awt.Color(0, 85, 166));
        pnlBarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemVindo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("Bem vindo");
        pnlBarraTitulo.add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        lblFechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(255, 255, 255));
        lblFechar.setText("X");
        lblFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });
        pnlBarraTitulo.add(lblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        pnlFundo.add(pnlBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        btnSair.setBackground(new java.awt.Color(0, 85, 166));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSair.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setText("Sair");
        btnSair.add(lblSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        pnlFundo.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 80, 40));

        btnAcessar.setBackground(new java.awt.Color(0, 85, 166));
        btnAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcessarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcessarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcessarMouseExited(evt);
            }
        });
        btnAcessar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Acessar");
        btnAcessar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

        pnlFundo.add(btnAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 80, 40));

        lblUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblUsuario.setText("Usuário");
        pnlFundo.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        lblSenha.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblSenha.setText("Senha");
        pnlFundo.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtLogin.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtLogin.setBorder(null);
        pnlFundo.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 240, -1));
        pnlFundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 240, 10));
        pnlFundo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 240, 10));

        txtSenha.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtSenha.setBorder(null);
        pnlFundo.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, -1));

        getContentPane().add(pnlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        setColor(btnSair);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        resetColor(btnSair);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        //Encerra aplicação
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnAcessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseClicked
        logBean.setLogin(txtLogin.getText());
        logBean.setSenha(String.valueOf(txtSenha.getPassword()));
        if (validaLogin(logBean) && validaCamposVazios()) {
            limpaCampos();
            TelaMenu tm = new TelaMenu(logBean.getLogin().toString());
            tm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnAcessarMouseClicked

    private void btnAcessarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseEntered
        setColor(btnAcessar);
    }//GEN-LAST:event_btnAcessarMouseEntered

    private void btnAcessarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcessarMouseExited
        resetColor(btnAcessar);
    }//GEN-LAST:event_btnAcessarMouseExited

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        //Encerra aplicação
        System.exit(0);
    }//GEN-LAST:event_lblFecharMouseClicked

    public void setIcon(JFrame frm) {
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/utilitarios/roupas.png"));
    }

    public boolean validaLogin(Login beanLog) {

        boolean status;

        status = logController.validaController(beanLog);

        if (status == true) {
            status = true;
            JOptionPane.showMessageDialog(this, "Bem vindo, " + logBean.getLogin() + "!");
        } else {
            status = false;
            JOptionPane.showMessageDialog(this, "Usuário não autorizado", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            limpaCampos();
        }
        return status;
    }

    //ALTERAR A COR DO OBJETO AO PASSAR O MOUSE
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(40, 40, 40));
    }

    //VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA
    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 85, 166));
    }

    private boolean validaCamposVazios() {
        String senha = String.valueOf(txtSenha.getPassword());

        if (this.txtLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return false;
        }
        if (senha.equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo de Senha!");
            return false;
        }
        return true;
    }

    private void limpaCampos() {
        txtLogin.setText("");
        txtSenha.setText("");
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
            java.util.logging.Logger.getLogger(TelaLoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAcessar;
    private javax.swing.JPanel btnSair;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}