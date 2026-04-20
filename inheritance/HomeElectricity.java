class HomeElectricity extends Electricity{
	int rooms;
	String typeOfElectricity;
	
	HomeElectricity(){
		super();
	}
	HomeElectricity(int rooms,String typeOfElectricity){
		this.rooms = rooms;
		this.typeOfElectricity = typeOfElectricity;
	}
	void show(){
		System.out.println("...ElectricityDetails...");
		System.out.println("source:"+source);
		System.out.println("voltage:"+voltage);
		System.out.println("rooms:"+rooms);
		System.out.println("typeOfElectricity:"+typeOfElectricity);
	}
}