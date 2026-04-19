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
		countries[i]=country;
		return;
		}
		System.out.println("full cannnot save more countries");
	} 
}