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
