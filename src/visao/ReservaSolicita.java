/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package visao;

import controller.MaterialBibliograficoController;
import controller.PessoaController;
import controller.ReservaController;
import java.util.Calendar;
import java.util.List;
import modelo.*;

/**
 *
 * @author Gabriel
 */
public class ReservaSolicita extends javax.swing.JFrame {

    /**
     * Creates new form ReservaSolicita
     */
    public ReservaSolicita() {
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMaterial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Preencha os campos abaixo:");

        jLabel2.setText("ID material:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livro", "Artigo", "Periódico", "Vídeo" }));

        jLabel3.setText("Material:");

        jLabel4.setText("ID usuário:");

        jButton1.setText("Solicitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMaterial)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MaterialBibliograficoController materialController = new MaterialBibliograficoController();
        
        int tipoMaterial = jComboBox1.getSelectedIndex();
        int idMaterial = Integer.parseInt(jTextFieldMaterial.getText());
        int idUsuario = Integer.parseInt(jTextFieldUsuario.getText());
        
        switch (tipoMaterial){
            case 0:
                Livro livro = new Livro();
                List<Livro> listaLivro = materialController.consultarMaterial(livro, idMaterial);
                if (listaLivro.isEmpty()) {
                    NaoEncontrado naoEncontrado = new NaoEncontrado();
                    naoEncontrado.setVisible(true);
                } else {
                    int nLocados = listaLivro.get(0).getQuantLocados();
                    int nCadastrado = listaLivro.get(0).getQuantidadeInventario();
                    
                    if (nLocados < nCadastrado) {
                        MaterialDisponivel disponivel = new MaterialDisponivel();
                        disponivel.setVisible(true);
                    } else {
                        ReservaController reservaController = new ReservaController();
                        //se nao possui reserva para aquele material
                        if (reservaController.buscarReserva(idMaterial, idUsuario)) {
                            Calendar data = Calendar.getInstance();
                            Reserva reserva = new Reserva(idMaterial, idUsuario, data.getTime());
                            reservaController.enviarReserva(reserva);

                            ConfirmaOperacao confirma = new ConfirmaOperacao();
                            confirma.setVisible(true);
                            dispose();
                        } else {
                            ReservaExistente existe = new ReservaExistente();
                            existe.setVisible(true);
                        }
                    }
                }
            break;
            
            case 1:
                Artigo artigo = new Artigo();
                List<Artigo> listaArtigo = materialController.consultarMaterial(artigo, idMaterial);
                if (listaArtigo.isEmpty()) {
                    NaoEncontrado naoEncontrado = new NaoEncontrado();
                    naoEncontrado.setVisible(true);
                } else {
                    int nLocados = listaArtigo.get(0).getQuantLocados();
                    int nCadastrado = listaArtigo.get(0).getQuantidadeInventario();

                    if (nLocados < nCadastrado) {
                        MaterialDisponivel disponivel = new MaterialDisponivel();
                        disponivel.setVisible(true);
                    } else {
                        ReservaController reservaController = new ReservaController();
                        //se nao possui reserva para aquele material
                        if (reservaController.buscarReserva(idMaterial, idUsuario)) {
                            Calendar data = Calendar.getInstance();
                            Reserva reserva = new Reserva(idMaterial, idUsuario, data.getTime());
                            reservaController.enviarReserva(reserva);

                            ConfirmaOperacao confirma = new ConfirmaOperacao();
                            confirma.setVisible(true);
                            dispose();
                        } else {
                            ReservaExistente existe = new ReservaExistente();
                            existe.setVisible(true);
                        }
                    }
                }
            break;
            
            case 2:
                Periodico periodico = new Periodico();
                List<Periodico> listaPeriodico = materialController.consultarMaterial(periodico, idMaterial);
                if (listaPeriodico.isEmpty()) {
                    NaoEncontrado naoEncontrado = new NaoEncontrado();
                    naoEncontrado.setVisible(true);
                } else {
                    int nLocados = listaPeriodico.get(0).getQuantLocados();
                    int nCadastrado = listaPeriodico.get(0).getQuantidadeInventario();

                    if (nLocados < nCadastrado) {
                        MaterialDisponivel disponivel = new MaterialDisponivel();
                        disponivel.setVisible(true);
                    } else {
                        ReservaController reservaController = new ReservaController();
                        //se nao possui reserva para aquele material
                        if (reservaController.buscarReserva(idMaterial, idUsuario)) {
                            Calendar data = Calendar.getInstance();
                            Reserva reserva = new Reserva(idMaterial, idUsuario, data.getTime());
                            reservaController.enviarReserva(reserva);

                            ConfirmaOperacao confirma = new ConfirmaOperacao();
                            confirma.setVisible(true);
                            dispose();
                        } else {
                            ReservaExistente existe = new ReservaExistente();
                            existe.setVisible(true);
                        }
                    }
                }
            break;
            
            case 3:
                Video video = new Video();
                List<Video> listaVideo = materialController.consultarMaterial(video, idMaterial);
                if (listaVideo.isEmpty()) {
                    NaoEncontrado naoEncontrado = new NaoEncontrado();
                    naoEncontrado.setVisible(true);
                } else {
                    int nLocados = listaVideo.get(0).getQuantLocados();
                    int nCadastrado = listaVideo.get(0).getQuantidadeInventario();

                    if (nLocados < nCadastrado) {
                        MaterialDisponivel disponivel = new MaterialDisponivel();
                        disponivel.setVisible(true);
                    } else {
                        ReservaController reservaController = new ReservaController();
                        //se nao possui reserva para aquele material
                        if (reservaController.buscarReserva(idMaterial, idUsuario)) {
                            Calendar data = Calendar.getInstance();
                            Reserva reserva = new Reserva(idMaterial, idUsuario, data.getTime());
                            reservaController.enviarReserva(reserva);

                            ConfirmaOperacao confirma = new ConfirmaOperacao();
                            confirma.setVisible(true);
                            dispose();
                        } else {
                            ReservaExistente existe = new ReservaExistente();
                            existe.setVisible(true);
                        }
                    }
                }
            break;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaSolicita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaSolicita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaSolicita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaSolicita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaSolicita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldMaterial;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
