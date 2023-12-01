package view;


public class JTelaInicial extends javax.swing.JPanel {
    
    private String fazenda;

    public JTelaInicial() {
        initComponents();
    }
    
    public JTelaInicial(String fazenda) {
        this.fazenda = fazenda;
        
        initComponents();
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
        jButtonCadastroNascimento1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(120, 130, 89));

        jButtonCadastroNascimento.setBackground(new java.awt.Color(120, 130, 89));
        jButtonCadastroNascimento.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonCadastroNascimento.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastroNascimento.setText("Cadastrar Nascimento");
        jButtonCadastroNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroNascimento.setFocusPainted(false);
        jButtonCadastroNascimento.setFocusable(false);
        jButtonCadastroNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroNascimentoActionPerformed(evt);
            }
        });

        jButtonCadastroAnimal1.setBackground(new java.awt.Color(120, 130, 89));
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

        jButtonConsultaAnimal.setBackground(new java.awt.Color(120, 130, 89));
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

        jButtonUndefined.setBackground(java.awt.Color.white);
        jButtonUndefined.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonUndefined.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUndefined.setText("UNDEFINED");
        jButtonUndefined.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N
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
                .addGap(0, 371, Short.MAX_VALUE))
        );

        jButtonCadastroNascimento1.setBackground(new java.awt.Color(120, 130, 89));
        jButtonCadastroNascimento1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButtonCadastroNascimento1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastroNascimento1.setText("Desconectar");
        jButtonCadastroNascimento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroNascimento1.setFocusPainted(false);
        jButtonCadastroNascimento1.setFocusable(false);
        jButtonCadastroNascimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroNascimento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonCadastroAnimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastroNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUndefined, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCadastroNascimento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonConsultaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastroAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastroNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastroNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUndefined, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAnimal1ActionPerformed
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CADASTRO_BOVINO, new JCadastraAnimal(fazenda));
    }//GEN-LAST:event_jButtonCadastroAnimal1ActionPerformed

    private void jButtonCadastroNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroNascimentoActionPerformed
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CADASTRO_NASCIMENTO, new JCadastraNascimento(fazenda));
    }//GEN-LAST:event_jButtonCadastroNascimentoActionPerformed

    private void jButtonConsultaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaAnimalActionPerformed
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CONSULTA, new JConsulta(fazenda));
    }//GEN-LAST:event_jButtonConsultaAnimalActionPerformed

    private void jButtonCadastroNascimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroNascimento1ActionPerformed
        FramePrincipal.removePainel(FramePrincipal.TELA_INICIAL);
        FramePrincipal.trocaPainel(FramePrincipal.TELA_LOGIN, new JTelaLogin());
    }//GEN-LAST:event_jButtonCadastroNascimento1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroAnimal1;
    private javax.swing.JButton jButtonCadastroNascimento;
    private javax.swing.JButton jButtonCadastroNascimento1;
    private javax.swing.JButton jButtonConsultaAnimal;
    private javax.swing.JButton jButtonUndefined;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}