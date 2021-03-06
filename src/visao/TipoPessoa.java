/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package visao;

/**
 *
 * @author alisson
 */
public class TipoPessoa extends javax.swing.JFrame {

    /**
     * Creates new form TipoUsuario
     */
    public TipoPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonGerente = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();
        jButtonAtendente = new javax.swing.JButton();
        jButtonBiblioteconomista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selecione o Tipo de Permissão ");

        jButtonGerente.setText("Gerente");
        jButtonGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenteActionPerformed(evt);
            }
        });

        jButtonUsuario.setText("Usuário");
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });

        jButtonAtendente.setText("Atendente");
        jButtonAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendenteActionPerformed(evt);
            }
        });

        jButtonBiblioteconomista.setText("Biblioteconomista");
        jButtonBiblioteconomista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBiblioteconomistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonGerente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtendente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBiblioteconomista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jButtonGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonUsuario)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtendente)
                .addGap(18, 18, 18)
                .addComponent(jButtonBiblioteconomista)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendenteActionPerformed
        // TODO add your handling code here:
        OpcaoAtendente opcaoAtendente = new OpcaoAtendente();
        opcaoAtendente.setVisible(true);
    }//GEN-LAST:event_jButtonAtendenteActionPerformed

    private void jButtonGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenteActionPerformed
        // TODO add your handling code here:
        OpcaoGerente opcaoGerente = new OpcaoGerente();
        opcaoGerente.setVisible(true);

        ConsultarGerente consultarG = new ConsultarGerente();
        consultarG.setVisible(true);
    }//GEN-LAST:event_jButtonGerenteActionPerformed

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        // TODO add your handling code here:
        OpcaoUsuario opcaoUsuario = new OpcaoUsuario();
        opcaoUsuario.setVisible(true);

    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jButtonBiblioteconomistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBiblioteconomistaActionPerformed
        // TODO add your handling code here:
        OpcaoBiblioteconomista opcaoBiblioteconomista = new OpcaoBiblioteconomista();
        opcaoBiblioteconomista.setVisible(true);

    }//GEN-LAST:event_jButtonBiblioteconomistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TipoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtendente;
    private javax.swing.JButton jButtonBiblioteconomista;
    private javax.swing.JButton jButtonGerente;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
