class RingRunner{
	public static void main(String[] values){
	    Ring.info();
        Ring.details(5.0, 18.5, 20000, 3, true);
		
        double ringWeight = 7.0; 
		double ringDiameter = 20.0; 
		int ringCost = 35000; 
		int ringNoOfStones = 5; 
		boolean ringIsGold = false;
        Ring.details(ringWeight, ringDiameter, ringCost, ringNoOfStones, ringIsGold);
	}
}