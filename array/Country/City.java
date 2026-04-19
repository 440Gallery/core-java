class City{
	String name;
	int noOfDistricts;
	District[] districts;
	City(){
		
	}
	City(String name,int noOfDistricts,District[] districts){
		this.name=name;
		this.noOfDistricts=noOfDistricts;
		this.districts=districts;
	}
	void cityDisplay(){
		System.out.println("name:"+name);
		System.out.println("noOfDistricts:"+noOfDistricts);
		for(District d =districts){
			d.districtsDisplay();
		}
	}
}