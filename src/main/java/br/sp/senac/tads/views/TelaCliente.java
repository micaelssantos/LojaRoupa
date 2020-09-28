/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

TELA CADASTRO DE CLIENTE - RESPONSÁVEL: DALILA DI LAZZARO TADS 2B NOTURNO
 */
package br.sp.senac.tads.views;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author dilaz
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
        //código para centralizar
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupoSexo = new javax.swing.ButtonGroup();
        radioGrupoEstCivil = new javax.swing.ButtonGroup();
        painel_Cadastro = new javax.swing.JPanel();
        jImgUser = new javax.swing.JLabel();
        painelCPFNomeNasc = new javax.swing.JPanel();
        jNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jCPF = new javax.swing.JLabel();
        txtFormatCPF = new javax.swing.JFormattedTextField();
        jDtNascimento = new javax.swing.JLabel();
        txtFormatadDtNasc = new javax.swing.JFormattedTextField();
        jEstCivil = new javax.swing.JLabel();
        radioCasado = new javax.swing.JRadioButton();
        radioSolteiro = new javax.swing.JRadioButton();
        radioViuvo = new javax.swing.JRadioButton();
        radioOutroCivil = new javax.swing.JRadioButton();
        jSexo = new javax.swing.JLabel();
        radioFeminino = new javax.swing.JRadioButton();
        radioMasculino = new javax.swing.JRadioButton();
        radioOutro = new javax.swing.JRadioButton();
        painelEndereco = new javax.swing.JPanel();
        jEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jCEP = new javax.swing.JLabel();
        txtFormatadCEP = new javax.swing.JFormattedTextField();
        painelRadioEmail = new javax.swing.JPanel();
        jEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        txtFormatedTelefone = new javax.swing.JFormattedTextField();
        txtFormatedCelular = new javax.swing.JFormattedTextField();
        painel_Ok_Cancelar = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrarNovo = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        painel_Cadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 15))); // NOI18N
        painel_Cadastro.setToolTipText("Painel_Cadastro");

        jImgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Admin-icon.png"))); // NOI18N

        painelCPFNomeNasc.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));
        painelCPFNomeNasc.setToolTipText("Painel nome, cpf, dt nasc");

        jNome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jNome.setText("Nome:*");

        jCPF.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jCPF.setText("CPF:*");

        try {
            txtFormatCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCPF.setToolTipText("");
        txtFormatCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormatCPFActionPerformed(evt);
            }
        });

        jDtNascimento.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jDtNascimento.setText("Data de Nascimento:");

        try {
            txtFormatadDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jEstCivil.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jEstCivil.setText("Estado civíl:");

        radioGrupoEstCivil.add(radioCasado);
        radioCasado.setText("Casado(a)");

        radioGrupoEstCivil.add(radioSolteiro);
        radioSolteiro.setText("Solteiro(a)");

        radioGrupoEstCivil.add(radioViuvo);
        radioViuvo.setText("Viuvo(a)");

        radioGrupoEstCivil.add(radioOutroCivil);
        radioOutroCivil.setText("Outro");

        jSexo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jSexo.setText("Sexo:");

        radioGrupoSexo.add(radioFeminino);
        radioFeminino.setText("Feminino");

        radioGrupoSexo.add(radioMasculino);
        radioMasculino.setText("Masculino");
        radioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasculinoActionPerformed(evt);
            }
        });

        radioGrupoSexo.add(radioOutro);
        radioOutro.setText("Outro");

        javax.swing.GroupLayout painelCPFNomeNascLayout = new javax.swing.GroupLayout(painelCPFNomeNasc);
        painelCPFNomeNasc.setLayout(painelCPFNomeNascLayout);
        painelCPFNomeNascLayout.setHorizontalGroup(
            painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jEstCivil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSexo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFormatCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioCasado)
                                    .addComponent(radioFeminino))
                                .addGap(18, 18, 18)
                                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                                        .addComponent(radioSolteiro)
                                        .addGap(12, 12, 12)
                                        .addComponent(radioViuvo)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioOutroCivil))
                                    .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                                        .addComponent(radioMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioOutro))))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDtNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormatadDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        painelCPFNomeNascLayout.setVerticalGroup(
            painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCPFNomeNascLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF)
                    .addComponent(txtFormatCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormatadDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCasado)
                    .addComponent(radioSolteiro)
                    .addComponent(radioViuvo)
                    .addComponent(radioOutroCivil)
                    .addComponent(jEstCivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCPFNomeNascLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSexo)
                    .addComponent(radioFeminino)
                    .addComponent(radioMasculino)
                    .addComponent(radioOutro)))
        );

        painelCPFNomeNascLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFormatCPF, txtFormatadDtNasc, txtNome});

        painelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        painelEndereco.setToolTipText("Painel endereço");

        jEndereco.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jEndereco.setText("Logradouro:");

        jNumero.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jNumero.setText("Nº");

        jCEP.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jCEP.setText("CEP: ");

        try {
            txtFormatadCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFormatadCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCEP)
                    .addComponent(txtFormatadCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelEnderecoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEndereco, txtFormatadCEP});

        painelRadioEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));
        painelRadioEmail.setToolTipText("painel radio e rmail");

        jEmail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jEmail.setText("E-mail:");

        labelTelefone.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelTelefone.setText("Telefone Fixo:");

        labelCelular.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelCelular.setText("Celular:");

        try {
            txtFormatedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFormatedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelRadioEmailLayout = new javax.swing.GroupLayout(painelRadioEmail);
        painelRadioEmail.setLayout(painelRadioEmailLayout);
        painelRadioEmailLayout.setHorizontalGroup(
            painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRadioEmailLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelRadioEmailLayout.createSequentialGroup()
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormatedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelRadioEmailLayout.createSequentialGroup()
                        .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jEmail)
                            .addComponent(labelCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormatedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))))
        );
        painelRadioEmailLayout.setVerticalGroup(
            painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRadioEmailLayout.createSequentialGroup()
                .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(txtFormatedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFormatedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCelular))
                    .addGroup(painelRadioEmailLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(painelRadioEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelRadioEmailLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtFormatedCelular, txtFormatedTelefone});

        painel_Ok_Cancelar.setToolTipText("Painel botao ok e cancelar");

        botaoCadastrar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ok-icon-verde.png"))); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-edit-delete-icon.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoCadastrarNovo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        botaoCadastrarNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-contact-new-icon.png"))); // NOI18N
        botaoCadastrarNovo.setText("Novo cliente");
        botaoCadastrarNovo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarNovoActionPerformed(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/broom-icon.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_Ok_CancelarLayout = new javax.swing.GroupLayout(painel_Ok_Cancelar);
        painel_Ok_Cancelar.setLayout(painel_Ok_CancelarLayout);
        painel_Ok_CancelarLayout.setHorizontalGroup(
            painel_Ok_CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_Ok_CancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCadastrarNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastrar)
                .addGap(18, 18, 18)
                .addComponent(botaoLimpar)
                .addGap(12, 12, 12)
                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        painel_Ok_CancelarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoCadastrar, botaoCancelar, botaoLimpar});

        painel_Ok_CancelarLayout.setVerticalGroup(
            painel_Ok_CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_Ok_CancelarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_Ok_CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoCadastrarNovo))
                .addGap(26, 26, 26))
        );

        painel_Ok_CancelarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoCadastrar, botaoCadastrarNovo, botaoCancelar, botaoLimpar});

        javax.swing.GroupLayout painel_CadastroLayout = new javax.swing.GroupLayout(painel_Cadastro);
        painel_Cadastro.setLayout(painel_CadastroLayout);
        painel_CadastroLayout.setHorizontalGroup(
            painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_CadastroLayout.createSequentialGroup()
                .addGroup(painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_CadastroLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jImgUser))
                    .addGroup(painel_CadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelCPFNomeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_CadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painel_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_CadastroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(painel_Ok_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_CadastroLayout.createSequentialGroup()
                        .addComponent(painelRadioEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        painel_CadastroLayout.setVerticalGroup(
            painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_CadastroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jImgUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCPFNomeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelRadioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(painel_Ok_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        //essa opção, é feita para sair da aplicação.
        System.exit(0);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
        //aqui eu faço um if else, para caso o usuario tete dar ok mas com os campos vazios
        boolean validarCampo = validarFormulario();
//        JFormattedTextField.AbstractFormatter cpf = txtFormatCPF.getFormatter();
//        if (txtNome.getText().trim().equals("") || txtFormatCPF.getFormatter().equals("")) {
//            String nome = txtNome.getText();
//            //JFormattedTextField.AbstractFormatter cpf=txtFormatCPF.getFormatter();    
//            JOptionPane.showMessageDialog(this, "O campo 'nome' " + nome + " ou o CPF está vazio" + cpf);
//        } else {
        if (validarCampo == false) {
            validarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, //componente pai
                    "Cliente cadastrado com sucesso!", "Caixa de Texto", JOptionPane.WARNING_MESSAGE);
            limparCampos();
        }
        //  }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void radioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasculinoActionPerformed

    private void txtFormatCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormatCPFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFormatCPFActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        //códigos para limpar campos
        limparCampos();

    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarNovoActionPerformed
        // TODO add your handling code here:
        boolean validarCampo = validarFormulario();
        if (validarCampo == false) {
            validarFormulario();

        } else {
            JOptionPane.showMessageDialog(this, "Cliente Cadastrado com sucesso!", "Caixa de Tezto",
                    JOptionPane.WARNING_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_botaoCadastrarNovoActionPerformed
    private boolean limparCampos() {
        txtEmail.setText("");
        txtEndereco.setText("");
        txtFormatCPF.setText("");
        txtFormatadCEP.setText("");
        txtFormatadDtNasc.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        radioGrupoEstCivil.clearSelection();
        radioGrupoSexo.clearSelection();
        return true;
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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });

    }

    private boolean validarFormulario() {
        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo *Nome* é obrigatório!");
            return false;
        }
        if (this.txtFormatCPF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo *CPF* é obrigatório!");
            return false;
        }
        return true;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCadastrarNovo;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JLabel jCEP;
    private javax.swing.JLabel jCPF;
    private javax.swing.JLabel jDtNascimento;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jEndereco;
    private javax.swing.JLabel jEstCivil;
    private javax.swing.JLabel jImgUser;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNumero;
    private javax.swing.JLabel jSexo;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel painelCPFNomeNasc;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JPanel painelRadioEmail;
    private javax.swing.JPanel painel_Cadastro;
    private javax.swing.JPanel painel_Ok_Cancelar;
    private javax.swing.JRadioButton radioCasado;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.ButtonGroup radioGrupoEstCivil;
    private javax.swing.ButtonGroup radioGrupoSexo;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JRadioButton radioOutro;
    private javax.swing.JRadioButton radioOutroCivil;
    private javax.swing.JRadioButton radioSolteiro;
    private javax.swing.JRadioButton radioViuvo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtFormatCPF;
    private javax.swing.JFormattedTextField txtFormatadCEP;
    private javax.swing.JFormattedTextField txtFormatadDtNasc;
    private javax.swing.JFormattedTextField txtFormatedCelular;
    private javax.swing.JFormattedTextField txtFormatedTelefone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
