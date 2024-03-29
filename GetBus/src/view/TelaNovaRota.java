package view;


import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.IRotas;
import model.Onibus;
import model.Repositorio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class TelaNovaRota extends javax.swing.JFrame implements IRotas{

    /**
     * Creates new form Principal
     */
    public TelaNovaRota() {
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
        jPanelWithBackground1 = new view.JPanelWithBackground("C:/Users/Jeferson/Documents/NetBeansProjects/GetBus/src/view/bg_novarota.png");//("C:/Documents and Settings/informatica/Meus documentos/NetBeansProjects/GetBus/src/view/bg_inicio.png");
        jTextFieldOrigem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRotasExcluir = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxHorario = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButtonVoltarPrincipal = new javax.swing.JButton();
        jButtonAddNovaRota = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemOperadores = new javax.swing.JMenuItem();
        jMenuItemPrincipal = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GetBus - Nova Rota");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanelWithBackground1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanelWithBackground1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelWithBackground1.setPreferredSize(new java.awt.Dimension(800, 500));

        jTextFieldOrigem.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldOrigem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 192, 192)));
        jTextFieldOrigem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldOrigemKeyPressed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTableRotasExcluir.setBackground(new java.awt.Color(238, 238, 238));
        jTableRotasExcluir.setForeground(new java.awt.Color(102, 102, 102));
        jTableRotasExcluir.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableRotasExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableRotasExcluir.setGridColor(new java.awt.Color(238, 238, 238));
        jTableRotasExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRotasExcluirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRotasExcluir);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_excluir.png"))); // NOI18N

        jTextFieldDestino.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 192, 192)));
        jTextFieldDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDestinoKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_destino.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_horario.png"))); // NOI18N

        jComboBoxHorario.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00" }));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_origem.png"))); // NOI18N

        jButtonVoltarPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVoltarPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        jButtonVoltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bt_voltarprincipal.png"))); // NOI18N
        jButtonVoltarPrincipal.setBorder(null);
        jButtonVoltarPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarPrincipalMouseClicked(evt);
            }
        });
        jButtonVoltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarPrincipalActionPerformed(evt);
            }
        });

        jButtonAddNovaRota.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAddNovaRota.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAddNovaRota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bt_addnovarota.png"))); // NOI18N
        jButtonAddNovaRota.setBorder(null);
        jButtonAddNovaRota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddNovaRota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddNovaRotaMouseClicked(evt);
            }
        });
        jButtonAddNovaRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNovaRotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWithBackground1Layout = new javax.swing.GroupLayout(jPanelWithBackground1);
        jPanelWithBackground1.setLayout(jPanelWithBackground1Layout);
        jPanelWithBackground1Layout.setHorizontalGroup(
            jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWithBackground1Layout.createSequentialGroup()
                .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldOrigem)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDestino)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddNovaRota)
                            .addComponent(jButtonVoltarPrincipal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );
        jPanelWithBackground1Layout.setVerticalGroup(
            jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonAddNovaRota)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltarPrincipal)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jMenu3.setText("Gerenciar");

        jMenuItemOperadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemOperadores.setText("Operadores");
        jMenuItemOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOperadoresActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOperadores);

        jMenuItemPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPrincipal.setText("Principal");
        jMenuItemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrincipalActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemPrincipal);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

        jMenuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLogout.setText("Trocar Operador");
        jMenu4.add(jMenuItemLogout);

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemSobre);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemSair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelWithBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWithBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOperadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemOperadoresActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jTextFieldOrigemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOrigemKeyPressed
        // CODIGO BUSCA
    }//GEN-LAST:event_jTextFieldOrigemKeyPressed

    private void jTextFieldDestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDestinoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDestinoKeyPressed

    private void jButtonVoltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarPrincipalActionPerformed

    private void jButtonAddNovaRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNovaRotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddNovaRotaActionPerformed

    private void jButtonAddNovaRotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddNovaRotaMouseClicked
        
        if((!jTextFieldOrigem.getText().isEmpty())&&(!jTextFieldDestino.getText().isEmpty())){
            Repositorio.addRota(jTextFieldOrigem.getText(), jTextFieldDestino.getText(), jComboBoxHorario.getSelectedItem().toString());
        }
        listaRotas();
    }//GEN-LAST:event_jButtonAddNovaRotaMouseClicked

    private void jTableRotasExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRotasExcluirMouseClicked
        int index = jTableRotasExcluir.getSelectedRow();
        int confirm = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir essa rota?","Cuidado",confirm);
        if(dialogResult == JOptionPane.YES_OPTION){
            Repositorio.removeRota(index);
        }
        listaRotas();
    }//GEN-LAST:event_jTableRotasExcluirMouseClicked

    private void jMenuItemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrincipalActionPerformed
         TelaInicio t = new TelaInicio();
         t.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jMenuItemPrincipalActionPerformed

    private void jButtonVoltarPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarPrincipalMouseClicked
         TelaInicio t = new TelaInicio();
         t.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarPrincipalMouseClicked

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovaRota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaRota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaRota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaRota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaNovaRota().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNovaRota;
    private javax.swing.JButton jButtonVoltarPrincipal;
    private javax.swing.JComboBox jComboBoxHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemOperadores;
    private javax.swing.JMenuItem jMenuItemPrincipal;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private view.JPanelWithBackground jPanelWithBackground1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRotasExcluir;
    private javax.swing.JTextField jTextFieldDestino;
    private javax.swing.JTextField jTextFieldOrigem;
    // End of variables declaration//GEN-END:variables

 public void listaRotas(){
        DefaultTableModel listaRotasEx = new DefaultTableModel();
        listaRotasEx.addColumn("");
        listaRotasEx.addColumn("");
        listaRotasEx.addColumn("");

        for(int i = 0; i < Repositorio.getRotas().size(); i++){
            Onibus onibus = Repositorio.getRotas().get(i);
            String vetor[] = new String [4];
            vetor[0] = onibus.getOrigem();
            vetor[1] = onibus.getDestino();
            vetor[2] = onibus.getHora();
            listaRotasEx.addRow(vetor);
        }
       
       
        jTableRotasExcluir.setModel(listaRotasEx);
        jTableRotasExcluir.getColumnModel().getColumn(0).setPreferredWidth(310);
        jTableRotasExcluir.getColumnModel().getColumn(1).setPreferredWidth(310);
        jScrollPane1.setColumnHeader(null);

 }



}

