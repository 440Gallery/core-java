class Coffee {
    static void info(){
        String type = "Arabica Coffee";
        double weight = 250.0;
        String origin = "Ethiopia";
        int price = 800;

        System.out.println("type:" + type);
        System.out.println("weight:" + weight);
        System.out.println("origin:" + origin);
        System.out.println("price:" + price);
    }

    static void details(double weight, int price, double temperature, int roastLevel, boolean isOrganic){
        if(weight > 0 && weight <= 5000) {
            System.out.println("Valid Weight: " + weight);
        }
        else {
            System.out.println("Invalid Weight");
        }

        if(price > 0 && price <= 50000) {
            System.out.println("Valid Price: " + price);
        }
        else {
            System.out.println("Invalid Price");
        }

        if(temperature > 0 && temperature <= 100) {
            System.out.println("Valid Temperature: " + temperature);
        }
        else {
            System.out.println("Invalid Temperature");
        }

        if(roastLevel > 0 && roastLevel <= 5) {
            System.out.println("Valid Roast Level: " + roastLevel);
        }
        else {
            System.out.println("Invalid Roast Level");
        }

        if(isOrganic == true) {
            System.out.println("It is Organic Coffee");
        }
        else {
            System.out.println("It is not Organic Coffee");
        }
    }
}