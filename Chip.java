class Chip {
    static void info() {
        String type = "potato chip";
        double weight = 150.0;
        String flavor = "salted";
        int price = 30;

        System.out.println("type:" + type);
        System.out.println("weight:" + weight);
        System.out.println("flavor:" + flavor);
        System.out.println("price:" + price);
    }
    static void details(String brand, String size, String packaging, int quantity) {
        System.out.println("brand:" + brand);
        System.out.println("size:" + size);
        System.out.println("packaging:" + packaging);
        System.out.println("quantity:" + quantity);
    }
}