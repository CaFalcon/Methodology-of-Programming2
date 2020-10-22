/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeglasscleaner;

/**
 *
 * @author Deng Zhihui
 */

import java.util.Scanner;

public class EyeglassCleaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean on_off = false; //turn off initially
        String Mode = "Normal";
        String Speed= "Normal";
        System.out.println("Welcome!");
        on_off=Turn_onoff(false);
        while(on_off==true){
            Mode = ModeChange("Normal");
            Speed = SpeedChange("Normal");
            System.out.println("Finish using");
            on_off=false;
        }
        System.out.println("Goodbye");
        
        
    }
    public static boolean Turn_onoff(boolean onoff){
        Scanner user = new Scanner(System.in); 
       System.out.println("Do you want to turn on the machine? Please print in 'Yes' or 'No' "); 
       String turn = new String();
        turn = user.nextLine(); 
        if(turn.equalsIgnoreCase("Yes")){
            onoff=true;
            System.out.println("Turn on successfully");
        }
        else if(turn.equalsIgnoreCase("No")){
            onoff=false;
            System.out.println("Turn off");
        }
        else{
            System.out.println("There is something wrong");
            System.out.println("Turn off");
        }
      return onoff;
    }
    
    public static String ModeChange(String mode){
        Scanner user = new Scanner(System.in); 
       System.out.println("What kind of mode do you want? Please print in 'Special' or 'Normal' "); 
        String change = user.nextLine(); 
        if(change.equalsIgnoreCase("Special")){
            mode="Special";
        }
        else{
            mode="Normal";
        }
      return mode;
    }
    
    public static String SpeedChange(String speed){
        Scanner user = new Scanner(System.in); 
       System.out.println("What kind of speed do you want? Please print in 'Fast' or 'Slow'or 'Normal' "); 
        String schange = user.nextLine(); 
        if(schange.equalsIgnoreCase("Fast")){
            speed="Fast";
        }
        else if(schange.equalsIgnoreCase("Slow")){
            speed="Slow";
        }
        else{
            speed="Normal";
        }
      return speed;
    }

}
