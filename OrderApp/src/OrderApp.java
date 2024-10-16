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

    public static LoginPage loginPage;
    
    
    
    
    
    
    public static void main(String[] args) {   
        loginForm(); 

    }
    
    
    public static void loginForm(){
        if(loginPage == null){
            loginPage = new LoginPage();
            loginPage.setVisible(true); 
        } 
    }
}
