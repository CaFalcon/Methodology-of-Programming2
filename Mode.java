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
public class Mode {
    private String modes;
    

    public Mode(String modes) {
        this.modes = modes;
    }

    public String getModes() {
        return modes;
    }

    public void setModes(String modes) {
        this.modes = modes;
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
}
