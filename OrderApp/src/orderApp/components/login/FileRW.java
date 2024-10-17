package orderApp.components.login;

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
                
                String accounts[] = new String[4];
                String temp;
                
                
                temp = scan.nextLine();
                
                
                //System.out.print(temp);
                //System.out.print(count);
                //count++;
                
                if(temp.equals(Main.END_LINE)){
                    System.out.print("break");
                    break;
                    
                }
                
                accounts = temp.split("/");
                
                System.out.print(temp);
                Main.account[count].setUsername(accounts[0]);
                Main.account[count].setEmail(accounts[1]);
                Main.account[count].setPassword(accounts[2]);
                Main.account[count].setRole(accounts[3]);
                
                count++;
                
                System.out.print(Main.account[count].getEmail());
                
            }
            
            scan.close();
        } catch (IOException e){
            
        } 
        
        
        
        
    }
    
    
    
    
    
}
