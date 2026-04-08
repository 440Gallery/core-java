class City{
    String cityName;
    int population;
    String famousFor;

    public City(String cityName,int population,String famousFor){
        this.cityName=cityName;
        this.population=population;
        this.famousFor=famousFor;
    }
	void show(){
        System.out.println("cityName:"+cityName );
		System.out.println("population:"+population );
		System.out.println("famousFor:"+famousFor);
    }
    public Tower getTower(){
		Tower tower=new Tower("Tower",115000,"goa");
		return tower;
        
    }
}