class CoffeeRunner{
	public static void main(String[] values){
	    Coffee.info();
        Coffee.details(500.0, 1200, 90.5, 3, true);
		
        double coffeeWeight = 250.0; 
		int coffeePrice = 600;
		double coffeeTemperature = 85.0; 
		int coffeeRoastLevel = 4; 
		boolean coffeeIsOrganic = false;
        Coffee.details(coffeeWeight, coffeePrice, coffeeTemperature, coffeeRoastLevel, coffeeIsOrganic);

	}
}