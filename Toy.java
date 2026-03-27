class Toy {
    static void info() {
        String type = "action figure";
        double height = 15.0;
        String color = "multicolor";
        int price = 500;

        System.out.println("type:" + type);
        System.out.println("height:" + height);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
    }
    static void details(double weight, String material, String brand, int quantity) {
        System.out.println("weight:" + weight);
        System.out.println("material:" + material);
        System.out.println("brand:" + brand);
        System.out.println("quantity:" + quantity);
    }
}