package view;

import control.BovinoControl;
import control.GestacaoControl;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bovino;
import model.Gestacao;

public class JGestacao extends javax.swing.JPanel {

    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private GestacaoControl gestControl;
    private BovinoControl boiControl;
    private DefaultTableModel tabelaGest;
    private DefaultTableModel tabelaFilhos;
    private Bovino boi;

    private ArrayList<Gestacao> gestacoes;
    private ArrayList<Bovino> filhotes;
    private int select = -1;
    
    public JGestacao(Bovino bovino, BovinoControl control) {
        initComponents();
        this.boiControl = control;
        this.boi = bovino;

        config();
    }

    private void config() {
        this.gestControl = new GestacaoControl();
        this.tabelaFilhos = (DefaultTableModel) jTableFilhos.getModel();
        this.tabelaGest = (DefaultTableModel) jTableGestacoes.getModel();
        this.gestacoes = gestControl.getById(boi.getId());
        this.filhotes = boiControl.getFilhos(boi.getId());

        this.geral();
        this.listarFilhos();
        this.listarGestacoes();
        this.edit(true);
    }

    private void geral() {
        this.jLabelMae.setText("Bovinos Associados à "+boi.getNome());
        this.jTextNome.setText(boi.getBrinco()+"");
        this.jTextRaca.setText(boi.getRaca());
        this.jTextSexo.setText(boi.isSexo() == Bovino.MACHO ? "Macho" : "Femea");
        this.jTextOrigem.setText(boi.getNascimento() != null ? "Nascimento" : "Compra");
        this.jTextPartos.setText(filhotes.size() + "");
    }

    private void listarGestacoes() {
        for (Gestacao gest : gestacoes) {
            String situacao="";
            switch (gest.getSituacaoGestacao()) {
                case 0: situacao = "Em Andamento"; break;
                case 1: situacao = "Finalizada"; break;
                case 2: situacao = "Abortada"; break;
            }
            
            Object[] row = {gest.getTipoAtividade() == 0 ? "Natural" : "Artificial", formato.format(gest.getDataEvento()), situacao};
            this.tabelaGest.addRow(row);
        }
        
        this.jTableGestacoes.setModel(tabelaGest);
        this.tabelaGest.fireTableDataChanged();
    }
    
    private void listarFilhos() {
        for (Bovino boi : filhotes) {
            Object[] row = {boi.getNome(), boi.getBrinco(), formato.format(boi.getNascimento()), boi.isSexo() == Bovino.MACHO ? "Macho" : "Femea", boi.getRaca()};
            this.tabelaFilhos.addRow(row);
        }

        this.jTableFilhos.setModel(tabelaFilhos);
        this.tabelaFilhos.fireTableDataChanged();
    }
       
    private void edit(boolean op) {
        this.jLabelTipo.setVisible(op);
        this.jSeparatorTipo.setVisible(op);
        this.jComboBoxTipo.setVisible(op);
        this.jButtonAdd.setVisible(op);
        this.jButtonUpdate.setVisible(!op);
    }
    
    private void limparFields() {
        this.jComboBoxSituacao.setSelectedIndex(-1);
        this.jTextData.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelHistorico = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextRaca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextSexo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextOrigem = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextPartos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparatorData = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jTextData = new javax.swing.JFormattedTextField();
        jSeparatorTipo = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGestacoes = new javax.swing.JTable();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jButtonUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFilhos = new javax.swing.JTable();
        jLabelMae = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(120, 130, 89));
        setPreferredSize(new java.awt.Dimension(1000, 674));

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

        jLabelHistorico.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabelHistorico.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHistorico.setText("Gerenciamento Reprodutivo");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextRaca.setBackground(new java.awt.Color(255, 255, 255));
        jTextRaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextRaca.setForeground(new java.awt.Color(0, 0, 0));
        jTextRaca.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Sexo:");

        jTextSexo.setBackground(new java.awt.Color(255, 255, 255));
        jTextSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextSexo.setForeground(new java.awt.Color(0, 0, 0));
        jTextSexo.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Origem:");

