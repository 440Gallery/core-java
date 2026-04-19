class Address{
	String no;
	int pincode;
	State state;
	Address(){
		
	}
	Address(String no,int pincode,State state){
		this.no=no;
		this.pincode=pincode;
		this.state=state;
	}
	void addressDisplay(){
		System.out.println("no:"+no);
		System.out.println("pincode:"+pincode);
		state.stateDisplay();
	}
}