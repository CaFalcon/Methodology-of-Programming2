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
public class Speed {
    private String speeds;

    public Speed(String speeds) {
        this.speeds = speeds;
    }

    public String getSpeeds() {
        return speeds;
    }

    public void setSpeeds(String speeds) {
        this.speeds = speeds;
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
