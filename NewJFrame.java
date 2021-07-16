
package despesas;



public class NewJFrame extends javax.swing.JFrame {

  
    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "despesas.NewJFrame_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_Alimentacao = new javax.swing.JTextField();
        Txt_Transporte = new javax.swing.JTextField();
        Txt_Saude = new javax.swing.JTextField();
        Txt_Moradia = new javax.swing.JTextField();
        Txt_Gerais = new javax.swing.JTextField();
        Txt_Reserva = new javax.swing.JTextField();
        Txt_Outros = new javax.swing.JTextField();
        Txt_Receita = new javax.swing.JTextField();
        lbl_Moradia = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbl_Alimentacao = new javax.swing.JLabel();
        lbl_Transporte = new javax.swing.JLabel();
        lbl_Saude = new javax.swing.JLabel();
        lbl_Compras = new javax.swing.JLabel();
        lbl_Fundo = new javax.swing.JLabel();
        lbl_Outros = new javax.swing.JLabel();
        lbl_M = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();
        lbl_Sobra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Calcular = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Alimentação: ");

        jLabel4.setText("Trasporte:");

        jLabel5.setText("Saúde:");

        jLabel6.setText("Moradia:");

        jLabel7.setText("Compras Gerais:");

        jLabel8.setText("Fundo de Reserva:");

        jLabel9.setText("Outros:");

        jLabel10.setText("Receita:");

        jLabel11.setText("Total de Despesas:");

        jLabel12.setText("Resultado:");

        Txt_Alimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_AlimentacaoActionPerformed(evt);
            }
        });

        lbl_Moradia.setBackground(new java.awt.Color(255, 255, 153));
        lbl_Moradia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Levantamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel13.setText("Alimentação:");

        jLabel14.setText("Transporte:");

        jLabel15.setText("Saúde:");

        jLabel16.setText("Moradia:");

        jLabel17.setText("Compras:");

        jLabel18.setText("Fundo:");

        jLabel19.setText("Outros:");

        lbl_Alimentacao.setText("...");

        lbl_Transporte.setText("...");

        lbl_Saude.setText("...");

        lbl_Compras.setText("...");

        lbl_Fundo.setText("...");

        lbl_Outros.setText("...");

        lbl_M.setText("...");

        jLabel20.setText("%");

        jLabel21.setText("%");

        jLabel22.setText("%");

        jLabel23.setText("%");

        jLabel24.setText("%");

        jLabel25.setText("%");

        jLabel26.setText("%");

        javax.swing.GroupLayout lbl_MoradiaLayout = new javax.swing.GroupLayout(lbl_Moradia);
        lbl_Moradia.setLayout(lbl_MoradiaLayout);
        lbl_MoradiaLayout.setHorizontalGroup(
            lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Alimentacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                        .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                                .addComponent(lbl_Outros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26))
                            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                                .addComponent(lbl_Fundo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25))
                            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                                .addComponent(lbl_Compras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24))
                            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                                .addComponent(lbl_Saude)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22))
                            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                                .addComponent(lbl_Transporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21))
                            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                                .addComponent(lbl_M)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)))))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        lbl_MoradiaLayout.setVerticalGroup(
            lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_MoradiaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbl_Alimentacao)
                    .addComponent(jLabel20))
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lbl_Transporte)
                    .addComponent(jLabel21))
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbl_Saude)
                    .addComponent(jLabel22))
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lbl_M)
                    .addComponent(jLabel23))
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lbl_Compras)
                    .addComponent(jLabel24))
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lbl_Fundo)
                    .addComponent(jLabel25))
                .addGap(21, 21, 21)
                .addGroup(lbl_MoradiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lbl_Outros)
                    .addComponent(jLabel26))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        lbl_Total.setText("...");

        lbl_Sobra.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Txt_Receita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Outros, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_Saude, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_Transporte, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_Alimentacao)
                                    .addComponent(Txt_Moradia, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_Reserva, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Sobra)
                            .addComponent(lbl_Total))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Moradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Txt_Receita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Txt_Alimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Txt_Transporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Txt_Saude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Txt_Moradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Txt_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_Outros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lbl_Total)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl_Moradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_Sobra))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Despesas mensais");

        btn_Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Calculator-48.png"))); // NOI18N
        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        btn_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clear.png"))); // NOI18N
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Casa.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Calcular)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double Receita, Alimentacao, Saude, Transporte, Moradia, Compras, Fundo, Outros, Despesas;
 
        public double arredondar(double por) {
            return Math.round(por * 100.0)/100.0;
        }

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
     
       
       Receita = Double.parseDouble(Txt_Receita.getText());
       Alimentacao = Double.parseDouble(Txt_Alimentacao.getText());
       Saude = Double.parseDouble(Txt_Saude.getText());
       Transporte = Double.parseDouble(Txt_Transporte.getText());
       Moradia = Double.parseDouble(Txt_Moradia.getText());
       Compras = Double.parseDouble(Txt_Gerais.getText());
       Fundo = Double.parseDouble(Txt_Reserva.getText());
       Outros = Double.parseDouble(Txt_Outros.getText());
       
     
       Despesas = Alimentacao+Saude+Transporte+ Moradia+Compras+Fundo+Outros;
       
       lbl_Sobra.setText(Double.toString(Receita - Alimentacao-Saude-Transporte- Moradia- Compras- Fundo- Outros));
       lbl_Total.setText(Double.toString(Despesas));
       
       lbl_Alimentacao.setText(Double.toString(arredondar(Alimentacao/Despesas*100)));
       lbl_Saude.setText(Double.toString(arredondar(Saude/Despesas*100)));
       lbl_Transporte.setText(Double.toString(arredondar(Transporte/Despesas*100)));
       lbl_M.setText(Double.toString(arredondar(Moradia/Despesas*100)));
       lbl_Compras.setText(Double.toString(arredondar(Compras/Despesas*100)));
       lbl_Fundo.setText(Double.toString(arredondar(Fundo/Despesas*100)));
       lbl_Outros.setText(Double.toString(arredondar(Outros/Despesas*100)));
       
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void Txt_AlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_AlimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_AlimentacaoActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
       lbl_Sobra.setText("");
       lbl_Total.setText("");
       lbl_Alimentacao.setText("");
       lbl_Saude.setText("");
       lbl_Transporte.setText("");
       lbl_M.setText("");
       lbl_Compras.setText("");
       lbl_Fundo.setText("");
       lbl_Outros.setText(""); 
       
       Txt_Receita.setText("");
       Txt_Alimentacao.setText("");
       Txt_Saude.setText("");
       Txt_Transporte.setText("");
       Txt_Moradia.setText("");
       Txt_Gerais.setText("");
       Txt_Reserva.setText("");
       Txt_Outros.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Alimentacao;
    private javax.swing.JTextField Txt_Gerais;
    private javax.swing.JTextField Txt_Moradia;
    private javax.swing.JTextField Txt_Outros;
    private javax.swing.JTextField Txt_Receita;
    private javax.swing.JTextField Txt_Reserva;
    private javax.swing.JTextField Txt_Saude;
    private javax.swing.JTextField Txt_Transporte;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Limpar;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Alimentacao;
    private javax.swing.JLabel lbl_Compras;
    private javax.swing.JLabel lbl_Fundo;
    private javax.swing.JLabel lbl_M;
    private javax.swing.JPanel lbl_Moradia;
    private javax.swing.JLabel lbl_Outros;
    private javax.swing.JLabel lbl_Saude;
    private javax.swing.JLabel lbl_Sobra;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JLabel lbl_Transporte;
    // End of variables declaration//GEN-END:variables


}
