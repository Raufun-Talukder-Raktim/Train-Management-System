
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
public final class Information extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    ResultSet res = null;
    String Date = null;
    String Train = null;
    int Root_Exist = 0;
    String User_Name = null;
    String AccountNo = null;
    
    public Information() {
        
        initComponents();        
    }
    
    public Information(String User_Name , String AccountNo) {
        
        initComponents();        
        
        this.User_Name = User_Name;
        this.AccountNo = AccountNo;
                
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            if(Train_Name.getSelectedItem().equals("All")){
                sql = "select * from journey_info";
            }
            else{
                sql = "select * from journey_info where Train = '"+Train_Name.getSelectedItem()+"'";
            }
            
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Train_Name = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        RootInfo = new javax.swing.JTable();
        Arrival = new javax.swing.JTextField();
        MainMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassSelection = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Departure = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        From = new javax.swing.JComboBox<>();
        To = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TrainName = new javax.swing.JTextField();
        Info_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Train_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Train_Name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Subarna Express", "Mohanagar Goduli", "Mohanagar Provati", "Ekota Express", "Tista Express", "Parabat Express", "Upukol Express", "Joyantika Express", "Paharia Express", "Uddayan Express", "Megna Express", "Agnibina Express", "Egarosindhur Provati", "Upaban Express", "Turna Express", "Bharamaputra", "Jamuna Express", "Egarosindhur Goduli", "Lalmoni Express", "Drutojan Express", "Dolonchapa Express", "Rangpur Express", "Kalani Express", "Sirajgong Express", "Kapotaskh express" }));
        Train_Name.setToolTipText("Select any particular Train");
        Train_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Train_NameMouseClicked(evt);
            }
        });
        Train_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Train_NameActionPerformed(evt);
            }
        });
        getContentPane().add(Train_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 200, 30));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 640, 290));

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
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 190, 40));

        ClassSelection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bogie_No.", "Seat_Category", "Fare"
            }
        ));
        ClassSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassSelectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClassSelection);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 640, 140));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Train Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel11.setText("Click to Check");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, -1));

        Departure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Departure.setEnabled(false);
        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 20, 0, 30));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Train Information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 210, -1));

        From.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Dhaka", "Bhairab Bazar", "Chandpur", "Chittagong", "Dewangong", "Dinajpur", "Khulna", "Kisoregonj", "Lalmonirhat", "Noakhali", "Rajshahi", "Rangpur", "Santahar", "Sirajgong", "Sylhet", "Tarakandi" }));
        From.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FromMouseClicked(evt);
            }
        });
        From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromActionPerformed(evt);
            }
        });
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 200, 30));

        To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Dhaka", "Bhairab Bazar", "Chandpur", "Chittagong", "Dewangong", "Dinajpur", "Khulna", "Kisoregonj", "Lalmonirhat", "Noakhali", "Rajshahi", "Rangpur", "Santahar", "Sirajgong", "Sylhet", "Tarakandi" }));
        To.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToMouseClicked(evt);
            }
        });
        To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToActionPerformed(evt);
            }
        });
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("From");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 0, -1));

        Info_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Info_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RootInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RootInfoMouseClicked
        
        int i = RootInfo.getSelectedRow();
        TableModel model = RootInfo.getModel();
        TrainName.setText((String) model.getValueAt(i, 1));
        Train = TrainName.getText();
        
        String url="jdbc:mysql://127.0.0.1/classcategory";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            if((Train.equals("Subarna Express")) || (Train.equals("Mohanagar Goduli")) || (Train.equals("Mohanagar Provati")) || (Train.equals("Turna Express ")))
                sql = "select * from dhakachittagong";
            
            else if((Train.equals("Ekota Express")) || (Train.equals("Drutojan Express")))
                sql = "select * from dhakadinajpur";
          
            else if((Train.equals("Tista Express")) || (Train.equals("Bharamaputra")))
                sql = "select * from dhakadewangong";
            
            else if((Train.equals("Parabat Express")) || (Train.equals("Joyantika Express")) || (Train.equals("Upaban Express")) || (Train.equals("Kalani Express")))
                sql = "select * from dhakasylhet";
            
            else if((Train.equals("Upukol Express")))
                sql = "select * from dhakanoakhali";
            
            else if((Train.equals("Paharia Express")) || (Train.equals("Uddayan Express")))
                sql = "select * from chittagongsylhet";
            
            else if((Train.equals("Megna Express")))
                sql = "select * from chittagongchandpur";
            
            else if((Train.equals("Agnibina Express")))
                sql = "select * from dhakatarakandi";
            
            else if((Train.equals("Egarosindhur Provati ")) || (Train.equals("Egarosindhur Goduli")))
                sql = "select * from dhakakisoregonj";
            
            else if((Train.equals("Jamuna Express")))
                sql = "select * from dhakabhairabbazar";
            
            else if((Train.equals("Lalmoni Express")))
                sql = "select * from dhakalalmonirhat";            
            
            else if((Train.equals("Dolonchapa Express")))
                sql = "select * from dinajpursantahar";
            
            else if((Train.equals("Rangpur Express")))
                sql = "select * from dhakarangpur";
            
            else if((Train.equals("Sirajgong Express")))
                sql = "select * from dhakasirajgong";
            
            else if((Train.equals("Kapotaskh express")))
                sql = "select * from khulnarajshahi";
            
                       
            res= stmt.executeQuery(sql); 
            ClassSelection.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_RootInfoMouseClicked
    
    public void RootExist(){
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            Root_Exist = 0;
            
            sql = "select * from journey_info where Departure_Station= '"+From.getSelectedItem()+"' and Arrival_Station='"+To.getSelectedItem()+"'";
            res= stmt.executeQuery(sql);             
            while(res.next()){
                Root_Exist = 1;
            }
            
            if(From.getSelectedItem().equals("<<Select>>") || To.getSelectedItem().equals("<<Select>>"))
            {
            }else if(Root_Exist == 0)
            {
                JOptionPane.showMessageDialog(null, "No root is available !!!");
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }
    
    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        new Menu(User_Name , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void ClassSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassSelectionMouseClicked
        
        
    }//GEN-LAST:event_ClassSelectionMouseClicked

    private void Train_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Train_NameActionPerformed
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            if(Train_Name.getSelectedItem().equals("All")){
                sql = "select * from journey_info";
            }
            else{
                sql = "select * from journey_info where Train = '"+Train_Name.getSelectedItem()+"'";
            }
            
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
                
        ClassSelection.setModel(new DefaultTableModel(null,new String[] {"Bogie_No.","Seat_Category","Fare"})); 
        
    }//GEN-LAST:event_Train_NameActionPerformed

    private void Train_NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Train_NameMouseClicked
        // TODO add your handling code here:
        From.setSelectedIndex(0);
        To.setSelectedIndex(0);
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
                
        ClassSelection.setModel(new DefaultTableModel(null,new String[] {"Bogie_No.","Seat_Category","Fare"}));  
        
    }//GEN-LAST:event_Train_NameMouseClicked

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureActionPerformed

    private void FromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FromMouseClicked
        // TODO add your handling code here:
        Train_Name.setSelectedIndex(0);
    }//GEN-LAST:event_FromMouseClicked

    private void ToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToMouseClicked
        // TODO add your handling code here:
        Train_Name.setSelectedIndex(0);
    }//GEN-LAST:event_ToMouseClicked

    private void FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select * from journey_info where Departure_Station= '"+From.getSelectedItem()+"' and Arrival_Station='"+To.getSelectedItem()+"'";
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            RootExist();
            
            if(From.getSelectedItem().equals("<<Select>>") || To.getSelectedItem().equals("<<Select>>"))            {
            }else if(From.getSelectedItem().equals(To.getSelectedItem()))            {
                JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
                From.setSelectedIndex(0);
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_FromActionPerformed

    private void ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            int Root_Exist = 0;
            
            sql = "select * from journey_info where Departure_Station= '"+From.getSelectedItem()+"' and Arrival_Station='"+To.getSelectedItem()+"'";
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            RootExist();
            
            if(From.getSelectedItem().equals("<<Select>>") || To.getSelectedItem().equals("<<Select>>"))            {
            }else if(From.getSelectedItem().equals(To.getSelectedItem()))            {
                JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
                To.setSelectedIndex(0);
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_ToActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arrival;
    private javax.swing.JTable ClassSelection;
    private javax.swing.JTextField Departure;
    private javax.swing.JComboBox<String> From;
    private javax.swing.JLabel Info_Icon;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTable RootInfo;
    private javax.swing.JComboBox<String> To;
    private javax.swing.JTextField TrainName;
    private javax.swing.JComboBox<String> Train_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
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