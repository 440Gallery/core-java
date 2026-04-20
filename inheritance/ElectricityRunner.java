class ElectricityRunner{
	public static void main(String[] args){
	Electricity e= new Electricity();
	Electricity e1 = new Electricity("solar",220.0);
	
	HomeElectricity he= new HomeElectricity();
	
	HomeElectricity he1 =new HomeElectricity(2,"direct current");
	}
}