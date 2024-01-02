package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.Hashtable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FramePrincipal extends javax.swing.JFrame {

    public static final String TELA_INICIAL = "TELA_INICIAL";
    public static final String TELA_LOGIN = "TELA_LOGIN";
    public static final String TELA_RECUPERAR_SENHA = "TELA_SENHA";
    public static final String TELA_CADASTRO_NASCIMENTO = "TELA_CADASTRO_NASCIMENTO";
    public static final String TELA_CADASTRO_BOVINO = "TELA_CADASTRO_BOVINO";
    public static final String TELA_CONSULTA = "TELA_CONSULTA";
    public static final String TELA_CADASTRO_FAZENDA = "TELA_CADASTRO_FAZENDA";
    public static final String TELA_HISTORICO_SAUDE = "TELA_HISTORICO_SAUDE";
    public static final String TELA_HISTORICO_VACINA = "TELA_HISTORICO_VACINA";
    public static final String TELA_HISTORICO_DOENCA = "TELA_HISTORICO_DOENCA";
    public static final String TELA_GERENCIAMENTO_REPRODUTIVO = "TELA_GERENCIAMENTO_REPRODUTIVO";
    
    //barras de rolagem (vertical e horiz.)
    private static JScrollPane painelRolagem;
    private static JPanel painelTroca;
    private static CardLayout baralhoPaineis;
    private static Hashtable<String, JPanel> historicoPaineis;

    public FramePrincipal() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        this.setLocationRelativeTo(null);
        configuraTrocaPaineis();

        trocaPainel(TELA_LOGIN, new JTelaLogin());
    }

    private void configuraTrocaPaineis() {
        //preencher TODO o espaço disponível com barras de rolagem
        this.setLayout(new BorderLayout());

        historicoPaineis = new Hashtable<>();
        baralhoPaineis = new CardLayout();
        painelRolagem = new JScrollPane();

        //"ligação" entre painel de trocas e os cards (paineis) dentro do baralho
        painelTroca = new JPanel(baralhoPaineis);

        //vamos add os elementos para o frame
        this.add(painelRolagem);
        painelRolagem.setViewportView(painelTroca);
        // painelRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    public static void removePainel(String nome) {
        if (historicoPaineis.containsKey(nome)) {
            historicoPaineis.remove(nome);
        }
    }

    public static void trocaPainel(String nome, JPanel novoPainel) {

        //se o novo painel não estive no histórico
        if (!historicoPaineis.containsKey(nome)) {

            painelTroca.add(novoPainel, nome);
            baralhoPaineis.show(painelTroca, nome);

            //estamos ajustando o tamanho do painelTroca ao tamanho do novoPainel
            painelTroca.setPreferredSize(novoPainel.getPreferredSize());

            historicoPaineis.put(nome, novoPainel);
        } else {
            //a chave esta dentro do historico
            baralhoPaineis.show(painelTroca, nome);
            painelTroca.setPreferredSize(historicoPaineis.get(nome).getPreferredSize());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MuuData");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    // End of variables declaration//GEN-END:variables
}
