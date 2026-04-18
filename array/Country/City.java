class City{
	String name;
	int noOfDistricts;
	District[] district;
	City(){
		
	}
	City(String name,int noOfDistricts,District[] district){
		this.name=name;
		this.noOfDistricts=noOfDistricts;
		this.district=district;
	}
	void cityDisplay(){
		System.out.println("name:"+name);
		System.out.println("noOfDistricts:"+noOfDistricts);
		System.out.println("district:"+district);
	}
}