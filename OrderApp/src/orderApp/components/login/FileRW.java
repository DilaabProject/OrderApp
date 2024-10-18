package orderApp.components.login;

import java.io.*;
import java.util.*;
import orderApp.Main;


public class FileRW {
    
    private static final String ACCOUNTS_PATH = "src/orderApp/components/login/accounts.txt";
       
    
    public static void fileRead(){
        
 
        
        
        
        try{
            
            File inputFile = new File(ACCOUNTS_PATH);
            Scanner scan = new Scanner(inputFile);
            int count = 0;
            
            while(scan.hasNextLine()){
                
                String accounts[] = new String[4];
                String temp;
                
                
                temp = scan.nextLine();
                
                if(temp.equals(Main.END_LINE)){
                    Main.account[count].setUsername(Main.END_LINE);
                    break;
                    
                }
                
                accounts = temp.split("/");
                
                Main.account[count].setUsername(accounts[0]);
                Main.account[count].setEmail(accounts[1]);
                Main.account[count].setPassword(accounts[2]);
                Main.account[count].setRole(accounts[3]);
           
                count++;
            }
            
            scan.close();
        } catch (IOException e){
            
        } 
        
        
        
        
    }
    
    
    public static void fileWrite(){
        
        try{
            
            File outputFile = new File(ACCOUNTS_PATH);
            FileWriter write = new FileWriter(outputFile);
                 
            
            for(int i = 0; i < Main.MAX_ACCOUNTS; i++){
                
                
                String temp = Main.account[i].accountData();
                
                if(Main.END_LINE.equals(Main.account[i].getUsername())){
                    write.write(Main.END_LINE);
                    break;
                }    
                write.write(temp + "\n");
            }
            
            write.close();
        }
        
        catch(IOException e){
            
            
        }
        
        
        
    }
    
    
}
