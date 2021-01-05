import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;

public class Frame2_LoginManager extends javax.swing.JFrame {

    public Frame2_LoginManager() {
        initComponents();
        
        //Set image of button
        String linkImageButton1 = "src/main/java/com/mycompany/librarygui/Library_Icons/icons8-back_1.png";
        Image im = Toolkit.getDefaultToolkit().createImage(linkImageButton1);
        im = im.getScaledInstance(btnBack1.getWidth(), btnBack1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(im);
        btnBack1.setIcon(ii);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        btnForgotPW = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 113, 164));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bgKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager");

        textFieldUsername.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        textFieldUsername.setBorder(null);
        textFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsernameActionPerformed(evt);
            }
        });
        textFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldUsernameKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 122, 255));
        btnLogin.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnCreateAccount.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(0, 122, 255));
        btnCreateAccount.setText("Create an account");
        btnCreateAccount.setBorderPainted(false);
        btnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseExited(evt);
            }
        });
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnForgotPW.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        btnForgotPW.setForeground(new java.awt.Color(64, 156, 255));
        btnForgotPW.setText("Forgot password?");
        btnForgotPW.setBorder(null);
        btnForgotPW.setBorderPainted(false);
        btnForgotPW.setContentAreaFilled(false);
        btnForgotPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnForgotPWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnForgotPWMouseExited(evt);
            }
        });
        btnForgotPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPWActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(0.0F);
        jSeparator1.setAlignmentY(0.0F);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setAlignmentY(0.0F);

        passwordField.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        btnBack.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\Library-Management-Official-\\LibraryGUI\\src\\main\\java\\com\\mycompany\\librarygui\\Library_Icons\\icons8-back_1.png")); // NOI18N
        btnBack1.setBorderPainted(false);
        btnBack1.setContentAreaFilled(false);
        btnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack1MouseExited(evt);
            }
        });
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnForgotPW)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(textFieldUsername)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(passwordField)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnForgotPW)
                .addGap(67, 67, 67)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateAccount)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = textFieldUsername.getText();
        String pass = String.valueOf(passwordField.getPassword());

        if(ManageData.getManageData().checkLoginManager(ManageData.getManageData().allManager, username, pass)==1){
            ManageData.getManageData().setWho_is_using_this_program(username);
            this.dispose();
            Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
            frame6.setVisible(true);
            ManageData.getManageData().setType_of_user_using_this_program("manager");
        }
        else{
            if(username.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter your username!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame4_RegisterManager frame4 = new Frame4_RegisterManager();
        frame4.setVisible(true);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnForgotPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPWActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame18_ForgotPassword frame18 = new Frame18_ForgotPassword();
        frame18.setVisible(true);
    }//GEN-LAST:event_btnForgotPWActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(0, 64, 221));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(0, 122, 255));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnCreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseEntered
        // TODO add your handling code here:
        btnCreateAccount.setBackground(new Color(20, 142, 255));
        btnCreateAccount.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCreateAccountMouseEntered

    private void btnCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseExited
        // TODO add your handling code here:
        btnCreateAccount.setBackground(new Color(255, 255, 255));
        btnCreateAccount.setForeground(new Color(0,122,255));
    }//GEN-LAST:event_btnCreateAccountMouseExited

    private void btnForgotPWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPWMouseEntered
        // TODO add your handling code here:
        btnForgotPW.setForeground(new Color(0, 122, 255));
    }//GEN-LAST:event_btnForgotPWMouseEntered

    private void btnForgotPWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPWMouseExited
        // TODO add your handling code here:
        btnForgotPW.setForeground(new Color(64, 156, 255));
    }//GEN-LAST:event_btnForgotPWMouseExited

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
        frame7.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = textFieldUsername.getText();
            String pass = String.valueOf(passwordField.getPassword());
            if(ManageData.getManageData().checkLoginManager(ManageData.getManageData().allManager, username, pass)==1){
                ManageData.getManageData().setWho_is_using_this_program(username);
                this.dispose();
                Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
                frame6.setVisible(true);
                ManageData.getManageData().setType_of_user_using_this_program("manager");
            }
            else{
                if(username.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter your username!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
                }
            }
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void textFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = textFieldUsername.getText();
            String pass = String.valueOf(passwordField.getPassword());
            if(ManageData.getManageData().checkLoginManager(ManageData.getManageData().allManager, username, pass)==1){
                ManageData.getManageData().setWho_is_using_this_program(username);
                this.dispose();
                Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
                frame6.setVisible(true);
                ManageData.getManageData().setType_of_user_using_this_program("manager");
            }
            else{
                if(username.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter your username!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
                }
            }
        }
    }//GEN-LAST:event_textFieldUsernameKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = textFieldUsername.getText();
            String pass = String.valueOf(passwordField.getPassword());
            if(ManageData.getManageData().checkLoginManager(ManageData.getManageData().allManager, username, pass)==1){
                ManageData.getManageData().setWho_is_using_this_program(username);
                this.dispose();
                Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
                frame6.setVisible(true);
                ManageData.getManageData().setType_of_user_using_this_program("manager");
            }
            else{
                if(username.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter your username!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong password, please type again!");
                }
            }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void bgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgKeyPressed

    private void btnBack1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBack1MouseEntered

    private void btnBack1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBack1MouseExited

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Frame1_Intro frame1 = new Frame1_Intro();
        frame1.setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2_LoginManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2_LoginManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnForgotPW;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
