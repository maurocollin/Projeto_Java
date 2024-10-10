
import database.MethodsUser;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class Insert extends javax.swing.JFrame {

    private final int adminId;
    private final String adminName;
    
    /**
     * Creates new form insert
     * @param adminId
     * @param adminName
     */
    public Insert(int adminId, String adminName) {
        initComponents();
        this.adminId=adminId;
        this.adminName=adminName;
    }

    private Insert() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertMenu = new javax.swing.JButton();
        lblInsert = new javax.swing.JLabel();
        txtInsertPhone = new javax.swing.JTextField();
        lblInsertPhone = new javax.swing.JLabel();
        txtInsertEmail = new javax.swing.JTextField();
        lblInsertEmail = new javax.swing.JLabel();
        txtInsertName = new javax.swing.JTextField();
        lblInsertName = new javax.swing.JLabel();
        txtInsertLastName = new javax.swing.JTextField();
        lblInsertLastName = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SmartManager");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnInsertMenu.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        btnInsertMenu.setText("Menu Principal");
        btnInsertMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnInsertMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 130, 30));

        lblInsert.setFont(new java.awt.Font("Century Schoolbook", 3, 36)); // NOI18N
        lblInsert.setForeground(new java.awt.Color(255, 255, 255));
        lblInsert.setText("Adicionar contato");
        getContentPane().add(lblInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtInsertPhone.setBackground(new java.awt.Color(0, 0, 0));
        txtInsertPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtInsertPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(txtInsertPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 243, 217, 41));

        lblInsertPhone.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        lblInsertPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertPhone.setText("Telefone:");
        getContentPane().add(lblInsertPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 221, -1, -1));

        txtInsertEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtInsertEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtInsertEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        getContentPane().add(txtInsertEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 318, 217, 41));

        lblInsertEmail.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        lblInsertEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertEmail.setText("E-mail :");
        getContentPane().add(lblInsertEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 296, -1, -1));

        txtInsertName.setBackground(new java.awt.Color(0, 0, 0));
        txtInsertName.setForeground(new java.awt.Color(255, 255, 255));
        txtInsertName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        txtInsertName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsertNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtInsertName, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 93, 217, 41));

        lblInsertName.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        lblInsertName.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertName.setText("Nome :");
        getContentPane().add(lblInsertName, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 71, -1, -1));

        txtInsertLastName.setBackground(new java.awt.Color(0, 0, 0));
        txtInsertLastName.setForeground(new java.awt.Color(255, 255, 255));
        txtInsertLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        txtInsertLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsertLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtInsertLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 168, 217, 41));

        lblInsertLastName.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        lblInsertLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblInsertLastName.setText("Sobre Nome :");
        getContentPane().add(lblInsertLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 146, -1, -1));

        btnInsert.setBackground(new java.awt.Color(204, 204, 204));
        btnInsert.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        btnInsert.setText("Adicionar Contato");
        btnInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertMenuActionPerformed
        MainMenu newFrame=new MainMenu(adminId, adminName);
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInsertMenuActionPerformed

    private void txtInsertLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsertLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsertLastNameActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try{
            MethodsUser object = new MethodsUser();
            String name=txtInsertName.getText();
            String last_name=txtInsertLastName.getText();
            String email=txtInsertEmail.getText();
            String phone=txtInsertPhone.getText();
            if (object.addContact(name, last_name, email, phone, adminId)) {
                JOptionPane.showMessageDialog(null,"O usuário foi adicionado com sucesso");  
            }
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtInsertNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsertNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsertNameActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsertMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInsert;
    private javax.swing.JLabel lblInsertEmail;
    private javax.swing.JLabel lblInsertLastName;
    private javax.swing.JLabel lblInsertName;
    private javax.swing.JLabel lblInsertPhone;
    private javax.swing.JTextField txtInsertEmail;
    private javax.swing.JTextField txtInsertLastName;
    private javax.swing.JTextField txtInsertName;
    private javax.swing.JTextField txtInsertPhone;
    // End of variables declaration//GEN-END:variables
}
