//State[] President: name,age,Address Address: no,pincode,
class President{
	String name;
	int age;
	Address address;
	
	President(){
		
	}
	President(String name,int age,Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void presidentDisplay(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

}
