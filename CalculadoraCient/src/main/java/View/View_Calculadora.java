/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Ctr_Calculadora;
import Model.Calculadora;
import Model.Erro;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class View_Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form View_doZero
     */
    public View_Calculadora() {
        initComponents();
    }
    Ctr_Calculadora ControleCalc = new Ctr_Calculadora();
    Calculadora calculadora = new Calculadora();
    Erro erro = new Erro();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_ponto = new javax.swing.JButton();
        jButton_totaliza = new javax.swing.JButton();
        jButton_n0 = new javax.swing.JButton();
        jButton_n1 = new javax.swing.JButton();
        jButton_n2 = new javax.swing.JButton();
        jButton_n3 = new javax.swing.JButton();
        jButton_n4 = new javax.swing.JButton();
        jButton_n5 = new javax.swing.JButton();
        jButton_n6 = new javax.swing.JButton();
        jButton_n7 = new javax.swing.JButton();
        jButton_n8 = new javax.swing.JButton();
        jButton_n9 = new javax.swing.JButton();
        jButton_CA = new javax.swing.JButton();
        jButton_seno = new javax.swing.JButton();
        jButton_cos = new javax.swing.JButton();
        jButton_tan = new javax.swing.JButton();
        jButton_pi = new javax.swing.JButton();
        jButton_nMais = new javax.swing.JButton();
        jButton_mMenos = new javax.swing.JButton();
        jButton_mr = new javax.swing.JButton();
        jButton_mc = new javax.swing.JButton();
        jButton_exp = new javax.swing.JButton();
        jButton_divRest = new javax.swing.JButton();
        jButton_multi = new javax.swing.JButton();
        jButton_soma = new javax.swing.JButton();
        jButton_sub = new javax.swing.JButton();
        jButton_divInt = new javax.swing.JButton();
        jButton_euler = new javax.swing.JButton();
        jLabel_calculadora = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Painel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jButton_ponto.setText(".");
        jButton_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pontoActionPerformed(evt);
            }
        });

        jButton_totaliza.setText("=");
        jButton_totaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_totalizaActionPerformed(evt);
            }
        });

        jButton_n0.setText("0");
        jButton_n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n0ActionPerformed(evt);
            }
        });

        jButton_n1.setText("1");
        jButton_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n1ActionPerformed(evt);
            }
        });

        jButton_n2.setText("2");
        jButton_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n2ActionPerformed(evt);
            }
        });

        jButton_n3.setText("3");
        jButton_n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n3ActionPerformed(evt);
            }
        });

        jButton_n4.setText("4");
        jButton_n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n4ActionPerformed(evt);
            }
        });

        jButton_n5.setText("5");
        jButton_n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n5ActionPerformed(evt);
            }
        });

        jButton_n6.setText("6");
        jButton_n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n6ActionPerformed(evt);
            }
        });

        jButton_n7.setText("7");
        jButton_n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n7ActionPerformed(evt);
            }
        });

        jButton_n8.setText("8");
        jButton_n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n8ActionPerformed(evt);
            }
        });

        jButton_n9.setText("9");
        jButton_n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_n9ActionPerformed(evt);
            }
        });

        jButton_CA.setText("AC");
        jButton_CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CAActionPerformed(evt);
            }
        });

        jButton_seno.setText("seno");

        jButton_cos.setText("cos");

        jButton_tan.setText("tan");
        jButton_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tanActionPerformed(evt);
            }
        });

        jButton_pi.setText("pi");
        jButton_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_piActionPerformed(evt);
            }
        });

        jButton_nMais.setText("M+");
        jButton_nMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nMaisActionPerformed(evt);
            }
        });

        jButton_mMenos.setText("M-");
        jButton_mMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mMenosActionPerformed(evt);
            }
        });

        jButton_mr.setText("MR");
        jButton_mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mrActionPerformed(evt);
            }
        });

        jButton_mc.setText("MC");
        jButton_mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mcActionPerformed(evt);
            }
        });

        jButton_exp.setText("exp");

        jButton_divRest.setText("%");
        jButton_divRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_divRestActionPerformed(evt);
            }
        });

        jButton_multi.setText("*");
        jButton_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_multiActionPerformed(evt);
            }
        });

        jButton_soma.setText("+");
        jButton_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_somaActionPerformed(evt);
            }
        });

        jButton_sub.setText("-");
        jButton_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_subActionPerformed(evt);
            }
        });

        jButton_divInt.setText("/");
        jButton_divInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_divIntActionPerformed(evt);
            }
        });

        jButton_euler.setText("e");
        jButton_euler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eulerActionPerformed(evt);
            }
        });

        jLabel_calculadora.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel_calculadora.setText("Calculadora");

        Painel.setColumns(20);
        Painel.setRows(5);
        jScrollPane2.setViewportView(Painel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jButton_CA, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_mMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_exp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_seno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_n0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jButton_totaliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton_cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_nMais, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_n7, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_n4, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_n1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_euler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton_pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_n5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jButton_divRest, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_divInt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel_calculadora))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel_calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_mMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_nMais, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_divRest, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_divInt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_euler, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_n8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_n7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_n5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_n4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton_n1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_seno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_n0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_totaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton_CA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_n9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_n6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n3ActionPerformed
        InserirDigito("3");
    }//GEN-LAST:event_jButton_n3ActionPerformed

    private void jButton_n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n6ActionPerformed
        InserirDigito("6");
    }//GEN-LAST:event_jButton_n6ActionPerformed

    private void jButton_nMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nMaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_nMaisActionPerformed

    private void jButton_mMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_mMenosActionPerformed

    private void jButton_mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_mrActionPerformed

    private void jButton_mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_mcActionPerformed

    private void jButton_CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CAActionPerformed
        //limpa Painel ok
        Painel.setText("");
        
        //limpa var 'numero1'
        calculadora.setNumero1("");
        
        //limpa var 'numero2'
        calculadora.setNumero2("");
        
        //limpa var 'operador'
        calculadora.setOperador("");
        
        //limpa var 'resultado'
        calculadora.setResultado("");
    }//GEN-LAST:event_jButton_CAActionPerformed

    private void jButton_eulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eulerActionPerformed
        Painel.setText(Double.toString(Math.E));
    }//GEN-LAST:event_jButton_eulerActionPerformed

    private void jButton_n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n0ActionPerformed
        InserirDigito("0");
    }//GEN-LAST:event_jButton_n0ActionPerformed

    private void jButton_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n1ActionPerformed
        InserirDigito("1");
    }//GEN-LAST:event_jButton_n1ActionPerformed

    private void jButton_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n2ActionPerformed
        InserirDigito("2");
    }//GEN-LAST:event_jButton_n2ActionPerformed

    private void jButton_n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n4ActionPerformed
        InserirDigito("4");
    }//GEN-LAST:event_jButton_n4ActionPerformed

    private void jButton_n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n5ActionPerformed
        InserirDigito("5");
    }//GEN-LAST:event_jButton_n5ActionPerformed

    private void jButton_n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n7ActionPerformed
        InserirDigito("7");
    }//GEN-LAST:event_jButton_n7ActionPerformed

    private void jButton_n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n8ActionPerformed
        InserirDigito("8");
    }//GEN-LAST:event_jButton_n8ActionPerformed

    private void jButton_n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_n9ActionPerformed
        InserirDigito("9");
    }//GEN-LAST:event_jButton_n9ActionPerformed

    private void jButton_divRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_divRestActionPerformed
        //pega oq esta no painel e coloca na var 'numero1'
        calculadora.setNumero1(Painel.getText());
        
        //limpa o painel
        Painel.setText("");
        
        //define o operador como soma(+)
        calculadora.setOperador("%");
    }//GEN-LAST:event_jButton_divRestActionPerformed

    private void jButton_divIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_divIntActionPerformed
        //pega oq esta no painel e coloca na var 'numero1'
        calculadora.setNumero1(Painel.getText());
        
        //limpa o painel
        Painel.setText("");
        
        //define o operador como soma(+)
        calculadora.setOperador("/");
    }//GEN-LAST:event_jButton_divIntActionPerformed

    private void jButton_totalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_totalizaActionPerformed
        //pega oq esta no painel e coloca na var 'numero2'
        calculadora.setNumero2(Painel.getText());
        
        //realiza a operação
        ControleCalc.SelecionaOperadoracao(calculadora);
        
        //saída do resultado da operação
        Painel.setText(calculadora.getResultado());
        
        //limpa as variaveis para o proximo calculo
        calculadora.limpar();
    }//GEN-LAST:event_jButton_totalizaActionPerformed

    private void jButton_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_multiActionPerformed
        //pega oq esta no painel e coloca na var 'numero1'
        calculadora.setNumero1(Painel.getText());
        
        //limpa o painel
        Painel.setText("");
        
        //define o operador como soma(+)
        calculadora.setOperador("*");
    }//GEN-LAST:event_jButton_multiActionPerformed

    private void jButton_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_subActionPerformed
        //pega oq esta no painel e coloca na var 'numero1'
        calculadora.setNumero1(Painel.getText());
        
        //limpa o painel
        Painel.setText("");
        
        //define o operador como soma(+)
        calculadora.setOperador("-");
    }//GEN-LAST:event_jButton_subActionPerformed

    private void jButton_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_somaActionPerformed
        //pega oq esta no painel e coloca na var 'numero1'
        calculadora.setNumero1(Painel.getText());
        
        //limpa o painel
        Painel.setText("");
        
        //define o operador como soma(+)
        calculadora.setOperador("+");
    }//GEN-LAST:event_jButton_somaActionPerformed

    private void jButton_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pontoActionPerformed
        InserirDigito(".");
    }//GEN-LAST:event_jButton_pontoActionPerformed

    private void jButton_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_piActionPerformed
        Painel.setText(Double.toString(Math.PI));
    }//GEN-LAST:event_jButton_piActionPerformed

    private void jButton_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tanActionPerformed
     
    }//GEN-LAST:event_jButton_tanActionPerformed

    private void InserirDigito(String digito){        
        if(Painel.equals("")){
        Painel.setText(Painel.getText());
        }
        else{
            if(digito.equals(".")&& Painel.getText().contains(".")){
            //não imprime nada
            }
            else{
                Painel.setText( Painel.getText()+digito);
            }
        }
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
            java.util.logging.Logger.getLogger(View_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Painel;
    private javax.swing.JButton jButton_CA;
    private javax.swing.JButton jButton_cos;
    private javax.swing.JButton jButton_divInt;
    private javax.swing.JButton jButton_divRest;
    private javax.swing.JButton jButton_euler;
    private javax.swing.JButton jButton_exp;
    private javax.swing.JButton jButton_mMenos;
    private javax.swing.JButton jButton_mc;
    private javax.swing.JButton jButton_mr;
    private javax.swing.JButton jButton_multi;
    private javax.swing.JButton jButton_n0;
    private javax.swing.JButton jButton_n1;
    private javax.swing.JButton jButton_n2;
    private javax.swing.JButton jButton_n3;
    private javax.swing.JButton jButton_n4;
    private javax.swing.JButton jButton_n5;
    private javax.swing.JButton jButton_n6;
    private javax.swing.JButton jButton_n7;
    private javax.swing.JButton jButton_n8;
    private javax.swing.JButton jButton_n9;
    private javax.swing.JButton jButton_nMais;
    private javax.swing.JButton jButton_pi;
    private javax.swing.JButton jButton_ponto;
    private javax.swing.JButton jButton_seno;
    private javax.swing.JButton jButton_soma;
    private javax.swing.JButton jButton_sub;
    private javax.swing.JButton jButton_tan;
    private javax.swing.JButton jButton_totaliza;
    private javax.swing.JLabel jLabel_calculadora;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
