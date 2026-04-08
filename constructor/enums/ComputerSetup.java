class ComputerSetup{
	int ram;
	Monitor monitor;
	String cpu;
	String operatingsystem;
	
	ComputerSetup(int ram,String cpu,String operatingsystem,Monitor monitor){
		this.ram=ram;
		this.cpu=cpu;
		this.operatingsystem=operatingsystem;
		this.monitor=monitor;
	}
	void checkinfo(){
		System.out.println(".....details.....");
		System.out.println("ram:"+ram);
		System.out.println("cpu:"+cpu);
		System.out.println("operatingsystem:"+operatingsystem);
		if(monitor!=null)
		{
		monitor.display();
		}
		else{
			System.out.println("invalid");
		}
	}
}