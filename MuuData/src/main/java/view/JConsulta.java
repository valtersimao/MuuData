package view;

import control.BovinoControl;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
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

        jComboBoxMae = new javax.swing.JComboBox<>();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextBrinco = new javax.swing.JTextField();
        jLabelMae = new javax.swing.JLabel();
        jTextSexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextData = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextRaca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextMae = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 153));

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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 25));
        jLabel1.setText("Consultar Animal");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        jTextNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNome.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextNome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Animal:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Brinco:");

        jTextBrinco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextBrinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextBrinco.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextBrinco.setEnabled(false);

        jLabelMae.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelMae.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMae.setText("Mãe:");

        jTextSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSexo.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextSexo.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Peso:");

        jTextData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextData.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Raça:");

        jTextRaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextRaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextRaca.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextRaca.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sexo:");

        jTextMae.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextMae.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMae.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextMae.setEnabled(false);

        jLabelDate.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDate.setText("Data de Nascimento:");

        jTextPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPeso.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextPeso.setEnabled(false);

        jLabelIdade.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelIdade.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIdade.setText("Idade:");

        jTextIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextIdade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextIdade.setDisabledTextColor(new java.awt.Color(60, 63, 65));
        jTextIdade.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMae, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextData))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabelMae))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                    .addComponent(jTextBrinco))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jTextMae)
                                            .addComponent(jTextRaca)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelIdade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextIdade)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonVoltar)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jComboBoxMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMae)
                    .addComponent(jTextMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdade))
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMaeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMaeItemStateChanged
        if (this.jComboBoxMae.getSelectedIndex() >= 0) {
            Bovino boi = (Bovino) this.jComboBoxMae.getSelectedItem();
            boolean temMae = (boi.getIdMae() != null) && (boi.getIdMae() != Bovino.ID_DEFAULT);

            this.jTextBrinco.setText(boi.getBrinco() + "");
            this.jTextRaca.setText(boi.getRaca());
            this.jTextData.setText(boi.getPeso() == 0 ? "-/-" : boi.getPeso() + "");
            this.jTextNome.setText((boi.getNome() == null || boi.getNome().isEmpty()) ? "-/-" : boi.getNome());
            this.jTextSexo.setText(boi.isSexo() == Bovino.MACHO ? "Macho" : "Fêmea");

            this.setMaeVisible(temMae);
            if (temMae) {
                this.jTextMae.setText(this.boiControl.getById(boi.getIdMae()).toString());
            }

            this.setDateVisible(boi.getNascimento() != null);
            if (boi.getNascimento() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                this.jTextData.setText(sdf.format(boi.getNascimento().getTime()));

                int anos = boi.getIdadeMeses() / 12;
                int meses = boi.getIdadeMeses() - (anos * 12);
                String idade = anos > 0 ? anos + " anos e " : "";
                idade += meses + " meses";
                this.jTextIdade.setText(idade);
            }
        }
    }//GEN-LAST:event_jComboBoxMaeItemStateChanged

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.limpaFields();
        FramePrincipal.trocaPainel("inicio", new JTelaInicial());
    }//GEN-LAST:event_jButtonVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<Bovino> jComboBoxMae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelMae;
    private javax.swing.JTextField jTextBrinco;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextMae;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextRaca;
    private javax.swing.JTextField jTextSexo;
    // End of variables declaration//GEN-END:variables
}
