package view;

import java.awt.Color;

public class JRecuperarSenha extends javax.swing.JPanel {

    public JRecuperarSenha(String nome) {
        initComponents();
        this.jTextNome.setText(nome);
        setVisibleCodigo(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelIcon = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jButtonPróximo = new javax.swing.JButton();
        jLabelVoltar = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(120, 130, 89));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jLabelCod.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelCod.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCod.setText("Insira o código enviado no email:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECUPERAR SENHA");

        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButtonPróximo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonPróximo.setText("PRÓXIMO");
        jButtonPróximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPróximo.setFocusable(false);
        jButtonPróximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPróximoActionPerformed(evt);
            }
        });

        jLabelVoltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelVoltar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelVoltar.setText("Voltar");
        jLabelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVoltarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseReleased(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("Informe o nome da fazenda:");

        jTextCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonPróximo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNome)
                            .addComponent(jLabelCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVoltar)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButtonPróximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVoltar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 337, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setVisibleCodigo(boolean op) {
        this.jTextNome.setVisible(!op);
        this.jLabelNome.setVisible(!op);
        
        this.jTextCodigo.setVisible(op);
        this.jLabelCod.setVisible(op);
    }
    
    private void jButtonPróximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPróximoActionPerformed
        if(this.jTextNome.isVisible()) {
            setVisibleCodigo(true);
        }
        
    }//GEN-LAST:event_jButtonPróximoActionPerformed

    private void jLabelVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseEntered
        this.jLabelVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jLabelVoltar.setForeground(Color.BLUE.blue);
    }//GEN-LAST:event_jLabelVoltarMouseEntered

    private void jLabelVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseExited
        this.jLabelVoltar.setForeground(Color.black);
    }//GEN-LAST:event_jLabelVoltarMouseExited

    private void jLabelVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMousePressed
        this.jLabelVoltar.setForeground(Color.cyan);
        FramePrincipal.removePainel(FramePrincipal.TELA_RECUPERAR_SENHA);
        FramePrincipal.trocaPainel(FramePrincipal.TELA_LOGIN,new JTelaLogin());
    }//GEN-LAST:event_jLabelVoltarMousePressed

    private void jLabelVoltarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseReleased
        this.jLabelVoltar.setForeground(Color.black);
    }//GEN-LAST:event_jLabelVoltarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPróximo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
