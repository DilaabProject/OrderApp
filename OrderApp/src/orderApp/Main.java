package orderApp;

import orderApp.components.login.LoginPage;
import orderApp.components.login.FileRWLogin;
import orderApp.components.objects.Account;
import orderApp.components.mainMenu.MainMenuAdmin;
import orderApp.components.mainMenu.MainMenuMember;
import orderApp.components.mainMenu.mainMenuComponents.Inventory;
import orderApp.components.objects.Product;
import orderApp.components.mainMenu.mainMenuComponents.AddProduct;
import orderApp.data.FileRWproduct;
public class Main {

    //constants
    public static final String END_LINE = "[END]";
    public static final String SuperAdminRole = "admin";
    public static final String MemberRole = "member";
    
    public static final int MAX_ACCOUNTS = 10000; 
    public static final int ACCOUNT_FORMAT_COUNT_ = 4; // username/email/password/role
    
    public static final int MAX_PRODUCTS = 10000;
    public static final int PRODUCTS_FORMAT_COUNT = 3; //product code/product name/ product quantity
    
    
    //object arrays
    public static Account account[] = new Account[MAX_ACCOUNTS];
    
    public static Product product[] = new Product[MAX_PRODUCTS];
    
    
    //frames
    public static LoginPage loginPage;

    public static MainMenuAdmin mainMenuAdmin;
    public static MainMenuMember mainMenuMember;

    //MainMenuComponents
    public static Inventory inventory;
    public static AddProduct addProduct;
    
    
    
    
    public static void main(String[] args) {  
        
        //instantiate the arrays
        for(int i = 0; i < MAX_ACCOUNTS; i++){
            account[i] = new Account();
        }
        
        for(int i = 0; i < MAX_PRODUCTS; i++){
            product[i] = new Product();
        }
        
        
        //load datas
        FileRWLogin.fileRead();
        FileRWproduct.fileRead();
        
       // loginForm(); 

       //try
       inventoryForm();
       
    }
    
    //control the visibility of jframes
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
    
     public static void addProductForm(){
        if(addProduct == null){
            addProduct = new AddProduct();
            addProduct.setVisible(true);
        } else {
            addProduct.setVisible(false);
            addProduct = null;
        }
    }
}

