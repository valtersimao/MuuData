package view;

import control.HistoricoControl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Vacina;

public class JCadastraVacina extends javax.swing.JFrame {

    private HistoricoControl saudeControl;
    private DefaultComboBoxModel listaVacinas;
    
    public JCadastraVacina(DefaultComboBoxModel lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.saudeControl = new HistoricoControl();
        this.listaVacinas = lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextDoses = new javax.swing.JTextField();
        jTextDescricao = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(120, 130, 89));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setPreferredSize(new java.awt.Dimension(401, 642));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nome:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNome.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Doses:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Descrição:");

        jTextDoses.setBackground(new java.awt.Color(255, 255, 255));
        jTextDoses.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDoses.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDescricao.setPreferredSize(new java.awt.Dimension(64, 30));

        jButtonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar.setText("Adicionar");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSalvar.setVerifyInputWhenFocusTarget(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Criar Vacinas");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextDoses, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDoses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (!jTextNome.getText().isEmpty() && !jTextDoses.getText().isEmpty() && !jTextDescricao.getText().isEmpty()) {
            
            String nome = jTextNome.getText();
            String descricao = jTextDescricao.getText();
            short doses = Short.parseShort(jTextDoses.getText());
            
            if (JOptionPane.showConfirmDialog(this, "Você deseja criar essa vacina?",
                    "Finalizar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                Vacina vacina = saudeControl.insert(nome, descricao, doses);
                
                if (vacina != null) {
                    JOptionPane.showMessageDialog(this, "Vacina criada com sucesso!",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.listaVacinas.addElement(vacina);                                
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Houve uma falha no registro!",
                            "Falha", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não deixe campos vazios!",
                    "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextDoses;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
