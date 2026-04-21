class ColorTape extends Tape{
    @Override
    void cut() {
        System.out.println("Color tape cut");
    }
	@Override
	void roll(){
		System.out.println("Tape roll"); 
	}
    @Override
    void displayInfo() {
		System.out.println("color: " + color);
		System.out.println("Tape: " + brand);
        System.out.println("width: " + width);	
		System.out.println("price: " + price);	
	}
}