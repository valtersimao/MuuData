package view;

import control.HistoricoControl;
import javax.swing.JOptionPane;
import model.HistoricoDeSaude;

public class JHistoricoDoenca extends javax.swing.JPanel {

    private HistoricoControl saudeControl;
    private HistoricoDeSaude historico;
    
    public JHistoricoDoenca() {    
    }
    
    public JHistoricoDoenca(HistoricoDeSaude historico) {
        initComponents();
        this.historico = historico;
        
        config();
    }

    private void config() {  
        this.saudeControl = new HistoricoControl();
        
        this.preencheFields();
        this.edit(false);
    }
    
    private void setButtonsVisible(boolean op) {
        
    }
    
    private void setFieldsEnable(boolean op) {
        
    }
    
    private void edit(boolean op) {
        this.setButtonsVisible(op);
        this.setFieldsEnable(op);
    }
    
    private void preencheFields() {
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonHistorico = new javax.swing.JButton();
        jLabelIcon1 = new javax.swing.JLabel();
        jButtonDoenca = new javax.swing.JButton();
        jButtonVacina = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVacinas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 674));

        jPanel1.setBackground(new java.awt.Color(120, 130, 89));

        jButtonVoltar.setBackground(new java.awt.Color(120, 130, 89));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/returnIcon.png"))); // NOI18N
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonHistorico.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jButtonHistorico.setForeground(new java.awt.Color(0, 0, 0));
        jButtonHistorico.setText("Histórico");
        jButtonHistorico.setContentAreaFilled(false);
        jButtonHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHistorico.setFocusable(false);
        jButtonHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHistoricoMouseExited(evt);
            }
        });
        jButtonHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoricoActionPerformed(evt);
            }
        });

        jLabelIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataMiniLogo.png"))); // NOI18N

        jButtonDoenca.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButtonDoenca.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDoenca.setText("Doenças");
        jButtonDoenca.setContentAreaFilled(false);
        jButtonDoenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDoenca.setFocusable(false);

        jButtonVacina.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jButtonVacina.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVacina.setText("Vacinas");
        jButtonVacina.setContentAreaFilled(false);
        jButtonVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVacina.setFocusable(false);
        jButtonVacina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVacinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVacinaMouseExited(evt);
            }
        });
        jButtonVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVacina)
                            .addComponent(jButtonDoenca)
                            .addComponent(jButtonHistorico))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTableVacinas.setBackground(new java.awt.Color(255, 255, 255));
        jTableVacinas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableVacinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Data", "Gravidade", "Tratamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVacinas.setFocusable(false);
        jTableVacinas.setGridColor(new java.awt.Color(128, 128, 128));
        jTableVacinas.setRowHeight(25);
        jTableVacinas.setSelectionBackground(new java.awt.Color(120, 130, 89));
        jTableVacinas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableVacinas.setShowGrid(false);
        jTableVacinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVacinasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVacinas);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ficha Médica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        FramePrincipal.removePainel(FramePrincipal.TELA_HISTORICO_SAUDE);
        FramePrincipal.removePainel(FramePrincipal.TELA_HISTORICO_VACINA);
        FramePrincipal.removePainel(FramePrincipal.TELA_HISTORICO_DOENCA);
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CONSULTA, new JConsulta());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoricoActionPerformed
        FramePrincipal.trocaPainel(FramePrincipal.TELA_HISTORICO_SAUDE, new JHistoricoSaude());
    }//GEN-LAST:event_jButtonHistoricoActionPerformed

    private void jButtonHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistoricoMouseEntered
        this.jButtonHistorico.setFont(new java.awt.Font("Arial Black", java.awt.Font.PLAIN, 24));
    }//GEN-LAST:event_jButtonHistoricoMouseEntered

    private void jButtonHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistoricoMouseExited
        this.jButtonHistorico.setFont(new java.awt.Font("Arial Black", java.awt.Font.PLAIN, 20));
    }//GEN-LAST:event_jButtonHistoricoMouseExited

    private void jButtonVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVacinaActionPerformed
        HistoricoDeSaude historico = this.historico;
        FramePrincipal.trocaPainel(FramePrincipal.TELA_HISTORICO_VACINA, new JHistoricoVacina(historico));
    }//GEN-LAST:event_jButtonVacinaActionPerformed

    private void jButtonVacinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVacinaMouseEntered
        this.jButtonVacina.setFont(new java.awt.Font("Arial Black", java.awt.Font.PLAIN, 24));
    }//GEN-LAST:event_jButtonVacinaMouseEntered

    private void jButtonVacinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVacinaMouseExited
        this.jButtonVacina.setFont(new java.awt.Font("Arial Black", java.awt.Font.PLAIN, 20));
    }//GEN-LAST:event_jButtonVacinaMouseExited

    private void jTableVacinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVacinasMouseClicked

    }//GEN-LAST:event_jTableVacinasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDoenca;
    private javax.swing.JButton jButtonHistorico;
    private javax.swing.JButton jButtonVacina;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIcon1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVacinas;
    // End of variables declaration//GEN-END:variables
}