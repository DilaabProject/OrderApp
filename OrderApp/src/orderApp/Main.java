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
    
    public static MainMenu mainMenuMember;
    public static MainMenu mainMenuAdmin;
    
    
    
    
    
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
    
    public static void mainForm(){
        if(mainMenu == null){
            mainMenu = new MainMenu();
            mainMenu.setVisible(true);
        } else {
            mainMenu.setVisible(false);
        }
    }
}

