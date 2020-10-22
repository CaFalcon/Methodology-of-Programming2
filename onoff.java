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
public class onoff {
    boolean on_off = false; //turn off initially

    public onoff(boolean on_off) {
        this.on_off = on_off;
    }

    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
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
    
    
}
