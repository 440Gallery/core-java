class Chain{
    String material;
    String type;
    String length;
    double weight;
    String color;
    double price;
    String brand;
    boolean isGoldPlated;
    String occasion;
    String style;

    Chain(String material,String type,String length, double weight,String color,double price,String brand, boolean isGoldPlated,String occasion,String style) {
        this.material=material;
        this.type=type;
        this.length=length;
        this.weight=weight;
        this.color=color;
        this.price=price;
        this.brand=brand;
        this.isGoldPlated=isGoldPlated;
        this.occasion=occasion;
        this.style=style;
    }
    void display(){
        System.out.println("Material:"+material);
        System.out.println("Type:"+type);
        System.out.println("Length:"+length);
        System.out.println("Weight:"+weight + " grams");
        System.out.println("Color:"+color);
        System.out.println("Price: ₹" + price);
        System.out.println("Brand:"+brand);
        System.out.println("Gold Plated:"+(isGoldPlated ? "Yes" : "No"));
        System.out.println("Occasion:"+occasion);
        System.out.println("Style:"+style);
    }
}