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
public class Eyeglass {
    private Integer ID;
    private String brand;
    private String function;
    private String color;

    public Eyeglass(Integer ID, String brand, String function, String color) {
        this.ID = ID;
        this.brand = brand;
        this.function = function;
        this.color = color;
    }

    public Eyeglass() {
        this.ID = 000;
        this.brand = "Gucci";
        this.function = "sunglasses";
        this.color = "black";
    }

    public Eyeglass(Integer ID) {
        this.ID = ID;
    }

    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void GiveInformation(){
        System.out.println("Please give information about your eyeglasses");
        Scanner user = new Scanner(System.in); 
       System.out.println("Please give the ID:"); 
       String a = new String();
        a = user.nextLine(); 
       this.ID=Integer.parseInt(a);
        Scanner user2 = new Scanner(System.in); 
       System.out.println("Please give the brand:"); 
       String b = new String();
        b = user.nextLine(); 
       this.brand=b;
        Scanner user3 = new Scanner(System.in); 
       System.out.println("Please give the function of your eyegalss:"); 
       String c = new String();
        c = user.nextLine(); 
       this.function=c;
        Scanner user4 = new Scanner(System.in); 
       System.out.println("Please give the color:"); 
       String d = new String();
        d = user.nextLine(); 
       this.color=d;
    }
    public void Printglasses(){
        System.out.println("eyeglass information:");
         System.out.println("ID: "+ this.ID);
         System.out.println("brand: "+ this.brand);
         System.out.println("function: "+ this.function);
         System.out.println("color: "+ this.color);
    }

    
}
