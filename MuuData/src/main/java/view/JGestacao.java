package view;

import control.BovinoControl;
import control.GestacaoControl;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Bovino;
import model.Gestacao;

/**
 *
 * @author jotaa
 */
public class JGestacao extends javax.swing.JPanel {

    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private GestacaoControl gestControl;
    private BovinoControl boiControl;
    private DefaultTableModel tabelaGest;
    private DefaultTableModel tabelaFilhos;
    private Bovino boi;

    private ArrayList<Gestacao> gestacoes;
    private ArrayList<Bovino> filhotes;

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
        jSeparator5 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextData = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGestacoes = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

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
                                .addComponent(jTextPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(129, Short.MAX_VALUE))
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
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Geral", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Situação:");

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Tipo:");

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Data:");

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

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

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
                false, true, true
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
        jScrollPane3.setViewportView(jTableGestacoes);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Natural", "Artificial" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.setFocusable(false);

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Andamento", "Finalizada", "Abortada" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox2.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23))
                                .addGap(75, 75, 75)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButtonAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel21)
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel22)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(jLabelMae)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelMae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

    }//GEN-LAST:event_jButtonAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelHistorico;
    private javax.swing.JLabel jLabelMae;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
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
