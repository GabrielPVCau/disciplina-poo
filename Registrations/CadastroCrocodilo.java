import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroCrocodilo extends javax.swing.JFrame {

    private Crocodilo crocodilo;
    private GerCroco gerCroco = new GerCroco();

    private static CadastroCrocodilo cadastroCrocodiloUnico;

    public CadastroCrocodilo() {
        initComponents();
    }

    //Singleton garante q tenha somente um projeto deste tipo
    public static CadastroCrocodilo getCadastroCrocodilo() {

        if (cadastroCrocodiloUnico == null) {
            cadastroCrocodiloUnico = new CadastroCrocodilo();
        }
        return cadastroCrocodiloUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblPatas = new javax.swing.JLabel();
        ctPatas = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        ctRaca = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCrocodilo = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblMacho = new javax.swing.JLabel();
        ctMacho = new javax.swing.JTextField();
        lblFemea = new javax.swing.JLabel();
        ctFemea = new javax.swing.JTextField();
        lblAlimentacao = new javax.swing.JLabel();
        ctAlimentacao = new javax.swing.JTextField();
        lblEscama = new javax.swing.JLabel();
        ctEscama = new javax.swing.JTextField();
        lblDente = new javax.swing.JLabel();
        ctDente = new javax.swing.JTextField();
        lblDentes = new javax.swing.JLabel();
        ctDentes = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Crocodilo");

        lblPatas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatas.setText("Patas :");

        lblRaca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRaca.setText("Raca:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar pela pata");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        tblCrocodilo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PATAS", "RACA", "MACHOS", "FEMEAS", "ALIMENTACAO", "ESCAMA", "DENTE", "DENTES"
            }
        ));
        jScrollPane2.setViewportView(tblCrocodilo);

        btAlterar.setText("Alterar pela Pata");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir pela Pata");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblMacho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMacho.setText("Quantidade Macho:");

        lblFemea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFemea.setText("Quantidade Femea:");

        lblAlimentacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAlimentacao.setText("Alimentacao:");

        lblEscama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEscama.setText("Escama:");

        lblDente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDente.setText("Dente:");

        lblDentes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDentes.setText("Quantidade Dentes:");

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setText("Cadastro Crocodilo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctPatas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFemea)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMacho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDentes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctDentes, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ctFemea, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(ctEscama))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEscama)
                                                    .addComponent(lblAlimentacao))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ctAlimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btLimpar)
                                        .addGap(26, 26, 26)
                                        .addComponent(btSair))
                                    .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblDente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctDente, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(344, 344, 344))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatas)
                    .addComponent(ctPatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaca)
                    .addComponent(ctRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMacho)
                            .addComponent(ctMacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFemea)
                            .addComponent(ctFemea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlimentacao)
                            .addComponent(ctAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEscama)
                            .addComponent(ctEscama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair)
                            .addComponent(btLimpar))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDente)
                            .addComponent(ctDente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDentes)
                            .addComponent(ctDentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        listarTabela();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listarTabela();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTabela();
    }//GEN-LAST:event_btExcluirActionPerformed

    public void excluir() {
        crocodilo = new Crocodilo();
        try {
            crocodilo.setPatas(Integer.parseInt(ctPatas.getText()));
            crocodilo = gerCroco.consultaCrocodiloPatas(crocodilo);

            //se nulo quer dizer q n esta cadastrado
            if (crocodilo != null) {

                //get Crocodilo
                ctPatas.setText(Integer.toString(crocodilo.getPatas()));
                ctRaca.setText(crocodilo.getRaca());
                ctAlimentacao.setText(crocodilo.getAlimentacao());
                ctMacho.setText(Integer.toString(crocodilo.getQuant().getMacho()));
                ctFemea.setText(Integer.toString(crocodilo.getQuant().getFemea()));
                ctEscama.setText(crocodilo.getEscama());
                ctDente.setText(crocodilo.getDente());
                ctDentes.setText(Integer.toString(crocodilo.getDentes()));

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir? ", "Excluindo", JOptionPane.YES_NO_OPTION);
                if (x == 0) {
                    gerCroco.removerCrocodiloPatas(crocodilo);
                    JOptionPane.showMessageDialog(null, "Exclusao concluida", "Exclusao", JOptionPane.INFORMATION_MESSAGE);
                }
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Este dado nao esta armazenado", "Animal Nao cadastrado", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Pata precisa ser numero inteiro", "ERRO Inteiro", JOptionPane.ERROR_MESSAGE);
            ctPatas.setText("");
            ctPatas.requestFocus();

        }
    }

    public void alterar() {
        crocodilo = new Crocodilo();
        try {
            crocodilo.setPatas(Integer.parseInt(ctPatas.getText()));
            crocodilo = gerCroco.atualizaCrocodiloPatas(crocodilo);

            //se nulo quer dizer q n esta cadastrado
            if (crocodilo != null) {

                //get Crocodilo
                ctPatas.setText(Integer.toString(crocodilo.getPatas()));
                ctRaca.setText(crocodilo.getRaca());
                ctAlimentacao.setText(crocodilo.getAlimentacao());
                ctMacho.setText(Integer.toString(crocodilo.getQuant().getMacho()));
                ctFemea.setText(Integer.toString(crocodilo.getQuant().getFemea()));
                ctEscama.setText(crocodilo.getEscama());
                ctDente.setText(crocodilo.getDente());
                ctDentes.setText(Integer.toString(crocodilo.getDentes()));

                JOptionPane.showMessageDialog(null, "Dados foram atualizados", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Este dado nao esta armazenado", "Animal Nao cadastrado", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Pata precisa ser numero inteiro", "ERRO Inteiro", JOptionPane.ERROR_MESSAGE);
            ctPatas.setText("");
            ctPatas.requestFocus();

        }

    }

    public void listarTabela() {

        // (DefaultTableModel) casting  
        DefaultTableModel modelo = (DefaultTableModel) tblCrocodilo.getModel();
        int indiceProximaLinha = 0;

        //indica primeira linha tabela
        modelo.setRowCount(indiceProximaLinha);

        //oque fara com as proximas linhas da tabela
        for (Crocodilo croco : gerCroco.getBdCroco()) {
            modelo.insertRow(indiceProximaLinha, new Object[]{
                croco.getPatas(),
                croco.getRaca(),
                croco.getQuant().getMacho(),
                croco.getQuant().getFemea(),
                croco.getAlimentacao(),
                croco.getEscama(),
                croco.getDente(),
                croco.getDentes(),});
            indiceProximaLinha++;
        }
    }

    public void consultar() {
        crocodilo = new Crocodilo();
        try {
            crocodilo.setPatas(Integer.parseInt(ctPatas.getText()));
            crocodilo = gerCroco.consultaCrocodiloPatas(crocodilo);

            //se nulo quer dizer q n esta cadastrado
            if (crocodilo != null) {

                //get Crocodilo
                ctPatas.setText(Integer.toString(crocodilo.getPatas()));
                ctRaca.setText(crocodilo.getRaca());
                ctAlimentacao.setText(crocodilo.getAlimentacao());
                ctMacho.setText(Integer.toString(crocodilo.getQuant().getMacho()));
                ctFemea.setText(Integer.toString(crocodilo.getQuant().getFemea()));
                ctEscama.setText(crocodilo.getEscama());
                ctDente.setText(crocodilo.getDente());
                ctDentes.setText(Integer.toString(crocodilo.getDentes()));

                JOptionPane.showMessageDialog(null, "Confira os dados", "Consulta", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Este dado nao esta armazenado", "Animal Nao cadastrado", JOptionPane.ERROR_MESSAGE);
                limpar();
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "Pata precisa ser numero inteiro", "ERRO Inteiro", JOptionPane.ERROR_MESSAGE);
            ctPatas.setText("");
            ctPatas.requestFocus();

        }
    }

    public void cadastrar() {

        crocodilo = new Crocodilo();
        //set crocodilo
        try {
            crocodilo.setPatas(Integer.parseInt(ctPatas.getText()));
            crocodilo.setRaca(ctRaca.getText());
            crocodilo.setAlimentacao(ctAlimentacao.getText());
            crocodilo.getQuant().setMacho(Integer.parseInt(ctMacho.getText()));
            crocodilo.getQuant().setFemea(Integer.parseInt(ctFemea.getText()));
            crocodilo.setEscama(ctEscama.getText());
            crocodilo.setDente(ctDente.getText());
            crocodilo.setDentes(Integer.parseInt(ctDentes.getText()));

            crocodilo = gerCroco.cadastroCrocodilo(crocodilo);

            if (crocodilo != null) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado", "Cadastro Positivo", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "O dado ja Foi Cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
                limpar();
                ctPatas.requestFocus();

            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Pata precisa ser numero inteiro", "ERRO Inteiro", JOptionPane.ERROR_MESSAGE);
            ctPatas.setText("");
            ctPatas.requestFocus();

        } catch (DentesNaoNegativoException ex) {
            JOptionPane.showMessageDialog(null, "Dentes nao podem Ser negativos", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void sair() {

        int respostaDoClique = JOptionPane.showConfirmDialog(null, "SE DESEJA SAIR CLIQUE SIM", "SAÍDA", JOptionPane.YES_NO_OPTION);
        if (respostaDoClique == 0) {
            this.dispose(); //fecha a janela, usando uma funcao do jframe
        }

    }

    //seta tudo espaco branco e coloca cursor no desejado
    public void limpar() {

        ctPatas.setText("");
        ctRaca.setText("");
        ctAlimentacao.setText("");
        ctMacho.setText("");
        ctFemea.setText("");
        ctEscama.setText("");
        ctDente.setText("");
        ctDentes.setText("");

        //Volta para posicao q vc escolheu
        ctPatas.requestFocus();

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
            java.util.logging.Logger.getLogger(CadastroCrocodilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCrocodilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCrocodilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCrocodilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCrocodilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctAlimentacao;
    private javax.swing.JTextField ctDente;
    private javax.swing.JTextField ctDentes;
    private javax.swing.JTextField ctEscama;
    private javax.swing.JTextField ctFemea;
    private javax.swing.JTextField ctMacho;
    private javax.swing.JTextField ctPatas;
    private javax.swing.JTextField ctRaca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAlimentacao;
    private javax.swing.JLabel lblDente;
    private javax.swing.JLabel lblDentes;
    private javax.swing.JLabel lblEscama;
    private javax.swing.JLabel lblFemea;
    private javax.swing.JLabel lblMacho;
    private javax.swing.JLabel lblPatas;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JTable tblCrocodilo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
