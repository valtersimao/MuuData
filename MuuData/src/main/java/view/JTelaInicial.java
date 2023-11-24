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

        jButtonCadastroNascimento = new javax.swing.JButton();
        jButtonCadastroAnimal1 = new javax.swing.JButton();
        jButtonConsultaAnimal = new javax.swing.JButton();
        jButtonUndefined = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(120, 130, 89));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\resources\\muuDataLogo.png"));
        jLabelIcon.setText("LOGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCadastroAnimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastroNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonUndefined, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jButtonConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(205, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jButtonConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastroAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastroNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUndefined, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
