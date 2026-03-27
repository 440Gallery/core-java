class Paper {
    static void info(){
        String type = "A4 Paper";
        double height = 29.7;
        String color = "white";
        int cost = 10;

        System.out.println("type:" + type);
        System.out.println("height:" + height);
        System.out.println("color:" + color);
        System.out.println("cost:" + cost);
    }

    static void details(double height, double weight, int cost, boolean goodQuality, double width){
        if(height > 0 && height <= 150) {
            System.out.println("Valid Height: " + height);
        }
        else {
            System.out.println("Invalid Height");
        }

        if(weight > 0 && weight <= 500) {
            System.out.println("Valid Weight: " + weight);
        }
        else {
            System.out.println("Invalid Weight");
        }

        if(cost > 0 && cost <= 10000) {
            System.out.println("Valid Cost: " + cost);
        }
        else {
            System.out.println("Invalid Cost");
        }

        if(goodQuality == true) {
            System.out.println("It is Good Quality");
        }
        else {
            System.out.println("It is not Good Quality");
        }

        if(width > 0 && width <= 100) {
            System.out.println("Valid Width: " + width);
        }
        else {
            System.out.println("Invalid Width");
        }
    }
}
