package view;

import control.BovinoControl;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Bovino;

public class JConsulta extends javax.swing.JPanel {

    DefaultComboBoxModel<Bovino> comboAnimais;
    BovinoControl boiControl;
    private String fazenda;

    public JConsulta() {
        initComponents();

        config();
    }

    public JConsulta(String fazenda) {
        this.fazenda = fazenda;

        initComponents();

        config();
    }

    private void config() {
        boiControl = new BovinoControl(fazenda);

        this.comboAnimais = new DefaultComboBoxModel();
        this.jComboBoxMae.setModel(comboAnimais);
        this.comboAnimais.addAll(boiControl.getAll());

        this.setMaeVisible(false);
        this.setDateVisible(false);
        this.setButtonsVisible(false);
    }

    private void setButtonsEnable(boolean op) {
        this.jButtonGestacao.setEnabled(op);
        this.jButtonSaude.setEnabled(op);
        this.jButtonExcluir.setEnabled(op);
        this.jButtonUpdate.setEnabled(op);
    }

    private void setMaeVisible(boolean op) {
        this.jTextMae.setVisible(op);
        this.jLabelMae.setVisible(op);
    }

    private void setButtonsVisible(boolean op) {
        this.jButtonUpdate.setVisible(!op);
        this.jButtonSalvar.setVisible(op);
        this.jButtonCancelar.setVisible(op);
    }

    private void setUpdatesEnabled(boolean op) {
        this.jTextNome.setEnabled(op);
        this.jTextBrinco.setEnabled(op);
        this.jTextPeso.setEnabled(op);
        this.jComboBoxMae.setEnabled(!op);
    }

    private void setDateVisible(boolean op) {
        this.jLabelDate.setVisible(op);
        this.jTextData.setVisible(op);
        this.jTextIdade.setVisible(op);
        this.jLabelIdade.setVisible(op);
    }

    private void setEditable(boolean op) {
        this.setButtonsVisible(op);
        this.setUpdatesEnabled(op);
        this.setButtonsEnable(!op);
    }

    private void editInfo(Bovino boi) {
        jTextBrinco.setText("" + boi.getBrinco());
        jTextNome.setText(boi.getNome().isBlank()? "-/-" : boi.getNome());
        jTextPeso.setText(boi.getPeso() == 0 ? "-/-" : boi.getPeso() + "");
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
        this.jTextPeso.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMae = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jTextRaca = new javax.swing.JTextField();
        jTextData = new javax.swing.JFormattedTextField();
        jTextBrinco = new javax.swing.JTextField();
        jTextSexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextMae = new javax.swing.JTextField();
        jLabelMae = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGestacao = new javax.swing.JButton();
        jButtonSaude = new javax.swing.JButton();
        jLabelOpcoes = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(120, 130, 89));

