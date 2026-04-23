class Mobile{
	String brand;
	double price;
	
	Mobile(){
		System.out.println("no-arg constructor");
	} 
	Mobile(String brand){
		this.brand=brand;
	}
	Mobile(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	void show(){
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		
	}
}