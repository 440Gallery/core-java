class Screw {
    static void info() {
        String type = "wood screw";
        double length = 3.5;
        String color = "silver";
        int price = 10;

        System.out.println("type:" + type);
        System.out.println("length:" + length);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
    }
    static void details(double diameter, String material, String brand, int quantity) {
        System.out.println("diameter:" + diameter);
        System.out.println("material:" + material);
        System.out.println("brand:" + brand);
        System.out.println("quantity:" + quantity);
    }
}
