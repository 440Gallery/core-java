class Specs{
    String brand;
    String frameType;
    String lensType;
    String color;
    double price;
    boolean isPolarized;
    String material;
    double weight;
    String style;
    String size;
    Specs(){
		
	}
	Specs(String brand,String frameType){
		this.brand=brand;
        this.frameType=frameType;
		
	}
	Specs(String brand,String frameType,String lensType){
		this.brand=brand;
        this.frameType=frameType;
        this.lensType=lensType;
		
	}
	Specs(String brand,String frameType,String lensType,String color,double price,boolean isPolarized,String material,double weight,String style,String size) {
        this.brand=brand;
        this.frameType=frameType;
        this.lensType=lensType;
        this.color=color;
        this.price=price;
        this.isPolarized=isPolarized;
        this.material=material;
        this.weight=weight;
        this.style=style;
        this.size=size;
    }
    public void display(){
		System.out.println(".................");
        System.out.println("Brand:"+brand);
        System.out.println("Frame Type:"+frameType);
        System.out.println("Lens Type:"+lensType);
        System.out.println("Color:"+color);
        System.out.println("Price: ₹"+price);
        System.out.println("Polarized:"+(isPolarized ? "Yes" :"No"));
        System.out.println("Material:"+material);
        System.out.println("Weight:"+weight+" grams");
        System.out.println("Style:"+style);
        System.out.println("Size:"+size);
    }
}
