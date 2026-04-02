class Rocket{
    String name;
    String fuelType;
    double height;
    double weight;
    double payloadCapacity;
    double speed;
    String country;
    String missionType;
    double cost;
    boolean reusable;
    Rocket(String name,String fuelType,double height,double weight,double payloadCapacity,double speed,String country,String missionType,double cost,boolean reusable){
        this.name=name;
        this.fuelType=fuelType;
        this.height=height;
        this.weight=weight;
        this.payloadCapacity=payloadCapacity;
        this.speed=speed;
        this.country=country;
        this.missionType=missionType;
        this.cost=cost;
        this.reusable=reusable;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Fuel Type:"+fuelType);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
        System.out.println("Payload Capacity:"+payloadCapacity);
        System.out.println("Speed:"+speed );
        System.out.println("Country:"+country);
        System.out.println("Mission Type:"+missionType);
        System.out.println("Cost: ₹" + cost);
        System.out.println("Reusable:"+reusable);
    }
}