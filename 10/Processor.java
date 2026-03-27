class Processor {
    static void info(){
        String type = "Intel Processor";
        double speed = 3.5;
        String color = "silver";
        int price = 15000;
        
        System.out.println("type:" + type);
        System.out.println("speed:" + speed);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
    }
    static void details(double speed, int gen, int storage){
		if(speed > 0 && speed <= 13) {
        System.out.println("Valid Speed: " + speed);
    } 
        else {
        System.out.println("Invalid Speed");
    }
	    if(gen > 0 && gen <= 20) {
        System.out.println("Valid Generation: " + gen);
    } 
        else {
        System.out.println("Invalid Generation");
    }
	    if(storage > 0 && storage <= 2000) {
        System.out.println("Valid Storage: " + storage);
    } 
        else {
        System.out.println("Invalid Storage");
    }
	    
    }
}