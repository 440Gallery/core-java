class Lock{
    String material;
    int strengthLevel;
    boolean digital;
	
    public Lock(String material,int strengthLevel,boolean digital) {
        this.material=material;
        this.strengthLevel=strengthLevel;
        this.digital=digital;
    }
    public void display() {
        System.out.println("Material:"+this.material );
		System.out.println("Strength Level:" +this.strengthLevel );
		System.out.println("Digital:"+this.digital);
    }
}
