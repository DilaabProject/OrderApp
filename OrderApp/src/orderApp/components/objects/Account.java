/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderApp.components.objects;

/**
 *
 * @author zero
 */
public class Account extends Person{
    
    protected String username;
    protected String email;
    protected String password;
    protected String role;
    
    public Account(){}
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getRole(){
        return role;
        
    }
    
    public String accountData(){
        return username + "/" + email + "/" + password + "/" + role;
    }
}
