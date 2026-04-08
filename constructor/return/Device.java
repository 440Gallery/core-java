class Device{
    String brand;
    String model;
    int batteryCapacity;

    Device(String brand,String model,int batteryCapacity){
        this.brand=brand;
        this.model=model;
        this.batteryCapacity=batteryCapacity;
    }
	void show(){
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("batteryCapacity:"+batteryCapacity);
	}
    public Charger getCharger(){
		Charger charger=new Charger("Samsung","folding",6000);
		return charger;
    }
}