        jTextOrigem.setBackground(new java.awt.Color(255, 255, 255));
        jTextOrigem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextOrigem.setForeground(new java.awt.Color(0, 0, 0));
        jTextOrigem.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Informações Gerais");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Brinco:");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("N° de partos:");

        jTextNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextNome.setEnabled(false);

        jTextPartos.setBackground(new java.awt.Color(255, 255, 255));
        jTextPartos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextPartos.setForeground(new java.awt.Color(0, 0, 0));
        jTextPartos.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Raça:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muuDataLogo.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(16, 16, 16)
                                .addComponent(jTextPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel18)
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Geral", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparatorData.setForeground(new java.awt.Color(0, 0, 0));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Situação:");

        jLabelTipo.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipo.setText("Tipo:");

        jLabelData.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(0, 0, 0));
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("Data:");

        jTextData.setBackground(new java.awt.Color(255, 255, 255));
        jTextData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            jTextData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jSeparatorTipo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Atividade Reprodutiva");

        jButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(25, 25, 25));
        jButtonAdd.setText("Registrar");
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.setFocusPainted(false);
        jButtonAdd.setFocusable(false);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jTableGestacoes.setBackground(new java.awt.Color(255, 255, 255));
        jTableGestacoes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableGestacoes.setForeground(new java.awt.Color(0, 0, 0));
        jTableGestacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Data", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableGestacoes.setFocusable(false);
        jTableGestacoes.setGridColor(new java.awt.Color(120, 130, 89));
        jTableGestacoes.setRowHeight(25);
        jTableGestacoes.setSelectionBackground(new java.awt.Color(120, 130, 89));
        jTableGestacoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableGestacoes.setShowGrid(false);
        jTableGestacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGestacoesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableGestacoes);

        jComboBoxTipo.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxTipo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Natural", "Artificial" }));
        jComboBoxTipo.setSelectedIndex(-1);
        jComboBoxTipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBoxTipo.setFocusable(false);

        jComboBoxSituacao.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxSituacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxSituacao.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Andamento", "Finalizada", "Abortada" }));
        jComboBoxSituacao.setSelectedIndex(-1);
        jComboBoxSituacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBoxSituacao.setFocusable(false);
        jComboBoxSituacao.setOpaque(true);

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(25, 25, 25));
        jButtonUpdate.setText("Redefinir");
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.setFocusPainted(false);
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelData)
                            .addComponent(jLabelTipo)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparatorTipo)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparatorData, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipo))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparatorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelData)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparatorData, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atividade", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableFilhos.setBackground(new java.awt.Color(255, 255, 255));
        jTableFilhos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableFilhos.setForeground(new java.awt.Color(0, 0, 0));
        jTableFilhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Brinco", "Data", "Sexo", "Raça"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFilhos.setFocusable(false);
        jTableFilhos.setGridColor(new java.awt.Color(120, 130, 89));
        jTableFilhos.setRowHeight(25);
        jTableFilhos.setSelectionBackground(new java.awt.Color(120, 130, 89));
        jTableFilhos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableFilhos.setShowGrid(false);
        jScrollPane2.setViewportView(jTableFilhos);
        if (jTableFilhos.getColumnModel().getColumnCount() > 0) {
            jTableFilhos.getColumnModel().getColumn(1).setHeaderValue("Brinco");
            jTableFilhos.getColumnModel().getColumn(2).setHeaderValue("Data");
            jTableFilhos.getColumnModel().getColumn(3).setHeaderValue("Sexo");
            jTableFilhos.getColumnModel().getColumn(4).setHeaderValue("Raça");
        }

        jLabelMae.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabelMae.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMae.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMae.setText("Bovinos Associados à");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMae)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabelMae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filhotes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHistorico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        FramePrincipal.removePainel(FramePrincipal.TELA_GERENCIAMENTO_REPRODUTIVO);
        FramePrincipal.trocaPainel(FramePrincipal.TELA_CONSULTA, new JConsulta());
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if (this.jComboBoxTipo.getSelectedIndex() >= 0 && this.jComboBoxSituacao.getSelectedIndex() >= 0 && !this.jTextData.getText().isEmpty()) {
            
            int tipo = (int) this.jComboBoxTipo.getSelectedIndex();
            int situacao = (int) this.jComboBoxSituacao.getSelectedIndex();
            String data = this.jTextData.getText();
            
            if (JOptionPane.showConfirmDialog(this, "Você deseja finalizar o registro?",
                    "Finalizar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                Gestacao gestacao = gestControl.insert(this.boi.getId(), tipo, situacao, data);
                
                if (gestacao != null) {
                    JOptionPane.showMessageDialog(this, "Vacina registrada com sucesso!",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    gestacoes.add(gestacao);
                    Comparator<Gestacao> comparador = Comparator.comparing(Gestacao::getDataEvento);
                    Collections.sort(gestacoes, comparador);
                    tabelaGest.setRowCount(0);
                    listarGestacoes();
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Houve uma falha no registro!",
                            "Falha", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não deixe campos vazios!",
                    "Dados incompletos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int linha = this.jTableGestacoes.getSelectedRow();
        Gestacao gestacao = this.gestacoes.get(linha);
        
        if (gestacao.getSituacaoGestacao() != this.jComboBoxSituacao.getSelectedIndex() 
            ||  !this.jTextData.getText().equals(formato.format(gestacao.getDataEvento()))) {
            
            String data = this.jTextData.getText();
            int tipo = gestacao.getTipoAtividade();
            int situacao = this.jComboBoxSituacao.getSelectedIndex();
            
            if (JOptionPane.showConfirmDialog(this, "Você deseja salvar as alterações?",
                    "Finalizar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                int id = gestacao.getId();
                gestacao = gestControl.update(data, tipo, situacao, id);
                
                if (gestacao != null) {
                    JOptionPane.showMessageDialog(this, "As alterações foram salvas com sucesso!",
                                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.gestacoes.set(linha, gestacao);
                    tabelaGest.setRowCount(0);
                    listarGestacoes();
                    
                    this.edit(true);
                    this.limparFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Houve uma falha na alteração!",
                                "Falha", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            this.edit(true);
            this.limparFields();
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTableGestacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGestacoesMouseClicked
        int unselect = this.jTableGestacoes.getSelectedRow();

        if (unselect == this.select) {
            this.jTableGestacoes.clearSelection();
            this.limparFields();
            this.edit(true);
            this.select = -1;
        } else {
            Gestacao gest = this.gestacoes.get(unselect);
            
            String situacao="";
            switch (gest.getSituacaoGestacao()) {
                case 0: situacao = "Em Andamento"; break;
                case 1: situacao = "Finalizada"; break;
                case 2: situacao = "Abortada"; break;
            }
            
            this.jComboBoxSituacao.setSelectedItem(situacao);
            this.jTextData.setText(formato.format(gest.getDataEvento()));
            this.select = unselect;
            this.edit(false);
        }
    }//GEN-LAST:event_jTableGestacoesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHistorico;
    private javax.swing.JLabel jLabelMae;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparatorData;
    private javax.swing.JSeparator jSeparatorTipo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableFilhos;
    private javax.swing.JTable jTableGestacoes;
    private javax.swing.JFormattedTextField jTextData;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextOrigem;
    private javax.swing.JTextField jTextPartos;
    private javax.swing.JTextField jTextRaca;
    private javax.swing.JTextField jTextSexo;
    // End of variables declaration//GEN-END:variables
}
