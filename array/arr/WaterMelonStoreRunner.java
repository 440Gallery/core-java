class WaterMelonStoreRunner {
    public static void main(String[] args) {
        WaterMelonStore wmStore = new WaterMelonStore();
		
        WaterMelon watermelon = new WaterMelon("Green",2.5, "Round","India",true, 200, 50.0, "Sweet","Summer","Hybrid");
        wmStore.save(watermelon);

        WaterMelon watermelon1 = new WaterMelon("Yellow",3.0, "Oval","USA",false, 150, 60.0, "Mild","Spring","Wild");
        wmStore.save(watermelon1);
		
		WaterMelon watermelons2 = new WaterMelon("Green",3.2, "Round","India",true,  180, 45.0, "Sweet", "Summer","Organic");
		wmStore.save(watermelons2);
		WaterMelon watermelons3 = new WaterMelon("Red",4.1, "Round","India",false, 160, 55.0, "VerySweet","Summer","Deluxe");
		
		wmStore.save(watermelons3);
		WaterMelon watermelons4= new WaterMelon("PaleGreen",2.8, "Round","India",true,  190, 48.0, "Sweet",  "Summer","Local");
		wmStore.save(watermelons4);
		WaterMelon watermelons5= new WaterMelon("DarkGreen",3.5, "Oval","India",false, 170, 52.0, "Mild",   "Summer","Export");
		wmStore.save(watermelons5);
		WaterMelon watermelons6 = new WaterMelon("GreenStriped",3.9, "Round","India",false, 165, 58.0, "Sweet",  "Summer","CashCrate");
		wmStore.save(watermelons6);
		WaterMelon watermelons7= new WaterMelon("Yellow",2.9, "Round","USA",true,  140, 62.0, "Mild",   "Summer","Imported");
		wmStore.save(watermelons7);
		WaterMelon watermelons8= new WaterMelon("Green",3.1, "Round","India",true,  185, 47.0, "Sweet", "Summer","Natural");
		wmStore.save(watermelons8);
		WaterMelon watermelons9= new WaterMelon("Striped",3.6, "Oval","India",false, 175, 54.0, "Sweet",  "Summer","Farmer");
		wmStore.save(watermelons9);
		WaterMelon watermelons10= new WaterMelon("Green",3.3, "Round","India",true, 195, 49.0,"Sweet", "Summer","Garden");
		wmStore.save(watermelons10);
		WaterMelon watermelons11= new WaterMelon("Green",3.3, "Round","India",true,  195, 49.0, "Sweet",  "Summer","Garden");
		wmStore.save(watermelons11);
		WaterMelon watermelons12= new WaterMelon("Green",3.3, "Round","India",true, 195, 49.0, "Sweet", "Summer","Garden");
		wmStore.save(watermelons12);
		WaterMelon watermelons13= new WaterMelon("Green",3.3, "Round","India",true,195, 49.0,"Sweet",  "Summer","Garden");
		wmStore.save(watermelons13);
		WaterMelon watermelons14= new WaterMelon("Green",3.3, "Round","India",true,  195, 49.0, "Sweet",  "Summer","Garden");
		wmStore.save(watermelons14);
		WaterMelon watermelons15= new WaterMelon("Green",3.3, "Round","India",true, 195, 49.0, "Sweet",  "Summer","Garden");
		wmStore.save(watermelons15);
		WaterMelon watermelons16= new WaterMelon("Green",3.3, "Round","India",true,  195, 49.0,"Sweet", "Summer","Garden");
		wmStore.save(watermelons16);
		WaterMelon watermelons17= new WaterMelon("Green",3.3, "Round","India",true, 195, 49.0, "Sweet",  "Summer","Garden");
		wmStore.save(watermelons17);
		WaterMelon watermelons18= new WaterMelon("Green",3.3, "Round","India",true, 195, 49.0, "Sweet", "Summer","Garden");
		wmStore.save(watermelons18);
		WaterMelon watermelons19= new WaterMelon("Green",3.3, "Round","India",true,  195, 49.0, "Sweet",  "Summer","Garden");
		wmStore.save(watermelons19);
 
		
		wmStore.displayAll();
    }
}