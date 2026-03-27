class IpadRunner {
    public static void main(String[] args) {
        Ipad i = new Ipad();
        Ipad i1 = new Ipad();
        Ipad i2 = new Ipad();
        Ipad i3 = new Ipad();
        Ipad i4 = new Ipad();
 
        System.out.println("Default colour:" + i.color);
        i.color = "silver";
        System.out.println("updated color:" + i.color);
        i1.color = "gold";
        System.out.println("clour:" + i1.color);
        i2.color = "blue";
        System.out.println("clour:" + i2.color);
        i3.color = "pink";
        System.out.println("clour:" + i3.color);
        i4.color = "purple";
        System.out.println("clour:" + i4.color);

        System.out.println("default model:" + i.model);
        i.model = "iPad Pro";
        System.out.println("updated model:" + i.model);
        i1.model = "iPad mini";
        System.out.println("model:" + i1.model);
        i2.model = "iPad 10th";
        System.out.println("model:" + i2.model);
        i3.model = "iPad Air 6";
        System.out.println("model:" + i3.model);
        i4.model = "iPad Pro M5";
        System.out.println("model:" + i4.model);

        System.out.println("default screenSize:" + i.screenSize);
        i.screenSize = 11.0;
        System.out.println("updated screenSize:" + i.screenSize);
        i1.screenSize = 8.3;
        System.out.println("screenSize:" + i1.screenSize);
        i2.screenSize = 10.2;
        System.out.println("screenSize:" + i2.screenSize);
        i3.screenSize = 10.9;
        System.out.println("screenSize:" + i3.screenSize);
        i4.screenSize = 13.0;
        System.out.println("screenSize:" + i4.screenSize);

        System.out.println("default price:" + i.price);
        i.price = 99900.0;
        System.out.println("updated price:" + i.price);
        i1.price = 49900.0;
        System.out.println("price:" + i1.price);
        i2.price = 34900.0;
        System.out.println("price:" + i2.price);
        i3.price = 69900.0;
        System.out.println("price:" + i3.price);
        i4.price = 129900.0;
        System.out.println("price:" + i4.price);

        System.out.println("default storage:" + i.storage);
        i.storage = "256GB";
        System.out.println("updated storage:" + i.storage);
        i1.storage = "64GB";
        System.out.println("storage:" + i1.storage);
        i2.storage = "512GB";
        System.out.println("storage:" + i2.storage);
        i3.storage = "1TB";
        System.out.println("storage:" + i3.storage);
        i4.storage = "2TB";
        System.out.println("storage:" + i4.storage);
    }
}