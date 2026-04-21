class FarmHouse {
    String name;
    String location;

    void open(){
		System.out.println("opened."); 
	}
    void close(){
		System.out.println("closed."); 
	}
    void FarmHouseCost(){
		System.out.println("cost 30000."); 
	}
    void service(){
		System.out.println("availabe");
	}
    void displayInfo(){
		System.out.println("FarmHouse: " + name ); 
		System.out.println("Location: " + location); 
	}
}