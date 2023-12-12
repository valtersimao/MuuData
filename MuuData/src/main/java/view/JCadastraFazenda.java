package view;

import control.FazendaControl;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Fazenda;

/**
 *
 * @author Vartin
 */
public class JCadastraFazenda extends javax.swing.JPanel {

    FazendaControl fazendaControl;

    public JCadastraFazenda() {
        initComponents();
        
        config();
    }

    private void config() {
        this.fazendaControl = new FazendaControl();
    }

    private void limpaFields() {
        this.jTextNome.setText("");
        this.jTextEmail.setText("");
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
        jButtonCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextEmail = new javax.swing.JTextField();
        jLabelCadastro = new javax.swing.JLabel();

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
        jLabel2.setText("CADASTRO");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha:");

        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButtonCadastrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonCadastrar.setText("CRIAR FAZENDA");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.setFocusable(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email:");

        jPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelCadastro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCadastro.setText("Já possui cadastro?");
        jLabelCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCadastroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCadastroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCadastroMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabelCadastro))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNome)
                            .addComponent(jTextEmail)
                            .addComponent(jPasswordField))))
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
                    .addComponent(jLabel4)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastro)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 350, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 350, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        //REALIZAR LOGIN -- TODO
        String nome = jTextNome.getText();
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do nome da fazenda!", "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            String email = jTextEmail.getText();
            if (email == null || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o campo do email!", "Falha", JOptionPane.WARNING_MESSAGE);
            } else {
                String senha = jPasswordField.getText();
                if (senha == null || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Preencha o campo da senha!", "Falha", JOptionPane.WARNING_MESSAGE);
                } else {
                    int op = this.fazendaControl.signIn(senha, nome, email);
                    if (op == FazendaControl.NO_PROBLEM) {
                        JOptionPane.showMessageDialog(this, "Cadastro concluído!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        FramePrincipal.trocaPainel(FramePrincipal.TELA_LOGIN, new JTelaLogin());
                    } else {
                        switch (op) {
                            case FazendaControl.USER_EXISTS:
                                JOptionPane.showMessageDialog(this, "Esse usuário já existe, tente novamente!", "Falha", JOptionPane.WARNING_MESSAGE);
                                break;
                            case FazendaControl.INVALID_EMAIL:
                                JOptionPane.showMessageDialog(this, "Esse email é inválido, tente novamente!", "Falha", JOptionPane.WARNING_MESSAGE);
                                break;
                            case FazendaControl.ANOTHER_ERROR:    
                                JOptionPane.showMessageDialog(this, "Ocorreu um erro!", "Falha", JOptionPane.WARNING_MESSAGE);
                            default:
                                throw new AssertionError();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jLabelCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroMouseEntered
        this.jLabelCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jLabelCadastro.setForeground(Color.blue);
    }//GEN-LAST:event_jLabelCadastroMouseEntered

    private void jLabelCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroMouseExited
        this.jLabelCadastro.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCadastroMouseExited

    private void jLabelCadastroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroMousePressed
        this.jLabelCadastro.setForeground(Color.cyan);
        this.limpaFields();
        FramePrincipal.trocaPainel(FramePrincipal.TELA_LOGIN, new JTelaLogin());
    }//GEN-LAST:event_jLabelCadastroMousePressed

    private void jLabelCadastroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroMouseReleased
        this.jLabelCadastro.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCadastroMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
