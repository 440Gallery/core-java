class Ring {
    static void info(){
        String type = "Wedding Ring";
        double weight = 5.0;
        String color = "gold";
        int cost = 20000;

        System.out.println("type:" + type);
        System.out.println("weight:" + weight);
        System.out.println("color:" + color);
        System.out.println("cost:" + cost);
    }

    static void details(double weight, double diameter, int cost, int noOfStones, boolean isGold){
        if(weight > 0 && weight <= 50) {
            System.out.println("Valid Weight: " + weight);
        }
        else {
            System.out.println("Invalid Weight");
        }

        if(diameter > 0 && diameter <= 40) {
            System.out.println("Valid Diameter: " + diameter);
        }
        else {
            System.out.println("Invalid Diameter");
        }

        if(cost > 0 && cost <= 500000) {
            System.out.println("Valid Cost: " + cost);
        }
        else {
            System.out.println("Invalid Cost");
        }

        if(noOfStones >= 0 && noOfStones <= 20) {
            System.out.println("Valid Number of Stones: " + noOfStones);
        }
        else {
            System.out.println("Invalid Number of Stones");
        }

        if(isGold == true) {
            System.out.println("It is a Gold Ring");
        }
        else {
            System.out.println("It is not a Gold Ring");
        }
    }
}