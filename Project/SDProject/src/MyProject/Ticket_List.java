
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
public final class Ticket_List extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    ResultSet res = null;
    String Date = null;
    String Train = null;
    int Root_Exist = 0;
    
    public Ticket_List() {
        
        initComponents();        
        
        String url="jdbc:mysql://127.0.0.1/ticket";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select Ticket_No , User_Name , Account_No , Number_of_Tickets , Type from all_tickets";
            
            res= stmt.executeQuery(sql); 
            TicketTable1.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TicketTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TicketTable1 = new javax.swing.JTable();
        Arrival = new javax.swing.JTextField();
        MainMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TicketTable2 = new javax.swing.JTable();
        Departure = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TicketTable4 = new javax.swing.JTable();
        TrainName = new javax.swing.JTextField();
        Info_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("List of Tickets");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 640, 70));

        TicketTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Train_Name", "Departure_Station", "Arrival_Station", "Bogie_No."
            }
        ));
        jScrollPane3.setViewportView(TicketTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 640, 50));

        TicketTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket_No.", "User_Name", "Account_No.", "Number_of_Tickets", "Type"
            }
        ));
        TicketTable1.setToolTipText("");
        TicketTable1.setName(""); // NOI18N
        TicketTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TicketTable1);
        if (TicketTable1.getColumnModel().getColumnCount() > 0) {
            TicketTable1.getColumnModel().getColumn(3).setResizable(false);
            TicketTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 640, 150));

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
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 190, 40));

        TicketTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger_Name", "Age", "Mobile_Number", "Gender", "Keyword"
            }
        ));
        TicketTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TicketTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 640, 50));

        Departure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Departure.setEnabled(false);
        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 20, 0, 30));

        TicketTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat_No.", "Class", "Fare", "Date", "Time"
            }
        ));
        jScrollPane4.setViewportView(TicketTable4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 640, 60));
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 0, -1));

        Info_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Info_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TicketTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketTable1MouseClicked
        
        int i = TicketTable1.getSelectedRow();
        TableModel model = TicketTable1.getModel();
        TrainName.setText((String) model.getValueAt(i, 0));
        String Ticket_No = TrainName.getText();
        
        String url="jdbc:mysql://127.0.0.1/ticket";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = "select Passenger_Name , Age , Mobile_Number , Gender , Keyword from all_tickets where Ticket_No = '"+Ticket_No+"'";
            
            res= stmt.executeQuery(sql); 
            TicketTable2.setModel(DbUtils.resultSetToTableModel(res));
            
            sql = "select Train_Name , Departure_Station , Arrival_Station , Bogie_No from all_tickets where Ticket_No = '"+Ticket_No+"'";
            
            res= stmt.executeQuery(sql); 
            TicketTable3.setModel(DbUtils.resultSetToTableModel(res));
            
            sql = "select Seat_No , Class , Fare , Date , Time from all_tickets where Ticket_No = '"+Ticket_No+"'";
            
            res= stmt.executeQuery(sql); 
            TicketTable4.setModel(DbUtils.resultSetToTableModel(res));
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_TicketTable1MouseClicked
    
       
    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        new AdminMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureActionPerformed

    private void TicketTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketTable2MouseClicked

    }//GEN-LAST:event_TicketTable2MouseClicked

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
            java.util.logging.Logger.getLogger(Ticket_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Ticket_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arrival;
    private javax.swing.JTextField Departure;
    private javax.swing.JLabel Info_Icon;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTable TicketTable1;
    private javax.swing.JTable TicketTable2;
    private javax.swing.JTable TicketTable3;
    private javax.swing.JTable TicketTable4;
    private javax.swing.JTextField TrainName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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