package view;


import javax.swing.table.DefaultTableModel;
import model.IRotas;
import model.Onibus;
import model.Repositorio;
import model.RotaIndexControler;

public class TelaInicio extends javax.swing.JFrame implements IRotas{

    /**
     * Creates new form Principal
     */
    public TelaInicio() {
        initComponents();
        listaRotas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanelWithBackground1 = new view.JPanelWithBackground("C:/Users/Jeferson/Documents/NetBeansProjects/GetBus/src/view/bg_inicio.png");//("C:/Documents and Settings/informatica/Meus documentos/NetBeansProjects/GetBus/src/view/bg_inicio.png");
        jButtonNovaRota = new javax.swing.JButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GetBus");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanelWithBackground1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanelWithBackground1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelWithBackground1.setPreferredSize(new java.awt.Dimension(800, 500));

        jButtonNovaRota.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNovaRota.setForeground(new java.awt.Color(51, 51, 51));
        jButtonNovaRota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bt_novarota.png"))); // NOI18N
        jButtonNovaRota.setBorder(null);
        jButtonNovaRota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovaRota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNovaRotaMouseClicked(evt);
            }
        });
        jButtonNovaRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaRotaActionPerformed(evt);
            }
        });

        jTextFieldBusca.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 192, 192)));
        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyPressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ico_search.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTableRotas.setBackground(new java.awt.Color(238, 238, 238));
        jTableRotas.setForeground(new java.awt.Color(102, 102, 102));
        jTableRotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableRotas.setGridColor(new java.awt.Color(238, 238, 238));
        jTableRotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRotas);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/title_origem.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/title_destino.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/title_hora.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/title_vagas.png"))); // NOI18N

        javax.swing.GroupLayout jPanelWithBackground1Layout = new javax.swing.GroupLayout(jPanelWithBackground1);
        jPanelWithBackground1.setLayout(jPanelWithBackground1Layout);
        jPanelWithBackground1Layout.setHorizontalGroup(
            jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                        .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNovaRota)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanelWithBackground1Layout.setVerticalGroup(
            jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                        .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonNovaRota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldBusca)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jMenu3.setText("Gerenciar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Rotas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

        jMenuItem5.setText("Sobre");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Sair");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelWithBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelWithBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaSobre s = new TelaSobre();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButtonNovaRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaRotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovaRotaActionPerformed

    private void jTextFieldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyPressed
        // CODIGO BUSCA
        DefaultTableModel listaRotasBusca = new DefaultTableModel();
        listaRotasBusca.addColumn("");
        listaRotasBusca.addColumn("");
        listaRotasBusca.addColumn("");
        listaRotasBusca.addColumn("");
        
        String valorBusca = jTextFieldBusca.getText();

        for(int i = 0; i < Repositorio.getRotas().size(); i++){
            Onibus onibus = Repositorio.getRotas().get(i);
            String vetor[] = new String [4];
            vetor[0] = onibus.getOrigem();
            vetor[1] = onibus.getDestino();
            vetor[2] = onibus.getHora();
            vetor[3] = String.valueOf(onibus.qtdVagas());
            if((onibus.getOrigem().toLowerCase().contains(valorBusca.toLowerCase()))||(onibus.getDestino().toLowerCase().contains(valorBusca.toLowerCase()))){
                listaRotasBusca.addRow(vetor);
            }
        }
       
        jTableRotas.setModel(listaRotasBusca);
        jTableRotas.getColumnModel().getColumn(0).setPreferredWidth(310);
        jTableRotas.getColumnModel().getColumn(1).setPreferredWidth(320);
        jTableRotas.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTableRotas.getColumnModel().getColumn(3).setPreferredWidth(10);
    }//GEN-LAST:event_jTextFieldBuscaKeyPressed

    private void jButtonNovaRotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNovaRotaMouseClicked
         TelaNovaRota t = new TelaNovaRota();
         t.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButtonNovaRotaMouseClicked

    private void jTableRotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRotasMouseClicked
        int index = jTableRotas.getSelectedRow();
        RotaIndexControler ind = new RotaIndexControler();
        RotaIndexControler.setIndex(index);
        TelaDetalheOnibus d = new TelaDetalheOnibus();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTableRotasMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         TelaNovaRota t = new TelaNovaRota();
         t.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNovaRota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private view.JPanelWithBackground jPanelWithBackground1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRotas;
    private javax.swing.JTextField jTextFieldBusca;
    // End of variables declaration//GEN-END:variables

 public void listaRotas(){
     DefaultTableModel listaRotas = new DefaultTableModel();
        listaRotas.addColumn("");
        listaRotas.addColumn("");
        listaRotas.addColumn("");
        listaRotas.addColumn("");

        for(int i = 0; i < Repositorio.getRotas().size(); i++){
            Onibus onibus = Repositorio.getRotas().get(i);
            String vetor[] = new String [4];
            vetor[0] = onibus.getOrigem();
            vetor[1] = onibus.getDestino();
            vetor[2] = onibus.getHora();
            vetor[3] = String.valueOf(onibus.qtdVagas());
            listaRotas.addRow(vetor);
        }
       
       
        jTableRotas.setModel(listaRotas);
        jTableRotas.getColumnModel().getColumn(0).setPreferredWidth(310);
        jTableRotas.getColumnModel().getColumn(1).setPreferredWidth(320);
        jTableRotas.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTableRotas.getColumnModel().getColumn(3).setPreferredWidth(10);
        jScrollPane1.setColumnHeader(null);
 
 }

}
