package view;

import control.FazendaControl;
import model.Fazenda;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author 0068967
 */
public class JTelaLogin extends javax.swing.JPanel {

    FazendaControl fazendaControl;

    public JTelaLogin() {
        initComponents();

        config();
    }

    private void config() {
        this.fazendaControl = new FazendaControl();
    }

    private void limpaFields() {
        this.jTextNome.setText("");
        this.jPasswordField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(120, 130, 89));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha:");

        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButtonLogin.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonLogin.setText("ENTRAR");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.setFocusable(false);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSenha.setText("Esqueci minha senha");
        jLabelSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSenhaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSenhaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelSenhaMouseReleased(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastrar.setText("Cadastrar Fazenda");
        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.setFocusable(false);
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseReleased(evt);
            }
        });
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextNome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSenha)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSenhaMouseEntered
        //this.jLabelSenha.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14)); // NOI18N
        this.jLabelSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jLabelSenha.setForeground(Color.blue);
    }//GEN-LAST:event_jLabelSenhaMouseEntered

    private void jLabelSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSenhaMouseExited
        //this.jLabelSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jLabelSenha.setForeground(Color.black);
    }//GEN-LAST:event_jLabelSenhaMouseExited

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CADASTRO_FAZENDA, new JCadastraFazenda());
        this.limpaFields();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseEntered
        this.jButtonCadastrar.setFont(new java.awt.Font("Arial Black", java.awt.Font.BOLD, 14));
    }//GEN-LAST:event_jButtonCadastrarMouseEntered

    private void jButtonCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseExited
        this.jButtonCadastrar.setFont(new java.awt.Font("Arial Black", 0, 14));

    }//GEN-LAST:event_jButtonCadastrarMouseExited

    private void jLabelSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSenhaMousePressed
        this.jLabelSenha.setForeground(Color.cyan);
        //ESQUECEU A SENHA -- TODO
    }//GEN-LAST:event_jLabelSenhaMousePressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        //REALIZAR LOGIN -- TODO
        String nome = jTextNome.getText();
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do nome da fazenda!", "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            String senha = jPasswordField.getText();
            if (senha == null || senha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o campo da senha!", "Falha", JOptionPane.WARNING_MESSAGE);
            } else {
                int op = this.fazendaControl.logIn(nome, senha);
                if (op == FazendaControl.NO_PROBLEM) {
                    /*Fazenda fazenda = this.fazendaControl.getFazenda(nome);
                      FramePrincipal.trocaPainel(FramePrincipal.TELA_INICIAL, new JTelaInicial(fazenda));
                      LOGIN COM A FAZENDA -- TODO
                     */

                    FramePrincipal.removePainel(FramePrincipal.TELA_LOGIN);
                    FramePrincipal.trocaPainel(FramePrincipal.TELA_INICIAL, new JTelaInicial(nome));
                } else {
                    switch (op) {
                        case FazendaControl.USER_NOT_FOUND:
                            JOptionPane.showMessageDialog(this, "Usuário inexistente!", "Falha", JOptionPane.WARNING_MESSAGE);

                            break;
                        case FazendaControl.INVALID_PASSWORD:
                            JOptionPane.showMessageDialog(this, "Senha incorreta!", "Falha", JOptionPane.WARNING_MESSAGE);
                        default:
                            throw new AssertionError();
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jLabelSenhaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSenhaMouseReleased
        this.jLabelSenha.setForeground(Color.blue);
    }//GEN-LAST:event_jLabelSenhaMouseReleased

    private void jButtonCadastrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseReleased
        this.jButtonCadastrar.setForeground(Color.black);
    }//GEN-LAST:event_jButtonCadastrarMouseReleased

    private void jButtonCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMousePressed
        this.jButtonCadastrar.setForeground(Color.blue);
    }//GEN-LAST:event_jButtonCadastrarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
