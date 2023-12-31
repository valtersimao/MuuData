package view;

import control.HistoricoControl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HistoricoDeSaude;
import model.Vacina;

public class JHistoricoVacina extends javax.swing.JPanel {

    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private HistoricoControl saudeControl;
    private HistoricoDeSaude historico;
    private DefaultTableModel tabela; 
    private DefaultComboBoxModel comboVacinas;

    private ArrayList<Vacina> vacinas;
    private int select = -1;

    public JHistoricoVacina() {
    }

    public JHistoricoVacina(HistoricoDeSaude historico) {
        initComponents();
        this.historico = historico;

        config();
    }

    private void config() {
        this.saudeControl = new HistoricoControl();
        this.comboVacinas = new DefaultComboBoxModel();
        this.comboVacinas.addAll(saudeControl.getAll());

        this.vacinas = saudeControl.getById(historico);
        this.tabela = (DefaultTableModel) this.jTableVacinas.getModel();

        for (Vacina vacina : vacinas) {
            Object[] row = {vacina.getNome(), vacina.getDescricao(), formato.format(vacina.getDataEvento()), vacina.getDosesRecomendadas()};
            this.tabela.addRow(row);
        }

        this.jTableVacinas.setModel(tabela);
        this.jComboBoxVacinas.setModel(comboVacinas);
        this.tabela.fireTableDataChanged();

        this.edit(false);
    }

    private void edit(boolean op) {
        this.jTextData.setEnabled(op);
        this.jButtonAdd.setVisible(op);
        this.jButtonDelete.setVisible(this.jTableVacinas.getSelectedRow() >= 0);
    }

    private void limpaFields() {
        this.jTextNome.setText("");
        this.jTextDoses.setText("");
        this.jTextDescricao.setText("");
        this.jTextData.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonHistorico = new javax.swing.JButton();
        jLabelIcon1 = new javax.swing.JLabel();
        jButtonVacina = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextDoses = new javax.swing.JTextField();
        jTextDescricao = new javax.swing.JTextField();
        jTextData = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVacinas = new javax.swing.JTable();
        jComboBoxVacinas = new javax.swing.JComboBox<>();
        jButtonCadastra = new javax.swing.JButton();

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

        jButtonVacina.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButtonVacina.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVacina.setText("Vacinas");
        jButtonVacina.setContentAreaFilled(false);
        jButtonVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVacina.setFocusable(false);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNome.setEnabled(false);
        jTextNome.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("N° de Doses:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Descrição");

        jTextDoses.setBackground(new java.awt.Color(255, 255, 255));
        jTextDoses.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDoses.setEnabled(false);
        jTextDoses.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextDescricao.setBackground(new java.awt.Color(255, 255, 255));
        jTextDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDescricao.setEnabled(false);
        jTextDescricao.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextData.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setEnabled(false);
        jTextData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextData.setMinimumSize(new java.awt.Dimension(64, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro de Vacinas");

        jButtonAdd.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(25, 25, 25));
        jButtonAdd.setText("Adicionar");
        jButtonAdd.setBorder(null);
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.setFocusPainted(false);
        jButtonAdd.setFocusable(false);
        jButtonAdd.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonAdd.setVerifyInputWhenFocusTarget(false);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(25, 25, 25));
        jButtonDelete.setText("Excluir");
        jButtonDelete.setBorder(null);
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.setFocusPainted(false);
        jButtonDelete.setFocusable(false);
        jButtonDelete.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonDelete.setVerifyInputWhenFocusTarget(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableVacinas.setBackground(new java.awt.Color(255, 255, 255));
        jTableVacinas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableVacinas.setForeground(new java.awt.Color(0, 0, 0));
        jTableVacinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Data", "Doses Recomendadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVacinas.setFocusable(false);
        jTableVacinas.setGridColor(new java.awt.Color(120, 130, 89));
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

        jComboBoxVacinas.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxVacinas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxVacinas.setMaximumRowCount(10);
        jComboBoxVacinas.setFocusable(false);
        jComboBoxVacinas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVacinasItemStateChanged(evt);
            }
        });

        jButtonCadastra.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCadastra.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastra.setText("Criar vacina");
        jButtonCadastra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastra.setFocusable(false);
        jButtonCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jComboBoxVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonCadastra))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jTextDoses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDoses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void jTableVacinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVacinasMouseClicked
        int unselect = this.jTableVacinas.getSelectedRow();
        this.jComboBoxVacinas.setSelectedIndex(-1);

        if (unselect == this.select) {
            this.jTableVacinas.clearSelection();
            this.edit(false);
            limpaFields();
            this.select = -1;
        } else {
            Vacina vacina = this.vacinas.get(unselect);

            this.jTextNome.setText(vacina.getNome());
            this.jTextDoses.setText(vacina.getDosesRecomendadas()+ "");
            this.jTextDescricao.setText(vacina.getDescricao());
            this.jTextData.setText(formato.format(vacina.getDataEvento()));
            this.select = unselect;
            this.edit(false);
        }
    }//GEN-LAST:event_jTableVacinasMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int linha = this.jTableVacinas.getSelectedRow();

        if (linha >= 0) {
            Vacina vacina = this.vacinas.get(linha);

            if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir essa vacina?",
                    "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                if (this.saudeControl.delete(vacina.getIdVacina())) {
                    JOptionPane.showMessageDialog(this, "O registro foi deletado com sucesso!",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.vacinas.remove(vacina);
                    this.tabela.removeRow(linha);
                    this.tabela.fireTableDataChanged();

                    this.limpaFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Houve uma falha ao tentar deletar o registro!",
                            "Falha", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            Vacina vacina = (Vacina) this.jComboBoxVacinas.getSelectedItem();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataEvento = LocalDate.parse(this.jTextData.getText(), formatter);
            vacina.setDataEvento(dataEvento);

            if (JOptionPane.showConfirmDialog(this, "Você deseja registrar essa vacina?",
                    "Finalizar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                vacina = saudeControl.insert(this.historico, vacina);

                if (vacina != null) {
                    JOptionPane.showMessageDialog(this, "Vacina registrada com sucesso!",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    Object[] row = {vacina.getNome(), vacina.getDescricao(), formato.format(vacina.getDataEvento()), vacina.getDosesRecomendadas()};
                    this.tabela.addRow(row);
                    this.tabela.fireTableDataChanged();
                    this.vacinas.add(vacina);

                    this.edit(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Houve uma falha no registro!",
                            "Falha", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Insira a data!",
                    "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jComboBoxVacinasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVacinasItemStateChanged
        if (this.jComboBoxVacinas.getSelectedIndex() >= 0) {
            Vacina vacina = (Vacina) jComboBoxVacinas.getSelectedItem();
            jTableVacinas.clearSelection();

            this.jTextNome.setText(vacina.getNome());
            this.jTextDoses.setText(vacina.getDosesRecomendadas() + "");
            this.jTextDescricao.setText(vacina.getDescricao());
            this.jTextData.setText(vacina.getDataEvento() == null ? "" : formato.format(vacina.getDataEvento()));

            this.edit(true);
        }
    }//GEN-LAST:event_jComboBoxVacinasItemStateChanged

    private void jButtonCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraActionPerformed
        new JCadastraVacina(comboVacinas).setVisible(true);
    }//GEN-LAST:event_jButtonCadastraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCadastra;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHistorico;
    private javax.swing.JButton jButtonVacina;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxVacinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIcon1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVacinas;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextDoses;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
