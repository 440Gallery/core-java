class Spoon{
	static void info(){
		double weight=150;
		int price=299;
		double length=20.5;
		
		System.out.println("weight:"+weight);
		System.out.println("price:"+price);
		System.out.println("length:"+length);
	}
	static void details(double weight,int price,double length){
		if(weight>0 && weight<=500){
			System.out.println("valid weight:"+weight);
		}
		else{
			System.out.println("invalid weight");
		}
		if(price>0 && price<=10000){
			System.out.println("valid price:"+price);
		}
		else{
			System.out.println("invalid price");
		}
		if(length>0 && length<=50){
			System.out.println("valid length:"+length);
		}
		else{
			System.out.println("invalid length");
		}
	}
}