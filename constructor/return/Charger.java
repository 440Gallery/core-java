class Charger{
    String brand;
    String type;
    int watt;

    Charger(String brand,String type,int watt){
        this.brand = brand;
        this.type = type;
        this.watt = watt;
    }
    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Watt: " + watt);
    }
}