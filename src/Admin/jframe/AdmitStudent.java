/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.jframe;

import static Admin.jframe.PendingStudents.*;
import Students.*;
import  java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AdmitStudent extends javax.swing.JFrame {
    private static Student obj;
    public static AdmitStudent admt;
    
    
    
    
    
    //--------------------------------------------------------------------------
    public AdmitStudent(Student obj) throws Exception{
        this.obj=obj;
    }
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    public AdmitStudent() {
        initComponents();
    }
    //--------------------------------------------------------------------------
    
    
    
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel20 = new javax.swing.JLabel();
        admit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        batch = new javax.swing.JTextField();
        programName = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Section = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

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

        jLabel20.setForeground(new java.awt.Color(204, 204, 255));
        jLabel20.setText("Religion");

        admit.setText("Admit");
        admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Batch:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("Section:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(eml, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(rlgn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(admit, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(programName)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Section, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(programName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fathername)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothername))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brthdt)
                        .addComponent(brthmnth)
                        .addComponent(brthyr)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mblnmbr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel6)
                        .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eml)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rlgn)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(admit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    private void admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitActionPerformed
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            admit();
            ResultSet rs=null;
            Statement st=obj.getConnection("institute").createStatement();
            try
            {
                rs=st.executeQuery("Select * from password_manager");
            }
            catch(Exception e){
                st.executeUpdate("create table password_manager(username int, password varchar(45), profession varchar(45));");
            }
            String query="insert into password_manager values("+
                    obj.id+", 'lustudentpass', "+
                    "'Student');";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Student Password is: \"lustudentpass\"");
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(AdmitStudent.class.getName()).log(Level.SEVERE, null, ex);
        }//</editor-fold>
        
    }//GEN-LAST:event_admitActionPerformed
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    public void Show(Student obj)throws Exception{
        this.obj=obj;
        set();
        Statement st=obj.getConnection("institute").createStatement();
        ResultSet rs=st.executeQuery("select nmbrOfPndng from counter where chck=390");
        rs.next();
        int d=rs.getInt("nmbrOfPndng");obj.id=d;
        
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
            java.util.logging.Logger.getLogger(AdmitStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmitStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmitStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmitStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                admt=new AdmitStudent();admt.setVisible(true);
                try {
                    set();
                } catch (Exception ex) {
                    Logger.getLogger(AdmitStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    private void admit()throws Exception{
        get();
        obj.addmember(obj);
        model.removeRow(row);
        admt.setVisible(false);
    }
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    static void set()throws Exception {
        Statement st=obj.getConnection("institute").createStatement();
        ResultSet rs=st.executeQuery("Select lastStudentId from counter where chck=390;");
        rs.next();
        int idd=rs.getInt("lastStudentId");
        id.setText(Integer.toString(idd));
        name.setText(obj.name);
        brthdt.setText(Integer.toString(obj.birthDate));
        brthmnth.setText(Integer.toString(obj.birthMonth));
        brthyr.setText(Integer.toString(obj.birthYear));
        eml.setText(obj.email);
        fathername.setText(obj.fathersName);
        mothername.setText(obj.mothersName);
        mblnmbr.setText(Integer.toString(obj.mobileNumber));
        programName.setText(obj.program);
        gender.setText(obj.gender);
        rlgn.setText(obj.religion);
    }
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    static void get() throws Exception{
        obj.id=Integer.parseInt(id.getText());
        obj.batch = Integer.parseInt(batch.getText());
        obj.name=name.getText();
        obj.birthDate=Integer.parseInt(brthdt.getText());
        obj.birthYear=Integer.parseInt(brthyr.getText());
        obj.birthMonth=Integer.parseInt(brthmnth.getText());
        obj.email=eml.getText();
        obj.fathersName=fathername.getText();
        obj.mothersName=mothername.getText();
        obj.mobileNumber=Integer.parseInt(mblnmbr.getText());
        obj.program=programName.getText();
        obj.gender=gender.getText();
        obj.religion=rlgn.getText();
        obj.section=Section.getText();
        Statement st=obj.getConnection("institute").createStatement();
        st.executeUpdate("update counter set lastStudentId="+Integer.toString(obj.id+1)+" where chck=390;");
        st.close();
        
    }
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    //variables
     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField Section;
    private javax.swing.JButton admit;
    private static javax.swing.JTextField batch;
    private static javax.swing.JTextField brthdt;
    private static javax.swing.JTextField brthmnth;
    private static javax.swing.JTextField brthyr;
    private static javax.swing.JTextField eml;
    private static javax.swing.JTextField fathername;
    private static javax.swing.JTextField gender;
    private static javax.swing.JTextField id;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JTextField mblnmbr;
    private static javax.swing.JTextField mothername;
    private static javax.swing.JTextField name;
    private static javax.swing.JTextField programName;
    private static javax.swing.JTextField rlgn;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    //--------------------------------------------------------------------------
}
