/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

import java.sql.*;

/**
 *
 * @author Utsho
 */
public class TeacherRoutine extends javax.swing.JDialog {

    /**
     * Creates new form TeacherRoutine
     */
    public TeacherRoutine(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        this.shrt_name = shrt_name;
    }
    static String shrt_name;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        day = new javax.swing.JComboBox<>();
        time = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Routine");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setEditable(false);
        result.setColumns(20);
        result.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        result.setForeground(new java.awt.Color(0, 0, 0));
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, 120));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select day", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 120, 33));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select time", "09_00_AM", "10_00_AM", "11_00_AM", "12_00_PM", "01_00_PM", "02_00_PM" }));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 33));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Select time");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 33));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select day");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 33));

        back.setBackground(getBackground());
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_button.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        search.setBackground(new java.awt.Color(0, 0, 153));
        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 51));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        setSize(new java.awt.Dimension(572, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String dy=day.getSelectedItem().toString();
        String tim=(time.getSelectedItem().toString());
//        String shrt_name="prb";
        try{
            Statement st=getConnection().createStatement();
            ResultSet rs=st.executeQuery("select * from routine where Day='"+dy+"' AND "+tim+" like '*"+shrt_name+"';");rs.next();
            result.setText(rs.getString(tim));
        }
        catch(Exception e)
        {
            result.setText("No class");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed
    Connection getConnection()throws Exception
    {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con=DriverManager.getConnection("jdbc:ucanaccess://routine.accdb");
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void teacherRoutine(String shrt_name) {
        TeacherRoutine.shrt_name = shrt_name;
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
            java.util.logging.Logger.getLogger(TeacherRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TeacherRoutine dialog = new TeacherRoutine(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea result;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
