package orderApp.components.login;

import java.util.regex.*;
import javax.swing.*;
import orderApp.Main;
import orderApp.components.login.FileRW;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpForm = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameSignUpText = new javax.swing.JTextField();
        emailSignUpText = new javax.swing.JTextField();
        passwordSignUpText = new javax.swing.JPasswordField();
        signUp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        passwordText = new javax.swing.JPasswordField();
        usernameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();

        signUpForm.setMinimumSize(new java.awt.Dimension(330, 220));
        signUpForm.setModal(true);
        signUpForm.setResizable(false);
        signUpForm.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Email");
        signUpForm.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel4.setText("Username");
        signUpForm.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel5.setText("Password");
        signUpForm.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));
        signUpForm.getContentPane().add(usernameSignUpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 90, -1));
        signUpForm.getContentPane().add(emailSignUpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 90, -1));
        signUpForm.getContentPane().add(passwordSignUpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 90, -1));

        signUp.setText("Sign Up");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        signUpForm.getContentPane().add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 90, -1));

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
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 80, -1));

        signUpButton.setText("Sign Up");
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        signUpForm.setVisible(true);
    }//GEN-LAST:event_signUpButtonMouseClicked

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        
        boolean isUsernameUnique = false;
        boolean isEmailUnique = false;
        boolean isEmailValid = false;
        String username = usernameSignUpText.getText();
        String email = emailSignUpText.getText();
        String password;
        
        
        char passwordArray[] = passwordSignUpText.getPassword();
        password = new String(passwordArray);  
        
        isUsernameUnique = usernameExist(username);
        isEmailValid = validEmailVerification(email);
        isEmailUnique = emailExist(email);
        
        //check if the fields is not empty
        
        if(!isUsernameUnique && !isEmailUnique && !isEmailValid){
            
            System.out.print("Email and Username is Invalid \n");
        }
        
        if(!isEmailValid){
            System.out.print("Email is not valid \n");
        }
        if(isUsernameUnique && !isEmailUnique && !isEmailValid){
            
            System.out.print("Username is Taken \n");
        }
        
        if(!isEmailUnique && isEmailValid){
            
            System.out.print("Email is already in use \n");
        }
       
        
        if (isUsernameUnique && isEmailUnique && isEmailValid){
            
            for(int i = 0; i < Main.MAX_ACCOUNTS; i++){
                
                if(Main.END_LINE.equals(Main.account[i].getUsername())){
                    Main.account[i].setUsername(username);
                    Main.account[i].setEmail(email);
                    Main.account[i].setPassword(password);
                    Main.account[i].setRole("member"); // permissions- need to revise this.
                    Main.account[i + 1].setUsername(Main.END_LINE);
                    FileRW.fileWrite();
                    break;
                }
                
                
            }
            
            signUpForm.setVisible(false);
           
        }
        
        
        
        
        
    }//GEN-LAST:event_signUpMouseClicked

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
        passwordText.requestFocus();
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
        loginButton.doClick();
    }//GEN-LAST:event_passwordTextActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
            JLabel outputMessageTags;
        String inputtedUsername = usernameText.getText().trim();
        String inputtedPassword = null;
        String role = null;
        boolean usernameIsNotEmpty = false;
        boolean usernameIsEmail = validEmailVerification(inputtedUsername);
        boolean usernameExist = false;
        boolean emailExist = false;
       
        //get the password
        char passwordArray[] = passwordText.getPassword();
        inputtedPassword = new String(passwordArray);   
        
        // get the role
        
        if(inputtedUsername != null && inputtedPassword != null){
            
            role = getRole(inputtedUsername, inputtedUsername, inputtedPassword);
        }
        
        
        //validate username inpute: username or email
        if (usernameText.getText().equals("")){
            outputMessageTags = new JLabel("Username cannot be blank.", SwingConstants.CENTER);
            JOptionPane.showMessageDialog(this, outputMessageTags, "Blank Username", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            usernameIsNotEmpty = true;
            usernameExist = usernamePassExist(inputtedUsername, inputtedPassword);
           
        }
        
        if(usernameIsNotEmpty && !usernameIsEmail && usernameExist && role != null){
            System.out.print("successfully login using username");

            
            //if the user is admin, then the admin menu will popup 
            //    else the member menu.
  
            if(role.equals(Main.SuperAdminRole)){
                Main.mainAdminForm();
            } else {
                Main.mainMemberForm();
            }
            
            Main.loginForm();

            return;
        }
      
        if (usernameIsNotEmpty && usernameIsEmail && emailPassExist(inputtedUsername, inputtedPassword)){
            emailExist = true;
            System.out.print("successfully login using email");

             //if the user is admin, then the admin menu will popup 
            //    else the member menu.
           
             if(role.equals(Main.SuperAdminRole)){
                Main.mainAdminForm();
            } else {
                Main.mainMemberForm();
            }
             
            Main.loginForm();
            return;
        }
        
       
        if (usernameIsNotEmpty && !usernameIsEmail && !usernameExist){
            JOptionPane.showMessageDialog(this, "You have inputted an invalid Email Address or Username. Try again.", "Invalid Email or Username", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    
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
            
            if(Main.END_LINE.equals(Main.account[i].getUsername())){
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
            
        
            if(Main.END_LINE.equals(Main.account[i].getUsername())){
                break;
            }
            if(inputEmail.equals(Main.account[i].getEmail()) && inputPassword.equals(Main.account[i].getPassword())){
                return true;
            }
         }
        
        return false;
        
    }
    
    private boolean usernameExist(String inputUsername){
        
        
        for(int i = 0; i < Main.MAX_ACCOUNTS; i++){
            
            if(Main.END_LINE.equals(Main.account[i].getUsername())){
                break;
            }
            if(inputUsername.equals(Main.account[i].getUsername())){
                return false;
            }
         }
        
        return true;
    }
    
      private boolean emailExist(String inputEmail){
        
        
        for(int i = 0; i < Main.MAX_ACCOUNTS; i++){
            
        
            if(Main.END_LINE.equals(Main.account[i].getUsername())){
                break;
            }
            if(inputEmail.equals(Main.account[i].getEmail())){
                return false;
            }
         }
        
        return true;
        
    }
      
     public String getRole(String username, String email, String password){
         
         for( int i = 0; i < Main.MAX_ACCOUNTS; i++){
             if((username.equals(Main.account[i].getUsername()) || email.equals(Main.account[i].getEmail()))  && password.equals(Main.account[i].getPassword())){
                 return Main.account[i].getRole();
             }
             
         }
         return null;     
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailSignUpText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordSignUpText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton signUp;
    private javax.swing.JButton signUpButton;
    private javax.swing.JDialog signUpForm;
    private javax.swing.JTextField usernameSignUpText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
