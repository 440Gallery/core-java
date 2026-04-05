class ArtMaterial{
    String name;
    String brand;  
    String type;  
    String color;    
    double price;       
    int quantity;     
    String material;    
    boolean ecoFriendly;
    String usage;      
    String size;
	
	ArtMaterial(){	
	}
	ArtMaterial(String name,String brand){
		this.name=name;
        this.brand=brand;	
	}
	ArtMaterial(String name, String brand, String type){
		this.name=name;
        this.brand=brand;
        this.type=type;
		
	}
    ArtMaterial(String name,String brand,String type,String color,double price,int quantity,String material,boolean ecoFriendly,String usage,String size){
        this.name=name;
        this.brand=brand;
        this.type=type;
        this.color=color;
        this.price=price;
        this.quantity=quantity;
        this.material=material;
        this.ecoFriendly=ecoFriendly;
        this.usage=usage;
        this.size=size;
    }
    void display() {
		System.out.println("..............");
        System.out.println("Name:"+name);
        System.out.println("Brand:"+brand);
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Price:" + price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Material:"+material);
        System.out.println("Eco-Friendly:"+ ecoFriendly);
        System.out.println("Usage:"+usage);
        System.out.println("Size:"+size);
    }
}