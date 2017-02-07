/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package visao;

import controller.EmprestimoController;
import controller.PessoaController;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Gabriel
 */
public class EmprestimoCadastro extends javax.swing.JFrame {
    private int tipoMaterial;
    /**
     * Creates new form EmprestimoCadastro
     */
    public EmprestimoCadastro() {
        initComponents();
    }
    
    public EmprestimoCadastro(int tipo) {
        tipoMaterial = tipo;
        initComponents();
    }
    
    public int getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
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
        jTextFieldNomeMaterial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldDataDevolucao = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldDataEmprestimo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIdMaterial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jButtonID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emprestimo de Material Bibliografico");
        setResizable(false);

        jLabel1.setText("Nome do Material:");

        jTextFieldNomeMaterial.setEnabled(false);

        jLabel2.setText("Nome do Usuário:");

        jTextFieldNomeUsuario.setEditable(false);
        jTextFieldNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Empréstimo:");

        jLabel4.setText("Data de Devolução:");

        jFormattedTextFieldDataDevolucao.setColumns(2);
        try {
            jFormattedTextFieldDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataDevolucaoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldDataEmprestimo.setEnabled(false);

        jLabel5.setText("ID:");

        jTextFieldIdMaterial.setEnabled(false);

        jLabel6.setText("ID:");

        jTextFieldIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdUsuarioActionPerformed(evt);
            }
        });

        jButtonID.setText("Procurar ID");
        jButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeMaterial))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataDevolucaoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataEmprestimo = Calendar.getInstance();
        Calendar dataDevolucao = Calendar.getInstance();
        EmprestimoController controller = new EmprestimoController();
        Emprestimo emprestimo = new Emprestimo();
        
        if (jTextFieldNomeUsuario.getText().equals("")){
            preencherCampos preenche = new preencherCampos();
            preenche.setVisible(true);
        } else{
            try {
                dataEmprestimo.setTime(formato.parse(jTextFieldDataEmprestimo.getText()));
                dataDevolucao.setTime(formato.parse(jFormattedTextFieldDataDevolucao.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(EmprestimoCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }

            emprestimo.setIdMaterial(Integer.parseInt(jTextFieldIdMaterial.getText()));
            emprestimo.setIdUsuario(Integer.parseInt(jTextFieldIdUsuario.getText()));
            emprestimo.setTipoMaterial(tipoMaterial);
            emprestimo.setDataEmprestimo(dataEmprestimo.getTime());
            emprestimo.setDataDevolucao(dataDevolucao.getTime());
            emprestimo.setEstado(true);

            try {
                controller.emprestimoCadastro(emprestimo);
                dispose();
                ConfirmaOperacao confirma = new ConfirmaOperacao();
                confirma.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioActionPerformed
    }//GEN-LAST:event_jTextFieldIdUsuarioActionPerformed

    private void jTextFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioActionPerformed
        //PessoaController usuarioController = new PessoaController();
        //usuarioController.buscarPessoa(0, jTextFieldNomeUsuario.getText());
    }//GEN-LAST:event_jTextFieldNomeUsuarioActionPerformed

    private void jButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIDActionPerformed
        PessoaController controller = new PessoaController();
        int id = Integer.parseInt(jTextFieldIdUsuario.getText());
        System.out.println("ID = "+id);
        Usuario usuario = controller.buscarUsuario(0, id);
        if (usuario == null) {
            NaoEncontrado naoEncontrado = new NaoEncontrado();
            naoEncontrado.setVisible(true);
        } else {
            jTextFieldNomeUsuario.setText(usuario.getNome());
        }
    }//GEN-LAST:event_jButtonIDActionPerformed

    public void setCampos(Livro livro) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = Calendar.getInstance();
        
        jTextFieldIdMaterial.setText(Integer.toString(livro.getId()));
        jTextFieldIdUsuario.setText(Integer.toString(0));
        jTextFieldNomeMaterial.setText(livro.getNome());
        jTextFieldNomeUsuario.setText("");
        jTextFieldDataEmprestimo.setText(formato.format(data.getTime()));
        
        data.add(Calendar.DAY_OF_MONTH, 7);
        jFormattedTextFieldDataDevolucao.setText(formato.format(data.getTime()));
    }

    public void setCampos(Artigo artigo) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = Calendar.getInstance();
        
        jTextFieldIdMaterial.setText(Integer.toString(artigo.getId()));
        jTextFieldIdUsuario.setText(Integer.toString(0));
        jTextFieldNomeMaterial.setText(artigo.getNome());
        jTextFieldNomeUsuario.setText("");
        jTextFieldDataEmprestimo.setText(formato.format(data.getTime()));
        
        data.add(Calendar.DAY_OF_MONTH, 7);
        jFormattedTextFieldDataDevolucao.setText(formato.format(data.getTime()));
    }
    
    public void setCampos(Periodico periodico) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = Calendar.getInstance();
        
        jTextFieldIdMaterial.setText(Integer.toString(periodico.getId()));
        jTextFieldIdUsuario.setText(Integer.toString(0));
        jTextFieldNomeMaterial.setText(periodico.getNome());
        jTextFieldNomeUsuario.setText("");
        jTextFieldDataEmprestimo.setText(formato.format(data.getTime()));
        
        data.add(Calendar.DAY_OF_MONTH, 7);
        jFormattedTextFieldDataDevolucao.setText(formato.format(data.getTime()));
    }
    
    public void setCampos(Video video) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = Calendar.getInstance();
        
        jTextFieldIdMaterial.setText(Integer.toString(video.getId()));
        jTextFieldIdUsuario.setText(Integer.toString(0));
        jTextFieldNomeMaterial.setText(video.getNome());
        jTextFieldNomeUsuario.setText("");
        jTextFieldDataEmprestimo.setText(formato.format(data.getTime()));
        
        data.add(Calendar.DAY_OF_MONTH, 7);
        jFormattedTextFieldDataDevolucao.setText(formato.format(data.getTime()));
    }
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
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmprestimoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonID;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldDataEmprestimo;
    private javax.swing.JTextField jTextFieldIdMaterial;
    private javax.swing.JTextField jTextFieldIdUsuario;
    private javax.swing.JTextField jTextFieldNomeMaterial;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
