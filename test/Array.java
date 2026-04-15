class Array{
	String name;
	int age;
	String collegeName;
	double height;
	Demo(String name,int age,String collegeName,double height){
		this.name=name;
		this.age=age;
		this.collegeName=collegeName;
		this.height=height;
	}
	void info(){
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("collegeName:"+this.collegeName);
		System.out.println("height:"+this.height);