package view;

import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.Bovino;

/**
 *
 * @author 0068967
 */
public class JCadastraAnimal extends javax.swing.JPanel {
    private ButtonGroup grupoButao;
    
    public JCadastraAnimal() {
        initComponents();
        
        config();
    }
    
    private void config() {
        this.limpaFields();
        this.grupoButao = new ButtonGroup();
        this.grupoButao.add(jRadioButtonM);
        this.grupoButao.add(jRadioButtonF);
    }
    
    private void limpaFields() {
        this.jTextNome.setText("");
        this.jTextBrinco.setText("");
        this.jTextPeso.setText("");
        this.jTextRaca.setText("");
        this.jRadioButtonF.setSelected(false);
        this.jRadioButtonM.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextBrinco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextRaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonM = new javax.swing.JRadioButton();
        jRadioButtonF = new javax.swing.JRadioButton();
        jButtonCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 25));
        jLabel1.setText("Cadastrar Novo Animal");

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

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 25, 25));
        jLabel3.setText("Brinco:");

        jTextBrinco.setBackground(new java.awt.Color(233, 233, 233));
        jTextBrinco.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextBrinco.setForeground(new java.awt.Color(25, 25, 25));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 25, 25));
        jLabel4.setText("Raça:");

        jTextRaca.setBackground(new java.awt.Color(233, 233, 233));
        jTextRaca.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextRaca.setForeground(new java.awt.Color(25, 25, 25));
        jTextRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRacaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 25, 25));
        jLabel5.setText("Peso:");

        jTextPeso.setBackground(new java.awt.Color(233, 233, 233));
        jTextPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextPeso.setForeground(new java.awt.Color(25, 25, 25));
        jTextPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 25, 25));
        jLabel6.setText("Nome:");

        jTextNome.setBackground(new java.awt.Color(233, 233, 233));
        jTextNome.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextNome.setForeground(new java.awt.Color(25, 25, 25));
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextRaca)
                            .addComponent(jTextBrinco)
                            .addComponent(jTextPeso)
                            .addComponent(jTextNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonM)
                    .addComponent(jRadioButtonF)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        this.limpaFields();
        FramePrincipal.trocaPainel("inicio", new JTelaInicial());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRacaActionPerformed

    private void jTextPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesoActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (!this.jTextBrinco.getText().isEmpty()) {
            int brinco = Integer.parseInt(this.jTextBrinco.getText());

            if (!this.jTextRaca.getText().isEmpty()) {
                String raca = this.jTextRaca.getText();

                if(!this.jTextPeso.getText().isEmpty()) {
                    String peso = this.jTextPeso.getText();
                }
   
            } else {
                JOptionPane.showMessageDialog(this, "Insira a raça do animal!",
                        "Dados incompletos", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira o número do brinco do animal!",
                    "Dados incompletos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButtonF;
    private javax.swing.JRadioButton jRadioButtonM;
    private javax.swing.JTextField jTextBrinco;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextRaca;
    // End of variables declaration//GEN-END:variables
}
