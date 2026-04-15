class DemoRunner{
	public static void main(String[] args){
		Array array1=new Array("anu",21,"BIET",5.32);
		array1.show();
		Array array2=new Array("anu",21,"BIET",5.32);
		array2.collegeName="BIT";
		array2.show();
		Array array3=new Array("anu",21,"BIET",5.32);
		array3.collegeName="";
		array3.show();
		
		Demo demo=new Demo("anu",21,"BIET",5.32,array1,array2,array3);
	}
}