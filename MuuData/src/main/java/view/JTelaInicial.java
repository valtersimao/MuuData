package view;

public class JTelaInicial extends javax.swing.JPanel {

    public JTelaInicial() {
        initComponents();
        config();
    }

    private void config() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jButtonCadastroNascimento = new javax.swing.JButton();
        jButtonCadastroAnimal1 = new javax.swing.JButton();
        jButtonConsultaAnimal = new javax.swing.JButton();
        jButtonUndefined = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\0068967\\Desktop\\interdisciplinar\\muuDataLogo.png")); // NOI18N
        jLabelIcon.setText("LOGO");

        jButtonCadastroNascimento.setBackground(new java.awt.Color(235, 233, 225));
        jButtonCadastroNascimento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonCadastroNascimento.setForeground(new java.awt.Color(25, 25, 25));
        jButtonCadastroNascimento.setText("Cadastrar Nascimento");
        jButtonCadastroNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroNascimento.setFocusPainted(false);
        jButtonCadastroNascimento.setFocusable(false);
        jButtonCadastroNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroNascimentoActionPerformed(evt);
            }
        });

        jButtonCadastroAnimal1.setBackground(new java.awt.Color(235, 233, 225));
        jButtonCadastroAnimal1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonCadastroAnimal1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastroAnimal1.setText("Cadastrar Animal");
        jButtonCadastroAnimal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroAnimal1.setFocusPainted(false);
        jButtonCadastroAnimal1.setFocusable(false);
        jButtonCadastroAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAnimal1ActionPerformed(evt);
            }
        });

        jButtonConsultaAnimal.setBackground(new java.awt.Color(235, 233, 225));
        jButtonConsultaAnimal.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonConsultaAnimal.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConsultaAnimal.setText("Consultar Animal");
        jButtonConsultaAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultaAnimal.setFocusPainted(false);
        jButtonConsultaAnimal.setFocusable(false);
        jButtonConsultaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaAnimalActionPerformed(evt);
            }
        });

        jButtonUndefined.setBackground(new java.awt.Color(235, 233, 225));
        jButtonUndefined.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonUndefined.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUndefined.setText("UNDEFINED");
        jButtonUndefined.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsultaAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastroAnimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastroNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUndefined, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCadastroAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCadastroNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUndefined, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAnimal1ActionPerformed
        // TODO add your handling code here:
        FramePrincipal.trocaPainel("cadastraAnimal", new JCadastraAnimal());
    }//GEN-LAST:event_jButtonCadastroAnimal1ActionPerformed

    private void jButtonCadastroNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroNascimentoActionPerformed
        // TODO add your handling code here:
        FramePrincipal.trocaPainel("cadastraNascimento", new JCadastraNascimento());
    }//GEN-LAST:event_jButtonCadastroNascimentoActionPerformed

    private void jButtonConsultaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaAnimalActionPerformed
        // TODO add your handling code here:
        FramePrincipal.trocaPainel("consultaAnimais", new JConsulta());
    }//GEN-LAST:event_jButtonConsultaAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroAnimal1;
    private javax.swing.JButton jButtonCadastroNascimento;
    private javax.swing.JButton jButtonConsultaAnimal;
    private javax.swing.JButton jButtonUndefined;
    private javax.swing.JLabel jLabelIcon;
    // End of variables declaration//GEN-END:variables
}
