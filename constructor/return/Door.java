class Door{
    String type;
    double height;
    double width;

    public Door(String type,double height,double width) {
        this.type = type;
        this.height = height;
        this.width = width;
    }
	public void show(){
        System.out.println("type:"+this.type );
		System.out.println("height:" +this.height );
		System.out.println("width:"+this.width);
    }
    public Lock getLock() {
        Lock lock=new Lock();
		return lock;
    }
}