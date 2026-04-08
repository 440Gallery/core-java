class Card{
	String holderName;
	int number;
	
	Card(String holderName,int number){
		this.holderName=holderName;
		this.number=number;
	}
	void display(){
		System.out.println("card details");
		System.out.println("holderName:"+holderName);
		System.out.println("number:"+number);
	}
}