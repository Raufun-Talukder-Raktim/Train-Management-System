
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
public final class Root_Info extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    ResultSet res = null;
    String ScheduleNo = null;
    int Schedule = 0;
    
    public Root_Info() {
        
        initComponents();        
        
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select * from journey_info";
            
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        RootInfo = new javax.swing.JTable();
        MainMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        To = new javax.swing.JTextField();
        TrainName = new javax.swing.JTextField();
        Time = new javax.swing.JTextField();
        From = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Info_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RootInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule_No.", "Train", "Departure_Station", "Arrival_Station", "Time"
            }
        ));
        RootInfo.setToolTipText("");
        RootInfo.setName(""); // NOI18N
        RootInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RootInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RootInfo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 640, 270));

        MainMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 200, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Root Information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 640, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Train Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Arrival Station");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Departure Station");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        To.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 150, 30));

        TrainName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 30));

        Time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 150, 30));

        From.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 30));

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 140, 40));

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 140, 40));

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 140, 40));

        Info_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Info_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RootInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RootInfoMouseClicked
        
        int i = RootInfo.getSelectedRow();
        TableModel model = RootInfo.getModel();
        Schedule = (int) model.getValueAt(i, 0);
        ScheduleNo = String.valueOf(Schedule);
        TrainName.setText((String) model.getValueAt(i, 1));
        From.setText((String) model.getValueAt(i, 2));
        To.setText((String) model.getValueAt(i, 3));
        Time.setText((String) model.getValueAt(i, 4));
    }//GEN-LAST:event_RootInfoMouseClicked
    
    
    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        new AdminMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "delete from journey_info where Schedule_No = '"+ScheduleNo+"'";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.executeUpdate(sql);
            
            sql = "select * from journey_info";
            
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            JOptionPane.showMessageDialog(null, "The selected schedule has been deleted !");
            TrainName.setText("");
            From.setText("");
            To.setText("");
            Time.setText("");
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "insert into journey_info values (null, '"+TrainName.getText()+"' , '"+From.getText()+"' , '"+To.getText()+"' , '"+Time.getText()+"')";
        
            PreparedStatement pstmt = conn.prepareStatement(sql);
                        
            int x = pstmt.executeUpdate(sql);
            
            sql = "select * from journey_info";
            
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            JOptionPane.showMessageDialog(null, "The inserted schedule has been added !");
            TrainName.setText("");
            From.setText("");
            To.setText("");
            Time.setText("");
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "update journey_info set Train = '"+TrainName.getText()+"' where Schedule_No = '"+ScheduleNo+"'";
            stmt.executeUpdate(sql);
            sql = "update journey_info set Departure_Station = '"+From.getText()+"' where Schedule_No = '"+ScheduleNo+"'";
            stmt.executeUpdate(sql);
            sql = "update journey_info set Arrival_Station = '"+To.getText()+"' where Schedule_No = '"+ScheduleNo+"'";
            stmt.executeUpdate(sql);
            sql = "update journey_info set Time = '"+Time.getText()+"' where Schedule_No = '"+ScheduleNo+"'";
            stmt.executeUpdate(sql);
            
            //sql = "update journey_info set Departure_Station = '"+From.getText()+"' and Arrival_Station = '"+To.getText()+"' where Schedule_No = '"+Schedule+"'";
            //stmt.executeUpdate(sql);

            sql = "select * from journey_info";
            
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            JOptionPane.showMessageDialog(null, "The schedule has been updated !");
            TrainName.setText("");
            From.setText("");
            To.setText("");
            Time.setText("");
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Root_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Root_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Root_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Root_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Root_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField From;
    private javax.swing.JLabel Info_Icon;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTable RootInfo;
    private javax.swing.JTextField Time;
    private javax.swing.JTextField To;
    private javax.swing.JTextField TrainName;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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