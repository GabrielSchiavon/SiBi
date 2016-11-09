/*
 * Trabalhodesenvolvido para disciplina de ISS - 2016
 */
package visao;

import controller.MaterialBibliograficoController;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import modelo.*;
/**
 *
 * @author schiavon
 */
public class MaterialBibliograficoCadastro extends javax.swing.JFrame {
    
    /**
     * Creates new form MaterialBibliograficoCadastro
     */
    public MaterialBibliograficoCadastro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox2 = new javax.swing.JComboBox<>();
        painelNaoAlteravel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        painelPrincipal = new javax.swing.JPanel();
        jPanelLivro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldLivroAutor = new javax.swing.JTextField();
        jTextFieldLivroGenero = new javax.swing.JTextField();
        jTextFieldLivroISBN = new javax.swing.JTextField();
        jTextFieldLivroEditora = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonLivroNao = new javax.swing.JRadioButton();
        jRadioButtonLivroSim = new javax.swing.JRadioButton();
        jPanelArtigo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldArtigoAutor = new javax.swing.JTextField();
        jTextFieldArtigoCategoria = new javax.swing.JTextField();
        jTextFieldArtigoResumo = new javax.swing.JTextField();
        jTextFieldArtigoTags = new javax.swing.JTextField();
        jPanelPeriodico = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPeriodicoAssunto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPeriodicoISSN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldPeriodicoDOI = new javax.swing.JTextField();
        jPanelVideo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldVideoAutor = new javax.swing.JTextField();
        jTextFieldVideoGenero = new javax.swing.JTextField();
        jTextFieldVideoDuracao = new javax.swing.JTextField();
        jTextFieldVideoSinopse = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livro", "Artigo", "Periodico", "Vídeo" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Data de Criação:");

        jFormattedTextFieldData.setColumns(2);
        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelNaoAlteravelLayout = new javax.swing.GroupLayout(painelNaoAlteravel);
        painelNaoAlteravel.setLayout(painelNaoAlteravelLayout);
        painelNaoAlteravelLayout.setHorizontalGroup(
            painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNaoAlteravelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNaoAlteravelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jTextFieldNome))
                    .addGroup(painelNaoAlteravelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelNaoAlteravelLayout.setVerticalGroup(
            painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNaoAlteravelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelNaoAlteravelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        painelPrincipal.setLayout(new java.awt.CardLayout());

        jPanelLivro.setName("jpanelLivro"); // NOI18N

        jLabel4.setText("ISBN:");

        jLabel5.setText("Gênero:");

        jLabel6.setText("Autor:");

        jLabel7.setText("Editora:");

        jLabel8.setText("Especial:");

        buttonGroup1.add(jRadioButtonLivroNao);
        jRadioButtonLivroNao.setSelected(true);
        jRadioButtonLivroNao.setText("Não");

        buttonGroup1.add(jRadioButtonLivroSim);
        jRadioButtonLivroSim.setText("Sim");
        jRadioButtonLivroSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLivroSimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonLivroNao)
                .addGap(40, 40, 40)
                .addComponent(jRadioButtonLivroSim)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonLivroNao)
                .addComponent(jRadioButtonLivroSim))
        );

        javax.swing.GroupLayout jPanelLivroLayout = new javax.swing.GroupLayout(jPanelLivro);
        jPanelLivro.setLayout(jPanelLivroLayout);
        jPanelLivroLayout.setHorizontalGroup(
            jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLivroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFieldLivroAutor))
                    .addGroup(jPanelLivroLayout.createSequentialGroup()
                        .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLivroGenero)
                            .addComponent(jTextFieldLivroISBN)
                            .addComponent(jTextFieldLivroEditora)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelLivroLayout.setVerticalGroup(
            jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLivroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLivroGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLivroISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldLivroEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPrincipal.add(jPanelLivro, "jPanelLivro");

        jPanelArtigo.setName("jpanelArtigo"); // NOI18N

        jLabel9.setText("Autor:");

        jLabel10.setText("Categoria");

        jLabel11.setText("Resumo:");

        jLabel12.setText("Tags:");

        javax.swing.GroupLayout jPanelArtigoLayout = new javax.swing.GroupLayout(jPanelArtigo);
        jPanelArtigo.setLayout(jPanelArtigoLayout);
        jPanelArtigoLayout.setHorizontalGroup(
            jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelArtigoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(41, 41, 41)
                        .addComponent(jTextFieldArtigoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanelArtigoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldArtigoCategoria))
                    .addGroup(jPanelArtigoLayout.createSequentialGroup()
                        .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldArtigoResumo)
                            .addComponent(jTextFieldArtigoTags))))
                .addContainerGap())
        );
        jPanelArtigoLayout.setVerticalGroup(
            jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldArtigoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldArtigoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldArtigoResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanelArtigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldArtigoTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPrincipal.add(jPanelArtigo, "jPanelArtigo");

        jPanelPeriodico.setName("jPanelPeriodico"); // NOI18N

        jLabel13.setText("Assunto:");

        jLabel14.setText("ISSN:");

        jLabel15.setText("DOI:");

        javax.swing.GroupLayout jPanelPeriodicoLayout = new javax.swing.GroupLayout(jPanelPeriodico);
        jPanelPeriodico.setLayout(jPanelPeriodicoLayout);
        jPanelPeriodicoLayout.setHorizontalGroup(
            jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeriodicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(24, 24, 24)
                .addGroup(jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPeriodicoISSN, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jTextFieldPeriodicoAssunto)
                    .addComponent(jTextFieldPeriodicoDOI))
                .addContainerGap())
        );
        jPanelPeriodicoLayout.setVerticalGroup(
            jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeriodicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldPeriodicoAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPeriodicoISSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelPeriodicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPeriodicoDOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        painelPrincipal.add(jPanelPeriodico, "jPanelPeriodico");

        jPanelVideo.setName("jPanelVideo"); // NOI18N

        jLabel16.setText("Autor:");

        jLabel17.setText("Gênero:");

        jLabel18.setText("Duração:");

        jLabel19.setText("Sinopse:");

        javax.swing.GroupLayout jPanelVideoLayout = new javax.swing.GroupLayout(jPanelVideo);
        jPanelVideo.setLayout(jPanelVideoLayout);
        jPanelVideoLayout.setHorizontalGroup(
            jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVideoLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVideoSinopse))
                    .addGroup(jPanelVideoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(40, 40, 40)
                        .addComponent(jTextFieldVideoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                    .addGroup(jPanelVideoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldVideoGenero))
                    .addGroup(jPanelVideoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVideoDuracao)))
                .addContainerGap())
        );
        jPanelVideoLayout.setVerticalGroup(
            jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldVideoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldVideoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldVideoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVideoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVideoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jTextFieldVideoSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        painelPrincipal.add(jPanelVideo, "jPanelVideo");

        jLabel20.setText("Cadastrar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNaoAlteravel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel20)
                        .addGap(74, 74, 74)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(painelNaoAlteravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(127, Short.MAX_VALUE)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataActionPerformed

    private void jRadioButtonLivroSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLivroSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonLivroSimActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        int valor = jComboBox2.getSelectedIndex();
        CardLayout card = (CardLayout)painelPrincipal.getLayout();
        
        switch (valor){
            case 0:
                card.show(painelPrincipal, "jPanelLivro");
                break;
            case 1:
                card.show(painelPrincipal, "jPanelArtigo");
                break;
            case 2:
                card.show(painelPrincipal, "jPanelPeriodico");
                break;
            case 3:
                card.show(painelPrincipal, "jPanelVideo");
                break;
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        MaterialBibliograficoController controller;
        ConfirmaCadastro interfaceConfirma;
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        int valor = jComboBox2.getSelectedIndex();
        String nome = jTextFieldNome.getText();
        int quantidade = Integer.parseInt(jTextFieldQuantidade.getText());
        
        Calendar dataCadastro = Calendar.getInstance();
        Calendar dataCriacao = Calendar.getInstance();
        String data = jFormattedTextFieldData.getText();
        try {
            dataCriacao.setTime(formato.parse(data));
        } catch (ParseException ex){
            System.out.println("Exception :"+ex);
        }
        
        switch (valor){
            case 0:
                int isbn = Integer.parseInt(jTextFieldLivroISBN.getText());
                String genero = jTextFieldLivroGenero.getText();
                String autorLivro = jTextFieldLivroAutor.getText();
                String editora = jTextFieldLivroEditora.getText();
                boolean especial = !jRadioButtonLivroNao.isSelected();
                int quantidadeLivroLocado = 0;
                
                Livro livro = new Livro(nome, quantidade, dataCadastro, dataCriacao,
                    isbn, genero,autorLivro, editora, especial, quantidadeLivroLocado);
                
                controller = new MaterialBibliograficoController(livro);
                try{
                    controller.cadastrarLivro(livro);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                interfaceConfirma = new ConfirmaCadastro();
                interfaceConfirma.setVisible(true);
                dispose();
                break;
                
            case 1:
                String categoria = jTextFieldArtigoCategoria.getText();
                String autorArtigo = jTextFieldArtigoAutor.getText();
                String resumo = jTextFieldArtigoResumo.getText();
                String tags = jTextFieldArtigoTags.getText();
                String[] tag = tags.replace(", ", "/").replace(",", "/").replace("  ", "/").split("/");
                tags = Arrays.toString(tag);
                
                Artigo artigo = new Artigo(nome, quantidade, dataCadastro, dataCriacao,
                    autorArtigo, categoria, resumo, tags);
                
                controller = new MaterialBibliograficoController(artigo);
                try{
                    controller.cadastrarArtigo(artigo);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                interfaceConfirma = new ConfirmaCadastro();
                interfaceConfirma.setVisible(true);
                dispose();
                break;
                
            case 2:
                String assunto = jTextFieldPeriodicoAssunto.getText();
                int issn = Integer.parseInt(jTextFieldPeriodicoISSN.getText());
                String doi = jTextFieldPeriodicoDOI.getText();
                
                Periodico periodico = new Periodico(nome, quantidade, dataCadastro,
                    dataCriacao, assunto, issn, doi);
                
                controller = new MaterialBibliograficoController(periodico);
                try{
                    controller.cadastrarPeriodico(periodico);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                interfaceConfirma = new ConfirmaCadastro();
                interfaceConfirma.setVisible(true);
                dispose();
                break;
                
            case 3:
                String autorVideo = jTextFieldVideoAutor.getText();
                String generoVideo = jTextFieldVideoGenero.getText();
                String sinopse = jTextFieldVideoSinopse.getText();
                int quantidadeVideoLocado = 0;
                Double duracao = Double.parseDouble(jTextFieldVideoDuracao.getText());
                Video video = new Video(nome, quantidade, dataCadastro, dataCriacao,
                    autorVideo, generoVideo, sinopse, duracao, quantidadeVideoLocado);
                
                controller = new MaterialBibliograficoController(video);
                try{
                    controller.cadastrarVideo(video);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                interfaceConfirma = new ConfirmaCadastro();
                interfaceConfirma.setVisible(true);
                dispose();
                break;
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(MaterialBibliograficoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialBibliograficoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialBibliograficoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialBibliograficoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaterialBibliograficoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelArtigo;
    private javax.swing.JPanel jPanelLivro;
    private javax.swing.JPanel jPanelPeriodico;
    private javax.swing.JPanel jPanelVideo;
    private javax.swing.JRadioButton jRadioButtonLivroNao;
    private javax.swing.JRadioButton jRadioButtonLivroSim;
    private javax.swing.JTextField jTextFieldArtigoAutor;
    private javax.swing.JTextField jTextFieldArtigoCategoria;
    private javax.swing.JTextField jTextFieldArtigoResumo;
    private javax.swing.JTextField jTextFieldArtigoTags;
    private javax.swing.JTextField jTextFieldLivroAutor;
    private javax.swing.JTextField jTextFieldLivroEditora;
    private javax.swing.JTextField jTextFieldLivroGenero;
    private javax.swing.JTextField jTextFieldLivroISBN;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeriodicoAssunto;
    private javax.swing.JTextField jTextFieldPeriodicoDOI;
    private javax.swing.JTextField jTextFieldPeriodicoISSN;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldVideoAutor;
    private javax.swing.JTextField jTextFieldVideoDuracao;
    private javax.swing.JTextField jTextFieldVideoGenero;
    private javax.swing.JTextField jTextFieldVideoSinopse;
    private javax.swing.JPanel painelNaoAlteravel;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
