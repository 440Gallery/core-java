class File1 extends File{
	File1(){
		super();
		txt="text file";
		jpg="image file";
	}
	
	File1(String txt,String jpg){
		this.txt=txt;
		this.jpg=jpg;
	}
	void display(){
		System.out.println(txt);
		System.out.println(jpg);
		System.out.println(pdf);
		System.out.println(ppt);
	}
}