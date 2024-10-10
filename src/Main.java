/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */

import database.Conection;
import database.MethodsUser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtLoginEmail = new javax.swing.JTextField();
        txtLoginPassword = new javax.swing.JPasswordField();
        lblLoginEmail = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartManager");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginRegister.setBackground(new java.awt.Color(153, 153, 153));
        btnLoginRegister.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        btnLoginRegister.setText("Register");
        btnLoginRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnLoginRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 110, 30));

        btnLogin.setBackground(new java.awt.Color(153, 153, 153));
        btnLogin.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        btnLogin.setText("Log in");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 100, 30));

        txtLoginEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        txtLoginEmail.setDoubleBuffered(true);
        txtLoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtLoginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 220, 41));

        txtLoginPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(txtLoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 220, 41));

        lblLoginEmail.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblLoginEmail.setText("E-mail:");
        lblLoginEmail.setToolTipText("");
        lblLoginEmail.setMaximumSize(new java.awt.Dimension(60, 20));
        getContentPane().add(lblLoginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 90, 40));

        lblLoginPassword.setBackground(new java.awt.Color(0, 0, 0));
        lblLoginPassword.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblLoginPassword.setText("Senha:");
        getContentPane().add(lblLoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo01.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_back.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginRegisterActionPerformed
        
        Conection newConn=new Conection();
        newConn.getConnection();
        
        Register newFrame= new Register();        
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            MethodsUser object = new MethodsUser();
            String email=txtLoginEmail.getText();
            String password=txtLoginPassword.getText();
            if (object.login(email, password)) {
                int adminId;
                String adminName;
                adminId=0;
                adminName="";
                adminId=object.getId(email, password);
                adminName=object.getName(email, password);
                MainMenu newFrame=new MainMenu(adminId, adminName);
                newFrame.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Verifique se os campos foram preenchidos corretamente");  
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Verifique se os campos foram preenchidos corretamente");  
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtLoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginEmailActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLoginEmail;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JTextField txtLoginEmail;
    private javax.swing.JPasswordField txtLoginPassword;
    // End of variables declaration//GEN-END:variables
}
