/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package orderApp.components.login;
import java.util.regex.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import orderApp.Main;
/**
 *
 * @author JOHN-RONAN S. BEIRA
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        jPanel1 = new javax.swing.JPanel();
        passwordText = new javax.swing.JPasswordField();
        usernameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 220));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(330, 190));
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, 30));

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        jPanel1.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 100, 30));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 30));

        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 30));

        loginButton.setText("Login");
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 80, -1));

        signUpButton.setText("Sign Up");
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        JLabel outputMessageTags;
        String inputtedUsername = usernameText.getText().trim();
        String inputtedPassword;
       

        boolean usernameIsNotEmpty = false;
        boolean usernameIsEmail = validEmailVerification(inputtedUsername);
        boolean usernameExist = false;
        
       
        //get the password
        char passwordArray[] = passwordText.getPassword();
        inputtedPassword = new String(passwordArray);   
        
        //validate username inpute: username or email
        if (usernameText.getText().equals("")){
            outputMessageTags = new JLabel("Username cannot be blank.", SwingConstants.CENTER);
            JOptionPane.showMessageDialog(this, outputMessageTags, "Blank Username", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            usernameIsNotEmpty = true;
            usernameExist = usernamePassExist(inputtedUsername, inputtedPassword);
           
        }
        
        if(usernameIsNotEmpty && !usernameIsEmail && usernameExist){
            System.out.print("successfully login using username");
            return;
        } else {
            if(!usernameIsEmail){
            JOptionPane.showMessageDialog(this, "You have inputted an invalid Email Address. Try again.", "Invalid Email", JOptionPane.ERROR_MESSAGE);
            } else if (emailPassExist(inputtedUsername, inputtedPassword)){
                System.out.print("successfully login using email");
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
        passwordText.requestFocus();
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
        loginButton.doClick();
    }//GEN-LAST:event_passwordTextActionPerformed
    
    private boolean validEmailVerification(String inputEmail){
        String inputEmailRegEx = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(inputEmailRegEx);
        if(inputEmail == null){
            return false;
        }
        return pat.matcher(inputEmail).matches();
    }
    
    private boolean usernamePassExist(String inputUsername, String inputPassword){
        
        
        for(int i = 0; i < Main.MAX_ACCOUNTS; i++){
            
            if(Main.account[i].getUsername() == null){
                break;
            }
            if(inputUsername.equals(Main.account[i].getUsername()) && inputPassword.equals(Main.account[i].getPassword())){
                return true;
            }
         }
        
        return false;
    }
    
    private boolean emailPassExist(String inputEmail, String inputPassword){
        
        
        for(int i = 0; i < Main.MAX_ACCOUNTS; i++){
            
        
            if(Main.account[i].getEmail() == null){
                break;
            }
            if(inputEmail.equals(Main.account[i].getEmail()) && inputPassword.equals(Main.account[i].getPassword())){
                return true;
            }
         }
        
        return false;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
