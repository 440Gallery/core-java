class PowerBankRunner {
    public static void main(String[] args) {
        PowerBank p = new PowerBank();
        PowerBank p1 = new PowerBank();
        PowerBank p2 = new PowerBank();
        PowerBank p3 = new PowerBank();
        PowerBank p4 = new PowerBank();
        
        System.out.println("Default colour:" + p.color);
        p.color = "white";
        System.out.println("updated color:" + p.color);
        p1.color = "blue";
        System.out.println("clour:" + p1.color);
        p2.color = "red";
        System.out.println("clour:" + p2.color);
        p3.color = "silver";
        System.out.println("clour:" + p3.color);
        p4.color = "green";
        System.out.println("clour:" + p4.color);

        System.out.println("default brand:" + p.brand);
        p.brand = "Mi";
        System.out.println("updated brand:" + p.brand);
        p1.brand = "Belkin";
        System.out.println("brand:" + p1.brand);
        p2.brand = "Samsung";
        System.out.println("brand:" + p2.brand);
        p3.brand = "Ambrane";
        System.out.println("brand:" + p3.brand);
        p4.brand = "Portronics";
        System.out.println("brand:" + p4.brand);

        System.out.println("default capacity:" + p.capacity);
        p.capacity = 20000.0;
        System.out.println("updated capacity:" + p.capacity);
        p1.capacity = 10000.0;
        System.out.println("capacity:" + p1.capacity);
        p2.capacity = 15000.0;
        System.out.println("capacity:" + p2.capacity);
        p3.capacity = 30000.0;
        System.out.println("capacity:" + p3.capacity);
        p4.capacity = 50000.0;
        System.out.println("capacity:" + p4.capacity);
 
        System.out.println("default price:" + p.price);
        p.price = 3500.0;
        System.out.println("updated price:" + p.price);
        p1.price = 1800.0;
        System.out.println("price:" + p1.price);
        p2.price = 2800.0;
        System.out.println("price:" + p2.price);
        p3.price = 4500.0;
        System.out.println("price:" + p3.price);
        p4.price = 6500.0;
        System.out.println("price:" + p4.price);

        System.out.println("default type:" + p.type);
        p.type = "Li-ion";
        System.out.println("updated type:" + p.type);
        p1.type = "Polymer";
        System.out.println("type:" + p1.type);
        p2.type = "FastCharge";
        System.out.println("type:" + p2.type);
        p3.type = "PD65W";
        System.out.println("type:" + p3.type);
        p4.type = "QC3.0";
        System.out.println("type:" + p4.type);
    }
}