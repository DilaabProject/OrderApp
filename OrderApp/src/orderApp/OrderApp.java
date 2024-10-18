package orderApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author zero
*/
import orderApp.components.login.LoginPage;

public class OrderApp {

    /**
     * @param args the command line arguments
     */
    
    public static LoginPage loginPage;
    
    public static void main(String[] args) {
        // TODO code application logic here
        loginPage = new LoginPage();
        System.out.println("Yahallo Sekai");
        loginPage.setVisible(true);
    }
    
}
