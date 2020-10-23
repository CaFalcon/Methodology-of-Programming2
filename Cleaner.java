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
public class Cleaner {
    private Integer ID;
    private boolean on_off;
    private String modes;
    private String speeds;

    public Cleaner() {
        this.ID=000;
        this.on_off = false;
        this.modes = "Normal";
        this.speeds = "Normal";
    }

    public Cleaner(Integer ID,boolean on_off, String modes, String speeds) {
        this.ID = ID;
        this.on_off = on_off;
        this.modes = modes;
        this.speeds = speeds;
    }

    public Cleaner(Integer ID) {
        this.ID = ID;
    }
    

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    
    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public String getModes() {
        return modes;
    }

    public void setModes(String modes) {
        this.modes = modes;
    }

    public String getSpeeds() {
        return speeds;
    }

    public void setSpeeds(String speeds) {
        this.speeds = speeds;
    }
    
     public boolean Turn_onoff(boolean onoff){
         Scanner id = new Scanner(System.in); 
       System.out.println("What is your cleaner ID?"); 
       String i = new String();
        i = id.nextLine(); 
        this.ID=Integer.parseInt(i);
        System.out.println("Your cleaner ID is: "+this.ID); 
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
     
      public String ModeChange(String mode){
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
     
      public String SpeedChange(String speed){
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
