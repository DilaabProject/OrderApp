package orderApp;

import orderApp.components.login.LoginPage;
import orderApp.components.login.FileRW;
import orderApp.components.objects.Account;
import orderApp.components.mainMenu.MainMenu;


public class Main {

    //constants
    public static final int MAX_ACCOUNTS = 10000; 
    public static final int ACCOUNT_COUNT_FORMAT = 4; // username/email/password/role
    
    public static final String END_LINE = "[END]";
    
    
    
    //object arrays
    public static Account account[] = new Account[MAX_ACCOUNTS];
    
    
    
    //frames
    public static LoginPage loginPage;

    public static MainMenu mainMenuAdmin;
    public static MainMenu mainMenuMember;

    
    
    
    
    
    public static void main(String[] args) {  
        
        //instantiate the arrays
        for(int i = 0; i < MAX_ACCOUNTS; i++){
            account[i] = new Account();
        }
        
        //load datas
        FileRW.fileRead();
        
        
        loginForm(); 

       
    }
    
    
    public static void loginForm(){
        if(loginPage == null){
            loginPage = new LoginPage();
            loginPage.setVisible(true); 
        } else {
            loginPage.setVisible(false);
        }
    }
    
    public static void mainAdminForm(){
        if(mainMenuAdmin == null){
            mainMenuAdmin = new MainMenu();
            mainMenuAdmin.setVisible(true);
        } else {
            mainMenuAdmin.setVisible(false);
        }
    }
    
    public static void mainMemberForm(){
        if(mainMenuMember == null){
            mainMenuMember = new MainMenu();
            mainMenuMember.setVisible(true);
        } else {
            mainMenuMember.setVisible(false);
        }
    }
  
}

