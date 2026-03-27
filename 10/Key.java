class Key {
    static void info(){
        String type = "House Key";
        double weight = 0.03;
        String material = "brass";
        int price = 200;

        System.out.println("type:" + type);
        System.out.println("weight:" + weight);
        System.out.println("material:" + material);
        System.out.println("price:" + price);
    }

    static void details(double weight, int size, int price, int numberOfCuts, boolean isMasterKey){
        if(weight > 0 && weight <= 0.5) {
            System.out.println("Valid Weight: " + weight);
        }
        else {
            System.out.println("Invalid Weight");
        }

        if(size > 0 && size <= 20) {
            System.out.println("Valid Size: " + size);
        }
        else {
            System.out.println("Invalid Size");
        }

        if(price > 0 && price <= 5000) {
            System.out.println("Valid Price: " + price);
        }
        else {
            System.out.println("Invalid Price");
        }

        if(numberOfCuts > 0 && numberOfCuts <= 20) {
            System.out.println("Valid Number of Cuts: " + numberOfCuts);
        }
        else {
            System.out.println("Invalid Number of Cuts");
        }

        if(isMasterKey == true) {
            System.out.println("It is a Master Key");
        }
        else {
            System.out.println("It is not a Master Key");
        }
    }
}