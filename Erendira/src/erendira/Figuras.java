/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package erendira;
import javax.swing.JOptionPane;
/**
 *
 * @author DINO G MTZ
 */
public class Figuras extends javax.swing.JFrame {

    /** Creates new form Figuras */
    public Figuras() {
        initComponents();
        this.jRadioButtonArea.isSelected();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiguras = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelT = new javax.swing.JLabel();
        jTextFieldBase = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButtonPerimetro = new javax.swing.JRadioButton();
        jRadioButtonArea = new javax.swing.JRadioButton();
        jButtonCalcular = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triángulo", "Cuadrado", "Rectángulo", "Círculo", "Rombo", "Pentágono", "Hexágono", "Trapecio", "Paralelogramo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelT.setText("TRIÁNGULO");

        jTextFieldBase.setText("0");
        jTextFieldBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBaseKeyTyped(evt);
            }
        });

        jTextFieldAltura.setText("0");
        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }
        });
        jTextFieldAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAlturaKeyTyped(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equilatero", "Rectangulo", "Isoceles", "Escaleno" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        buttonGroupFiguras.add(jRadioButtonPerimetro);
        jRadioButtonPerimetro.setText("Perímetro");
        jRadioButtonPerimetro.setActionCommand("jRadioButtonPerimetro");
        jRadioButtonPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPerimetroActionPerformed(evt);
            }
        });

        buttonGroupFiguras.add(jRadioButtonArea);
        jRadioButtonArea.setSelected(true);
        jRadioButtonArea.setText("Área");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonPerimetro)
                                .addComponent(jRadioButtonArea))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabelT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jTextFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelT)
                .addGap(54, 54, 54)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonArea)
                    .addComponent(jTextFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPerimetro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResultado))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
           this.jLabelT.setVisible(false);
           this.jComboBox2.setVisible(false);
           switch (jComboBox1.getSelectedIndex()) {
            case 0:
                this.jLabelT.setText("TRIÁNGULO");
                this.jLabelT.setVisible(true);
                this.jComboBox2.setVisible(true);
                this.jTextFieldBase.setVisible(true);
                break;
            case 1:
                this.jLabelT.setText("CUADRADO");
                this.jLabelT.setVisible(true);
                this.jTextFieldBase.setVisible(false);
                break;
            case 2:
                this.jLabelT.setText("RECTÁNGULO");
                this.jLabelT.setVisible(true);
                break;
            case 3:
                this.jLabelT.setText("CÍRCULO");
                this.jLabelT.setVisible(true);
                break;
            case 4:
                this.jLabelT.setText("ROMBO");
                this.jLabelT.setVisible(true);
                break;
            case 5:
                this.jLabelT.setText("PENTÁGONO");
                this.jLabelT.setVisible(true);
                break;
            case 6:
                this.jLabelT.setText("HEXÁGONO");
                this.jLabelT.setVisible(true);
                break;
            case 7:
                this.jLabelT.setText("TRAPECIO");
                this.jLabelT.setVisible(true);
                break;
            case 8:
                this.jLabelT.setText("PARALELOGRAMO");
                this.jLabelT.setVisible(true);
                break;
            default:
                throw new AssertionError();
                
        }
           
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButtonPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPerimetroActionPerformed

    private void jTextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaActionPerformed
        
    }//GEN-LAST:event_jTextFieldAlturaActionPerformed

    private void jTextFieldAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAlturaKeyTyped
        char c=evt.getKeyChar();
	if(Character.isLetter(c)) {
		getToolkit().beep();
		evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAlturaKeyTyped

    private void jTextFieldBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBaseKeyTyped
        char c=evt.getKeyChar();
	if(Character.isLetter(c)) {
		getToolkit().beep();
		evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBaseKeyTyped

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        try {
            double base = (Double.parseDouble(this.jTextFieldBase.getText()));
            double altura = (Double.parseDouble(this.jTextFieldAltura.getText()));
            if (this.jRadioButtonArea.isSelected()) {
                switch (jComboBox1.getSelectedIndex()) {
                case 0: //TRIÁNGULO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (base * altura)/2 + " u²");
                break;
                case 1: //CUADRADO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (altura * altura) + " u²");
                break;
                case 2: //RECTÁNGULO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (base * altura) + " u²");
                break;
                case 3: //CÍRCULO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((base * base) * 3.1416) + " u²");
                break;
                case 4: //ROMBO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (base * altura)/2 + " u²");
                break;
                case 5: //PENTÁGONO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((5 * base) * altura)/2 + " u²");
                break;
                case 6: //HEXÁGONO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((6 * base) * altura)/2 + " u²");
                break;
                case 7: //TRAPECIO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((6 * base) * altura)/2 + " u²");
                break;
                case 8: //PARALELOGRAMO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((6 * base) * altura)/2 + " u²");
                break;
            default: 
                throw new AssertionError();
            }
            } else if (this.jRadioButtonPerimetro.isSelected()) {
                switch (jComboBox1.getSelectedIndex()) {
                case 0: //TRIÁNGULO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (base * altura)/2 + " cm");
                break;
                case 1: //CUADRADO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (altura * altura) + " cm");
                break;
                case 2: //RECTÁNGULO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (base * altura) + " cm");
                break;
                case 3: //CÍRCULO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((base * base) * 3.1416) + " cm");
                break;
                case 4: //ROMBO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + (base * altura)/2 + " cm");
                break;
                case 5: //PENTÁGONO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((5 * base) * altura)/2 + " cm");
                break;
                case 6: //HEXÁGONO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((6 * base) * altura)/2 + " cm");
                break;
                case 7: //TRAPECIO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((6 * base) * altura)/2 + " cm");
                break;
                case 8: //PARALELOGRAMO
                    this.jLabelResultado.setText("Resultado: ");
                    this.jLabelResultado.setText(this.jLabelResultado.getText() + ((6 * base) * altura)/2 + " cm");
                break;
            default: 
                throw new AssertionError();
            }
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
        }
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiguras;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelT;
    private javax.swing.JRadioButton jRadioButtonArea;
    private javax.swing.JRadioButton jRadioButtonPerimetro;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldBase;
    // End of variables declaration//GEN-END:variables

}
