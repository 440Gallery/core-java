class State{
	String name;
	long population;
	City city;
	
	State(){
		
	}
	State(String name,long population,City city){
		this.name=name;
		this.population=population;
		this.city=city;
		
	}
	void stateDisplay(){
		System.out.println("name:"+name);
		System.out.println("population:"+population);
		city.cityDisplay();
	}
}