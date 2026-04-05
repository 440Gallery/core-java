class Locket{
    String material;
    String shape;
    String color;
    double weight;
    String design;
    String chainType;
    double price;
    String brand;
    boolean isEngraved;
    String occasion;
	Locket(){
		
	}
	Locket(String material,String shape){
		this.material=material;
        this.shape=shape;
		
	}
	Locket(String material,String shape,String color){
		this.material=material;
        this.shape=shape;
        this.color=color;
		
	}
	Locket(String material,String shape,String color,double weight,String design,String chainType,double price,String brand,boolean isEngraved,String occasion) {
		super();
        this.material=material;
        this.shape=shape;
        this.color=color;
        this.weight=weight;
        this.design=design;
        this.chainType=chainType;
        this.price=price;
        this.brand=brand;
        this.isEngraved=isEngraved;
        this.occasion=occasion;
    }
    void display(){
		System.out.println("....................");
        System.out.println("Material:"+material);
        System.out.println("Shape:"+shape);
        System.out.println("Color:"+color);
        System.out.println("Weight:"+weight);
        System.out.println("Design:"+design);
        System.out.println("Chain Type:"+chainType);
        System.out.println("Price:"+price);
        System.out.println("Brand:"+brand);
        System.out.println("Engraved:"+isEngraved);
        System.out.println("Occasion:"+occasion);
    }
}