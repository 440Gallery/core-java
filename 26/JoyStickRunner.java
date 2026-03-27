class JoyStickRunner {
    public static void main(String[] args) {
        JoyStick j = new JoyStick();
        JoyStick j1 = new JoyStick();
        JoyStick j2 = new JoyStick();
        JoyStick j3 = new JoyStick();
        JoyStick j4 = new JoyStick();

        System.out.println("Default colour:" + j.color);
        j.color = "white";
        System.out.println("updated color:" + j.color);
        j1.color = "blue";
        System.out.println("clour:" + j1.color);
        j2.color = "red";
        System.out.println("clour:" + j2.color);
        j3.color = "silver";
        System.out.println("clour:" + j3.color);
        j4.color = "green";
        System.out.println("clour:" + j4.color);

        System.out.println("default brand:" + j.brand);
        j.brand = "Razer";
        System.out.println("updated brand:" + j.brand);
        j1.brand = "Thrustmaster";
        System.out.println("brand:" + j1.brand);
        j2.brand = "Thrustmaster";
        System.out.println("brand:" + j2.brand);
        j3.brand = "Xbox";
        System.out.println("brand:" + j3.brand);
        j4.brand = "PlayStation";
        System.out.println("brand:" + j4.brand);

        System.out.println("default price:" + j.price);
        j.price = 4500.0;
        System.out.println("updated price:" + j.price);
        j1.price = 2800.0;
        System.out.println("price:" + j1.price);
        j2.price = 5200.0;
        System.out.println("price:" + j2.price);
        j3.price = 3800.0;
        System.out.println("price:" + j3.price);
        j4.price = 6200.0;
        System.out.println("price:" + j4.price);

        System.out.println("default type:" + j.type);
        j.type = "digital";
        System.out.println("updated type:" + j.type);
        j1.type = "flightstick";
        System.out.println("type:" + j1.type);
        j2.type = "gamepad";
        System.out.println("type:" + j2.type);
        j3.type = "precision";
        System.out.println("type:" + j3.type);
        j4.type = "wireless";
        System.out.println("type:" + j4.type);
 
        System.out.println("default buttons:" + j.buttons);
        j.buttons = 16;
        System.out.println("updated buttons:" + j.buttons);
        j1.buttons = 8;
        System.out.println("buttons:" + j1.buttons);
        j2.buttons = 20;
        System.out.println("buttons:" + j2.buttons);
        j3.buttons = 12;
        System.out.println("buttons:" + j3.buttons);
        j4.buttons = 24;
        System.out.println("buttons:" + j4.buttons);
    }
}