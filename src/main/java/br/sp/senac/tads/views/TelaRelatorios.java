package br.sp.senac.tads.views;

import br.sp.senac.tads.controller.RelatoriosController;
import br.sp.senac.tads.model.Relatorios;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
* @author Rene.Silva
* @see br.sp.senac.tads.controller.RelatoriosController
* @see br.sp.senac.tads.model.Relatorios
 */
public class TelaRelatorios extends javax.swing.JFrame {

    Relatorios relatorioBean = new Relatorios();
    RelatoriosController relatorio = new RelatoriosController();
    String usuario_sessao;

    public TelaRelatorios() {
        initComponents();
    }

    public TelaRelatorios(String sessao) {
        initComponents();
        setIcon(this);
        this.usuario_sessao = sessao;
        lblUsuario.setText(usuario_sessao);
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
        btnDetalhar = new javax.swing.JPanel();
        lblDetalhar = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblRelatorioSintetico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSintetico = new javax.swing.JTable();
        lblValorTotalPeriodo = new javax.swing.JLabel();
        lblAte = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JPanel();
        lblPesquisar = new javax.swing.JLabel();
        lblValorPeriodo = new javax.swing.JLabel();
        jdtAte = new com.toedter.calendar.JDateChooser();
        jdtDE = new com.toedter.calendar.JDateChooser();

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
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("null");
        pnlBarraLateral.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, 150, 40));

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilitarios/logout.png"))); // NOI18N
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        pnlBarraLateral.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        btnProdutos.setBackground(new java.awt.Color(0, 85, 166));
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProdutosMouseExited(evt);
            }
        });
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

        btnRelatorios.setBackground(new java.awt.Color(40, 40, 40));
        btnRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
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

        btnDetalhar.setBackground(new java.awt.Color(0, 85, 166));
        btnDetalhar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetalhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetalharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetalharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetalharMouseExited(evt);
            }
        });
        btnDetalhar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDetalhar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblDetalhar.setForeground(new java.awt.Color(255, 255, 255));
        lblDetalhar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalhar.setText("Detalhar");
        btnDetalhar.add(lblDetalhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlFundo.add(btnDetalhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

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

        pnlFundo.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 90, 40));

        lblFechar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(40, 40, 40));
        lblFechar.setText("X");
        lblFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });
        pnlFundo.add(lblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        lblMinimizar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(40, 40, 40));
        lblMinimizar.setText("_");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        pnlFundo.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        lblRelatorioSintetico.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblRelatorioSintetico.setText("Relatório sintético");
        pnlFundo.add(lblRelatorioSintetico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N

        tblSintetico.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tblSintetico.setForeground(new java.awt.Color(40, 40, 40));
        tblSintetico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venda", "Nome Cliente", "Valor Total", "Data Venda"
            }
        ));
        tblSintetico.setToolTipText("");
        tblSintetico.setGridColor(new java.awt.Color(40, 40, 40));
        tblSintetico.setSelectionBackground(new java.awt.Color(0, 85, 166));
        jScrollPane1.setViewportView(tblSintetico);
        if (tblSintetico.getColumnModel().getColumnCount() > 0) {
            tblSintetico.getColumnModel().getColumn(0).setResizable(false);
            tblSintetico.getColumnModel().getColumn(1).setResizable(false);
            tblSintetico.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 540, 330));

        lblValorTotalPeriodo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblValorTotalPeriodo.setForeground(new java.awt.Color(40, 40, 40));
        lblValorTotalPeriodo.setText("Valor total do período:");
        pnlFundo.add(lblValorTotalPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        lblAte.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblAte.setForeground(new java.awt.Color(40, 40, 40));
        lblAte.setText("Até:");
        pnlFundo.add(lblAte, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 40, -1));

        lblPeriodo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(40, 40, 40));
        lblPeriodo.setText("Período");
        pnlFundo.add(lblPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, -1));

        lblDe.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblDe.setForeground(new java.awt.Color(40, 40, 40));
        lblDe.setText("De:");
        pnlFundo.add(lblDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 40, -1));

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

        lblPesquisar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesquisar.setText("Pesquisar");
        btnPesquisar.add(lblPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlFundo.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 90, 40));

        lblValorPeriodo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblValorPeriodo.setForeground(new java.awt.Color(40, 40, 40));
        lblValorPeriodo.setText("R$ 0,00");
        pnlFundo.add(lblValorPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 130, 30));

        jdtAte.setDateFormatString("yyyy-MM-dd");
        pnlFundo.add(jdtAte, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 140, -1));

        jdtDE.setDateFormatString("yyyy-MM-dd");
        pnlFundo.add(jdtDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, -1));

        getContentPane().add(pnlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseEntered
        setColor(btnProdutos);
    }//GEN-LAST:event_btnProdutosMouseEntered

    private void btnProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseExited
        resetColor(btnProdutos);
    }//GEN-LAST:event_btnProdutosMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        setColor(btnClientes);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        resetColor(btnClientes);
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseExited
        resetColor(btnRelatorios);
    }//GEN-LAST:event_btnRelatoriosMouseExited

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        setColor(btnVoltar);
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        resetColor(btnVoltar);
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        /**Volta para o Menu Principal*/
        new TelaMenu(usuario_sessao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        /**Volta para o Menu Principal*/
        new TelaMenu(usuario_sessao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFecharMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        /**Volta para a Tela de Login*/
        new TelaLoginInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    /**Método que pesquisa e detalha itens de uma determinada compra selecionada */
    private void btnDetalharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalharMouseClicked

        int linhaSelecionada = tblSintetico.getSelectedRow();

        if (linhaSelecionada >= 0) {

            int idVenda = Integer.parseInt(tblSintetico.getValueAt(tblSintetico.getSelectedRow(), 0).toString());

            new TelaRelatorioAnalitico(usuario_sessao, idVenda).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma Venda!", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDetalharMouseClicked

    private void btnDetalharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalharMouseEntered
        setColor(btnDetalhar);
    }//GEN-LAST:event_btnDetalharMouseEntered

    private void btnDetalharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalharMouseExited
        resetColor(btnDetalhar);
    }//GEN-LAST:event_btnDetalharMouseExited

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        /** Acessa a tela de Clientes */
        new TelaClientes(usuario_sessao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseClicked
        /** Acessa a tela de Produtos */
        new TelaProdutos(usuario_sessao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosMouseClicked
    
    /**Método que pesquisa umas venda atravéz de um período selecionado DE: ? Até: ? */
    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        if (jdtDE.getDate() != null && jdtAte.getDate() != null) {
            if (jdtDE.getDate().before(jdtAte.getDate())) {

                Long diff = jdtAte.getDate().getTime() - jdtDE.getDate().getTime();
                Long diffDias = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                //Validação do limite de 30 dias no qual o relatório pode ser gerado
                if (diffDias <= 30 && diffDias >= 0) {
                    JOptionPane.showMessageDialog(this, "Pesquisa realizada!");

                    String d1 = sp.format(jdtDE.getDate());
                    String d2 = sp.format(jdtAte.getDate());

                    //Carrega a tabela com os itens dentro das condições impostas
                    CarregarRelatorioSintetico(d1, d2);

                } else {
                    JOptionPane.showMessageDialog(this, "Diferença deve ser no máximo de 30 dias",
                            "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "A data de término dever ser maior que a data de início!",
                        "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Informe um período para Pesquisar!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        setColor(btnPesquisar);
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        resetColor(btnPesquisar);
    }//GEN-LAST:event_btnPesquisarMouseExited
    /**Método que carrega as linhas da tabela do Relatório Sintético*/
    public void CarregarRelatorioSintetico(String d1, String d2) {

        double valor = 0;

        ArrayList<RelatoriosController> listaVendas = relatorio.listarRelatorioController(d1, d2);

        if (listaVendas.size() > 0) {

            DefaultTableModel tmSintetico = new DefaultTableModel();

            tmSintetico.addColumn("ID Venda");
            tmSintetico.addColumn("Nome Cliente");
            tmSintetico.addColumn("Valor Total");
            tmSintetico.addColumn("Data Venda");

            tblSintetico.setModel(tmSintetico);

            tmSintetico.setRowCount(0);

            int i = 0;

            for (Object obj : listaVendas) {
                Relatorios bean = (Relatorios) obj;
                tmSintetico.addRow(new String[1]);
                tblSintetico.setValueAt(bean.getIdVenda(), i, 0);
                tblSintetico.setValueAt(bean.getNomeCliente(), i, 1);
                tblSintetico.setValueAt(bean.getValorTotalvenda(), i, 2);
                tblSintetico.setValueAt(bean.getData(), i, 3);

                valor = Double.parseDouble(String.valueOf(tblSintetico.getModel().getValueAt(i, 2))) + valor;
                i++;
            }

            tblSintetico.getColumnModel().getColumn(0).setPreferredWidth(120); //ID VENDA
            tblSintetico.getColumnModel().getColumn(1).setPreferredWidth(300); //CLIENTE
            tblSintetico.getColumnModel().getColumn(2).setPreferredWidth(150); //VALOR TOTAL  
            tblSintetico.getColumnModel().getColumn(3).setPreferredWidth(200); //DATA
            this.lblValorPeriodo.setText(String.valueOf(valor));
        }
    }

    public void setIcon(JFrame frm) {
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/utilitarios/roupas.png"));
    }

    /** Alterar a cor do objeto ao passar o mouse*/
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(40, 40, 40));
    }

    /**Voltar para a cor padrão do objeto ao tirar o mouse de cima */
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
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnDetalhar;
    private javax.swing.JPanel btnPesquisar;
    private javax.swing.JPanel btnProdutos;
    private javax.swing.JPanel btnRelatorios;
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdtAte;
    private com.toedter.calendar.JDateChooser jdtDE;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblDetalhar;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblIconeClientes;
    private javax.swing.JLabel lblIconeProdutos;
    private javax.swing.JLabel lblIconeRelatorios;
    private javax.swing.JLabel lblIconeUsuario;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatorioSintetico;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblValorPeriodo;
    private javax.swing.JLabel lblValorTotalPeriodo;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel pnlBarraLateral;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JTable tblSintetico;
    // End of variables declaration//GEN-END:variables
}
