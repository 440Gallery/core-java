class Cell {
    static void info() {
        String type = "battery cell";
        double voltage = 1.5;
        String color = "silver";
        int price = 80;

        System.out.println("type:" + type);
        System.out.println("voltage:" + voltage);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
    }
    static void details(double capacity, String material, String brand, int quantity) {
        System.out.println("capacity:" + capacity);
        System.out.println("material:" + material);
        System.out.println("brand:" + brand);
        System.out.println("quantity:" + quantity);
    }
}
