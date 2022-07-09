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
public class Pressure extends javax.swing.JFrame {

    /**
     * Creates new form Pressure
     */
    public Pressure() {
        initComponents();
    }
          // Pressure
     // bar
     public void same(){
        double var = Double.parseDouble(textfrom.getText().toString());
        String var2 = Double.toString(var);
        textto.setText(var2);
    }
     public void Bar_pascal(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var*100000;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void Bar_poundPerSquareinch(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var*14.504;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void Bar_StandardAtmosphare(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/ 1.013;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void Bar_torr(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var* 750;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     // pascal
     public void pascal_Bar(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/100000;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void pascal_poundPerSquareinch(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/6895;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void pascal_StandardAtmosphare(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/101325;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void pascal_torr(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/133;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     // poundPerSquareinch
     public void poundPerSquareinch_Bar(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/14.504;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void poundPerSquareinch_pascal(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var* 6895;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void poundPerSquareinch_StandardAtmosphare(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/14.696;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void poundPerSquareinch_torr(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var*51.715;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     //StandardAtmosphare
     public void StandardAtmosphare_Bar(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var*1.013;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void StandardAtmosphare_pascal(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var* 101325;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void StandardAtmosphare_poundPerSquareinch(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var*14.696;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void StandardAtmosphare_torr(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var* 760;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     // Torr
     public void torr_Bar(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/750 ;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void torr_pascal(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var* 133;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void torr_poundPerSquareinch(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/51.715;
      String var2 = Double.toString(var);
      textto.setText(var2);
     }
     public void torr_StandardAtmosphare(){
      double var = Double.parseDouble(textfrom.getText().toString());
      var = var/760;
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
        pressurefrom = new javax.swing.JComboBox<>();
        pressureto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        textto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttoActionPerformed(evt);
            }
        });

        textfrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        pressurefrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pressurefrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bar", "Pascal", "Pound per square inch", "Standard atmosphere", "Torr" }));

        pressureto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pressureto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bar", "Pascal", "Pound per square inch", "Standard atmosphere", "Torr" }));

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
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textfrom)
                    .addComponent(pressurefrom, 0, 220, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pressureto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textto))
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pressurefrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pressureto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        if(pressurefrom.getSelectedIndex() == pressureto.getSelectedIndex()){
                    same();
                }
        else{
            if(pressurefrom.getSelectedIndex()==0 && pressureto.getSelectedIndex()==1){
                       Bar_pascal();
                }
            else if(pressurefrom.getSelectedIndex()==0 && pressureto.getSelectedIndex()==2){
                Bar_poundPerSquareinch();
            }
            else if(pressurefrom.getSelectedIndex()==0 && pressureto.getSelectedIndex()==3){
                Bar_StandardAtmosphare();
            }
            else if(pressurefrom.getSelectedIndex()==0 && pressureto.getSelectedIndex()==4){
                Bar_torr();
            }
            else if(pressurefrom.getSelectedIndex()==1 && pressureto.getSelectedIndex()==0){
                pascal_Bar();
            }
            else if(pressurefrom.getSelectedIndex()==1 && pressureto.getSelectedIndex()==2){
                pascal_poundPerSquareinch();
            }
            else if(pressurefrom.getSelectedIndex()==1 && pressureto.getSelectedIndex()==3){
                pascal_StandardAtmosphare();
            }
            else if(pressurefrom.getSelectedIndex()==1 && pressureto.getSelectedIndex()==4){
                pascal_torr();
            }
            else if(pressurefrom.getSelectedIndex()==2 && pressureto.getSelectedIndex()==0){
                poundPerSquareinch_Bar();
            }
            else if(pressurefrom.getSelectedIndex()==2 && pressureto.getSelectedIndex()==1){
                poundPerSquareinch_pascal();
            }
            else if(pressurefrom.getSelectedIndex()==2 && pressureto.getSelectedIndex()==3){
                poundPerSquareinch_StandardAtmosphare();
            }
            else if(pressurefrom.getSelectedIndex()==2 && pressureto.getSelectedIndex()==4){
                poundPerSquareinch_torr();
            }
            else if(pressurefrom.getSelectedIndex()==3 && pressureto.getSelectedIndex()==0){
                StandardAtmosphare_Bar();
            }
            else if(pressurefrom.getSelectedIndex()==3 && pressureto.getSelectedIndex()==1){
                StandardAtmosphare_pascal();
            }else if(pressurefrom.getSelectedIndex()==3 && pressureto.getSelectedIndex()==2){
                StandardAtmosphare_poundPerSquareinch();
            }
            else if(pressurefrom.getSelectedIndex()==3 && pressureto.getSelectedIndex()==4){
                StandardAtmosphare_torr();
            }
            else if(pressurefrom.getSelectedIndex()==4 && pressureto.getSelectedIndex()==0){
                torr_Bar();
            }
            else if(pressurefrom.getSelectedIndex()==4 && pressureto.getSelectedIndex()==1){
                torr_pascal();
            }else if(pressurefrom.getSelectedIndex()==4 && pressureto.getSelectedIndex()==2){
                torr_poundPerSquareinch();
            }
            else if(pressurefrom.getSelectedIndex()==4 && pressureto.getSelectedIndex()==3){
                torr_StandardAtmosphare();
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Converter.object.setVisible(true);
        obj.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void texttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static Pressure obj = null ;
    public static void Pressurefun() {
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
            java.util.logging.Logger.getLogger(Pressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pressure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Pressure().setVisible(true);
                obj = new Pressure();
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pressurefrom;
    private javax.swing.JComboBox<String> pressureto;
    private javax.swing.JTextField textfrom;
    private javax.swing.JTextField textto;
    // End of variables declaration//GEN-END:variables
}
