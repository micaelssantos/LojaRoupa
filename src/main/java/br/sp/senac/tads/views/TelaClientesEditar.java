package br.sp.senac.tads.views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaClientesEditar extends javax.swing.JFrame {

    /**
     * Creates new form TelaBase
     */
    public TelaClientesEditar() {
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

        rdoGrupoEstCivil = new javax.swing.ButtonGroup();
        rdoGrupoSexo = new javax.swing.ButtonGroup();
        pnlFundo = new javax.swing.JPanel();
        pnlBarraTitulo = new javax.swing.JPanel();
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCadastroCliente = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JPanel();
        lblLimpar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JPanel();
        lblSalvar = new javax.swing.JLabel();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblEstadoCivil = new javax.swing.JLabel();
        rdoCasado = new javax.swing.JRadioButton();
        rdoSolteiro = new javax.swing.JRadioButton();
        rdoViuvo = new javax.swing.JRadioButton();
        rdoOutro = new javax.swing.JRadioButton();
        lblCPF = new javax.swing.JLabel();
        txtFormatCPF = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblSexo = new javax.swing.JLabel();
        rdoFeminino = new javax.swing.JRadioButton();
        rdoMasculino = new javax.swing.JRadioButton();
        rdoOutro2 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtFormatadDtNasc = new javax.swing.JFormattedTextField();
        lblDataNascimento = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        pnlEndereco = new javax.swing.JPanel();
        lblLogradouro = new javax.swing.JLabel();
        txtFormatadCEP = new javax.swing.JFormattedTextField();
        lblCEP = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblLogradouro1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        pnlContato = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtFormatedTelefone = new javax.swing.JFormattedTextField();
        txtFormatedCelular = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

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

        lblCadastroCliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCadastroCliente.setText("Cadastro de cliente");
        pnlBarraTitulo.add(lblCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 40));

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

        btnSalvar.setBackground(new java.awt.Color(0, 85, 166));
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSalvar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblSalvar.setForeground(new java.awt.Color(255, 255, 255));
        lblSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalvar.setText("Salvar");
        btnSalvar.add(lblSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        pnlFundo.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 40));

        pnlDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));
        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true), "Dados pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18))); // NOI18N
        pnlDadosPessoais.setForeground(new java.awt.Color(40, 40, 40));
        pnlDadosPessoais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(40, 40, 40));
        lblID.setText("ID:");
        pnlDadosPessoais.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        txtNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(40, 40, 40));
        txtNome.setBorder(null);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        pnlDadosPessoais.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, -1));
        pnlDadosPessoais.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 10));

        lblEstadoCivil.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblEstadoCivil.setForeground(new java.awt.Color(40, 40, 40));
        lblEstadoCivil.setText("* Estado civil");
        pnlDadosPessoais.add(lblEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        rdoCasado.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoEstCivil.add(rdoCasado);
        rdoCasado.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoCasado.setText("Casado(a)");
        pnlDadosPessoais.add(rdoCasado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        rdoSolteiro.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoEstCivil.add(rdoSolteiro);
        rdoSolteiro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoSolteiro.setText("Solteiro(a)");
        pnlDadosPessoais.add(rdoSolteiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        rdoViuvo.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoEstCivil.add(rdoViuvo);
        rdoViuvo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoViuvo.setText("Viuvo(a)");
        pnlDadosPessoais.add(rdoViuvo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        rdoOutro.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoEstCivil.add(rdoOutro);
        rdoOutro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoOutro.setText("Outro");
        pnlDadosPessoais.add(rdoOutro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        lblCPF.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(40, 40, 40));
        lblCPF.setText("* CPF");
        pnlDadosPessoais.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        txtFormatCPF.setBorder(null);
        txtFormatCPF.setForeground(new java.awt.Color(40, 40, 40));
        try {
            txtFormatCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCPF.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pnlDadosPessoais.add(txtFormatCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 160, -1));
        pnlDadosPessoais.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 160, 10));

        lblSexo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(40, 40, 40));
        lblSexo.setText("* Sexo");
        pnlDadosPessoais.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        rdoFeminino.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoSexo.add(rdoFeminino);
        rdoFeminino.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoFeminino.setText("Feminino");
        pnlDadosPessoais.add(rdoFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        rdoMasculino.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoSexo.add(rdoMasculino);
        rdoMasculino.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoMasculino.setText("Masculino");
        pnlDadosPessoais.add(rdoMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        rdoOutro2.setBackground(new java.awt.Color(255, 255, 255));
        rdoGrupoSexo.add(rdoOutro2);
        rdoOutro2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rdoOutro2.setText("Outro");
        pnlDadosPessoais.add(rdoOutro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));
        pnlDadosPessoais.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 160, 10));

        txtFormatadDtNasc.setBorder(null);
        txtFormatadDtNasc.setForeground(new java.awt.Color(40, 40, 40));
        try {
            txtFormatadDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatadDtNasc.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pnlDadosPessoais.add(txtFormatadDtNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 160, -1));

        lblDataNascimento.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(40, 40, 40));
        lblDataNascimento.setText("* Data de nascimento");
        pnlDadosPessoais.add(lblDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        lblNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(40, 40, 40));
        lblNome.setText("* Nome");
        pnlDadosPessoais.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        pnlFundo.add(pnlDadosPessoais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 190));

        pnlEndereco.setBackground(new java.awt.Color(255, 255, 255));
        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true), "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18))); // NOI18N
        pnlEndereco.setForeground(new java.awt.Color(40, 40, 40));
        pnlEndereco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogradouro.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblLogradouro.setForeground(new java.awt.Color(40, 40, 40));
        lblLogradouro.setText("Logradouro");
        pnlEndereco.add(lblLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        txtFormatadCEP.setBorder(null);
        txtFormatadCEP.setForeground(new java.awt.Color(40, 40, 40));
        try {
            txtFormatadCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatadCEP.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pnlEndereco.add(txtFormatadCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        lblCEP.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(40, 40, 40));
        lblCEP.setText("CEP");
        pnlEndereco.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtLogradouro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtLogradouro.setForeground(new java.awt.Color(40, 40, 40));
        txtLogradouro.setBorder(null);
        txtLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLogradouroKeyTyped(evt);
            }
        });
        pnlEndereco.add(txtLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 320, -1));

        lblLogradouro1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblLogradouro1.setForeground(new java.awt.Color(40, 40, 40));
        lblLogradouro1.setText("Nº");
        pnlEndereco.add(lblLogradouro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        txtNumero.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(40, 40, 40));
        txtNumero.setBorder(null);
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        pnlEndereco.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 90, -1));
        pnlEndereco.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 10));
        pnlEndereco.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 320, 10));
        pnlEndereco.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 90, 10));

        pnlFundo.add(pnlEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 780, 110));

        pnlContato.setBackground(new java.awt.Color(255, 255, 255));
        pnlContato.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true), "Contato", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18))); // NOI18N
        pnlContato.setForeground(new java.awt.Color(40, 40, 40));
        pnlContato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTelefone.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(40, 40, 40));
        lblTelefone.setText("Telefone");
        pnlContato.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(40, 40, 40));
        lblEmail.setText("* E-mail");
        pnlContato.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        lblCelular.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(40, 40, 40));
        lblCelular.setText("Celular");
        pnlContato.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        txtFormatedTelefone.setBorder(null);
        txtFormatedTelefone.setForeground(new java.awt.Color(40, 40, 40));
        try {
            txtFormatedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatedTelefone.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pnlContato.add(txtFormatedTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        txtFormatedCelular.setBorder(null);
        txtFormatedCelular.setForeground(new java.awt.Color(40, 40, 40));
        try {
            txtFormatedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatedCelular.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pnlContato.add(txtFormatedCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 150, -1));

        txtEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(40, 40, 40));
        txtEmail.setBorder(null);
        pnlContato.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 310, -1));
        pnlContato.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 10));
        pnlContato.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, 10));
        pnlContato.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 310, 10));

        pnlFundo.add(pnlContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 780, 110));

        getContentPane().add(pnlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        setColor(btnSalvar);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        resetColor(btnSalvar);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        //VOLTAR PARA A TELA CLIENTES
        new TelaClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFecharMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // TODO add your handling code here:
        if (campoObrigatorio()) {
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
            limparCampos();
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseEntered
        setColor(btnLimpar);
    }//GEN-LAST:event_btnLimparMouseEntered

    private void btnLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseExited
        resetColor(btnLimpar);
    }//GEN-LAST:event_btnLimparMouseExited

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        limparCampos();
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        //VOLTAR PARA A TELA CLIENTES
        new TelaClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        if (txtNome.getText().length() < 30) {
            //verifica se foi digitado o numero
            if (txtNome.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido numero retorna que não é permitido
                JOptionPane.showMessageDialog(this, "Permitido somente letras no campo \"Nome\"!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                txtNome.setText("");
            }
        } else {
            //caso seja maior estoura o limite
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 30 caracteres!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtLogradouroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLogradouroKeyTyped
        // TODO add your handling code here:
        if (txtLogradouro.getText().length() < 30) {
            
        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 30 caracteres", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtLogradouroKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        if (txtNumero.getText().length() < 5) {
            if (txtNumero.getText().matches("^[a-zA-Z]")) {
                evt.consume();
                txtNumero.setText("");
                JOptionPane.showMessageDialog(this, "Não é permitiddo letra no campo \"Nº\"",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 5 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    //ALTERAR A COR DO OBJETO AO PASSAR O MOUSE
    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(40, 40, 40));
    }

    //VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA
    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 85, 166));
    }

    private void limparCampos() {
        txtEmail.setText("");
        txtLogradouro.setText("");
        txtFormatCPF.setText("");
        txtFormatadCEP.setText("");
        txtFormatadDtNasc.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        rdoGrupoEstCivil.clearSelection();
        rdoGrupoSexo.clearSelection();
        txtFormatedTelefone.setText("");
        txtFormatedCelular.setText("");
        txtEmail.setText("");
    }

    private boolean campoObrigatorio() {
        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo \"Nome\" é obrigatório!");
            return false;
        }
        if (this.txtFormatCPF.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(this, "Campo \"CPF\" é obrigatório!");
            return false;
        }
        if (this.txtFormatadDtNasc.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "Campo \"Data de Nascimento\" é obrigatório!");
            return false;
        }
        if (this.rdoGrupoEstCivil.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Campo \"Estado Civil\" é obrigatório!");
            return false;
        }
        if (this.rdoGrupoSexo.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Campo \"Sexo\" é obrigatório!");
            return false;
        }
        if (this.txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo \"E-mail\" é obrigatório!");
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
            java.util.logging.Logger.getLogger(TelaClientesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientesEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientesEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnLimpar;
    private javax.swing.JPanel btnSalvar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastroCliente;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLimpar;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblLogradouro1;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlBarraTitulo;
    private javax.swing.JPanel pnlContato;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JRadioButton rdoCasado;
    private javax.swing.JRadioButton rdoFeminino;
    private javax.swing.ButtonGroup rdoGrupoEstCivil;
    private javax.swing.ButtonGroup rdoGrupoSexo;
    private javax.swing.JRadioButton rdoMasculino;
    private javax.swing.JRadioButton rdoOutro;
    private javax.swing.JRadioButton rdoOutro2;
    private javax.swing.JRadioButton rdoSolteiro;
    private javax.swing.JRadioButton rdoViuvo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFormatCPF;
    private javax.swing.JFormattedTextField txtFormatadCEP;
    private javax.swing.JFormattedTextField txtFormatadDtNasc;
    private javax.swing.JFormattedTextField txtFormatedCelular;
    private javax.swing.JFormattedTextField txtFormatedTelefone;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
