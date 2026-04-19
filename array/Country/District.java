class District{
	String name;
	Collector collector;
	
	District(){
		
	}
	District(String name,Collector collector){
		this.name=name;
		this.collector=collector;
		
	}
	void districtDisplay(){
		System.out.println("name:"+name);
		collector.collectorDisplay();
		
	}
}