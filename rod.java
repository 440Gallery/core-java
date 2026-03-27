class Rod{
	static void info(){
	    String type="fishing rod";
	    double length=2.5;
	    String color="black";
	    int price=1200;
        double weight;
        String material;
        String brand;
        int quantity;
	
	    System.out.println("type:"+type);
	    System.out.println("length:"+length);
	    System.out.println("color:"+color);
	    System.out.println("price:"+price);
	}

	static void details(double weight,String material,String brand,int quantity)
	{
		System.out.println("weight:"+weight);
        System.out.println("material:"+material);
        System.out.println("brand:"+brand);
        System.out.println("quantity:"+quantity);
		
	}
}
