
package orderApp.components.objects;


public class Product {
    
    private String productCode;
    private String productName;
    private int productQuantity;
    
    public Product(){};
    
    public void setProductCode(String productCode){
        this.productCode = productCode;
    }
    
    public String getProductCode(){
        return productCode;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public void setProductQuantity(int productQuantity){
        this.productQuantity = productQuantity;
    }
    
    public int getProductQuantity(){
        return productQuantity;
    }
    
    public String getProductData(){
        return productCode + "/" + productName + "/" + productQuantity;
    }
}