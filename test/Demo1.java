class Demo1{
	
	
	public static void main(String[] args){
		String[] name={"anu","yashu"};
		System.out.println(name[0]);
		System.out.println(name[1]);
		name[0]="prathiba";
		System.out.println("update:"+name[0]);
		name[1]=null;
		System.out.println("remove:"+name[1]);
	}
}

