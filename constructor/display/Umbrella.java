class Umbrella{
    String type;
    String color;
    String material;
    String size;
    String brand;
    double price;
    boolean waterproof;
    boolean windResistant;
    double weight;
    String usage;

    Umbrella(String type,String color,String material,String size,String brand,double price,boolean waterproof,boolean windResistant,double weight,String usage){
		
        this.type=type;
        this.color=color;
        this.material=material;
        this.size=size;
        this.brand=brand;
        this.price=price;
        this.waterproof=waterproof;
        this.windResistant=windResistant;
        this.weight=weight;
        this.usage=usage;
    }
    void display(){
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Size:"+size);
        System.out.println("Brand:"+brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Waterproof:"+(waterproof ? "Yes" : "No"));
        System.out.println("Wind Resistant:"+(windResistant ? "Yes" : "No"));
        System.out.println("Weight:"+weight + " grams");
        System.out.println("Usage:"+usage);
    }
}