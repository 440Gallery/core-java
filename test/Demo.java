class Demo{
	String name;
	int age;
	String collegeName;
	double height;
	Array[] arr;
	
	Demo(String name,int age,String collegeName,double height,Array[] arr){
		this.name=name;
		this.age=age;
		this.collegeName=collegeName;
		this.height=height;
		this.arr=arr;
	}
	void show(){
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("collegeName:"+this.collegeName);
		System.out.println("height:"+this.height);
		if(arr != null)
		{
			for (Array start : arr) 
			{
					start.info();
			}
		}
		else
		{
			System.out.println("array are null");
		}
	}
}