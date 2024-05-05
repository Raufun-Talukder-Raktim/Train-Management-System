/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

/**
 *
 * @author Rafi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class SignUP extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    /**
     * Creates new form signup
     */
    String Accont_Number = null;
    public SignUP() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register_gender = new javax.swing.JComboBox<>();
        jpanelsignup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        L_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        F_Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        MobileNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        close = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ShowPassword = new javax.swing.JCheckBox();
        ShowConPassword = new javax.swing.JCheckBox();
        Password = new javax.swing.JPasswordField();
        ConPassword = new javax.swing.JPasswordField();

        register_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelsignup.setBackground(new java.awt.Color(255, 255, 255));
        jpanelsignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setText("Register a new Account");
        jpanelsignup.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jpanelsignup.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        L_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_NameActionPerformed(evt);
            }
        });
        jpanelsignup.add(L_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 245, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name *");
        jpanelsignup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));
        jpanelsignup.add(F_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 233, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Username *");
        jpanelsignup.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jpanelsignup.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 233, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gender *");
        jpanelsignup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email Address");
        jpanelsignup.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jpanelsignup.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 233, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mobile number");
        jpanelsignup.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Male", "Female" }));
        jpanelsignup.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 150, 240, 31));

        MobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNoActionPerformed(evt);
            }
        });
        jpanelsignup.add(MobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 243, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Password *");
        jpanelsignup.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Confimation Password *");
        jpanelsignup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jpanelsignup.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 90, 37));

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jpanelsignup.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 92, 39));

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jpanelsignup.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 85, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/train.jpg"))); // NOI18N
        jpanelsignup.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 21, -1, 40));

        ShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        jpanelsignup.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 167, -1));

        ShowConPassword.setBackground(new java.awt.Color(255, 255, 255));
        ShowConPassword.setText("Show Confirmation Password");
        ShowConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowConPasswordActionPerformed(evt);
            }
        });
        jpanelsignup.add(ShowConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jpanelsignup.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 233, 31));
        jpanelsignup.add(ConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 243, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelsignup, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelsignup, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileNoActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void L_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_NameActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        new SignIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        F_Name.setText("");
        L_Name.setText("");
        UserName.setText("");
        Email.setText("");
        MobileNo.setText("");
        Password.setText("");
        ConPassword.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
                
        if(F_Name.getText().isEmpty() || UserName.getText().isEmpty() || Gender.getSelectedItem().equals("<<Select>>") || (Email.getText().isEmpty() && MobileNo.getText().isEmpty()) || Password.getText().isEmpty() || ConPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter the all the Information !");
        }else if(UserName.getText().equals("Admin")){
            JOptionPane.showMessageDialog(null, "This user name is not valid for user !");
        }else if(Password.getText().equals(ConPassword.getText())){
            try{
                long mobileno = Integer.parseInt(MobileNo.getText());
                
                String Full_Name = F_Name.getText() + " " + L_Name.getText();
                String url="jdbc:mysql://127.0.0.1/useracconts";
                String user="root";
                String pass="";
                
                PreparedStatement ps = null;

                try{

                    Connection conn= DriverManager.getConnection(url, user, pass);
                    Statement stmt=conn.createStatement();
                    String sql;
                    sql = "select * from account";
                    ResultSet res = stmt.executeQuery(sql);
                    int Account_Serial = 100001;
                    
                    while(res.next()){
                        Accont_Number = res.getString("Serial_No.");
                        Account_Serial = 0;
                    }

                    if(Account_Serial == 100001)
                    {
                        Accont_Number = "BR_UA" + String.valueOf(Account_Serial);
                    }
                    else
                    {
                        Account_Serial = Integer.parseInt(Accont_Number);   
                        Accont_Number = "BR_UA" + String.valueOf(Account_Serial + 100001);
                    }
                    System.out.println(Accont_Number);

                }catch(SQLException e){

                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Error !!!");
                 }
                
                try{

                    Connection conn= DriverManager.getConnection(url, user, pass);

                    String sql;
                    
                    sql = "insert into account values (null , '"+Accont_Number+"' , '"+Full_Name+"' , '"+UserName.getText()+"' , '"+Password.getText()+"' ,'"+Gender.getSelectedItem()+"' ,'"+Email.getText()+"' ,'"+MobileNo.getText()+"')";
            
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                        
                    int x = pstmt.executeUpdate(sql);
                    String AccountNo = null;
                    
                    JOptionPane.showMessageDialog(null, "Your account has been created");
                    
                    new Menu(UserName.getText() , Accont_Number).setVisible(true);
                    dispose();

                }catch(SQLException e){

                    JOptionPane.showMessageDialog(null, e);
                    System.out.println(e);

                }
            }catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Enter a valid mobile number !");
                    System.out.println(e);

                }
        }else{
            JOptionPane.showMessageDialog(null, "Password & Confimation Password must be same !");
        }
    }//GEN-LAST:event_signupActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if(ShowPassword.isSelected())
        {
            Password.setEchoChar((char) 0);
        }else{
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void ShowConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowConPasswordActionPerformed
        if(ShowConPassword.isSelected())
        {
            ConPassword.setEchoChar((char) 0);
        }else{
            ConPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowConPasswordActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConPassword;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField F_Name;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField L_Name;
    private javax.swing.JTextField MobileNo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox ShowConPassword;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpanelsignup;
    private javax.swing.JComboBox<String> register_gender;
    private javax.swing.JButton reset;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
