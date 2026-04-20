class Electricity{
	String source;
	double voltage;
	
	Electricity(){
	}
	Electricity(String source,double voltage){
		this.source=source;
		this.voltage=voltage;
	}
	void show(){
		System.out.println("...ElectricityDetails...");
		System.out.println("source:"+source);
		System.out.println("voltage:"+voltage);
	}
}