/*//declare 5 instance variables 
class Hospital{
	String name;
	String location;
	int noDoctor;
	int noPatient;
	int capacity;
	}
*/
//2 classes show this chaining 
class Hospital{
	String name;
	String location;
	int noDoctor;
	int noPatient;
	int capacity;
	
	Hospital(){
		this("City Hospital", "bengaluru", 50, 120, 200);
	}
	Hospital(String name,String location,int noDoctor,int noPatient,int capacity){
		this.name=name;
		this.location=location;
		this.noDoctor=noDoctor;
		this.noPatient=noPatient;
		this.capacity=capacity;
	}
}
/*
3 classses show super chaining
1 class declare as final
1 class decare a final variable

init with const 6 classes declare 5 instance methods.
Declare subclasses for this 6 parent
override 3 methods. 
Create two instances of subclass , 
invoke all the 5 methods
*/


