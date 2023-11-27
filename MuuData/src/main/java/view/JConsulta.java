package view;

import control.BovinoControl;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Bovino;

public class JConsulta extends javax.swing.JPanel {

    DefaultComboBoxModel<Bovino> comboAnimais;
    BovinoControl boiControl;

    public JConsulta() {
        initComponents();

        config();
    }

    private void config() {
        boiControl = new BovinoControl();

        this.comboAnimais = new DefaultComboBoxModel();
        this.jComboBoxMae.setModel(comboAnimais);
        this.comboAnimais.addAll(boiControl.getAll());

        this.setMaeVisible(false);
        this.setDateVisible(false);
        this.jButtonUpdate.setVisible(false);
        this.jButtonSalvar.setVisible(false);
    }
    
    private void setButtonsEnable(boolean op) {
        this.jButtonGestacao.setEnabled(op);
        this.jButtonSaude.setEnabled(op);
    }
    
    private void setMaeVisible(boolean op) {
        this.jTextMae.setVisible(op);
        this.jLabelMae.setVisible(op);
    }
    
    private void setDateVisible(boolean op) {
        this.jLabelDate.setVisible(op);
        this.jTextData.setVisible(op);
        this.jTextIdade.setVisible(op);
        this.jLabelIdade.setVisible(op);
    }
    
    private void setUpdatesEnabled(boolean op) {
        this.jTextNome.setEnabled(op);
        this.jTextBrinco.setEnabled(op);
        this.jTextPeso.setEnabled(op);
    }

    private void limpaFields() {
        this.jComboBoxMae.setSelectedIndex(-1);
        this.jTextData.setText("");
        this.jTextBrinco.setText("");
        this.jTextNome.setText("");
        this.jTextRaca.setText("");
        this.jTextMae.setText("");
        this.jTextIdade.setText("");
        this.jTextSexo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jPanel80 = new javax.swing.JPanel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jComboBoxMae79 = new javax.swing.JComboBox<>();
        jLabel321 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jTextRaca = new javax.swing.JTextField();
        jTextData = new javax.swing.JFormattedTextField();
        jTextBrinco = new javax.swing.JTextField();
        jTextSexo = new javax.swing.JTextField();
        jLabel324 = new javax.swing.JLabel();
        jTextMae = new javax.swing.JTextField();
        jLabelMae = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonGestacao = new javax.swing.JButton();
        jButtonSaude = new javax.swing.JButton();
        jButtonUndefined = new javax.swing.JButton();
        jLabel325 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(120, 130, 89));

        jButtonVoltar.setBackground(new java.awt.Color(120, 130, 89));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setPreferredSize(new java.awt.Dimension(300, 590));