        jButtonVoltar.setBackground(new java.awt.Color(120, 130, 89));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/returnIcon.png"))); // NOI18N
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 590));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sexo:");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Animais");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Animal:");

        jComboBoxMae.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxMae.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxMae.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMae.setFocusable(false);
        jComboBoxMae.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMaeItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Brinco:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextNome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Peso:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome:");

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

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Raça:");

        jTextMae.setBackground(new java.awt.Color(255, 255, 255));
        jTextMae.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextMae.setForeground(new java.awt.Color(0, 0, 0));
        jTextMae.setEnabled(false);
        jTextMae.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextMaeMousePressed(evt);
            }
        });
        jTextMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMaeActionPerformed(evt);
            }
        });

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
        jButtonUpdate.setEnabled(false);
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
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSalvar.setVerifyInputWhenFocusTarget(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jTextRaca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(21, 21, 21)
                                        .addComponent(jTextNome)))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMae, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelMae)
                                            .addGap(7, 7, 7)))
                                    .addComponent(jLabelIdade)
                                    .addComponent(jLabelDate))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMae)
                                    .addComponent(jTextIdade)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButtonCancelar)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jButtonGestacao.setBackground(new java.awt.Color(120, 130, 89));
        jButtonGestacao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonGestacao.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGestacao.setText("Gestação do Animal");
        jButtonGestacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGestacao.setEnabled(false);
        jButtonGestacao.setFocusPainted(false);
        jButtonGestacao.setFocusable(false);

        jButtonSaude.setBackground(new java.awt.Color(120, 130, 89));
        jButtonSaude.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSaude.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSaude.setText("Histórico de Saúde");
        jButtonSaude.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSaude.setEnabled(false);
        jButtonSaude.setFocusPainted(false);
        jButtonSaude.setFocusable(false);
        jButtonSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaudeActionPerformed(evt);
            }
        });

        jLabelOpcoes.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabelOpcoes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOpcoes.setText("Opções do Animal");

        jButtonExcluir.setBackground(new java.awt.Color(120, 130, 89));
        jButtonExcluir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExcluir.setText("Excluir Animal");
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSaude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGestacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabelOpcoes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabelOpcoes)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonGestacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.limpaFields();
        FramePrincipal.removePainel(FramePrincipal.TELA_CONSULTA);
        FramePrincipal.trocaPainel("TELA_INICIAL", new JTelaInicial());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxMaeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMaeItemStateChanged
        if (this.jComboBoxMae.getSelectedIndex() != -1) {
            Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();
            boolean temMae = (boi.getIdMae() != null) && (boi.getIdMae() != Bovino.ID_DEFAULT);

            this.setButtonsEnable(true);
            this.jTextBrinco.setText(boi.getBrinco() + "");
            this.jTextRaca.setText(boi.getRaca());
            this.jTextPeso.setText(boi.getPeso() == null || boi.getPeso() == 0 ? "-/-" : boi.getPeso() + "");
            this.jTextNome.setText((boi.getNome() == null || boi.getNome().isBlank()) ? "-/-" : boi.getNome());
            this.jTextSexo.setText(boi.isSexo() == Bovino.MACHO ? "Macho" : "Fêmea");

            this.setMaeVisible(temMae);
            if (temMae) {
                this.jTextMae.setText(this.boiControl.getById(boi.getIdMae()).toString());
                // this.jButtonGestacao.setEnabled(false);
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
        } else {
            this.setButtonsEnable(false);
        }
    }//GEN-LAST:event_jComboBoxMaeItemStateChanged

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        this.setEditable(true);
        if(this.jTextPeso.getText().equals("-/-")) {
            this.jTextPeso.setText("");
        }
        if(this.jTextNome.getText().equals("-/-")) {
            this.jTextNome.setText("");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();

            String nome = this.jTextNome.getText().equals("-/-") ? "" : this.jTextNome.getText();
            int brinco = this.jTextBrinco.getText().isEmpty() ? 0 : Integer.parseInt(this.jTextBrinco.getText());
            int peso = this.jTextPeso.getText().isEmpty() ? 0 : Integer.parseInt(this.jTextPeso.getText());    
            

            if (brinco != boi.getBrinco() || !nome.equals(boi.getNome()) || peso != boi.getPeso()) {
                if (JOptionPane.showConfirmDialog(this, "Deseja salvar as alterações?",
                        "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    int id = boi.getId();
                    if (boiControl.update(peso, nome, brinco, id)) {
                        boi.setNome(nome);
                        boi.setBrinco(brinco);
                        boi.setPeso(peso);
                        this.editInfo(boi);
                        JOptionPane.showMessageDialog(this, "As alterações foram salvas com sucesso!",
                                "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                        this.setEditable(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Houve uma falha no cadastro!",
                                "Falha", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    this.editInfo(boi);
                }
            } else {
                this.setEditable(false);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira o formato correto!",
                    "Dados incorretos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();

        if (JOptionPane.showConfirmDialog(this, "Deseja descartar as alterações?",
                "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            this.setEditable(false);
            this.editInfo(boi);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaudeActionPerformed
        Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();
        FramePrincipal.trocaPainel(FramePrincipal.TELA_HISTORICO_SAUDE, new JHistoricoSaude(boi));
    }//GEN-LAST:event_jButtonSaudeActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();

        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esse animal?",
                "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            if (this.boiControl.delete(boi)) {
                JOptionPane.showMessageDialog(this, "O animal foi deletado com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                this.jComboBoxMae.removeItem(boi);
                this.jComboBoxMae.setSelectedIndex(-1);
                this.setButtonsEnable(false);
                this.limpaFields();
            } else {
                JOptionPane.showMessageDialog(this, "Houve uma falha no cadastro!",
                        "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMaeActionPerformed
    }//GEN-LAST:event_jTextMaeActionPerformed

    private void jTextMaeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMaeMousePressed
        // TODO add your handling code here:
        Integer brincoMae = ((Bovino) this.jComboBoxMae.getSelectedItem()).getIdMae();

        new JFrameConsultaMae(boiControl.getById(brincoMae)).setVisible(true);
    }//GEN-LAST:event_jTextMaeMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGestacao;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSaude;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Bovino> jComboBoxMae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelMae;
    private javax.swing.JLabel jLabelOpcoes;
    private javax.swing.JPanel jPanel1;
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
