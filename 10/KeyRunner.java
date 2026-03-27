class KeyRunner{
	public static void main(String[] values){
	    Key.info();
        Key.details(0.03, 5, 150, 6, true);
		
        double keyWeight = 0.1; 
		int keySize = 10; 
		int keyPrice = 500;
		int keyNumberOfCuts = 12; 
		boolean keyIsMasterKey = false;
        Key.details(keyWeight, keySize, keyPrice, keyNumberOfCuts, keyIsMasterKey);

	}
}