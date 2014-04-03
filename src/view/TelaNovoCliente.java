package view;

import model.*;

public class TelaNovoCliente extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public TelaNovoCliente() {
        initComponents();

        RotaIndexControler ind = new RotaIndexControler();
        int index = RotaIndexControler.getIndex();
        int assen = RotaIndexControler.getNumAssento();
        if (assen < 10) {
            jLabelNumAssento.setText("0" + assen);
        } else {
            jLabelNumAssento.setText("" + assen);
        }
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
        jPanelWithBackground1 = new view.JPanelWithBackground("C:/Users/Jeferson/Documents/NetBeansProjects/GetBus/src/view/bg_novocliente.png");//("C:/Documents and Settings/informatica/Meus documentos/NetBeansProjects/GetBus/src/view/bg_inicio.png");
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonVoltarOnibus = new javax.swing.JButton();
        jButtonAddNovoCliente = new javax.swing.JButton();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelNumAssento = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemPrincipal = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GetBus - Adicionar Passageiro");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanelWithBackground1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanelWithBackground1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelWithBackground1.setPreferredSize(new java.awt.Dimension(800, 500));

        jTextFieldNome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 192, 192)));
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jTextFieldCpf.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 192, 192)));
        jTextFieldCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCpfKeyPressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_cpf.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_fone.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/label_nome.png"))); // NOI18N

        jButtonVoltarOnibus.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVoltarOnibus.setForeground(new java.awt.Color(51, 51, 51));
        jButtonVoltarOnibus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bt_voltarota.png"))); // NOI18N
        jButtonVoltarOnibus.setBorder(null);
        jButtonVoltarOnibus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarOnibusMouseClicked(evt);
            }
        });
        jButtonVoltarOnibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarOnibusActionPerformed(evt);
            }
        });

        jButtonAddNovoCliente.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAddNovoCliente.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAddNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bt_addnovocliente.png"))); // NOI18N
        jButtonAddNovoCliente.setBorder(null);
        jButtonAddNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddNovoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddNovoClienteMouseClicked(evt);
            }
        });
        jButtonAddNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNovoClienteActionPerformed(evt);
            }
        });

        jTextFieldTelefone.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(193, 192, 192)));
        jTextFieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelefoneKeyPressed(evt);
            }
        });

        jLabelNumAssento.setFont(new java.awt.Font("Tahoma", 0, 180)); // NOI18N
        jLabelNumAssento.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNumAssento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumAssento.setText("01");

        javax.swing.GroupLayout jPanelWithBackground1Layout = new javax.swing.GroupLayout(jPanelWithBackground1);
        jPanelWithBackground1.setLayout(jPanelWithBackground1Layout);
        jPanelWithBackground1Layout.setHorizontalGroup(
            jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelWithBackground1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldTelefone))
                    .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNome)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCpf)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAddNovoCliente)
                                .addComponent(jButtonVoltarOnibus)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabelNumAssento, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanelWithBackground1Layout.setVerticalGroup(
            jPanelWithBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWithBackground1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonAddNovoCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonVoltarOnibus)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWithBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNumAssento, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        jMenu3.setText("Gerenciar");

        jMenuItemPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPrincipal.setText("Principal");
        jMenuItemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrincipalActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemPrincipal);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Rota");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

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

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        TelaSobre s = new TelaSobre();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        // CODIGO BUSCA
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCpfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfKeyPressed

    private void jButtonVoltarOnibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarOnibusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarOnibusActionPerformed

    private void jButtonAddNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNovoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddNovoClienteActionPerformed

    private void jButtonAddNovoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddNovoClienteMouseClicked
        RotaIndexControler ind = new RotaIndexControler();
        int index = RotaIndexControler.getIndex();
        int assen = RotaIndexControler.getNumAssento();
        if ((!jTextFieldNome.getText().isEmpty()) && (!jTextFieldCpf.getText().isEmpty()) && (!jTextFieldTelefone.getText().isEmpty())) {
            Cliente c = new Cliente();
            c.setNome(jTextFieldNome.getText());
            c.setCpf(jTextFieldCpf.getText());
            c.setTelefone(jTextFieldTelefone.getText());
            Repositorio.getRotas().get(index).gerenciaPassageiro(assen, c);
            TelaDetalheOnibus d = new TelaDetalheOnibus();
            d.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonAddNovoClienteMouseClicked

    private void jMenuItemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrincipalActionPerformed
        TelaInicio t = new TelaInicio();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemPrincipalActionPerformed

    private void jButtonVoltarOnibusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarOnibusMouseClicked
        TelaDetalheOnibus d = new TelaDetalheOnibus();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarOnibusMouseClicked

    private void jTextFieldTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneKeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaNovaRota r = new TelaNovaRota();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaNovoCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNovoCliente;
    private javax.swing.JButton jButtonVoltarOnibus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNumAssento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemPrincipal;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private view.JPanelWithBackground jPanelWithBackground1;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
