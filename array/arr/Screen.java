class Screen{
    String brand;
    int size;
    String resolution;
    String type;
    boolean smart;
    double price;
    String color;
    int refreshRate;
    String panelType;
    String model;

    Screen(String brand, int size, String resolution, String type,boolean smart, double price, String color, int refreshRate,String panelType, String model){
        this.brand=brand;
        this.size=size;
        this.resolution=resolution;
        this.type=type;
        this.smart=smart;
        this.price=price;
        this.color=color;
        this.refreshRate=refreshRate;
        this.panelType=panelType;
        this.model=model;
    }

    void display(){
		System.out.println("..................");
        System.out.println("Screenbrand="+brand );
		System.out.println(" size="+size );
		System.out.println(" resolution="+resolution );
		System.out.println(" type="+type );
		System.out.println("smart="+smart);
		System.out.println("  price="+price );
		System.out.println("color="+color );
		System.out.println("refreshRate="+refreshRate);
		System.out.println("panelType="+panelType);
		System.out.println(" model="+model);
    }
}