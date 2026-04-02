class InkPad{
    String color;
    String brand;
    String size;
    String shape;
    String material;
    double price;
    boolean refillable;
    String usage;
    String durability;
    double weight;

    public InkPad(String color,String brand,String size,String shape,String material,double price,boolean refillable,String usage,String durability,double weight){
        this.color=color;
        this.brand=brand;
        this.size=size;
        this.shape=shape;
        this.material=material;
        this.price=price;
        this.refillable=refillable;
        this.usage=usage;
        this.durability=durability;
        this.weight=weight;
    }

    void displayInfo(){
        System.out.println("Color:"+color);
        System.out.println("Brand:"+brand);
        System.out.println("Size:"+size);
        System.out.println("Shape:"+shape);
        System.out.println("Material:"+material);
        System.out.println("Price: ₹" + price);
        System.out.println("Refillable:"+(refillable ? "Yes" : "No"));
        System.out.println("Usage:"+usage);
        System.out.println("Durability:"+durability);
        System.out.println("Weight:"+weight);
    }
}