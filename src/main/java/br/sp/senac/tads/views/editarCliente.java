/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads.views;

import javax.swing.JOptionPane;

/**
 *
 * @author dilaz
 */
public class editarCliente extends javax.swing.JFrame {

    /**
     * Creates new form editarCliente
     */
    public editarCliente() {
        initComponents();
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

        radioGrupoCivil = new javax.swing.ButtonGroup();
        radioGrupoSexo = new javax.swing.ButtonGroup();
        lblEditar = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        lblDadosPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtFormatedCPF = new javax.swing.JFormattedTextField();
        lblNasciemtno = new javax.swing.JLabel();
        txtFormatedNasmciemtno = new javax.swing.JFormattedTextField();
        lblCivil = new javax.swing.JLabel();
        rdoCasado = new javax.swing.JRadioButton();
        rdoSolteiro = new javax.swing.JRadioButton();
        rdoOutro = new javax.swing.JRadioButton();
        lblSexo = new javax.swing.JLabel();
        rdoFeminino = new javax.swing.JRadioButton();
        rdoMasculino = new javax.swing.JRadioButton();
        rdoOutro2 = new javax.swing.JRadioButton();
        rdoViuvo = new javax.swing.JRadioButton();
        lblID = new javax.swing.JLabel();
        lblIDEditar = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblContato = new javax.swing.JPanel();
        lblTelefone = new javax.swing.JLabel();
        txtFormatedTelefone = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        txtFormatedCelular = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlEndereco = new javax.swing.JPanel();
        lblLogradouro = new javax.swing.JLabel();
        txtEnredeco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNuemro = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtFormatedCEP = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 15))); // NOI18N

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ok-icon-verde.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        lblNome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblNome.setText("Nome: ");

        lblCPF.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblCPF.setText("CPF:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        try {
            txtFormatedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNasciemtno.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblNasciemtno.setText("Data de Nascimento:");

        try {
            txtFormatedNasmciemtno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCivil.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblCivil.setText("Estado Civil:");

        radioGrupoCivil.add(rdoCasado);
        rdoCasado.setText("Casado(a)");

        radioGrupoCivil.add(rdoSolteiro);
        rdoSolteiro.setText("Solteiro(a)");

        radioGrupoCivil.add(rdoOutro);
        rdoOutro.setText("Outro");

        lblSexo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblSexo.setText("Sexo:");

        radioGrupoSexo.add(rdoFeminino);
        rdoFeminino.setText("Feminino");

        radioGrupoSexo.add(rdoMasculino);
        rdoMasculino.setText("Masculino");

        radioGrupoSexo.add(rdoOutro2);
        rdoOutro2.setText("Outro");

        radioGrupoCivil.add(rdoViuvo);
        rdoViuvo.setText("Viuvo(a)");

        lblID.setText("ID:");

        javax.swing.GroupLayout lblDadosPessoaisLayout = new javax.swing.GroupLayout(lblDadosPessoais);
        lblDadosPessoais.setLayout(lblDadosPessoaisLayout);
        lblDadosPessoaisLayout.setHorizontalGroup(
            lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCivil, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNasciemtno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(rdoCasado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoSolteiro))
                            .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(rdoFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoMasculino)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoOutro2)
                            .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(rdoViuvo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoOutro))))
                    .addComponent(txtFormatedNasmciemtno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormatedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIDEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblDadosPessoaisLayout.setVerticalGroup(
            lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID)
                    .addComponent(lblIDEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtFormatedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNasciemtno)
                    .addComponent(txtFormatedNasmciemtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCivil)
                    .addComponent(rdoCasado)
                    .addComponent(rdoSolteiro)
                    .addComponent(rdoOutro)
                    .addComponent(rdoViuvo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rdoFeminino)
                    .addComponent(rdoMasculino)
                    .addComponent(rdoOutro2))
                .addContainerGap())
        );

        lblDadosPessoaisLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFormatedCPF, txtFormatedNasmciemtno, txtNome});

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit-icon.png"))); // NOI18N

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-edit-delete-icon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lblTelefone.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblTelefone.setText("Telefone Fixo:");

        try {
            txtFormatedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCelular.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblCelular.setText("Celular:");

        try {
            txtFormatedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblEmail.setText("e-mail:");

        javax.swing.GroupLayout lblContatoLayout = new javax.swing.GroupLayout(lblContato);
        lblContato.setLayout(lblContatoLayout);
        lblContatoLayout.setHorizontalGroup(
            lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblContatoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFormatedCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(txtFormatedTelefone, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
        );
        lblContatoLayout.setVerticalGroup(
            lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtFormatedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormatedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblContatoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtFormatedCelular, txtFormatedTelefone});

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lblLogradouro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblLogradouro.setText("Logradouro:");

        txtEnredeco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnredecoKeyTyped(evt);
            }
        });

        lblNumero.setText("Nº");

        txtNuemro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuemroKeyTyped(evt);
            }
        });

        lblCEP.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblCEP.setText("CEP:");

        try {
            txtFormatedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogradouro)
                    .addComponent(lblCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtEnredeco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lblNumero)
                        .addGap(18, 18, 18)
                        .addComponent(txtNuemro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFormatedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormatedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP))
                .addGap(8, 8, 8)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnredeco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogradouro)
                    .addComponent(lblNumero)
                    .addComponent(txtNuemro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEnderecoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEnredeco, txtFormatedCEP});

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/broom-icon.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblEditarLayout = new javax.swing.GroupLayout(lblEditar);
        lblEditar.setLayout(lblEditarLayout);
        lblEditarLayout.setHorizontalGroup(
            lblEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDadosPessoais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lblEditarLayout.createSequentialGroup()
                        .addGroup(lblEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblEditarLayout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(lblImg))
                            .addGroup(lblEditarLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnSalvar)
                                .addGap(31, 31, 31)
                                .addComponent(btnLimpar)
                                .addGap(36, 36, 36)
                                .addComponent(btnCancelar)))
                        .addGap(80, 80, 80)))
                .addContainerGap())
        );

        lblEditarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnLimpar, btnSalvar});

        lblEditarLayout.setVerticalGroup(
            lblEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        lblEditarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnLimpar, btnSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        if (txtNome.getText().length() < 30) {
            if (txtNome.getText().matches("^[0-9].*")) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Permitido somente letras no campo \"Nome\"!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 30 caracteres!");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtEnredecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnredecoKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEnredecoKeyTyped

    private void txtNuemroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuemroKeyTyped
        // TODO add your handling code here:
        if (txtNuemro.getText().length()<5) {
            if (txtNuemro.getText().matches("^.*")) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Não é permitido o uso de caracter especial!", "Erro",
                        JOptionPane.ERROR_MESSAGE);                
            }
        }else{
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de até 5 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNuemroKeyTyped

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (campoObrigatorio()==true) {
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
            limparCampos();
            this.dispose();
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void limparCampos() {
        txtEmail.setText("");
        txtEnredeco.setText("");
        txtFormatedCPF.setText("");
        txtFormatedCEP.setText("");
        txtFormatedNasmciemtno.setText("");
        txtNome.setText("");
        txtNuemro.setText("");
        radioGrupoCivil.clearSelection();
        radioGrupoSexo.clearSelection();
        txtFormatedTelefone.setText("");
        txtFormatedCelular.setText("");
    }
    
    public boolean campoObrigatorio(){
        
        if (this.txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo \"Nome\" não pode ficar em branco!");
            return false;
        }
        if (this.txtFormatedCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo \"CPF\" não pode ficar em branco!");
            return false;
        }
        if (this.txtFormatedNasmciemtno.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo \"Data de Nascimento\" não pode ficar em branco!");
            return false;
        }
        if (this.txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "O campo \"e-mail\" não pode ficar em branco!");
            return false;
        }
        
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
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCivil;
    private javax.swing.JPanel lblContato;
    private javax.swing.JPanel lblDadosPessoais;
    private javax.swing.JPanel lblEditar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDEditar;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNasciemtno;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.ButtonGroup radioGrupoCivil;
    private javax.swing.ButtonGroup radioGrupoSexo;
    private javax.swing.JRadioButton rdoCasado;
    private javax.swing.JRadioButton rdoFeminino;
    private javax.swing.JRadioButton rdoMasculino;
    private javax.swing.JRadioButton rdoOutro;
    private javax.swing.JRadioButton rdoOutro2;
    private javax.swing.JRadioButton rdoSolteiro;
    private javax.swing.JRadioButton rdoViuvo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnredeco;
    private javax.swing.JFormattedTextField txtFormatedCEP;
    private javax.swing.JFormattedTextField txtFormatedCPF;
    private javax.swing.JFormattedTextField txtFormatedCelular;
    private javax.swing.JFormattedTextField txtFormatedNasmciemtno;
    private javax.swing.JFormattedTextField txtFormatedTelefone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNuemro;
    // End of variables declaration//GEN-END:variables
}
