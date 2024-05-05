
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
public final class Cancelation_RootSelection extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    ResultSet res = null;
    String Date = null;
    int Check = 0;
    
    String User_Name = null;
    String AccountNo = null;
    
    public Cancelation_RootSelection() {
        
        initComponents();
    }
    
    public Cancelation_RootSelection(String User_Name , String AccountNo) {
        
        initComponents();
        
        Date date = new Date();
        this.User_Name = User_Name;
        this.AccountNo = AccountNo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrainName = new javax.swing.JTextField();
        From = new javax.swing.JLabel();
        To = new javax.swing.JLabel();
        FromCombo = new javax.swing.JComboBox<>();
        ToCombo = new javax.swing.JComboBox<>();
        Time = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        Fare = new javax.swing.JTextField();
        MainMenu = new javax.swing.JButton();
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
        MobileNo = new javax.swing.JTextField();
        Next = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        JourneyDate = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Gender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ShowKeyword = new javax.swing.JCheckBox();
        Keyword = new javax.swing.JPasswordField();
        Reset = new javax.swing.JButton();
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
        getContentPane().add(TrainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 30));

        From.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        From.setText("From");
        getContentPane().add(From, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 60, 20));

        To.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        To.setText("To");
        getContentPane().add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 30, 20));

        FromCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Dhaka", "Bhairab Bazar", "Chandpur", "Chittagong", "Dewangong", "Dinajpur", "Khulna", "Kisoregonj", "Lalmonirhat", "Noakhali", "Rajshahi", "Rangpur", "Santahar", "Sirajgong", "Sylhet", "Tarakandi" }));
        FromCombo.setToolTipText("Select Your Departure Station");
        FromCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FromComboMouseClicked(evt);
            }
        });
        FromCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromComboActionPerformed(evt);
            }
        });
        getContentPane().add(FromCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 200, 30));

        ToCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Bhairab Bazar", "Chandpur", "Chittagong", "Dewangong", "Dhaka", "Dinajpur", "Khulna", "Kisoregonj", "Lalmonirhat", "Noakhali", "Rajshahi", "Rangpur", "Santahar", "Sirajgong", "Sylhet", "Tarakandi" }));
        ToCombo.setToolTipText("Select Your Arrival Station");
        ToCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToComboMouseClicked(evt);
            }
        });
        ToCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToComboActionPerformed(evt);
            }
        });
        getContentPane().add(ToCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 200, 30));

        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setEnabled(false);
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, 30));

        Class.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Class.setEnabled(false);
        getContentPane().add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 200, 30));

        Fare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fare.setEnabled(false);
        Fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FareActionPerformed(evt);
            }
        });
        getContentPane().add(Fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 140, 30));

        MainMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MainMenu.setText("Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, 40));

        BogieNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BogieNo.setEnabled(false);
        BogieNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BogieNoActionPerformed(evt);
            }
        });
        getContentPane().add(BogieNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bogie No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Time");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 60, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Train Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 30, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Class");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Mobile_Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fare");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 40, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Passenger Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Age");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 20));
        getContentPane().add(Pass_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 30));
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 30));

        MobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNoActionPerformed(evt);
            }
        });
        getContentPane().add(MobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 200, 30));

        Next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 110, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Keyword");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 20));

        JourneyDate.setEnabled(false);
        getContentPane().add(JourneyDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 30));

        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, 30));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Select>>", "Male", "Female" }));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("/= Taka");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 50, 30));

        ShowKeyword.setBackground(new java.awt.Color(255, 255, 255));
        ShowKeyword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShowKeyword.setText(" Show Keyword");
        ShowKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowKeywordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, 30));

        Keyword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Keyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 30));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 40));

        RootSelectionIcon.setBackground(new java.awt.Color(255, 255, 255));
        RootSelectionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(RootSelectionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        new Menu(User_Name , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void ToComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToComboActionPerformed
        // TODO add your handling code here: 
        TrainName.setText(null);
        Time.setText(null);
        Class.setText(null);
        Fare.setText(null);
        BogieNo.setText(null);
        
        if(FromCombo.getSelectedItem().equals("<<Select>>") || ToCombo.getSelectedItem().equals("<<Select>>"))
        {
        }else if(FromCombo.getSelectedItem().equals(ToCombo.getSelectedItem()))
        {
           JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
           ToCombo.setSelectedIndex(0);
        }
        
        
    }//GEN-LAST:event_ToComboActionPerformed

    private void FromComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromComboActionPerformed
        // TODO add your handling code here:
        TrainName.setText(null);
        Time.setText(null);
        Class.setText(null);
        Fare.setText(null);
        BogieNo.setText(null);
        
        if(FromCombo.getSelectedItem().equals("<<Select>>") || ToCombo.getSelectedItem().equals("<<Select>>"))
        {
        }else if(FromCombo.getSelectedItem().equals(ToCombo.getSelectedItem()))
        {
           JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");
           FromCombo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_FromComboActionPerformed

    private void ToComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToComboMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ToComboMouseClicked

    private void FromComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FromComboMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_FromComboMouseClicked

    private void TrainNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrainNameActionPerformed

    private void MobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileNoActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
       
        if(Pass_Name.getText().isEmpty() || Age.getText().isEmpty() || MobileNo.getText().isEmpty() || Gender.getSelectedItem().equals("<<Select>>") || FromCombo.getSelectedItem().equals("<<Select>>") || ToCombo.getSelectedItem().equals("<<Select>>") || Keyword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter all the information !!!");
        }
        else{
            try{
                   Check = Integer.parseInt(MobileNo.getText());

                   try{
                       Check = Integer.parseInt(Age.getText());
                       
                       if(TrainName.getText().isEmpty() || BogieNo.getText().isEmpty() || Class.getText().isEmpty() || Fare.getText().isEmpty() || JourneyDate.getText().isEmpty() || Time.getText().isEmpty()){
                            JOptionPane.showMessageDialog(null, "There is no any Ticket purchased !!!");
                        }
                        else{
                            new SearchedTicket(MobileNo.getText() , Keyword.getText() , User_Name , AccountNo).setVisible(true);
                            dispose();
                        }
                   }catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Enter the valid Age !");
                   }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Enter a valid Mobile Number !");
            }
        }
        
    }//GEN-LAST:event_NextActionPerformed

    private void BogieNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BogieNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BogieNoActionPerformed

    private void FareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FareActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
        TrainName.setText(null);
        BogieNo.setText(null);            
        JourneyDate.setText(null);            
        Time.setText(null);            
        Class.setText(null);
        Fare.setText(null);
        
        if(Pass_Name.getText().isEmpty() || MobileNo.getText().isEmpty() || Age.getText().isEmpty() || Gender.getSelectedItem().equals("<<Select>>") || Keyword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter all the information !!!");
        }
        else{
            try{
                   Check = Integer.parseInt(MobileNo.getText());

                   try{
                       Check = Integer.parseInt(Age.getText());

                           if(FromCombo.getSelectedItem().equals("<<Select>>") && ToCombo.getSelectedItem().equals("<<Select>>"))
                            {
                              JOptionPane.showMessageDialog(null, "Select the Departure and Arrival Stations !!!");

                            }
                           else if(FromCombo.getSelectedItem().equals(ToCombo.getSelectedItem()))
                            {
                              JOptionPane.showMessageDialog(null, "Departure Station and Arrival Station must be different !!!");

                            }
                            else if(FromCombo.getSelectedItem().equals("<<Select>>"))
                            {
                              JOptionPane.showMessageDialog(null, "Select the Departure Station !!!");

                            }
                            else if(ToCombo.getSelectedItem().equals("<<Select>>"))
                            {
                              JOptionPane.showMessageDialog(null, "Select the Arrival Station !!!");

                            }
                            else{
                           
                                String url="jdbc:mysql://127.0.0.1/ticket";
                                String user="root";
                                String pass="";
                                PreparedStatement ps = null;

                                try{

                                    Connection conn= DriverManager.getConnection(url, user, pass);
                                    Statement stmt=conn.createStatement();
                                    String sql = null;

                                    sql = "select * from ticket_list where Passenger_Name = '"+Pass_Name.getText()+"' and Mobile_Number = '"+MobileNo.getText()+"' and Age = '"+Age.getText()+"' and Gender = '"+Gender.getSelectedItem()+"' and Departure_Station = '"+FromCombo.getSelectedItem()+"' and Arrival_Station = '"+ToCombo.getSelectedItem()+"' and Keyword = '"+Keyword.getText()+"'";
                                    res= stmt.executeQuery(sql); 

                                    while(res.next()){
                                            TrainName.setText(res.getString("Train_Name"));
                                            BogieNo.setText(res.getString("Bogie_No."));            
                                            JourneyDate.setText(res.getString("Date"));            
                                            Time.setText(res.getString("Time"));            
                                            Class.setText(res.getString("Class"));
                                            Fare.setText(res.getString("Fare"));
                                     }

                                }catch(SQLException e){

                                    System.out.println(e);
                                }
                                
                                if(TrainName.getText().isEmpty() || BogieNo.getText().isEmpty() || Class.getText().isEmpty() || Fare.getText().isEmpty() || JourneyDate.getText().isEmpty() || Time.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(null, "There is no any Ticket purchased !!!");
                                }
                            }

                   }catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Enter the valid Age !");
                   }           
               }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Enter a valid Mobile Number !");     
               }
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void ShowKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowKeywordActionPerformed
        // TODO add your handling code here:
        if(ShowKeyword.isSelected())
        {
            Keyword.setEchoChar((char) 0);
        }else{
            Keyword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowKeywordActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        Pass_Name.setText(null);
        MobileNo.setText("01");
        Age.setText(null);
        FromCombo.setSelectedIndex(0);
        ToCombo.setSelectedIndex(0);
        Gender.setSelectedIndex(0);
        TrainName.setText(null);
        Time.setText(null);
        Class.setText(null);
        Fare.setText(null);
        BogieNo.setText(null);
        JourneyDate.setText(null);
        Keyword.setText(null);
        ShowKeyword.setSelected(false);
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(Cancelation_RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancelation_RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancelation_RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancelation_RootSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cancelation_RootSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField BogieNo;
    private javax.swing.JTextField Class;
    private javax.swing.JTextField Fare;
    private javax.swing.JLabel From;
    private javax.swing.JComboBox<String> FromCombo;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField JourneyDate;
    private javax.swing.JPasswordField Keyword;
    private javax.swing.JButton MainMenu;
    private javax.swing.JTextField MobileNo;
    private javax.swing.JButton Next;
    private javax.swing.JTextField Pass_Name;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel RootSelectionIcon;
    private javax.swing.JButton Search;
    private javax.swing.JCheckBox ShowKeyword;
    private javax.swing.JTextField Time;
    private javax.swing.JLabel To;
    private javax.swing.JComboBox<String> ToCombo;
    private javax.swing.JTextField TrainName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private String getString(String fromInput) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void TicketGenerate(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}