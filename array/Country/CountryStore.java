/*Country[10] save(Country country);\n 
Country findByName(String name)\n 
State findStateByStateName(String name)\n 
City[] findAllCityByStateName(String name) 
int findNoOfDistrictsByCityName(String name)\n 
Country findByCollectorName(String collectorName)\n
*/
class CountryStore{
	Country[] countries=new Country[10];
	
	void save(Country country){
		for(int i=0;i<countries.length;i++){
			if(countries[i]== null){
				countries[i]=country;
				System.out.println("country name:"+country.name);
				return;
			}
		}
		System.out.println("full cannnot save more countries");
	} 
	Country findByName(String name){
		for(Country c:countries){
			if(c != null && c.name.equals(name)){
				System.out.println("find name:"+name);
				return c;
			}
		}
		System.out.println(name + " not found");
		return null;
	}
	
	State findStateByStateName(String name){
		for (Country c : countries) {
                for (State s : c.states) {
                    if (s != null && s.name.equals(name)) {
                        System.out.println("state found: " + s.name);
                        return s;
						}
                    }
            }
        System.out.println(name + " state not found");
		return null;		
	}
	
	City[] findAllCityByStateName(String name){
		for (Country c : countries) {
                for (State s : c.states){
					if(name==){
						City[] cities = new City[1];
                            cities[0] = state.city; 
                            return cities;
					}
				}
		
	}
	/*
	int findNoOfDistrictsByCityName(String name){
		
	}
	Country findByCollectorName(String collectorName){
		
	}
*/
}

