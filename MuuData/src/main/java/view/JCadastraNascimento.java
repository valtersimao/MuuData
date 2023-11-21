package view;

import control.BovinoControl;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Bovino;

public class JCadastraNascimento extends javax.swing.JPanel {

    private DefaultComboBoxModel comboMae;
    private BovinoControl boiControl;
    private ButtonGroup grupoButao;

    public JCadastraNascimento() {
        initComponents();

        config();
    }

    private void config() {
        this.limpaFields();
        this.grupoButao = new ButtonGroup();
        this.grupoButao.add(jRadioButtonM);
        this.grupoButao.add(jRadioButtonF);

        this.boiControl = new BovinoControl();

        this.comboMae = new DefaultComboBoxModel();
        this.jComboBoxMae.setModel(comboMae);
        this.comboMae.addAll(boiControl.getFemale());
    }

    private void limpaFields() {
        this.jComboBoxMae.setSelectedIndex(-1);
        this.jTextData.setText("");
        this.jTextBrinco.setText("");
        this.jTextNome.setText("");
        this.jTextRaca.setText("");
        this.jRadioButtonF.setSelected(false);
        this.jRadioButtonM.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMae = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextBrinco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextRaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonM = new javax.swing.JRadioButton();
        jRadioButtonF = new javax.swing.JRadioButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 25));
        jLabel1.setText("Cadastrar Nascimento");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 25, 25));
        jLabel2.setText("Maternidade:");

        jComboBoxMae.setBackground(new java.awt.Color(233, 233, 233));
        jComboBoxMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxMae.setForeground(new java.awt.Color(60, 63, 65));
        jComboBoxMae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMae.setFocusable(false);
        jComboBoxMae.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMaeItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 25, 25));
        jLabel3.setText("Brinco:");

        jTextBrinco.setBackground(new java.awt.Color(233, 233, 233));
        jTextBrinco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextBrinco.setForeground(new java.awt.Color(60, 63, 65));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 25, 25));
        jLabel4.setText("Raça:");

        jTextRaca.setBackground(new java.awt.Color(233, 233, 233));
        jTextRaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextRaca.setForeground(new java.awt.Color(60, 63, 65));
        jTextRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRacaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 25, 25));
        jLabel5.setText("Nome:");

        jTextNome.setBackground(new java.awt.Color(233, 233, 233));
        jTextNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextNome.setForeground(new java.awt.Color(60, 63, 65));
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 25, 25));
        jLabel6.setText("Data:");

        jTextData.setBackground(new java.awt.Color(233, 233, 233));
        jTextData.setForeground(new java.awt.Color(60, 63, 65));
        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 25, 25));
        jLabel7.setText("Sexo:");

        jRadioButtonM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jRadioButtonM.setForeground(new java.awt.Color(25, 25, 25));
        jRadioButtonM.setText("M");
        jRadioButtonM.setContentAreaFilled(false);
        jRadioButtonM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonM.setFocusable(false);

        jRadioButtonF.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jRadioButtonF.setForeground(new java.awt.Color(25, 25, 25));
        jRadioButtonF.setText("F");
        jRadioButtonF.setContentAreaFilled(false);
        jRadioButtonF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonF.setFocusable(false);

        jButtonVoltar.setBackground(new java.awt.Color(233, 233, 233));
        jButtonVoltar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(233, 233, 233));
        jButtonCadastrar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.setFocusable(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxMae, 0, 292, Short.MAX_VALUE)
                            .addComponent(jTextBrinco)
                            .addComponent(jTextRaca)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonM)
                    .addComponent(jRadioButtonF)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMaeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMaeItemStateChanged
        if (this.jComboBoxMae.getSelectedIndex() >= 0) {
            Bovino mae = (Bovino) this.jComboBoxMae.getSelectedItem();

            this.jTextBrinco.setText(mae.getBrinco() + "");
            this.jTextRaca.setText(mae.getRaca() + "");
        }
    }//GEN-LAST:event_jComboBoxMaeItemStateChanged

    private void jTextRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRacaActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.limpaFields();
        FramePrincipal.trocaPainel("inicio", new JTelaInicial());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:

        //verificação para evitar valores nulos
        try {

            if (this.jComboBoxMae.getSelectedIndex() != -1) {
                int idMae = ((Bovino) this.jComboBoxMae.getSelectedItem()).getId();

                if (!this.jTextBrinco.getText().isEmpty()) {
                    int brinco = Integer.parseInt(this.jTextBrinco.getText());

                    if (!this.jTextRaca.getText().isEmpty()) {
                        String raca = this.jTextRaca.getText();

                        int op = JOptionPane.NO_OPTION;
                        if (this.jTextNome.getText().isEmpty()) {
                            op = JOptionPane.showConfirmDialog(this, "O bezerro está sem nome, você deseja mudar?",
                                    "Dados incompletos", JOptionPane.YES_NO_OPTION);
                        }

                        if (op == JOptionPane.NO_OPTION) {
                            String nome = this.jTextNome.getText();

                            try {

                                boolean sexo = this.jRadioButtonM.isSelected();

                                op = JOptionPane.showConfirmDialog(this, "Você deseja cadastrar esse animal?",
                                        "Finalizar", JOptionPane.YES_NO_OPTION);

                                if (op == JOptionPane.YES_OPTION) {

                                    if (boiControl.insert(nome, brinco, raca, sexo, idMae, this.jTextData.getText())) {
                                        JOptionPane.showMessageDialog(this, "Bezerro cadastrado com sucesso!",
                                                "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                                        op = JOptionPane.showConfirmDialog(this, "Você deseja cadastrar outro nascimento?",
                                                "", JOptionPane.YES_NO_OPTION);
                                        if (op == JOptionPane.YES_OPTION) {
                                            this.limpaFields();
                                        } else {
                                            this.jButtonVoltarActionPerformed(evt);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Houve uma falha no cadastro",
                                                "Falha", JOptionPane.ERROR_MESSAGE);
                                    }
                                }

                            } catch (ParseException ex) {
                                JOptionPane.showMessageDialog(this, "Erro na data de nascimento!",
                                        "Dados incorretos", JOptionPane.WARNING_MESSAGE);
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Insira a raça do bezerro!",
                                "Dados incompletos", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira o número do brinco do bezerro!",
                            "Dados incompletos", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione a mãe do bezerro!",
                        "Dados incompletos", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira o formato correto!",
                    "Dados incorretos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Bovino> jComboBoxMae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButtonF;
    private javax.swing.JRadioButton jRadioButtonM;
    private javax.swing.JTextField jTextBrinco;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextRaca;
    // End of variables declaration//GEN-END:variables
}
