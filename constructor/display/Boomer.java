class Boomer{
    String material;
    String shape;
    String color;
    double weight;
    String brand;
    double range;
    double price;
    String origin;
    String usage;
    String size;
	Boomer(){
		
	}
	Boomer(String material,String shape){
		this.material=material;
        this.shape=shape;
		
	}
	Boomer(String material,String shape,String color){
		this.material=material;
        this.shape=shape;
        this.color=color;
		
	}

    Boomer(String material,String shape,String color,double weight,String brand,double range,double price,String origin,String usage,String size){
        this.material=material;
        this.shape=shape;
        this.color=color;
        this.weight=weight;
        this.brand=brand;
        this.range=range;
        this.price=price;
        this.origin=origin;
        this.usage=usage;
        this.size=size;
    }

    void displayInfo(){
        System.out.println("Material:"+material);
        System.out.println("Shape:"+shape);
        System.out.println("Color:"+color);
        System.out.println("Weight:"+weight + " grams");
        System.out.println("Brand:"+brand);
        System.out.println("Range:"+range + " meters");
        System.out.println("Price: ₹" + price);
        System.out.println("Origin:"+origin);
        System.out.println("Usage:"+usage);
        System.out.println("Size:"+size);
    }
}