/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderApp.components.objects;

/**
 *
 * @author zero
 */
public class Person {
    
    protected String firstname;
    protected String lastname;
    protected int contactNum;
    
    
    public Person(){}
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public void setContactNum(String constactNum){
        this.contactNum = contactNum;
    }
    
    public String getFirstname(){
        return firstname;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public int getContactNum(){
        return contactNum;
    }
}

