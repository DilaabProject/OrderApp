package orderApp;

import orderApp.components.login.LoginPage;
import orderApp.components.login.FileRW;
import orderApp.components.objects.Account;
import orderApp.components.mainMenu.MainMenuAdmin;
import orderApp.components.mainMenu.MainMenuMember;
import orderApp.components.inventory.Inventory;

public class Main {

    //constants
    public static final int MAX_ACCOUNTS = 10000; 
    public static final int ACCOUNT_COUNT_FORMAT = 4; // username/email/password/role
    
    public static final String END_LINE = "[END]";
    public static final String SuperAdminRole = "admin";
    public static final String MemberRole = "member";
    
    //object arrays
    public static Account account[] = new Account[MAX_ACCOUNTS];
    
    
    
    //frames
    public static LoginPage loginPage;

    public static MainMenuAdmin mainMenuAdmin;
    public static MainMenuMember mainMenuMember;

    public static Inventory inventory;
    
    
    
    
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
            mainMenuAdmin = new MainMenuAdmin();
            mainMenuAdmin.setVisible(true);
        } else {
            mainMenuAdmin.setVisible(false);
        }
    }
    
    public static void mainMemberForm(){
        if(mainMenuMember == null){
            mainMenuMember = new MainMenuMember();
            mainMenuMember.setVisible(true);
        } else {
            mainMenuMember.setVisible(false);
        }
    }
  
    public static void inventoryForm(){
        if(inventory == null){
            inventory = new Inventory();
            inventory.setVisible(true);
        } else {
            inventory.setVisible(false);
        }
    }
    
}

