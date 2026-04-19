class Country
{
	String name;
	President president;
	State[] states;
	
	Country(String name,President president,State[] states){
		
		this.name=name;
		this.president=president;
		this.states=states;
	}
		
    void countryDisplay(){
			System.out.println("name:"+name);
			president.presidentDisplay();
			for (State s : states){
				s.stateDisplay();
				}
			}
	}
}
