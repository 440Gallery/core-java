class Address{
	String name;
	int pincode;
	
	Address(){
		
	}
	Address(String name,int pincode){
		this.name=name;
		this.pincode=pincode;
	}
	void addressDisplay(){
		System.out.println("name:"+name);
		System.out.println("pincode:"+pincode);
	}
}