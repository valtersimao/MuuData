package view;

import javax.swing.JOptionPane;
import model.Bovino;

/**
 *
 * @author jotaa
 */
public class JHistoricoSaude extends javax.swing.JPanel {
    private Bovino bovino;
    
    public JHistoricoSaude(Bovino bovino) {
        initComponents();
        
        this.bovino = bovino;
        config();
    }
     
    private void config() {
        
        jLabelHistorico.setText("Histórico de " + this.bovino.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jTabbedSaude = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabelIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelHistorico = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextNomeVacina = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextDose = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextData = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextPrioridade = new javax.swing.JTextField();
        jButtonUpdateV = new javax.swing.JButton();
        jButtonAddV = new javax.swing.JButton();
        jButtonDeleteV = new javax.swing.JButton();
        jButtonSaveV = new javax.swing.JButton();
        jButtonCancelV = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDoencas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSalvar1 = new javax.swing.JButton();
        jButtonSalvar2 = new javax.swing.JButton();
        jButtonSalvar3 = new javax.swing.JButton();
        jButtonSalvar4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(120, 130, 89));
        setPreferredSize(new java.awt.Dimension(1000, 674));

        jPanel1.setBackground(new java.awt.Color(120, 130, 89));

        jButtonVoltar.setBackground(new java.awt.Color(120, 130, 89));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.setFocusable(false);
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedSaude.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedSaude.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedSaude.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelHistorico.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabelHistorico.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHistorico.setText("Historico");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(jLabelHistorico)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelHistorico)))
                .addContainerGap(373, Short.MAX_VALUE))
        );

        jTabbedSaude.addTab("Geral", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Prioridade", "Data", "Doses"
            }
        ));
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro de Vacinas");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome:");

        jTextNomeVacina.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeVacina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNomeVacina.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeVacina.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("N° de Doses:");

        jTextDose.setBackground(new java.awt.Color(255, 255, 255));
        jTextDose.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDose.setForeground(new java.awt.Color(0, 0, 0));
        jTextDose.setEnabled(false);
        jTextDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDoseActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Data:");

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

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Prioridade:");

        jTextPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        jTextPrioridade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextPrioridade.setForeground(new java.awt.Color(0, 0, 0));
        jTextPrioridade.setEnabled(false);

        jButtonUpdateV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdateV.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonUpdateV.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUpdateV.setText("Redefinir");
        jButtonUpdateV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdateV.setFocusPainted(false);
        jButtonUpdateV.setFocusable(false);
        jButtonUpdateV.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonUpdateV.setVerifyInputWhenFocusTarget(false);
        jButtonUpdateV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateVActionPerformed(evt);
            }
        });

        jButtonAddV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddV.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonAddV.setForeground(new java.awt.Color(25, 25, 25));
        jButtonAddV.setText("Adicionar");
        jButtonAddV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddV.setFocusPainted(false);
        jButtonAddV.setFocusable(false);
        jButtonAddV.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonAddV.setVerifyInputWhenFocusTarget(false);
        jButtonAddV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVActionPerformed(evt);
            }
        });

        jButtonDeleteV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDeleteV.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonDeleteV.setForeground(new java.awt.Color(25, 25, 25));
        jButtonDeleteV.setText("Excluir");
        jButtonDeleteV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteV.setFocusPainted(false);
        jButtonDeleteV.setFocusable(false);
        jButtonDeleteV.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonDeleteV.setVerifyInputWhenFocusTarget(false);
        jButtonDeleteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteVActionPerformed(evt);
            }
        });

        jButtonSaveV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSaveV.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSaveV.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSaveV.setText("Salvar");
        jButtonSaveV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSaveV.setFocusPainted(false);
        jButtonSaveV.setFocusable(false);
        jButtonSaveV.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSaveV.setVerifyInputWhenFocusTarget(false);

        jButtonCancelV.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelV.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonCancelV.setForeground(new java.awt.Color(25, 25, 25));
        jButtonCancelV.setText("Cancel");
        jButtonCancelV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelV.setFocusPainted(false);
        jButtonCancelV.setFocusable(false);
        jButtonCancelV.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonCancelV.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jTextNomeVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel9))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jButtonUpdateV, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextDose, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jButtonAddV, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(jButtonDeleteV, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jButtonSaveV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButtonCancelV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextNomeVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jTextPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdateV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedSaude.addTab("Vacinas", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTableDoencas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTableDoencas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Diagnóstico", "Gravidade", "Tratamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDoencas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableDoencas.setShowGrid(false);
        jScrollPane2.setViewportView(jTableDoencas);
        if (jTableDoencas.getColumnModel().getColumnCount() > 0) {
            jTableDoencas.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Doenças");

        jButtonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar.setText("Redefinir");
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

        jButtonSalvar1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar1.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar1.setText("Adicionar");
        jButtonSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar1.setFocusPainted(false);
        jButtonSalvar1.setFocusable(false);
        jButtonSalvar1.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSalvar1.setVerifyInputWhenFocusTarget(false);
        jButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar1ActionPerformed(evt);
            }
        });

        jButtonSalvar2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar2.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar2.setText("Excluir");
        jButtonSalvar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar2.setFocusPainted(false);
        jButtonSalvar2.setFocusable(false);
        jButtonSalvar2.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSalvar2.setVerifyInputWhenFocusTarget(false);
        jButtonSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar2ActionPerformed(evt);
            }
        });

        jButtonSalvar3.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar3.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar3.setText("Salvar");
        jButtonSalvar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar3.setFocusPainted(false);
        jButtonSalvar3.setFocusable(false);
        jButtonSalvar3.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSalvar3.setVerifyInputWhenFocusTarget(false);

        jButtonSalvar4.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalvar4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar4.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar4.setText("Cancel");
        jButtonSalvar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar4.setFocusPainted(false);
        jButtonSalvar4.setFocusable(false);
        jButtonSalvar4.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonSalvar4.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel2)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jButtonSalvar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButtonSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(120, 120, 120)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedSaude.addTab("Doenças", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedSaude))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedSaude))
        );

        jTabbedSaude.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        FramePrincipal.removePainel(FramePrincipal.TELA_HISTORICO_SAUDE);
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CONSULTA, new JConsulta());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvar1ActionPerformed

    private void jButtonSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvar2ActionPerformed

    private void jButtonUpdateVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateVActionPerformed

    private void jButtonAddVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddVActionPerformed

    private void jButtonDeleteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteVActionPerformed

    private void jTextDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDoseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddV;
    private javax.swing.JButton jButtonCancelV;
    private javax.swing.JButton jButtonDeleteV;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSalvar1;
    private javax.swing.JButton jButtonSalvar2;
    private javax.swing.JButton jButtonSalvar3;
    private javax.swing.JButton jButtonSalvar4;
    private javax.swing.JButton jButtonSaveV;
    private javax.swing.JButton jButtonUpdateV;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHistorico;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedSaude;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDoencas;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextDose;
    private javax.swing.JTextField jTextNomeVacina;
    private javax.swing.JTextField jTextPrioridade;
    // End of variables declaration//GEN-END:variables
}