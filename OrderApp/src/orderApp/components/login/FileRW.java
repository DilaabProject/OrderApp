/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderApp.components.login;

/**
 *
 * @author zero
 */


import java.io.*;
import java.util.*;
import orderApp.Main;
public class FileRW {
    
    
    public static void fileRead(){
        
        try{
            
            File inputFile = new File("src/orderApp/components/login/accounts.txt");
            Scanner scan = new Scanner(inputFile);
            int count = 0;
            
            while(scan.hasNextLine()){
                
                String accounts[] = new String[3];
                String temp;
                
                
                if(scan.nextLine().isEmpty()){
                    break;
                }
                
                temp = scan.nextLine();
                accounts = temp.split("/");
                
                Main.account[count].setUsername(accounts[0]);
                Main.account[count].setPassword(accounts[1]);
                Main.account[count].setRole(accounts[2]);
                count++;
               
            }
            
            
        } catch (IOException e){
            
        } 
        
        
        
        
    }
    
    
    
    
    
}
