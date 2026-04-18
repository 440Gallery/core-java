class Country{
	String name;
	String President;
	State[] state;
	
	Country(String name,String President,State[] state){
		
		this.name=name;
		this.president=president;
		this.state=state;
		
		void countryDisplay(){
			System.out.println("name:"+name);
			System.out.println("president:"+president);
			System.out.println("state:"+state);
		}
		
	}
}
