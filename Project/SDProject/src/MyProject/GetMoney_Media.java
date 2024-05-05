/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

import javax.swing.JOptionPane;

/**
 *
 * @author USER C
 */
public class GetMoney_Media extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Payment
     */
    String Medium = null;
    String MobileNo = null;
    String Keyword = null;
    String User_Name = null;
    String AccountNo = null;
    
    public GetMoney_Media() {
        initComponents();
    }
    
    /**
     *
     * @param Pass_Name
     * @param Age
     * @param MobileNo
     * @param Gender
     * @param TrainName
     * @param Departure
     * @param Arrival
     * @param BogieNo
     * @param Class
     * @param Fare
     * @param JourneyDate
     * @param Time
     * @param Keyword
     */
    public GetMoney_Media(String MobileNo , String Keyword , String GetMoney , String User_Name , String AccountNo) {
        initComponents();
                
        this.MobileNo = MobileNo;
        this.Keyword = Keyword;
        this.GetMoney.setText(GetMoney);
        this.User_Name = User_Name;
        this.AccountNo = AccountNo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BKash = new javax.swing.JButton();
        Nogad = new javax.swing.JButton();
        Rocket = new javax.swing.JButton();
        SureCash = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GetMoney = new javax.swing.JTextField();
        Payment_Title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Payment_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BKash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BKash.jpg"))); // NOI18N
        BKash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKashActionPerformed(evt);
            }
        });
        getContentPane().add(BKash, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 290, -1));

        Nogad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nogad.png"))); // NOI18N
        Nogad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NogadActionPerformed(evt);
            }
        });
        getContentPane().add(Nogad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 290, 160));

        Rocket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rocket.png"))); // NOI18N
        Rocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RocketActionPerformed(evt);
            }
        });
        getContentPane().add(Rocket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 290, 160));

        SureCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SureCash.jpg"))); // NOI18N
        SureCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureCashActionPerformed(evt);
            }
        });
        getContentPane().add(SureCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 290, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("You will get");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("/= taka for the Cancellation");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, 40));

        GetMoney.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GetMoney.setEnabled(false);
        GetMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(GetMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 80, 40));

        Payment_Title.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Payment_Title.setText("Select for the Media to return Money");
        getContentPane().add(Payment_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 34, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 640, 70));

        Payment_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Payment_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BKashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKashActionPerformed
        // TODO add your handling code here:
        
        Medium = "BKash";
        String Secret_Keyword = Keyword;        
        new GetMoneyAccount(Medium , MobileNo , Keyword , GetMoney.getText() , User_Name , AccountNo).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_BKashActionPerformed

    private void NogadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NogadActionPerformed
        // TODO add your handling code here:
        
        Medium = "Nogad";
        String Secret_Keyword = Keyword;        
        new GetMoneyAccount(Medium , MobileNo , Keyword , GetMoney.getText() , User_Name , AccountNo).setVisible(true);
        dispose();
    }//GEN-LAST:event_NogadActionPerformed

    private void RocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RocketActionPerformed
        // TODO add your handling code here:
        
        Medium = "Rocket";
        String Secret_Keyword = Keyword;        
        new GetMoneyAccount(Medium , MobileNo , Keyword , GetMoney.getText() , User_Name , AccountNo).setVisible(true);
        dispose();
    }//GEN-LAST:event_RocketActionPerformed

    private void SureCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureCashActionPerformed
        // TODO add your handling code here:
        
        Medium = "SureCash";
        String Secret_Keyword = Keyword;        
        new GetMoneyAccount(Medium , MobileNo , Keyword , GetMoney.getText() , User_Name , AccountNo).setVisible(true);
        dispose();
    }//GEN-LAST:event_SureCashActionPerformed

    private void GetMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetMoneyActionPerformed

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
            java.util.logging.Logger.getLogger(GetMoney_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetMoney_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetMoney_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetMoney_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetMoney_Media().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKash;
    private javax.swing.JTextField GetMoney;
    private javax.swing.JButton Nogad;
    private javax.swing.JLabel Payment_Icon;
    private javax.swing.JLabel Payment_Title;
    private javax.swing.JButton Rocket;
    private javax.swing.JButton SureCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}