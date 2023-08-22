package com.workintech.phone.main;

import com.workintech.phone.Contact;
import com.workintech.phone.MobilePhone;


public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("123456");
        Contact ali = new Contact("Ali", "12344666");
        phone.addNewContact(new Contact("Mehmet", "1223444"));
        phone.addNewContact(ali);
        phone.addNewContact(new Contact("Aslı", "1233442"));
        phone.addNewContact(new Contact("Murat", "33112221"));
        phone.addNewContact(new Contact("Yavuz", "12392263"));
        phone.printContact();
        System.out.println("Index: " + phone.findContact(ali));
        System.out.println("Index with String: " + phone.findContact(ali.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Ali"));
        phone.removeContact(ali);
        phone.printContact();
    }
}