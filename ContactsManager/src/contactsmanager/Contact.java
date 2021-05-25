/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmanager;

/**
 *
 * @author acer
 */
public class Contact {
    String name;
    String email;
    String phoneNumber;

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    public String getEmail (){
        return email;
    }
    public String getPhoneNumber (){
        return phoneNumber;
    }

}

