
package Students.Jframe;

import Login.Login;
import Students.Student;
import java.util.logging.Level;
import java.sql.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Admission extends javax.swing.JFrame {

    public Admission() {
        obj=new Student();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Student obj;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mothername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        brthdt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        mblnmbr = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        eml = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        rlgn = new javax.swing.JTextField();
        brthmnth = new javax.swing.JTextField();
        brthyr = new javax.swing.JTextField();
        ProgramName = new javax.swing.JComboBox<>();
        gndr = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Program Name:");

        name.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setToolTipText("");
        name.setName(""); // NOI18N

        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Name:");

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Father's Name:");

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Mother's Name:");

        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setText("Date of Birth(dd/mm/yy)");

        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setText("Mobile Number");

        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18.setText("Email:");

        jLabel19.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19.setText("Gender");

        rlgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlgnActionPerformed(evt);
            }
        });

        ProgramName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BBA(Hons)", "BA(Hons) in English", "B.Sc(Hons) in CSE", "B.Sc(Hons) in EEE LL.B(Hons)", "Bachelor of Architechture", "B.Sc in Civil Engineering", "B A(Hons) in Iislamic Studies", "Bachelor of Tourism & Hospitality Management", "B A(Hons) in Bangla" }));
        ProgramName.setAutoscrolls(true);

        gndr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText("Religion");

        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        back.setBackground(getBackground());
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_button.png"))); // NOI18N
        back.setBorder(null);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(done)
                                .addGap(120, 120, 120))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rlgn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gndr, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eml, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name)
                                    .addComponent(fathername)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(brthdt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(brthmnth, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(brthyr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mothername, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mblnmbr)
                                    .addComponent(ProgramName, 0, 1, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(153, 153, 153))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel16, jLabel18, jLabel19, jLabel2, jLabel3, jLabel4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fathername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothername))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(brthdt)
                    .addComponent(brthmnth)
                    .addComponent(brthyr)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mblnmbr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eml))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gndr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rlgn)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(done)
                .addGap(38, 38, 38))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {brthdt, jLabel1});

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="done method"> 
    void done()throws Exception{
        
        Statement st=st = obj.getConnection("institute").createStatement();
        ResultSet rs=null;
        try{
            rs=st.executeQuery("select nmbrOfPndng from counter where chck=390");
            rs.next();
        }
        catch(Exception ex)
        {
            st.executeUpdate("Create table counter(nmbrOfPndng int, lastStudentId int, lastTeacherId int, chck int);");
            st.executeUpdate("insert into counter values(1, 1, 1, 390);");
            rs=st.executeQuery("select nmbrOfPndng from counter where chck=390");
            rs.next();
        }
        try {
            obj.program=ProgramName.getSelectedItem().toString();
            System.out.println(obj.program);
            obj.name=name.getText();
            obj.admissionId=rs.getInt("nmbrOfPndng");
            obj.fathersName=fathername.getText();
            obj.mothersName=mothername.getText();
            obj.birthDate=Integer.parseInt(brthdt.getText().toString());
            obj.birthMonth=Integer.parseInt(brthmnth.getText());
            obj.birthYear=Integer.parseInt(brthyr.getText());
            obj.mobileNumber=Integer.parseInt(mblnmbr.getText());
            obj.email=eml.getText();
            obj.gender=gndr.getSelectedItem().toString();
            obj.religion=rlgn.getText();
            obj.addToPending(obj);
            st.executeUpdate("update counter set nmbrOfPndng="+(obj.admissionId+1)+" where chck=390");
        } catch (Exception ex) {
            
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"Please Input in correct format!"+ex);
        }
    }
    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        try {
            done();
            JOptionPane.showMessageDialog(null, "Submited. Wait for admin to confirm.");
        } catch (Exception ex) {
            Logger.getLogger(Admission.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_doneActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void rlgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlgnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rlgnActionPerformed
    //</editor-fold>
    //------------------------------------------------------------------------------------------
    
    
    //------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Main method"> 
    public static void registration() {
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
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Admission().setVisible(true);
            }
        });
    }
     //</editor-fold>
    //------------------------------------------------------------------------------------------

    
    
    
    //------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="variables declaration"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ProgramName;
    private javax.swing.JButton back;
    private javax.swing.JTextField brthdt;
    private javax.swing.JTextField brthmnth;
    private javax.swing.JTextField brthyr;
    private javax.swing.JButton done;
    private javax.swing.JTextField eml;
    private javax.swing.JTextField fathername;
    private javax.swing.JComboBox<String> gndr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mblnmbr;
    private javax.swing.JTextField mothername;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rlgn;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    //------------------------------------------------------------------------------------------
}
