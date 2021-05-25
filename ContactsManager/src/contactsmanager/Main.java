/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmanager;

import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Main {
    
    public static void main(String [] args){
    
        char again;
        String searchName;
    
    ContactsManager myContactsManager = new ContactsManager();
    
        Contact contact1 = new Contact();
        contact1.name = "Nathan";
        contact1.email = "luckmansyarif46@gmail.com";
        contact1.phoneNumber = "089653417773";
        myContactsManager.addContact(contact1);
        
        Contact contact2 = new Contact();
        contact2.name = "Dzaky";
        contact2.email = "syahrindradr@gmail.com";
        contact2.phoneNumber = "081298742602";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Sandy";
        contact3.email = "sanwahyu34@gmail.com";
        contact3.phoneNumber = "081226474181";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Satria";
        contact4.email = "septuwuryanto@gmail.com";
        contact4.phoneNumber = "085879414074";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "Busroni";
        contact5.email = "busroni10@gmail.com";
        contact5.phoneNumber = "0895366557609";
        myContactsManager.addContact(contact5);
    
        Scanner scanner=new Scanner(System.in);
        do{

            System.out.print("Search Name : ");
            searchName = scanner.next();
            System.out.println("looking for "+ searchName +"'s contact..");

            Contact result = myContactsManager.searchContact(searchName);
            if (result == null){
                 System.out.println("Contact not found!\n");
            }
            else {
                System.out.println("Nama\t\t: " + result.name);
                System.out.println("E-mail\t\t: " + result.email);
                System.out.println("Phone Number\t: " + result.phoneNumber+"\n");    
            }

            System.out.print("Again? (y/n) : ");
            again=scanner.next().charAt(0);

        }while(again=='y');
    
    }
     
}
