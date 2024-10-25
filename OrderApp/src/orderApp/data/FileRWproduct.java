
package orderApp.data;

import java.io.*;
import java.util.*;
import orderApp.Main;

public class FileRWproduct {
 
    private static final String PRODUCTS_PATH = "src/orderApp/data/products.txt";
    
    
    public static void fileRead(){
        
          try{
            
            File inputFile = new File(PRODUCTS_PATH);
            Scanner scan = new Scanner(inputFile);
            int count = 0;
            
            while(scan.hasNextLine()){
                
                String products[] = new String[3];
                String temp;
                
                
                temp = scan.nextLine();
                
                if(temp.equals(Main.END_LINE)){
                    Main.product[count].setProductCode(Main.END_LINE);
                    break;
                    
                }
                
                products = temp.split("/");
                
                Main.product[count].setProductCode(products[0]);
                Main.product[count].setProductName(products[1]);
                Main.product[count].setProductQuantity(Integer.parseInt(products[2]));
           
                count++;
            }
            
            scan.close();
        } catch (IOException e){
            
        }

    }
    
      
    public static void fileWrite(){
        
        try{
            
            File outputFile = new File(PRODUCTS_PATH);
            FileWriter write = new FileWriter(outputFile);
                 
            
            for(int i = 0; i < Main.MAX_PRODUCTS; i++){
                
                
                String temp = Main.product[i].getProductData();
                
                if(Main.END_LINE.equals(Main.product[i].getProductCode())){
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
