package orderApp.components.login;

import java.io.*;
import java.util.*;
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
