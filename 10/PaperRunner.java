class PaperRunner{
	public static void main(String[] values){
	    Paper.info();
        Paper.details(29.7, 80.0, 10, true, 21.0);
		
        double paperHeight = 35.0; 
		double paperWeight = 100.0;
		int paperCost = 20; 
		boolean paperGoodQuality = false; 
		double paperWidth = 25.0;
        Paper.details(paperHeight, paperWeight, paperCost, paperGoodQuality, paperWidth);

	}
}