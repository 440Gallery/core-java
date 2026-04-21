class Tape{ 
    String brand;
    String material;
    double width;
    double price;
	
    void cut(){
		System.out.println("Tape cut"); 
	}
    void roll(){
		System.out.println("Tape roll"); 
	}
	void material(){
		System.out.println("material"); 
	}
    void displayInfo() {
		System.out.println("Tape: " + brand);
        System.out.println("width: " + width);	
		System.out.println("price: " + price);	
	}
}