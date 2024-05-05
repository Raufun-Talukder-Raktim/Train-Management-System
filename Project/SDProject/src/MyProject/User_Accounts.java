
package MyProject;
import static java.lang.reflect.Array.set;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER C
 */
public final class User_Accounts extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    ResultSet res = null;
    String Date = null;
    String Train = null;
    int Root_Exist = 0;
    
    public User_Accounts() {
        
        initComponents();        
        
        String url="jdbc:mysql://127.0.0.1/useracconts";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select * from account";
            res= stmt.executeQuery(sql); 
            UserAccounts.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserAccounts = new javax.swing.JTable();
        Arrival = new javax.swing.JTextField();
        MainMenu = new javax.swing.JButton();
        Departure = new javax.swing.JTextField();
        TrainName = new javax.swing.JTextField();
        Info_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("User Accounts");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 640, 70));

        UserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial_No.", "Account_No.", "Full_Name", "User_Name", "Password", "Gender", "Email", "Mobile_Number"
            }
        ));
        UserAccounts.setToolTipText("");
        UserAccounts.setName(""); // NOI18N
        UserAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserAccountsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(UserAccounts);
        if (UserAccounts.getColumnModel().getColumnCount() > 0) {
            UserAccounts.getColumnModel().getColumn(3).setResizable(false);
            UserAccounts.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 700, 190));

        Arrival.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Arrival.setEnabled(false);
        getContentPane().add(Arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 0, 30));

        MainMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 190, 40));

        Departure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Departure.setEnabled(false);
        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 20, 0, 30));
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 0, -1));

        Info_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Info_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserAccountsMouseClicked

    }//GEN-LAST:event_UserAccountsMouseClicked
    
    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        new AdminMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureActionPerformed

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
            java.util.logging.Logger.getLogger(User_Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                new User_Accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arrival;
    private javax.swing.JTextField Departure;
    private javax.swing.JLabel Info_Icon;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTextField TrainName;
    private javax.swing.JTable UserAccounts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private String getString(String fromInput) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void TicketGenerate(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getText(String format) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}