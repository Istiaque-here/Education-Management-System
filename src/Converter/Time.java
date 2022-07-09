package Converter;

import Converter.Converter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Time extends javax.swing.JFrame {

    /**
     * Creates new form Time
     */
    public Time() {
        initComponents();
    }
    public void same(){
        double var = Double.parseDouble(textfrom.getText().toString());
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
    // time
    // nanosecond
    public void nanosecond_Microsecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var/1000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void nanosecond_Millisecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var/0.000001;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void nanosecond_second() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var/0.00000001;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void nanosecond_minute() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /60000000000.0;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void nanosecond_hour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /360000000000.0;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
    // microsecond
    public void Microsecond_nanosecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*1000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Microsecond_Millisecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var/1000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Microsecond_second() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var/1000000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Microsecond_minute() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /60000000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Microsecond_hour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /3600000000.0;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
    // second
    public void second_nanosecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*1000000000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void second_Millisecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*1000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void second_Microsecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*1000000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void second_minute() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /60;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void second_hour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /3600;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
    // minute
   
    public void minute_nanosecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*60000000000.0;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void minute_Millisecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*60000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void minute_Microsecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var*60000000;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void minute_second() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var *60;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void minute_hour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 60;
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
        textto = new javax.swing.JTextField();
        textfrom = new javax.swing.JTextField();
        timefrom = new javax.swing.JComboBox<>();
        timeto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        timefrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timefrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nanosecond", "Microsecond", "Second", "Minute" }));

        timeto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nanosecond", "Microsecond", "Second", "Minute" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timefrom, 0, 208, Short.MAX_VALUE)
                            .addComponent(textfrom))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeto, 0, 209, Short.MAX_VALUE)
                            .addComponent(textto)))
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timefrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(timefrom.getSelectedIndex() == timeto.getSelectedIndex()){
                    same();
                }
        else{
            if(timefrom.getSelectedIndex()==0 && timeto.getSelectedIndex()==1){
                        nanosecond_Microsecond();
                }
            else if(timefrom.getSelectedIndex()==0 && timeto.getSelectedIndex()==2){
                nanosecond_second();
            }
            else if(timefrom.getSelectedIndex()==0 && timeto.getSelectedIndex()==3){
                nanosecond_minute();
            }
            else if(timefrom.getSelectedIndex()==0 && timeto.getSelectedIndex()==4){
                nanosecond_Microsecond();
            }
            else if(timefrom.getSelectedIndex()==1 && timeto.getSelectedIndex()==0){
                Microsecond_nanosecond();
            }
            else if(timefrom.getSelectedIndex()==1 && timeto.getSelectedIndex()==2){
                Microsecond_second();
            }
            else if(timefrom.getSelectedIndex()==1 && timeto.getSelectedIndex()==3){
                Microsecond_minute();
            }
            else if(timefrom.getSelectedIndex()==2 && timeto.getSelectedIndex()==0){
                second_nanosecond();
            }
            else if(timefrom.getSelectedIndex()==2 && timeto.getSelectedIndex()==1){
                second_Microsecond();
            }
            else if(timefrom.getSelectedIndex()==2 && timeto.getSelectedIndex()==3){
                second_minute();
            }
            else if(timefrom.getSelectedIndex()==3 && timeto.getSelectedIndex()==0){
                minute_nanosecond();
            }
            else if(timefrom.getSelectedIndex()==3 && timeto.getSelectedIndex()==1){
                minute_Microsecond();
            }
            else if(timefrom.getSelectedIndex()==3 && timeto.getSelectedIndex()==2){
                minute_second();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Converter.object.setVisible(true);
        obj.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static Time obj = null ;
    public static void Timefun() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj = new Time();
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textfrom;
    private javax.swing.JTextField textto;
    private javax.swing.JComboBox<String> timefrom;
    private javax.swing.JComboBox<String> timeto;
    // End of variables declaration//GEN-END:variables
}
