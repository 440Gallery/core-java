class Tower{
    String name;
    int height;
    String location;

    public Tower(String name,int height,String location){
        this.name=name;
        this.height=height;
        this.location=location;
    }
	void display() {
        System.out.println("Tower Name:"+name );
		System.out.println("Height:"+height );
		System.out.println("Location:"+location);
    }
}
