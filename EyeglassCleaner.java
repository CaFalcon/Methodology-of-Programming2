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


public class EyeglassCleaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        User user = new User();
        Eyeglass eyeglass = new Eyeglass();
        System.out.println("Welcome!");
        user.GiveInformation();
        user.PrintUser();
        eyeglass.GiveInformation();
        eyeglass.Printglasses();
        boolean Turn_onoff;
        Turn_onoff = cleaner.Turn_onoff(false);
        while(Turn_onoff==true){
            cleaner.ModeChange("Normal");
            cleaner.SpeedChange("Normal");
            System.out.println("Finish using");
            Turn_onoff=false;
        }
        System.out.println("Goodbye");
        
        
    }

}
