
package MyProject;
import static java.lang.reflect.Array.set;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;


public final class RootSelection extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    ResultSet res = null;
    int Check = 0;
    String JourneyDate = null;
    int DateCheck = 0;
    long Differance = 0;
    long Time_diff = 0;
    long Date_diff = 0;
    String Now = null;
    String Temp_SeatNo = null;
    String SeatNo = null;
    int Passenger_Number = 0 ;
    String User = null;
    String AccountNo = null;
    int Root_Exist = 0;
    
    public RootSelection() {
        
        initComponents();
        
        Date date = new Date();
        DateChooser.getDayChooser().setMinSelectableDate(date);
    }
    
    public RootSelection(String User , String AccountNo) {
        
        initComponents();
        
        Date date = new Date();
        DateChooser.getDayChooser().setMinSelectableDate(date);
        
        this.User = User;
        this.AccountNo = AccountNo;
    }
    
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
            
            sql = "select * from journey_info where Departure_Station= '"+Departure.getSelectedItem()+"' and Arrival_Station='"+Arrival.getSelectedItem()+"'";
            res= stmt.executeQuery(sql);             
            while(res.next()){
                Root_Exist = 1;
            }
            
            if(Departure.getSelectedItem().equals("<<Select>>") || Arrival.getSelectedItem().equals("<<Select>>"))
            {
            }else if(Root_Exist == 0)
            {
                JOptionPane.showMessageDialog(null, "No root is available !!!");
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrainName = new javax.swing.JTextField();
        From = new javax.swing.JLabel();
        To = new javax.swing.JLabel();
        Departure = new javax.swing.JComboBox<>();
        Arrival = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        RootInfo = new javax.swing.JTable();
        Time = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        Fare = new javax.swing.JTextField();
        RootSelectBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassSelection = new javax.swing.JTable();
        BogieNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Pass_Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        MobileNo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Set = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        ShowKeyword = new javax.swing.JCheckBox();
        Keyword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JCalendar();
        jLabel13 = new javax.swing.JLabel();
        Number_of_Tickets = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        RootSelectionIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TrainName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TrainName.setEnabled(false);
        TrainName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainNameActionPerformed(evt);
            }
        });
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 180, 30));

        From.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        From.setText("From");
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        To.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        To.setText("To");
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 30, 20));

        Departure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Dhaka", "Bhairab Bazar", "Chandpur", "Chittagong", "Dewangong", "Dinajpur", "Khulna", "Kisoregonj", "Lalmonirhat", "Noakhali", "Rajshahi", "Rangpur", "Santahar", "Sirajgong", "Sylhet", "Tarakandi" }));
        Departure.setToolTipText("Select Your Departure Station");
        Departure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepartureMouseClicked(evt);
            }
        });
        Departure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureActionPerformed(evt);
            }
        });
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 30));

        Arrival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Bhairab Bazar", "Chandpur", "Chittagong", "Dewangong", "Dhaka", "Dinajpur", "Khulna", "Kisoregonj", "Lalmonirhat", "Noakhali", "Rajshahi", "Rangpur", "Santahar", "Sirajgong", "Sylhet", "Tarakandi" }));
        Arrival.setToolTipText("Select Your Arrival Station");
        Arrival.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArrivalMouseClicked(evt);
            }
        });
        Arrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrivalActionPerformed(evt);
            }
        });
        getContentPane().add(Arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 180, 30));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RootInfoMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(RootInfo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 750, 100));

        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setEnabled(false);
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 180, 30));

        Class.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Class.setEnabled(false);
        Class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassActionPerformed(evt);
            }
        });
        getContentPane().add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 30));

        Fare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fare.setEnabled(false);
        Fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FareActionPerformed(evt);
            }
        });
        getContentPane().add(Fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 90, 30));

        RootSelectBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RootSelectBack.setText("Main Menu");
        RootSelectBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RootSelectBackActionPerformed(evt);
            }
        });
        getContentPane().add(RootSelectBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 140, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 750, 140));

        BogieNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BogieNo.setEnabled(false);
        BogieNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BogieNoActionPerformed(evt);
            }
        });
        getContentPane().add(BogieNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bogie No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Time");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 60, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Train Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Journey Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Class");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Mobile_Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fare");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 40, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Passenger Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Age");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 50, 20));
        getContentPane().add(Pass_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 30));

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 180, 30));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 140, 40));

        MobileNo.setText("01");
        MobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNoActionPerformed(evt);
            }
        });
        getContentPane().add(MobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 180, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel11.setText("Click to Set");
        jPanel1.add(jLabel11);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 240, 40));

        Set.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Set.setText("Set");
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });
        getContentPane().add(Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 140, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Keyword");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 60, 20));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Male", "Female" }));
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 180, 30));

        ShowKeyword.setBackground(new java.awt.Color(255, 255, 255));
        ShowKeyword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShowKeyword.setText("  Show Keyword");
        ShowKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowKeywordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 140, 30));

        Keyword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Keyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeywordActionPerformed(evt);
            }
        });
        getContentPane().add(Keyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 180, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 520, 60));

        DateChooser.setBackground(new java.awt.Color(255, 255, 255));
        DateChooser.setToolTipText("the day more than 1 weak from today");
        getContentPane().add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 370, 170));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Taka / Ticket");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 80, 30));

        Number_of_Tickets.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Number_of_Tickets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        Number_of_Tickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_of_TicketsActionPerformed(evt);
            }
        });
        getContentPane().add(Number_of_Tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 180, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Number of Tickets");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, 20));

        RootSelectionIcon.setBackground(new java.awt.Color(255, 255, 255));
        RootSelectionIcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RootSelectionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(RootSelectionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RootInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RootInfoMouseClicked
        // TODO add your handling code here:
        int i = RootInfo.getSelectedRow();
        TableModel model = RootInfo.getModel();
        TrainName.setText((String) model.getValueAt(i, 1));
        Time.setText((String) model.getValueAt(i, 4));
        
        String url="jdbc:mysql://127.0.0.1/classcategory";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            
            
            if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Chittagong")) || (Departure.getSelectedItem().equals("Chittagong") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakachittagong";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Dinajpur")) || (Departure.getSelectedItem().equals("Dinajpur") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakadinajpur";
          
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Dewangong")) || (Departure.getSelectedItem().equals("Dewangong") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakadewangong";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Sylhet")) || (Departure.getSelectedItem().equals("Sylhet") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakasylhet";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Noakhali")) || (Departure.getSelectedItem().equals("Noakhali") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakanoakhali";
            
            else if((Departure.getSelectedItem().equals("Sylhet") && Arrival.getSelectedItem().equals("Chittagong")) || (Departure.getSelectedItem().equals("Chittagong") && Arrival.getSelectedItem().equals("Sylhet")))
                sql = "select * from chittagongsylhet";
            
            else if((Departure.getSelectedItem().equals("Chandpur") && Arrival.getSelectedItem().equals("Chittagong")) || (Departure.getSelectedItem().equals("Chittagong") && Arrival.getSelectedItem().equals("Chandpur")))
                sql = "select * from chittagongchandpur";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Tarakandi")) || (Departure.getSelectedItem().equals("Tarakandi") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakatarakandi";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Kisoregonj")) || (Departure.getSelectedItem().equals("Kisoregonj") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakakisoregonj";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Bhairab Bazar")) || (Departure.getSelectedItem().equals("Bhairab Bazar") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakabhairabbazar";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Lalmonirhat")) || (Departure.getSelectedItem().equals("Lalmonirhat") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakalalmonirhat";            
            
            else if((Departure.getSelectedItem().equals("Santahar") && Arrival.getSelectedItem().equals("Dinajpur")) || (Departure.getSelectedItem().equals("Dinajpur") && Arrival.getSelectedItem().equals("Santahar")))
                sql = "select * from dinajpursantahar";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Rangpur")) || (Departure.getSelectedItem().equals("Rangpur") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakarangpur";
            
            else if((Departure.getSelectedItem().equals("Dhaka") && Arrival.getSelectedItem().equals("Sirajgong")) || (Departure.getSelectedItem().equals("Sirajgong") && Arrival.getSelectedItem().equals("Dhaka")))
                sql = "select * from dhakasirajgong";
            
            else if((Departure.getSelectedItem().equals("Khulna") && Arrival.getSelectedItem().equals("Rajshahi")) || (Departure.getSelectedItem().equals("Rajshahi") && Arrival.getSelectedItem().equals("Khulna")))
                sql = "select * from khulnarajshahi";
            
            res= stmt.executeQuery(sql); 
            ClassSelection.setModel(DbUtils.resultSetToTableModel(res));
            
                        
            if(Departure.getSelectedItem().equals(Arrival.getSelectedItem()))
            {
                JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
                
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_RootInfoMouseClicked

    private void RootSelectBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RootSelectBackActionPerformed
        // TODO add your handling code here:
        new Menu(User , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RootSelectBackActionPerformed

    private void ClassSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassSelectionMouseClicked
        // TODO add your handling code here:
        int i = ClassSelection.getSelectedRow();
        TableModel model = ClassSelection.getModel();
        BogieNo.setText((String) model.getValueAt(i, 0));
        Class.setText((String) model.getValueAt(i, 1));
        Fare.setText((String) model.getValueAt(i, 2));
        
    }//GEN-LAST:event_ClassSelectionMouseClicked

    private void ArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrivalActionPerformed
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
            
            sql = "select * from journey_info where Departure_Station= '"+Departure.getSelectedItem()+"' and Arrival_Station='"+Arrival.getSelectedItem()+"'";
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            RootExist();
            
            if(Departure.getSelectedItem().equals("<<Select>>") || Arrival.getSelectedItem().equals("<<Select>>"))            {
            }else if(Departure.getSelectedItem().equals(Arrival.getSelectedItem()))            {
                JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
                Arrival.setSelectedIndex(0);
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_ArrivalActionPerformed

    private void DepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureActionPerformed
        // TODO add your handling code here:
        String url="jdbc:mysql://127.0.0.1/trainschedule";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select * from journey_info where Departure_Station= '"+Departure.getSelectedItem()+"' and Arrival_Station='"+Arrival.getSelectedItem()+"'";
            res= stmt.executeQuery(sql); 
            RootInfo.setModel(DbUtils.resultSetToTableModel(res));
            
            RootExist();
            
            if(Departure.getSelectedItem().equals("<<Select>>") || Arrival.getSelectedItem().equals("<<Select>>"))            {
            }else if(Departure.getSelectedItem().equals(Arrival.getSelectedItem()))            {
                JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
                Departure.setSelectedIndex(0);
            }
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }//GEN-LAST:event_DepartureActionPerformed

    private void ArrivalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArrivalMouseClicked
        // TODO add your handling code here:
        TrainName.setText(null);
        Time.setText(null);
        Class.setText(null);
        Fare.setText(null);
        BogieNo.setText(null);
        Number_of_Tickets.setSelectedIndex(0);
        RootInfo.setModel(new DefaultTableModel(null,new String[] {"Schedule_No.","Train","Departure_Station","Arrival_Station","Time"}));
        ClassSelection.setModel(new DefaultTableModel(null,new String[] {"Bogie_No.","Seat_Category","Fare"}));  
    }//GEN-LAST:event_ArrivalMouseClicked

    private void DepartureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepartureMouseClicked
        // TODO add your handling code here:
        TrainName.setText(null);
        Time.setText(null);
        Class.setText(null);
        Fare.setText(null);
        BogieNo.setText(null);
        Number_of_Tickets.setSelectedIndex(0);
        RootInfo.setModel(new DefaultTableModel(null,new String[] {"Schedule_No.","Train","Departure_Station","Arrival_Station","Time"}));
        ClassSelection.setModel(new DefaultTableModel(null,new String[] {"Bogie_No.","Seat_Category","Fare"}));  
    }//GEN-LAST:event_DepartureMouseClicked

    private void TrainNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrainNameActionPerformed

    private void MobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileNoActionPerformed

    @SuppressWarnings({"deprecation", "deprecation", "deprecation"})
    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        
        try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date FirstDate = DateChooser.getDate();
                Date CurrentDate = new Date();
                JourneyDate = sdf.format(DateChooser.getDate());
                
                long diff = Math.abs(CurrentDate.getTime() - FirstDate.getTime());
                Differance = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            
            } catch (Exception ex) {
                System.out.println(ex);
            }
        
        if(Pass_Name.getText().isEmpty() || Age.getText().isEmpty() || MobileNo.getText().isEmpty() || Gender.getSelectedItem().equals("<<Select>>") || TrainName.getText().isEmpty() || Departure.getSelectedItem().equals("<<Select>>") || Arrival.getSelectedItem().equals("<<Select>>") || BogieNo.getText().isEmpty() || Class.getText().isEmpty() || Fare.getText().isEmpty() || Time.getText().isEmpty() || Keyword.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Enter the all the Information !");
       }
       else{
            
            String url="jdbc:mysql://127.0.0.1/ticket";
            String user="root";
            String pass="";
            
            String TName = null;
            String From = null;
            String Temp_Date = null;
            String Temp_Bogie = null;
            int Temp = 0;


            try{
                    Connection conn= DriverManager.getConnection(url, user, pass);
                    Statement stmt=conn.createStatement();
                    String sql;
                    sql = "select * from ticket_list where Train_Name = '"+TrainName.getText()+"' and Departure_Station = '"+(String) Departure.getSelectedItem()+"'";
                    ResultSet res = stmt.executeQuery(sql);

                    while(res.next()){
                        Temp_Date = res.getString("Date");
                        Temp_Bogie = res.getString("Bogie_No.");
                                                
                        if(Temp_Date.equals(JourneyDate) && Temp_Bogie.equals(BogieNo.getText())){
                        
                            String url1="jdbc:mysql://127.0.0.1/ticket";

                            try{

                                    Connection con= DriverManager.getConnection(url, user, pass);
                                    Statement pstmt=con.createStatement();
                                    String sql1;
                                    sql1 = "select * from ticket_list where Date = '"+Temp_Date+"' and Bogie_No. = '"+Temp_Bogie+"'";
                                    ResultSet ress = pstmt.executeQuery(sql);

                                    while(ress.next()){
                                        Temp_SeatNo = ress.getString("Temp_Seat_No.");
                                        Temp = 1;
                                    }

                                }catch(SQLException e){

                                    System.out.println(e);
                                    JOptionPane.showMessageDialog(null, "Error !!!");
                                 }
                        }
                        
                    }
                    
                }catch(SQLException e){

                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Error !!!");
                 }
            
            if(Temp == 0)
            {
                SeatNo = "1";
                Temp_SeatNo = "0";
            }else{
                
                SeatNo = String.valueOf(Integer.parseInt(Temp_SeatNo) + 1);
                
            }
                
            Passenger_Number = Integer.parseInt((String) Number_of_Tickets.getSelectedItem());
            
                if(Number_of_Tickets.getSelectedItem().equals("1")){
                    
                    Temp_SeatNo = SeatNo;
                    
                }else{
                    
                    Temp_SeatNo = String.valueOf(Integer.parseInt(Temp_SeatNo) + Passenger_Number);
                    SeatNo = SeatNo + " - " + Temp_SeatNo;

                }
            
            
            if(Differance >= 6){
                JOptionPane.showMessageDialog(null, "You can't buy the ticket of the day more than 1 week from today !");
            }else{
                try{
                   Check = Integer.parseInt(MobileNo.getText());

                   try{
                       Check = Integer.parseInt(Age.getText());
                           
                           String Temp_Fare = null;
                           Temp_Fare = String.valueOf(Integer.parseInt(Fare.getText()) *  Passenger_Number);
                           
                           if(Integer.parseInt(Temp_SeatNo) < 73){
                                new Payment_Media(User , AccountNo , Pass_Name.getText() , Age.getText() , MobileNo.getText() , (String) Gender.getSelectedItem(), TrainName.getText() , (String) Departure.getSelectedItem() , (String) Arrival.getSelectedItem() , BogieNo.getText() , Class.getText() , Temp_Fare , JourneyDate , Time.getText() , Keyword.getText() , SeatNo , Temp_SeatNo , Passenger_Number).setVisible(true);
                                dispose();
                           }else{
                                JOptionPane.showMessageDialog(null, "The Bogie has already been overloaded !");
                           }

                   }catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Enter the valid Age !");
                   }           
               }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Enter a valid Mobile Number !");     
               }
            }
       }
        
    }//GEN-LAST:event_SetActionPerformed

    private void BogieNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BogieNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BogieNoActionPerformed

    private void ShowKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowKeywordActionPerformed
        // TODO add your handling code here:
        if(ShowKeyword.isSelected())
        {
            Keyword.setEchoChar((char) 0);
        }else{
            Keyword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowKeywordActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void ClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void FareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FareActionPerformed

    private void Number_of_TicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_of_TicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Number_of_TicketsActionPerformed

    private void KeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeywordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeywordActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        Pass_Name.setText(null);
        MobileNo.setText("01");
        Age.setText(null);
        Departure.setSelectedIndex(0);
        Arrival.setSelectedIndex(0);
        Gender.setSelectedIndex(0);
        TrainName.setText(null);
        Time.setText(null);
        Class.setText(null);
        Fare.setText(null);
        BogieNo.setText(null);
        Keyword.setText(null);
        Number_of_Tickets.setSelectedIndex(0);
        ShowKeyword.setSelected(false);
        RootInfo.setModel(new DefaultTableModel(null,new String[] {"Schedule_No.","Train","Departure_Station","Arrival_Station","Time"}));
        ClassSelection.setModel(new DefaultTableModel(null,new String[] {"Bogie_No.","Seat_Category","Fare"}));
    }//GEN-LAST:event_ResetActionPerformed

    private void RootInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RootInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RootInfoMouseEntered

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
            java.util.logging.Logger.getLogger(RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RootSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JComboBox<String> Arrival;
    private javax.swing.JTextField BogieNo;
    private javax.swing.JTextField Class;
    private javax.swing.JTable ClassSelection;
    private com.toedter.calendar.JCalendar DateChooser;
    private javax.swing.JComboBox<String> Departure;
    private javax.swing.JTextField Fare;
    private javax.swing.JLabel From;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JPasswordField Keyword;
    private javax.swing.JTextField MobileNo;
    private javax.swing.JComboBox<String> Number_of_Tickets;
    private javax.swing.JTextField Pass_Name;
    private javax.swing.JButton Reset;
    private javax.swing.JTable RootInfo;
    private javax.swing.JButton RootSelectBack;
    private javax.swing.JLabel RootSelectionIcon;
    private javax.swing.JButton Set;
    private javax.swing.JCheckBox ShowKeyword;
    private javax.swing.JTextField Time;
    private javax.swing.JLabel To;
    private javax.swing.JTextField TrainName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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