class ElectricityRunner{
	public static void main(String[] args){
	Electricity e= new Electricity();
	e.show();
	Electricity e1 = new Electricity("solar",220.0);
	e1.show();
	HomeElectricity he= new HomeElectricity();
	
	HomeElectricity he1 =new HomeElectricity(2,"direct current");
	}
}