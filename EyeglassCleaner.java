/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeglasscleaner;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class EyeglassCleaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mode mode= new Mode("Normal");
        Speed speed= new Speed("Normal");
        System.out.println("Welcome!");
        boolean Turn_onoff = onoff.Turn_onoff(false);
        while(Turn_onoff==true){
            mode.ModeChange("Normal");
            speed.SpeedChange("Normal");
            System.out.println("Finish using");
            Turn_onoff=false;
        }
        System.out.println("Goodbye");
        
        
    }

}
