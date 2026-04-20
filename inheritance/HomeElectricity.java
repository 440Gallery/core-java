class HomeElectricity extends Electricity{
	int rooms;
	String typeOfElectricity;
	
	HomeElectricity(){
		super();
	}
	HomeElectricity(int rooms,String typeOfElectricity){
		this.rooms = rooms;
		this.typeOfElectricity = typeOfElectricity;
		
		System.out.println("rooms:"+ rooms);
		System.out.println("typeOfElectricity:"+ typeOfElectricity);
	}
}