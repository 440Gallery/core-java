class object{
	
}
class Test extends object{
	
	Test(){
		super();
		int x=100;
		int y=200;
	}
	Test(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Test1 extends object{
	Test1(){
		super();
		a=300;
		b=400;
	}
	Test1(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args){
		Test1 test=new Test1();
		test.display();
	}
}

