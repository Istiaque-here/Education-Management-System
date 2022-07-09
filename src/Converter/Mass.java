package Converter;


import static Converter.Converter.object;
import static Converter.Mass.obj;
import static Converter.Pressure.obj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsho
 */
public class Mass extends javax.swing.JFrame {

    /**
     * Creates new form Mass
     */
    public Mass() {
        initComponents();
    }
    public void same() {
            double var = Double.parseDouble(textfrom.getText().toString());
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        // kilogram->
        public void kilogram_gram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 1000;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void kilogram_miligram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 1000000;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void kilogram_pound() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 2.205;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void kilogram_ounce() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 35.274;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        // gram->
        public void gram_kilogram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 1000;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void gram_miligram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 1000;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void gram_pound() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 454;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void gram_ounce() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 28.35;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        // miligram->
        public void miligram_kilogram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 1000000;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void miligram_gram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 1000;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void miligram_pound() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 453592;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void miligram_ounce() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 28350;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        // pound->
        public void pound_kilogram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 2.205;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void pound_gram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 454;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void pound_miligram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 453592;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void pound_ounce() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 16;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        // ounce->
        public void ounce_kilogram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var / 35.274;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void ounce_gram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 28.35;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

        public void ounce_miligram() {
            double var = Double.parseDouble(textfrom.getText().toString());
            var = var * 28350;
            String var2 = Double.toString(var);
            textto.setText(var2);
        }

     public void ounce_pound(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/16;      
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        massto = new javax.swing.JComboBox<>();
        massfrom = new javax.swing.JComboBox<>();
        textto = new javax.swing.JTextField();
        textfrom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mass Converter");
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        massto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        massto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "Gram", "Milligram", "Pound", "Ounce" }));
        massto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masstoActionPerformed(evt);
            }
        });
        jPanel1.add(massto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        massfrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        massfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "Gram", "Milligram", "Pound", "Ounce" }));
        massfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massfromActionPerformed(evt);
            }
        });
        jPanel1.add(massfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));
        jPanel1.add(textto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, 60));
        jPanel1.add(textfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 60));

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        setSize(new java.awt.Dimension(640, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void massfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massfromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (massfrom.getSelectedIndex() == massto.getSelectedIndex()) {
                same();
            } else {
                if (massfrom.getSelectedIndex() == 0 && massto.getSelectedIndex() == 1) {
                    kilogram_gram();
                }
                else if(massfrom.getSelectedIndex() == 0 && massto.getSelectedIndex() == 2) {
                    kilogram_miligram();
                }
                else if(massfrom.getSelectedIndex() == 0 && massto.getSelectedIndex() == 3) {
                    kilogram_pound();
                }
                else if(massfrom.getSelectedIndex() == 0 && massto.getSelectedIndex() == 4) {
                    kilogram_ounce();
                }
                else if(massfrom.getSelectedIndex() == 1 && massto.getSelectedIndex() == 0) {
                    gram_kilogram();
                }else if(massfrom.getSelectedIndex() == 1 && massto.getSelectedIndex() == 2) {
                    gram_miligram();
                }
                else if(massfrom.getSelectedIndex() == 1 && massto.getSelectedIndex() == 3) {
                    gram_pound();
                }
                else if(massfrom.getSelectedIndex() == 1 && massto.getSelectedIndex() == 4) {
                    gram_ounce();
                }else if(massfrom.getSelectedIndex() == 2 && massto.getSelectedIndex() == 0) {
                    miligram_kilogram();
                }
                else if(massfrom.getSelectedIndex() == 2 && massto.getSelectedIndex() == 1) {
                    miligram_gram();
                }
                else if(massfrom.getSelectedIndex() == 2 && massto.getSelectedIndex() == 3) {
                    miligram_pound();
                }
                else if(massfrom.getSelectedIndex() == 2 && massto.getSelectedIndex() == 4) {
                    miligram_ounce();
                }
                else if(massfrom.getSelectedIndex() == 3 && massto.getSelectedIndex() == 0) {
                    pound_kilogram();
                }
                else if(massfrom.getSelectedIndex() == 3 && massto.getSelectedIndex() == 1) {
                    pound_gram();
                }
                else if(massfrom.getSelectedIndex() == 3 && massto.getSelectedIndex() == 2) {
                    pound_miligram();
                }
                else if(massfrom.getSelectedIndex() == 3 && massto.getSelectedIndex() == 4) {
                    pound_ounce();
                }
                else if(massfrom.getSelectedIndex() == 4 && massto.getSelectedIndex() == 0) {
                    ounce_kilogram();
                }
                else if(massfrom.getSelectedIndex() == 4 && massto.getSelectedIndex() == 1) {
                    ounce_gram();
                }
                else if(massfrom.getSelectedIndex() == 4 && massto.getSelectedIndex() == 2) {
                    ounce_miligram();
                }
                else if(massfrom.getSelectedIndex() == 4 && massto.getSelectedIndex() == 3) {
                    ounce_pound();
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void masstoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masstoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masstoActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        object.setVisible(true);
        obj.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed
    public static Mass obj = null;
    /**
     * @param args the command line arguments
     */
    public static void Massfun() {
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
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj = new Mass();
                    obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> massfrom;
    private javax.swing.JComboBox<String> massto;
    private javax.swing.JTextField textfrom;
    private javax.swing.JTextField textto;
    // End of variables declaration//GEN-END:variables
}
