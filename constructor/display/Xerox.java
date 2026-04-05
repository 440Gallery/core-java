class Xerox{
    String brand;
    String model;
    String type;
    int speed;
    String resolution;
    int paperCapacity;
    boolean colorSupport;
    double price;
    double weight;
    String usage;
	Xerox(){
		
	}
	Xerox(String brand,String model){
		this.brand=brand;
        this.model=model;
	}
	Xerox(String brand,String model,String type){
		this.brand=brand;
        this.model=model;
        this.type=type;
	}

    Xerox(String brand,String model,String type,int speed,String resolution,int paperCapacity,boolean colorSupport,double price,double weight,String usage) {
        this.brand=brand;
        this.model=model;
        this.type=type;
        this.speed=speed;
        this.resolution=resolution;
        this.paperCapacity=paperCapacity;
        this.colorSupport=colorSupport;
        this.price=price;
        this.weight=weight;
        this.usage=usage;
    }

    void display() {
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Type:"+type);
        System.out.println("Speed:"+speed);
        System.out.println("Resolution:"+resolution);
        System.out.println("Paper Capacity:"+paperCapacity);
        System.out.println("Color Support:"+colorSupport);
        System.out.println("Price:" + price);
        System.out.println("Weight:"+weight);
        System.out.println("Usage:"+usage);
    }
}