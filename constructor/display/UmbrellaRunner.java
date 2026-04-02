class UmbrellaRunner{
	public static void main(String[] args){
		Umbrella u1=new Umbrella("Foldable","Black","Nylon","Medium","Samsonite",1200,true,true,500,"Rain Protection");
        Umbrella u2=new Umbrella("Golf","Red","Polyester","Large","Nike",2500,true,true,800,"Outdoor Sports");
        Umbrella u3=new Umbrella("Kids","Yellow","Plastic","Small","Disney",600,true,false,300,"School Use");
		
		u1.display();
		u2.display();
		u3.display();
	}
}

