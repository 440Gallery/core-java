class FarmHouse {
    String name;
    String location;
    int rooms;
	String ownerName;
	String FarmHouseCost;

    void open(){
		System.out.println("opened."); 
	}
    void close(){
		System.out.println("closed."); 
	}
    void FarmHouseCost(){
		System.out.println("cost 30000."); 
	}
    void rooms(){
		System.out.println("5 rooms")
	}
    void displayInfo(){
		System.out.println("FarmHouse: " + name ); 
		System.out.println("Location: " + location); 
	}
}