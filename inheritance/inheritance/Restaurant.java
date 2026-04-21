class Restaurant{
    String name;
    int tables;
    double rating;

    void serveFood() {
		System.out.println("Food served");
	}
    void order() {
		System.out.println("Ordered");
	}
    void tables() {
		System.out.println("cleaned"); 
	}
    void displayInfo() {
		System.out.println("Restaurant:" + name);
		System.out.ptintln("rating:" + rating);
	}
}