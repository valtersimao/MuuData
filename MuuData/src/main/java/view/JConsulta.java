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
        this.jButtonSalvar.setVisible(false);
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

    private void limpaFields() {
        this.jComboBoxMae.setSelectedIndex(-1);
        this.jTextData.setText("");
        this.jTextNome.setText("");
        this.jTextRaca.setText("");
        this.jTextPeso.setText("");
        this.jTextMae.setText("");
        this.jTextIdade.setText("");
        this.jTextSexo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButtonSalvar = new javax.swing.JButton();
        jTextBrinco = new javax.swing.JTextField();
        jTextSexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextMae = new javax.swing.JTextField();
        jLabelMae = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 590));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sexo:");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Animal");

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

        jTextRaca.setBackground(new java.awt.Color(255, 255, 255));
        jTextRaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextRaca.setForeground(new java.awt.Color(0, 0, 0));

        jTextData.setBackground(new java.awt.Color(255, 255, 255));
        jTextData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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

        jTextBrinco.setBackground(new java.awt.Color(255, 255, 255));
        jTextBrinco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextBrinco.setForeground(new java.awt.Color(0, 0, 0));

        jTextSexo.setBackground(new java.awt.Color(255, 255, 255));
        jTextSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextSexo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Raça:");

        jTextMae.setBackground(new java.awt.Color(255, 255, 255));
        jTextMae.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextMae.setForeground(new java.awt.Color(0, 0, 0));

        jLabelMae.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelMae.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMae.setText("Mãe:");

        jLabelIdade.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelIdade.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIdade.setText("Idade:");

        jTextIdade.setBackground(new java.awt.Color(255, 255, 255));
        jTextIdade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextIdade.setForeground(new java.awt.Color(0, 0, 0));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUpdate.setText("Alterar");
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelMae)
                                            .addGap(7, 7, 7)))
                                    .addComponent(jLabelIdade)
                                    .addComponent(jLabelDate))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMae)
                                    .addComponent(jTextIdade)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMae, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.limpaFields();
        FramePrincipal.removePainel(FramePrincipal.TELA_CADASTRO_BOVINO);
        FramePrincipal.trocaPainel("TELA_INICIAL", new JTelaInicial());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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

    private void jComboBoxMaeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMaeItemStateChanged
        if (this.jComboBoxMae.getSelectedIndex() >= 0) {
            Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();
            boolean temMae = (boi.getIdMae() != null) && (boi.getIdMae() != Bovino.ID_DEFAULT);

            this.jTextBrinco.setText(boi.getBrinco() + "");
            this.jTextRaca.setText(boi.getRaca());
            this.jTextPeso.setText(boi.getPeso() == null || boi.getPeso() == 0 ? "-/-" : boi.getPeso() + "");
            this.jTextNome.setText((boi.getNome() == null || boi.getNome().isEmpty()) ? "-/-" : boi.getNome());
            this.jTextSexo.setText(boi.isSexo() == Bovino.MACHO ? "Macho" : "Fêmea");
            
            this.setMaeVisible(temMae);
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
    }//GEN-LAST:event_jComboBoxMaeItemStateChanged

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        this.jButtonUpdate.setEnabled(false);
        this.jButtonSalvar.setEnabled(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
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
