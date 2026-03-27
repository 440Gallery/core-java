class Thread {
    static void info() {
        String type = "sewing thread";
        double length = 500.0;
        String color = "white";
        int price = 50;
		
        System.out.println("type:" + type);
        System.out.println("length:" + length);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
    }
    static void details(double thickness, String material, String brand, int quantity) {
		
        System.out.println("thickness:" + thickness);
        System.out.println("material:" + material);
        System.out.println("brand:" + brand);
        System.out.println("quantity:" + quantity);
    }
}