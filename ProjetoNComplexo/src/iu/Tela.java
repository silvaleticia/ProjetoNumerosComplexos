/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import javax.swing.JOptionPane;
import Classe.NComplexo;

/**
 *
 * @author Leticia
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionar4 = new javax.swing.JButton();
        jButtonAdicionar5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonAdicionarAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jLabelNumero2 = new javax.swing.JLabel();
        jTextFieldNumero1ParteReal = new javax.swing.JTextField();
        jTextFieldNumero2ParteReal = new javax.swing.JTextField();
        jLabelParteReal = new javax.swing.JLabel();
        jTextFieldNumero1ParteImaginaria = new javax.swing.JTextField();
        jLabelParteImaginaria = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldnumero2ParteImaginaria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonEDiferente = new javax.swing.JButton();
        jButtonEIgual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jButtonNovoCalculo = new javax.swing.JButton();

        jButtonAdicionar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdicionar4.setText("ADCIONAR");
        jButtonAdicionar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionar4ActionPerformed(evt);
            }
        });

        jButtonAdicionar5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAdicionar5.setText("+");
        jButtonAdicionar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionar5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Números Complexos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));

        jButtonAdicionarAdicionar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAdicionarAdicionar.setText("+");
        jButtonAdicionarAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NUMEROS COMPLEXOS");

        jLabelNumero1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumero1.setText("NUMERO 1");

        jLabelNumero2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumero2.setText("NUMERO 2");

        jLabelParteReal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelParteReal.setText("PR");

        jTextFieldNumero1ParteImaginaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ParteImaginariaActionPerformed(evt);
            }
        });

        jLabelParteImaginaria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelParteImaginaria.setText("PI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("+");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel7.setText("i");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("+");

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setText("i");

        jButtonSubtrair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDividir.setText("/");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonEDiferente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEDiferente.setText("!=");
        jButtonEDiferente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDiferenteActionPerformed(evt);
            }
        });

        jButtonEIgual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEIgual.setText("==");
        jButtonEIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEIgualActionPerformed(evt);
            }
        });

        jTextAreaSaida.setEditable(false);
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

        jButtonNovoCalculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNovoCalculo.setText("NOVO CALCULO");
        jButtonNovoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButtonNovoCalculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonEIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButtonAdicionarAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelNumero1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldNumero1ParteReal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelNumero2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldNumero2ParteReal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldnumero2ParteImaginaria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldNumero1ParteImaginaria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonEDiferente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelParteReal)
                                .addGap(71, 71, 71)
                                .addComponent(jLabelParteImaginaria)
                                .addGap(58, 58, 58)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParteReal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelParteImaginaria, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumero1ParteReal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumero1ParteImaginaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNumero2ParteReal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldnumero2ParteImaginaria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubtrair)
                    .addComponent(jButtonAdicionarAdicionar))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMultiplicar)
                    .addComponent(jButtonDividir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEIgual)
                    .addComponent(jButtonEDiferente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNovoCalculo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarAdicionarActionPerformed
        try {
            int parteReal1=Integer.parseInt(jTextFieldNumero1ParteReal.getText());
            int parteImagaginaria1=Integer.parseInt(jTextFieldNumero1ParteImaginaria.getText());
            
            int parteReal2=Integer.parseInt(jTextFieldNumero2ParteReal.getText());
            int parteImaginaria2=Integer.parseInt(jTextFieldnumero2ParteImaginaria.getText());
            
            
            NComplexo a = new NComplexo(parteReal1,parteImagaginaria1);
            NComplexo b = new NComplexo();
            NComplexo c = new NComplexo(parteReal2, parteImaginaria2);
            
            b=a.adicionar(c);
            
            String saida = "RESULDADO: "+b.get();
            jTextAreaSaida.setText(saida);                 
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAdicionarAdicionarActionPerformed

    private void jButtonAdicionar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicionar4ActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
    try {
            int parteReal1 =Integer.parseInt(jTextFieldNumero1ParteReal.getText());
            int parteImaginaria1=Integer.parseInt(jTextFieldNumero1ParteImaginaria.getText());
            
            int parteReal2=Integer.parseInt(jTextFieldNumero2ParteReal.getText());
            int parteImaginaria2=Integer.parseInt(jTextFieldnumero2ParteImaginaria.getText());
            
            NComplexo a = new NComplexo(parteReal1,parteImaginaria1);
            NComplexo b = new NComplexo();
            NComplexo c = new NComplexo(parteReal2,parteImaginaria2);
            
            b=a.subtrair(c);
            
            String saida = "RESULDADO: "+b.get();
            jTextAreaSaida.setText(saida);
                           
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
     try {
            int parteReal1 =Integer.parseInt(jTextFieldNumero1ParteReal.getText());
            int parteImaginaria1=Integer.parseInt(jTextFieldNumero1ParteImaginaria.getText());
            
            int parteReal2=Integer.parseInt(jTextFieldNumero2ParteReal.getText());
            int parteImaginaria2=Integer.parseInt(jTextFieldnumero2ParteImaginaria.getText());
            
            NComplexo a = new NComplexo(parteReal1,parteImaginaria1);
            NComplexo b = new NComplexo();
            NComplexo c = new NComplexo(parteReal2,parteImaginaria2);
            
            b=a.multiplicar(c);
            
            String saida = "RESULDADO: "+b.get();
            jTextAreaSaida.setText(saida);
                           
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
        
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
       try {
            int parteReal1 =Integer.parseInt(jTextFieldNumero1ParteReal.getText());
            int parteImaginaria1=Integer.parseInt(jTextFieldNumero1ParteImaginaria.getText());
            
            int parteReal2=Integer.parseInt(jTextFieldNumero2ParteReal.getText());
            int parteImaginaria2=Integer.parseInt(jTextFieldnumero2ParteImaginaria.getText());
            
            NComplexo a = new NComplexo(parteReal1,parteImaginaria1);
            NComplexo b = new NComplexo();
            NComplexo c = new NComplexo(parteReal2,parteImaginaria2);
            
            b=a.dividir(c);
            
            String saida = "RESULDADO: "+b.get();
            jTextAreaSaida.setText(saida);
                           
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jButtonAdicionar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicionar5ActionPerformed

    private void jButtonEDiferenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDiferenteActionPerformed
try {
            int parteReal1 =Integer.parseInt(jTextFieldNumero1ParteReal.getText());
            int parteImaginaria1=Integer.parseInt(jTextFieldNumero1ParteImaginaria.getText());
            
            int parteReal2=Integer.parseInt(jTextFieldNumero2ParteReal.getText());
            int parteImaginaria2=Integer.parseInt(jTextFieldnumero2ParteImaginaria.getText());
            
            
            
           NComplexo a = new NComplexo(parteReal1,parteImaginaria1);
           NComplexo b = new NComplexo();
           NComplexo c = new NComplexo(parteReal2,parteImaginaria2);
           
           if(a.eIgual(c) == false){
                String saida = "è Diferente";
                jTextAreaSaida.setText(saida);
            }else{
                String saida = "";
                jTextAreaSaida.setText(saida);
            }
            
            
            
            
                           
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonEDiferenteActionPerformed

    private void jButtonEIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEIgualActionPerformed
      try {
            int parteReal1 =Integer.parseInt(jTextFieldNumero1ParteReal.getText());
            int parteImaginaria1=Integer.parseInt(jTextFieldNumero1ParteImaginaria.getText());
            
            int parteReal2=Integer.parseInt(jTextFieldNumero2ParteReal.getText());
            int parteImaginaria2=Integer.parseInt(jTextFieldnumero2ParteImaginaria.getText());
            
            
            
           NComplexo a = new NComplexo(parteReal1,parteImaginaria1);
           NComplexo b = new NComplexo();
           NComplexo c = new NComplexo(parteReal2,parteImaginaria2);
            
            
            if(a.eIgual(c) == true){
                String saida = "è igual";
                jTextAreaSaida.setText(saida);
            }else{
                String saida = "";
                jTextAreaSaida.setText(saida);
            }
            
            
           
                           
            
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonEIgualActionPerformed

    private void jTextFieldNumero1ParteImaginariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ParteImaginariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ParteImaginariaActionPerformed

    private void jButtonNovoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCalculoActionPerformed
        jTextFieldNumero1ParteReal.setText("");
        jTextFieldNumero1ParteImaginaria.setText("");
        jTextFieldNumero2ParteReal.setText("");
        jTextFieldnumero2ParteImaginaria.setText("");
        jTextAreaSaida.setText("");
    }//GEN-LAST:event_jButtonNovoCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar4;
    private javax.swing.JButton jButtonAdicionar5;
    private javax.swing.JButton jButtonAdicionarAdicionar;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonEDiferente;
    private javax.swing.JButton jButtonEIgual;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonNovoCalculo;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelNumero2;
    private javax.swing.JLabel jLabelParteImaginaria;
    private javax.swing.JLabel jLabelParteReal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldNumero1ParteImaginaria;
    private javax.swing.JTextField jTextFieldNumero1ParteReal;
    private javax.swing.JTextField jTextFieldNumero2ParteReal;
    private javax.swing.JTextField jTextFieldnumero2ParteImaginaria;
    // End of variables declaration//GEN-END:variables
}
