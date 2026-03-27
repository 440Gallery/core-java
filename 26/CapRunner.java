class CapRunner {
    public static void main(String[] args) {
        Cap c = new Cap();
        Cap c1 = new Cap();
        Cap c2 = new Cap();
        Cap c3 = new Cap();
        Cap c4 = new Cap();

        System.out.println("Default colour:" + c.color);
        c.color = "white";
        System.out.println("updated color:" + c.color);
        c1.color = "blue";
        System.out.println("clour:" + c1.color);
        c2.color = "red";
        System.out.println("clour:" + c2.color);
        c3.color = "green";
        System.out.println("clour:" + c3.color);
        c4.color = "grey";
        System.out.println("clour:" + c4.color);

        System.out.println("default brand:" + c.brand);
        c.brand = "Adidas";
        System.out.println("updated brand:" + c.brand);
        c1.brand = "Puma";
        System.out.println("brand:" + c1.brand);
        c2.brand = "Reebok";
        System.out.println("brand:" + c2.brand);
        c3.brand = "NewEra";
        System.out.println("brand:" + c3.brand);
        c4.brand = "47Brand";
        System.out.println("brand:" + c4.brand);

        System.out.println("default size:" + c.size);
        c.size = 7.5;
        System.out.println("updated size:" + c.size);
        c1.size = 7.25;
        System.out.println("size:" + c1.size);
        c2.size = 7.75;
        System.out.println("size:" + c2.size);
        c3.size = 8.0;
        System.out.println("size:" + c3.size);
        c4.size = 8.25;
        System.out.println("size:" + c4.size);
 
        System.out.println("default price:" + c.price);
        c.price = 2000.0;
        System.out.println("updated price:" + c.price);
        c1.price = 1800.0;
        System.out.println("price:" + c1.price);
        c2.price = 2200.0;
        System.out.println("price:" + c2.price);
        c3.price = 2500.0;
        System.out.println("price:" + c3.price);
        c4.price = 2800.0;
        System.out.println("price:" + c4.price);
 
        System.out.println("default type:" + c.type);
        c.type = "snapback";
        System.out.println("updated type:" + c.type);
        c1.type = "fitted";
        System.out.println("type:" + c1.type);
        c2.type = "trucker";
        System.out.println("type:" + c2.type);
        c3.type = "dadcap";
        System.out.println("type:" + c3.type);
        c4.type = "beanie";
        System.out.println("type:" + c4.type);
    }
}