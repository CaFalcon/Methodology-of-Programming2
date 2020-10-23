/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeglasscleaner;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class User {
    private Integer ID;
    private String name;
    private String email;
    private String phone;
    private String gender;

    public User(Integer ID, String name, String email, String phone, String gender) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

    public User() {
        this.ID = 000;
        this.name = "abc";
        this.email = "abc@gmail.com";
        this.phone = "12345";
        this.gender = "male";
    }

    public User(Integer ID) {
        this.ID = ID;
    }

    
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void GiveInformation(){
        System.out.println("Please give information about yourself");
        Scanner user = new Scanner(System.in); 
       System.out.println("Please give your ID:"); 
       String a = new String();
        a = user.nextLine(); 
       this.ID=Integer.parseInt(a);
        Scanner user2 = new Scanner(System.in); 
       System.out.println("Please give your name:"); 
       String b = new String();
        b = user.nextLine(); 
       this.name=b;
        Scanner user3 = new Scanner(System.in); 
       System.out.println("Please give your email:"); 
       String c = new String();
        c = user.nextLine(); 
       this.email=c;
        Scanner user4 = new Scanner(System.in); 
       System.out.println("Please give your phone number:"); 
       String d = new String();
        d = user.nextLine(); 
       this.phone=d;
        Scanner user5 = new Scanner(System.in); 
       System.out.println("Please give your gender:"); 
       String e = new String();
        e = user.nextLine(); 
       this.gender=e;
    }
    public void PrintUser(){
        System.out.println("your information:");
         System.out.println("your ID: "+ this.ID);
         System.out.println("your name: "+ this.name);
         System.out.println("your email: "+ this.email);
         System.out.println("your phone: "+ this.phone);
         System.out.println("your gender: "+ this.gender);
    }
    
}
