package orderApp;



import orderApp.components.login.LoginPage;
import orderApp.components.objects.Account;
public class Main {

    //constants
    public static final int MAX_ACCOUNTS = 10000; 
    public static final int ACCOUNT_COUNT_FORMAT = 3; // username/password/role
    
    
    
    
    //object arrays
    public static Account account[] = new Account[MAX_ACCOUNTS];
    
    
    
    //frames
    public static LoginPage loginPage;
    
    
    
    
    
    
    public static void main(String[] args) {  
        
        //instantiate the arrays
        for(int i = 0; i < MAX_ACCOUNTS; i++){
            account[i] = new Account();
        }
        
        
        
        loginForm(); 

    }
    
    
    public static void loginForm(){
        if(loginPage == null){
            loginPage = new LoginPage();
            loginPage.setVisible(true); 
        } 
    }
}

