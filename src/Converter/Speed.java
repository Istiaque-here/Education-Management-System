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
public class Speed extends javax.swing.JFrame {

    /**
     * Creates new form Speed
     */
    public Speed() {
        initComponents();
    }
        // speed
    // milesPerhour
    public void same(){
        double var = Double.parseDouble(textfrom.getText().toString());
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
    public void milesPerhour_Kiloperhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var * 1.609;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void milesPerhour_FootPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var * 1.467;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void milesPerhour_MeterPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 2.237;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void milesPerhour_knot() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 1.151;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
    
    // FootPerSecond
   
    public void FootPerSecond_milesPerhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 1.467;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void FootPerSecond_MeterPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 3.281;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void FootPerSecond_Kiloperhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var * 1.097;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void FootPerSecond_knot() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 1.688;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    // MeterPerSecond

    public void MeterPerSecond_milesPerhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var *2.237;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void MeterPerSecond_FootPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var *3.281;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void MeterPerSecond_Kiloperhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var * 3.6 ;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void MeterPerSecond_knot() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var *1.944;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    // Kiloperhour

    public void Kiloperhour_milesPerhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /1.609;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Kiloperhour_FootPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /1.097;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Kiloperhour_MeterPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 3.6 ;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void Kiloperhour_knot() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var /1.852;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    // knot

    public void knot_milesPerhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var *1.151;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void knot_FootPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var *1.688;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void knot_MeterPerSecond() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var / 1.944;
        String var2 = Double.toString(var);
        textto.setText(var2);
    }

    public void knot_Kiloperhour() {
        double var = Double.parseDouble(textfrom.getText().toString());
        var = var * 1.852;
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
        speedfrom = new javax.swing.JComboBox<>();
        speedto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        textto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textfrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        speedfrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miles per hour", "Foot per second", "Meter per second", "Kilo meter per second", "Knot" }));
        speedfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedfromActionPerformed(evt);
            }
        });

        speedto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miles per hour", "Foot per second", "Meter per second", "Kilo meter per second", "Knot" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(speedfrom, 0, 201, Short.MAX_VALUE)
                    .addComponent(textfrom))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textto)
                    .addComponent(speedto, 0, 193, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(Back))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void speedfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speedfromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(speedfrom.getSelectedIndex() == speedto.getSelectedIndex()){
                    same();
                }
        else{
            if(speedfrom.getSelectedIndex()==0 && speedto.getSelectedIndex()==1){
                        milesPerhour_FootPerSecond();
                    }
                else if(speedfrom.getSelectedIndex()==0 && speedto.getSelectedIndex()==2){
                        milesPerhour_MeterPerSecond();
                    }
                else if(speedfrom.getSelectedIndex()==0 && speedto.getSelectedIndex()==3){
                        milesPerhour_Kiloperhour();
                    }
                else if(speedfrom.getSelectedIndex()==0 && speedto.getSelectedIndex()==4){
                        milesPerhour_knot();
                    }
            
            
            else if(speedfrom.getSelectedIndex()==1 && speedto.getSelectedIndex()==0){
                    FootPerSecond_milesPerhour();
            }
            else if(speedfrom.getSelectedIndex()==1 && speedto.getSelectedIndex()==2){
                    FootPerSecond_MeterPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==1 && speedto.getSelectedIndex()==3){
                    FootPerSecond_Kiloperhour();
            }
            else if(speedfrom.getSelectedIndex()==1 && speedto.getSelectedIndex()==4){
                    FootPerSecond_knot();
            }
            
            
            else if(speedfrom.getSelectedIndex()==2 && speedto.getSelectedIndex()==0){
                    MeterPerSecond_milesPerhour();
            }
            else if(speedfrom.getSelectedIndex()==2 && speedto.getSelectedIndex()==1){
                    MeterPerSecond_FootPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==2 && speedto.getSelectedIndex()==3){
                    MeterPerSecond_Kiloperhour();
            }
            else if(speedfrom.getSelectedIndex()==2 && speedto.getSelectedIndex()==4){
                    MeterPerSecond_knot();
            }
            
            
            
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==0){
                    Kiloperhour_milesPerhour();
            }
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==1){
                    Kiloperhour_FootPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==2){
                    Kiloperhour_MeterPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==4){
                    Kiloperhour_knot();
            }
            
            
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==0){
                    Kiloperhour_milesPerhour();
            }
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==1){
                    Kiloperhour_FootPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==2){
                    Kiloperhour_MeterPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==3 && speedto.getSelectedIndex()==4){
                    Kiloperhour_knot();
            }
            
            
            else if(speedfrom.getSelectedIndex()==4 && speedto.getSelectedIndex()==0){
                    knot_milesPerhour();
            }
            else if(speedfrom.getSelectedIndex()==4 && speedto.getSelectedIndex()==1){
                    knot_FootPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==4 && speedto.getSelectedIndex()==2){
                    knot_MeterPerSecond();
            }
            else if(speedfrom.getSelectedIndex()==4 && speedto.getSelectedIndex()==3){
                    knot_Kiloperhour();
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
    public static Speed obj = null ;
    public static void Speedfun() {
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
            java.util.logging.Logger.getLogger(Speed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Speed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Speed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Speed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj = new Speed();
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> speedfrom;
    private javax.swing.JComboBox<String> speedto;
    private javax.swing.JTextField textfrom;
    private javax.swing.JTextField textto;
    // End of variables declaration//GEN-END:variables
}