        jLabel317.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(0, 0, 0));
        jLabel317.setText("Sexo:");

        jLabel318.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(0, 0, 0));
        jLabel318.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel318.setText("Consultar Animal");

        jLabel319.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jLabel320.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(0, 0, 0));
        jLabel320.setText("Animal:");

        jComboBoxMae79.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxMae79.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxMae79.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMae79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMae79.setFocusable(false);
        jComboBoxMae79.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMae79ItemStateChanged(evt);
            }
        });

        jLabel321.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(0, 0, 0));
        jLabel321.setText("Brinco:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextNome.setEnabled(false);

        jLabel322.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(0, 0, 0));
        jLabel322.setText("Peso:");

        jLabel323.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(0, 0, 0));
        jLabel323.setText("Nome:");

        jLabelDate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDate.setText("Data:");

        jTextPeso.setBackground(new java.awt.Color(255, 255, 255));
        jTextPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextPeso.setForeground(new java.awt.Color(0, 0, 0));
        jTextPeso.setEnabled(false);

        jTextRaca.setBackground(new java.awt.Color(255, 255, 255));
        jTextRaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextRaca.setForeground(new java.awt.Color(0, 0, 0));
        jTextRaca.setEnabled(false);

        jTextData.setBackground(new java.awt.Color(255, 255, 255));
        jTextData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setEnabled(false);
        jTextData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextBrinco.setBackground(new java.awt.Color(255, 255, 255));
        jTextBrinco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextBrinco.setForeground(new java.awt.Color(0, 0, 0));
        jTextBrinco.setEnabled(false);

        jTextSexo.setBackground(new java.awt.Color(255, 255, 255));
        jTextSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextSexo.setForeground(new java.awt.Color(0, 0, 0));
        jTextSexo.setEnabled(false);

        jLabel324.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(0, 0, 0));
        jLabel324.setText("Raça:");

        jTextMae.setBackground(new java.awt.Color(255, 255, 255));
        jTextMae.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextMae.setForeground(new java.awt.Color(0, 0, 0));
        jTextMae.setEnabled(false);

        jLabelMae.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelMae.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMae.setText("Mãe:");

        jLabelIdade.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelIdade.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIdade.setText("Idade:");

        jTextIdade.setBackground(new java.awt.Color(255, 255, 255));
        jTextIdade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextIdade.setForeground(new java.awt.Color(0, 0, 0));
        jTextIdade.setEnabled(false);

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUpdate.setText("Redefinir");
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel318, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jTextRaca))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel80Layout.createSequentialGroup()
                                        .addComponent(jLabel321)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel80Layout.createSequentialGroup()
                                        .addComponent(jLabel323)
                                        .addGap(21, 21, 21)
                                        .addComponent(jTextNome)))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel80Layout.createSequentialGroup()
                                        .addComponent(jLabel317)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel80Layout.createSequentialGroup()
                                        .addComponent(jLabel322)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel320)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMae79, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel324)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel80Layout.createSequentialGroup()
                                            .addComponent(jLabelMae)
                                            .addGap(7, 7, 7)))
                                    .addComponent(jLabelIdade)
                                    .addComponent(jLabelDate))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMae)
                                    .addComponent(jTextIdade)
                                    .addGroup(jPanel80Layout.createSequentialGroup()
                                        .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel80Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel318)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel320)
                    .addComponent(jComboBoxMae79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel323)
                    .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel317)
                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel322)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel321))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel324)
                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jButtonGestacao.setBackground(new java.awt.Color(120, 130, 89));
        jButtonGestacao.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonGestacao.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGestacao.setText("Gestação Reprodutiva");
        jButtonGestacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGestacao.setFocusPainted(false);
        jButtonGestacao.setFocusable(false);
        jButtonGestacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestacaoActionPerformed(evt);
            }
        });

        jButtonSaude.setBackground(new java.awt.Color(120, 130, 89));
        jButtonSaude.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonSaude.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSaude.setText("Histórico de Saúde");
        jButtonSaude.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSaude.setFocusPainted(false);
        jButtonSaude.setFocusable(false);
        jButtonSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaudeActionPerformed(evt);
            }
        });

        jButtonUndefined.setBackground(java.awt.Color.white);
        jButtonUndefined.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonUndefined.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUndefined.setText("UNDEFINED");
        jButtonUndefined.setEnabled(false);

        jLabel325.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabel325.setForeground(new java.awt.Color(0, 0, 0));
        jLabel325.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel325.setText("Opções do Animal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSaude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGestacao, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jButtonUndefined, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel325)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel325)
                .addGap(65, 65, 65)
                .addComponent(jButtonGestacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButtonSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButtonUndefined, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.limpaFields();
        FramePrincipal.removePainel(FramePrincipal.TELA_CADASTRO_BOVINO);
        FramePrincipal.trocaPainel("TELA_INICIAL", new JTelaInicial());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxMae79ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMae79ItemStateChanged
        if (this.jComboBoxMae.getSelectedIndex() >= 0) {
            Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();
            boolean temMae = (boi.getIdMae() != null) && (boi.getIdMae() != Bovino.ID_DEFAULT);

            this.setButtonsEnable(true);
            this.jTextBrinco.setText(boi.getBrinco() + "");
            this.jTextRaca.setText(boi.getRaca());
            this.jTextPeso.setText(boi.getPeso() == null || boi.getPeso() == 0 ? "-/-" : boi.getPeso() + "");
            this.jTextNome.setText((boi.getNome() == null || boi.getNome().isEmpty()) ? "-/-" : boi.getNome());
            this.jTextSexo.setText(boi.isSexo() == Bovino.MACHO ? "Macho" : "Fêmea");

            this.setMaeVisible(temMae);
            this.jButtonGestacao.setEnabled(!temMae);
            if (temMae) {
                this.jTextMae.setText(this.boiControl.getById(boi.getIdMae()).toString());
            }

            this.setDateVisible(boi.getNascimento() != null);
            if (boi.getNascimento() != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                this.jTextData.setText(formatter.format(boi.getNascimento()));

                int anos = boi.getIdadeMeses() / 12;
                int meses = boi.getIdadeMeses() - (anos * 12);
                String idade = anos > 0 ? anos + " anos e " : "";
                idade += meses + " meses";
                this.jTextIdade.setText(idade);
            }

        }
    }//GEN-LAST:event_jComboBoxMae79ItemStateChanged

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        this.setUpdatesEnabled(true);
        this.jButtonUpdate.setVisible(false);
        this.jButtonSalvar.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();

        if (!this.jTextBrinco.getText().equals(boi.getBrinco()) || !this.jTextNome.getText().equals(boi.getNome())
            || !this.jTextPeso.getText().equals(boi.getPeso())) {

            int op = JOptionPane.showConfirmDialog(this, "Você deseja salvar as alterações", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (op == JOptionPane.YES_OPTION) {
                String nome = jTextNome.getText();
                int brinco = Integer.parseInt(jTextBrinco.getText());
                int peso = Integer.parseInt(jTextPeso.getText());
                int id = boi.getBrinco();

                if (boiControl.update(peso, nome, brinco, id)) {
                    boi.setNome(nome);
                    boi.setBrinco(brinco);
                    boi.setPeso(peso);

                    JOptionPane.showMessageDialog(this, "sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Houve uma falha no cadastro",
                        "Falha", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                jTextBrinco.setText(""+boi.getBrinco());
                jTextNome.setText(boi.getNome());
                jTextPeso.setText(""+boi.getPeso());
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonGestacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestacaoActionPerformed
        // TODO add your handling code here:
        FramePrincipal.trocaPainel("consultaAnimais", new JConsulta());
    }//GEN-LAST:event_jButtonGestacaoActionPerformed

    private void jButtonSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaudeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGestacao;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSaude;
    private javax.swing.JButton jButtonUndefined;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Bovino> jComboBoxMae;
    private javax.swing.JComboBox<Bovino> jComboBoxMae1;
    private javax.swing.JComboBox<Bovino> jComboBoxMae10;
    private javax.swing.JComboBox<Bovino> jComboBoxMae11;
    private javax.swing.JComboBox<Bovino> jComboBoxMae12;
    private javax.swing.JComboBox<Bovino> jComboBoxMae13;
    private javax.swing.JComboBox<Bovino> jComboBoxMae14;
    private javax.swing.JComboBox<Bovino> jComboBoxMae15;
    private javax.swing.JComboBox<Bovino> jComboBoxMae16;
    private javax.swing.JComboBox<Bovino> jComboBoxMae17;
    private javax.swing.JComboBox<Bovino> jComboBoxMae18;
    private javax.swing.JComboBox<Bovino> jComboBoxMae19;
    private javax.swing.JComboBox<Bovino> jComboBoxMae2;
    private javax.swing.JComboBox<Bovino> jComboBoxMae20;
    private javax.swing.JComboBox<Bovino> jComboBoxMae21;
    private javax.swing.JComboBox<Bovino> jComboBoxMae22;
    private javax.swing.JComboBox<Bovino> jComboBoxMae23;
    private javax.swing.JComboBox<Bovino> jComboBoxMae24;
    private javax.swing.JComboBox<Bovino> jComboBoxMae25;
    private javax.swing.JComboBox<Bovino> jComboBoxMae26;
    private javax.swing.JComboBox<Bovino> jComboBoxMae27;
    private javax.swing.JComboBox<Bovino> jComboBoxMae28;
    private javax.swing.JComboBox<Bovino> jComboBoxMae29;
    private javax.swing.JComboBox<Bovino> jComboBoxMae3;
    private javax.swing.JComboBox<Bovino> jComboBoxMae30;
    private javax.swing.JComboBox<Bovino> jComboBoxMae31;
    private javax.swing.JComboBox<Bovino> jComboBoxMae32;
    private javax.swing.JComboBox<Bovino> jComboBoxMae33;
    private javax.swing.JComboBox<Bovino> jComboBoxMae34;
    private javax.swing.JComboBox<Bovino> jComboBoxMae35;
    private javax.swing.JComboBox<Bovino> jComboBoxMae36;
    private javax.swing.JComboBox<Bovino> jComboBoxMae37;
    private javax.swing.JComboBox<Bovino> jComboBoxMae38;
    private javax.swing.JComboBox<Bovino> jComboBoxMae39;
    private javax.swing.JComboBox<Bovino> jComboBoxMae4;
    private javax.swing.JComboBox<Bovino> jComboBoxMae40;
    private javax.swing.JComboBox<Bovino> jComboBoxMae41;
    private javax.swing.JComboBox<Bovino> jComboBoxMae42;
    private javax.swing.JComboBox<Bovino> jComboBoxMae43;
    private javax.swing.JComboBox<Bovino> jComboBoxMae44;
    private javax.swing.JComboBox<Bovino> jComboBoxMae45;
    private javax.swing.JComboBox<Bovino> jComboBoxMae46;
    private javax.swing.JComboBox<Bovino> jComboBoxMae47;
    private javax.swing.JComboBox<Bovino> jComboBoxMae48;
    private javax.swing.JComboBox<Bovino> jComboBoxMae49;
    private javax.swing.JComboBox<Bovino> jComboBoxMae5;
    private javax.swing.JComboBox<Bovino> jComboBoxMae50;
    private javax.swing.JComboBox<Bovino> jComboBoxMae51;
    private javax.swing.JComboBox<Bovino> jComboBoxMae52;
    private javax.swing.JComboBox<Bovino> jComboBoxMae53;
    private javax.swing.JComboBox<Bovino> jComboBoxMae54;
    private javax.swing.JComboBox<Bovino> jComboBoxMae55;
    private javax.swing.JComboBox<Bovino> jComboBoxMae56;
    private javax.swing.JComboBox<Bovino> jComboBoxMae57;
    private javax.swing.JComboBox<Bovino> jComboBoxMae58;
    private javax.swing.JComboBox<Bovino> jComboBoxMae59;
    private javax.swing.JComboBox<Bovino> jComboBoxMae6;
    private javax.swing.JComboBox<Bovino> jComboBoxMae60;
    private javax.swing.JComboBox<Bovino> jComboBoxMae61;
    private javax.swing.JComboBox<Bovino> jComboBoxMae62;
    private javax.swing.JComboBox<Bovino> jComboBoxMae63;
    private javax.swing.JComboBox<Bovino> jComboBoxMae64;
    private javax.swing.JComboBox<Bovino> jComboBoxMae65;
    private javax.swing.JComboBox<Bovino> jComboBoxMae66;
    private javax.swing.JComboBox<Bovino> jComboBoxMae67;
    private javax.swing.JComboBox<Bovino> jComboBoxMae68;
    private javax.swing.JComboBox<Bovino> jComboBoxMae69;
    private javax.swing.JComboBox<Bovino> jComboBoxMae7;
    private javax.swing.JComboBox<Bovino> jComboBoxMae70;
    private javax.swing.JComboBox<Bovino> jComboBoxMae71;
    private javax.swing.JComboBox<Bovino> jComboBoxMae72;
    private javax.swing.JComboBox<Bovino> jComboBoxMae73;
    private javax.swing.JComboBox<Bovino> jComboBoxMae74;
    private javax.swing.JComboBox<Bovino> jComboBoxMae75;
    private javax.swing.JComboBox<Bovino> jComboBoxMae76;
    private javax.swing.JComboBox<Bovino> jComboBoxMae77;
    private javax.swing.JComboBox<Bovino> jComboBoxMae78;
    private javax.swing.JComboBox<Bovino> jComboBoxMae79;
    private javax.swing.JComboBox<Bovino> jComboBoxMae8;
    private javax.swing.JComboBox<Bovino> jComboBoxMae9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelMae;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextBrinco;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextMae;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextRaca;
    private javax.swing.JTextField jTextSexo;
    // End of variables declaration//GEN-END:variables
}
