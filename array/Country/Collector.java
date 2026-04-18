class Collector {
	String name;
	int batchNo;
	
	Collector(){
		
	}
	Collector(String name,int batchNo){
		this.name=name;
		this.batchNo=batchNo;
		
	}
	void collectorDisplay(){
		System.out.println("name:"+name);
		System.out.println("batchNo:"+batchNo);
		
	}
}