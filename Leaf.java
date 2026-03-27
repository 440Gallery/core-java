class Leaf {
    static void info() {
        String type = "apple leaf";
        double length = 8.0;
        String color = "green";
        int price = 5;

        System.out.println("type:" + type);
        System.out.println("length:" + length);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
    }
    static void details(double width, String texture, String season, int quantity) {
        System.out.println("width:" + width);
        System.out.println("texture:" + texture);
        System.out.println("season:" + season);
        System.out.println("quantity:" + quantity);
    }
}
