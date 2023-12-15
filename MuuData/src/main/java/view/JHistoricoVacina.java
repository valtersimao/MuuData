package view;

import control.HistoricoControl;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HistoricoDeSaude;
import model.Vacina;

/**
 *
 * @author jotaa
 */
public class JHistoricoVacina extends javax.swing.JPanel {

    private HistoricoControl saudeControl;
    private HistoricoDeSaude historico;
    private DefaultTableModel tabela;

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
        this.vacinas = saudeControl.getById(historico);
        this.tabela = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        this.tabela.addColumn("Nome");
        this.tabela.addColumn("Prioridade");
        this.tabela.addColumn("Data");
        this.tabela.addColumn("Doses Recomendadas");
        this.tabela.addColumn("Dose");

        for (Vacina vacina : vacinas) {
            Object[] row = {vacina.getNome(), vacina.getPrioridade(), vacina.getDataEvento(), vacina.getDosesRecomendadas(), vacina.getDose()};
            this.tabela.addRow(row);
        }

        this.jTableVacinas.setModel(tabela);
        this.tabela.fireTableDataChanged();
        this.setButtonsVisible(false);
    }

    private void setButtonsVisible(boolean op) {
        this.jButtonUpdate.setVisible(!op);
        this.jButtonAdd.setVisible(!op);
        this.jButtonDelete.setVisible(!op);
        this.jTableVacinas.setEnabled(!op);
        this.jButtonSalvar.setVisible(op);
        this.jButtonCancelar.setVisible(op);
    }

    private void setButtonsEnable(boolean op) {
        this.jButtonUpdate.setEnabled(op);
        this.jButtonDelete.setEnabled(op);
        this.jButtonAdd.setEnabled(!op);
        this.jTextData.setEnabled(!op);
    }

    private void preencheFields() {
        if (this.jTableVacinas.getSelectedRow() >= 0) {
            Vacina vacina = this.vacinas.get(this.jTableVacinas.getSelectedRow());

            this.jTextNome.setText(vacina.getNome());
            this.jTextDoses.setText(vacina.getDose() + "");
            this.jTextPrioridade.setText(vacina.getPrioridade());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.jTextData.setText(formatter.format(vacina.getDataEvento()));

            this.setButtonsVisible(false);
            this.setButtonsEnable(true);
            this.enableFields(false);
        }
    }

    private void enableFields(boolean op) {
        jTextDoses.setEnabled(op);
        jTextNome.setEnabled(op);
        jTextPrioridade.setEnabled(op);
    }

    private void limpaFields() {
        this.jTextNome.setText("");
        this.jTextDoses.setText("");
        this.jTextPrioridade.setText("");
        this.jTextData.setText("");
        this.setButtonsEnable(false);
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
        jLabel8 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextDoses = new javax.swing.JTextField();
        jTextPrioridade = new javax.swing.JTextField();
        jTextData = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVacinas = new javax.swing.JTable();

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

        jButtonDoenca.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jButtonDoenca.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDoenca.setText("Doenças");
        jButtonDoenca.setContentAreaFilled(false);
        jButtonDoenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDoenca.setFocusable(false);
        jButtonDoenca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDoencaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDoencaMouseExited(evt);
            }
        });
        jButtonDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoencaActionPerformed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextNome.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("N° de Doses:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Prioridade:");

        jTextDoses.setBackground(new java.awt.Color(255, 255, 255));
        jTextDoses.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDoses.setForeground(new java.awt.Color(0, 0, 0));
        jTextDoses.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        jTextPrioridade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextPrioridade.setForeground(new java.awt.Color(0, 0, 0));
        jTextPrioridade.setPreferredSize(new java.awt.Dimension(64, 30));

        jTextData.setBackground(new java.awt.Color(255, 255, 255));
        jTextData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextData.setMinimumSize(new java.awt.Dimension(64, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro de Vacinas");

        jButtonAdd.setBackground(new java.awt.Color(120, 130, 89));
        jButtonAdd.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
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

        jButtonDelete.setBackground(new java.awt.Color(120, 130, 89));
        jButtonDelete.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(25, 25, 25));
        jButtonDelete.setText("Excluir");
        jButtonDelete.setBorder(null);
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.setEnabled(false);
        jButtonDelete.setFocusPainted(false);
        jButtonDelete.setFocusable(false);
        jButtonDelete.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonDelete.setVerifyInputWhenFocusTarget(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(120, 130, 89));
        jButtonUpdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUpdate.setText("Redefinir");
        jButtonUpdate.setBorder(null);
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.setEnabled(false);
        jButtonUpdate.setFocusPainted(false);
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonUpdate.setVerifyInputWhenFocusTarget(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(120, 130, 89));
        jButtonCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(97, 28));
        jButtonCancelar.setVerifyInputWhenFocusTarget(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(120, 130, 89));
        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(25, 25, 25));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(null);
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

        jTableVacinas.setBackground(new java.awt.Color(255, 255, 255));
        jTableVacinas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableVacinas.setForeground(new java.awt.Color(0, 0, 0));
        jTableVacinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
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
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(255, 255, 255))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDoses, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jTextDoses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jButtonDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoencaActionPerformed
        HistoricoDeSaude historico = this.historico;
        FramePrincipal.trocaPainel(FramePrincipal.TELA_HISTORICO_DOENCA, new JHistoricoDoenca(historico));
    }//GEN-LAST:event_jButtonDoencaActionPerformed

    private void jButtonDoencaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDoencaMouseEntered
        this.jButtonDoenca.setFont(new java.awt.Font("Arial Black", java.awt.Font.PLAIN, 24));
    }//GEN-LAST:event_jButtonDoencaMouseEntered

    private void jButtonDoencaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDoencaMouseExited
        this.jButtonDoenca.setFont(new java.awt.Font("Arial Black", java.awt.Font.PLAIN, 20));
    }//GEN-LAST:event_jButtonDoencaMouseExited

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        this.setButtonsVisible(true);
        this.enableFields(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (!this.jTextNome.getText().isEmpty() && !this.jTextDoses.getText().isEmpty() && !this.jTextData.getText().isEmpty()) {
            try {
                String nome = this.jTextNome.getText();
                String data = this.jTextData.getText();
                short doses = Short.parseShort(this.jTextDoses.getText());
                String prioridade = this.jTextPrioridade.getText().isEmpty() ? "Não definido" : this.jTextPrioridade.getText();

                if (JOptionPane.showConfirmDialog(this, "Você deseja registrar essa vacina?",
                        "Finalizar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    Vacina vacina = saudeControl.insert(this.historico, nome, doses, prioridade, data);

                    if (vacina != null) {
                        JOptionPane.showMessageDialog(this, "Vacina registrada com sucesso!",
                                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        Object[] row = {nome, prioridade, data, doses, doses};
                        this.tabela.addRow(row);
                        this.tabela.fireTableDataChanged();
                        this.vacinas.add(vacina);

                        this.setButtonsVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Houve uma falha no registro",
                                "Falha", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Insira o formato correto!",
                        "Dados incorretos", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não deixe campos vazios!",
                    "Dados incompletos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int linha = this.jTableVacinas.getSelectedRow();
        Vacina vacina = this.vacinas.get(linha);

        if (!jTextNome.getText().isEmpty() && !jTextDoses.getText().isEmpty() && !jTextPrioridade.getText().isEmpty() && !jTextData.getText().isEmpty()) {

            String nome = this.jTextNome.getText();
            String prioridade = this.jTextPrioridade.getText();
            short doses = Short.parseShort(jTextDoses.getText());

            if (!nome.equals(vacina.getNome()) || !prioridade.equals(vacina.getPrioridade()) || doses != vacina.getDose()) {
                if (JOptionPane.showConfirmDialog(this, "Deseja salvar as alterações?",
                        "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    int idVacina = vacina.getIdVacina();
                    vacina = saudeControl.update(nome, prioridade, doses, idVacina);

                    if (vacina != null) {
                        JOptionPane.showMessageDialog(this, "As alterações foram salvas com sucesso!",
                                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        this.vacinas.set(linha, vacina);
                        this.tabela.setValueAt(vacina.getNome(), linha, 0);
                        this.tabela.setValueAt(vacina.getPrioridade(), linha, 1);
                        this.tabela.setValueAt(vacina.getDose(), linha, 3);
                        this.tabela.setValueAt(vacina.getDose(), linha, 4);
                        this.tabela.fireTableDataChanged();

                        this.setButtonsVisible(true);
                        this.enableFields(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Houve uma falha nas alterações!",
                                "Falha", JOptionPane.ERROR_MESSAGE);
                        this.preencheFields();
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não deixe nenhum campo vazio!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja descartar as alterações?",
                "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.setButtonsVisible(false);
            this.preencheFields();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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

    private void jTableVacinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVacinasMouseClicked
        int unselect = this.jTableVacinas.getSelectedRow();

        if (unselect == this.select) {
            this.jTableVacinas.clearSelection();
            limpaFields();
            this.select = -1;
        } else {
            this.preencheFields();
            this.select = unselect;
        }
    }//GEN-LAST:event_jTableVacinasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDoenca;
    private javax.swing.JButton jButtonHistorico;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonVacina;
    private javax.swing.JButton jButtonVoltar;
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
    private javax.swing.JTextField jTextDoses;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextPrioridade;
    // End of variables declaration//GEN-END:variables
}
