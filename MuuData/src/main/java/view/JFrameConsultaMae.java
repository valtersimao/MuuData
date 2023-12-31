package view;

import control.BovinoControl;
import java.time.format.DateTimeFormatter;
import model.Bovino;

public class JFrameConsultaMae extends javax.swing.JFrame {

    private Bovino boi;
    private BovinoControl boiControl;
    private String nomeFilho;

    public JFrameConsultaMae(Bovino boi, BovinoControl boiControl, String nomeFilho) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.boi = boi;
        this.boiControl = boiControl;
        this.nomeFilho = nomeFilho;
        config();
    }

    private void config() {
        this.jLabel1.setText(jLabel1.getText() + this.nomeFilho);
        editInfo(this.boi);

        boolean temMae = (boi.getIdMae() != null) && (boi.getIdMae() != Bovino.ID_DEFAULT);

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
    }

    private void setDateVisible(boolean op) {
        this.jLabelDate.setVisible(op);
        this.jTextData.setVisible(op);
        this.jTextIdade.setVisible(op);
        this.jLabelIdade.setVisible(op);
    }

    private void setMaeVisible(boolean op) {
        this.jTextMae.setVisible(op);
        this.jLabelMae.setVisible(op);
    }

    private void editInfo(Bovino boi) {
        jTextBrinco.setText("" + boi.getBrinco());
        jTextNome.setText(boi.getNome().isBlank() ? "-/-" : boi.getNome());
        jTextPeso.setText(boi.getPeso() == 0 ? "-/-" : boi.getPeso() + "");
        jTextRaca.setText(boi.getRaca());
        jTextSexo.setText(boi.isSexo() ? "Macho" : "Femea");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(120, 130, 89));

        jPanel2.setBackground(new java.awt.Color(120, 130, 89));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 590));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sexo:");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mãe de ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextMaeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextMaeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextMaeMousePressed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBrinco)
                            .addComponent(jTextNome))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMae, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextRaca)
                                    .addComponent(jTextIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))))))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMaeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMaeMousePressed
        Integer brincoMae = this.boi.getIdMae();
        String nomeFi = this.boi.getNome().isBlank() ? this.boi.getBrinco() + "" : this.boi.getNome();

        new JFrameConsultaMae(boiControl.getById(brincoMae), boiControl, nomeFi).setVisible(true);


    }//GEN-LAST:event_jTextMaeMousePressed

    private void jTextMaeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMaeMouseEntered
        this.jTextMae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextMae.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));    }//GEN-LAST:event_jTextMaeMouseEntered

    private void jTextMaeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextMaeMouseExited
        jTextMae.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jTextMaeMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelMae;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
