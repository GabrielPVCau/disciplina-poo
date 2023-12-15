import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroCachorro extends javax.swing.JFrame {

    private Cachorro cachorro;
    private GerCachorro gerCachorro = new GerCachorro();
    
    private static CadastroCachorro cadastroCachorroUnico;

    
    private CadastroCachorro() {
        initComponents();
    }
    //Singleton garante q tenha somente um projeto deste tipo
    public static CadastroCachorro getCadastroCachorro(){
        
        if(cadastroCachorroUnico == null){
            cadastroCachorroUnico = new CadastroCachorro();
        }
        return cadastroCachorroUnico;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMacho = new javax.swing.JLabel();
        ctMacho = new javax.swing.JTextField();
        lblFemea = new javax.swing.JLabel();
        ctFemea = new javax.swing.JTextField();
        lblAlimentacao = new javax.swing.JLabel();
        ctAlimentacao = new javax.swing.JTextField();
        lblPelo = new javax.swing.JLabel();
        ctPelo = new javax.swing.JTextField();
        lblPatas = new javax.swing.JLabel();
        lblLatido = new javax.swing.JLabel();
        ctPatas = new javax.swing.JTextField();
        ctLatido = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        ctRaca = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lblHabilidade = new javax.swing.JLabel();
        ctHabilidade = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCachorro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cachorro");

        lblMacho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMacho.setText("Quantidade Macho:");

        lblFemea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFemea.setText("Quantidade Femea:");

        lblAlimentacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAlimentacao.setText("Alimentacao:");

        lblPelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPelo.setText("Pelo:");

        lblPatas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatas.setText("Patas :");

        lblLatido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLatido.setText("Latido:");

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

        lblHabilidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHabilidade.setText("Habilidade:");

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setText("Cadastro Cachorro");

        tblCachorro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PATAS", "RACA", "MACHOS", "FEMEAS", "ALIMENTACAO", "PELO", "LATIDO", "HABILIDADE"
            }
        ));
        jScrollPane2.setViewportView(tblCachorro);

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
                                        .addComponent(ctMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btLimpar)
                                        .addGap(26, 26, 26)
                                        .addComponent(btSair))
                                    .addComponent(btConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHabilidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ctFemea, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(ctPelo))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPelo)
                                                    .addComponent(lblAlimentacao))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ctAlimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAlterar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblLatido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctLatido, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(344, 344, 344))
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
                            .addComponent(lblPelo)
                            .addComponent(ctPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLatido)
                            .addComponent(ctLatido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHabilidade)
                            .addComponent(ctHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
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
        cachorro = new Cachorro();
        try {
            cachorro.setPatas(Integer.parseInt(ctPatas.getText()));
            cachorro = gerCachorro.consultaCachorroPatas(cachorro);

            //se nulo quer dizer q n esta cadastrado
            if (cachorro != null) {

                //get cachorro
                ctPatas.setText(Integer.toString(cachorro.getPatas()));
                ctRaca.setText(cachorro.getRaca());
                ctAlimentacao.setText(cachorro.getAlimentacao());
                ctMacho.setText(Integer.toString(cachorro.getQuant().getMacho()));
                ctFemea.setText(Integer.toString(cachorro.getQuant().getFemea()));
                ctPelo.setText(cachorro.getPelo());
                ctLatido.setText(cachorro.getLatido());
                ctHabilidade.setText(cachorro.getHabilidade());

                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir? ", "Excluindo", JOptionPane.YES_NO_OPTION);
                if (x == 0) {
                    gerCachorro.removerCachorroPatas(cachorro);
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
        cachorro = new Cachorro();
        try {
            cachorro.setPatas(Integer.parseInt(ctPatas.getText()));
            cachorro = gerCachorro.atualizaCachorroPatas(cachorro);

            //se nulo quer dizer q n esta cadastrado
            if (cachorro != null) {

                //get cachorro
                ctPatas.setText(Integer.toString(cachorro.getPatas()));
                ctRaca.setText(cachorro.getRaca());
                ctAlimentacao.setText(cachorro.getAlimentacao());
                ctMacho.setText(Integer.toString(cachorro.getQuant().getMacho()));
                ctFemea.setText(Integer.toString(cachorro.getQuant().getFemea()));
                ctPelo.setText(cachorro.getPelo());
                ctLatido.setText(cachorro.getLatido());
                ctHabilidade.setText(cachorro.getHabilidade());

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

    public void consultar() {
        cachorro = new Cachorro();
        try {
            cachorro.setPatas(Integer.parseInt(ctPatas.getText()));
            cachorro = gerCachorro.consultaCachorroPatas(cachorro);

            //se nulo quer dizer q n esta cadastrado
            if (cachorro != null) {

                //get cachorro
                ctPatas.setText(Integer.toString(cachorro.getPatas()));
                ctRaca.setText(cachorro.getRaca());
                ctAlimentacao.setText(cachorro.getAlimentacao());
                ctMacho.setText(Integer.toString(cachorro.getQuant().getMacho()));
                ctFemea.setText(Integer.toString(cachorro.getQuant().getFemea()));
                ctPelo.setText(cachorro.getPelo());
                ctLatido.setText(cachorro.getLatido());
                ctHabilidade.setText(cachorro.getHabilidade());

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

    public void listarTabela() {

        // (DefaultTableModel) casting  
        DefaultTableModel modelo = (DefaultTableModel) tblCachorro.getModel();
        int indiceProximaLinha = 0;

        //indica primeira linha tabela
        modelo.setRowCount(indiceProximaLinha);

        //oque fara com as proximas linhas da tabela
        for (Cachorro cachorro : gerCachorro.getBdCachorro()) {
            modelo.insertRow(indiceProximaLinha, new Object[]{
                cachorro.getPatas(),
                cachorro.getRaca(),
                cachorro.getQuant().getMacho(),
                cachorro.getQuant().getFemea(),
                cachorro.getAlimentacao(),
                cachorro.getPelo(),
                cachorro.getLatido(),
                cachorro.getHabilidade(),});
            indiceProximaLinha++;
        }
    }

    public void cadastrar() {

        cachorro = new Cachorro();
        //set cachorro
        try {
            cachorro.setPatas(Integer.parseInt(ctPatas.getText()));
            cachorro.setRaca(ctRaca.getText());
            cachorro.setAlimentacao(ctAlimentacao.getText());
            cachorro.getQuant().setMacho(Integer.parseInt(ctMacho.getText()));
            cachorro.getQuant().setFemea(Integer.parseInt(ctFemea.getText()));
            cachorro.setPelo(ctPelo.getText());
            cachorro.setLatido(ctLatido.getText());
            cachorro.setHabilidade(ctHabilidade.getText());

            cachorro = gerCachorro.cadastroCachorro(cachorro);

            if (cachorro != null) {
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
        ctPelo.setText("");
        ctLatido.setText("");
        ctHabilidade.setText("");

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
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCachorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCachorro().setVisible(true);
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
    private javax.swing.JTextField ctFemea;
    private javax.swing.JTextField ctHabilidade;
    private javax.swing.JTextField ctLatido;
    private javax.swing.JTextField ctMacho;
    private javax.swing.JTextField ctPatas;
    private javax.swing.JTextField ctPelo;
    private javax.swing.JTextField ctRaca;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlimentacao;
    private javax.swing.JLabel lblFemea;
    private javax.swing.JLabel lblHabilidade;
    private javax.swing.JLabel lblLatido;
    private javax.swing.JLabel lblMacho;
    private javax.swing.JLabel lblPatas;
    private javax.swing.JLabel lblPelo;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JTable tblCachorro;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
