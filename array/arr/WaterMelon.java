class WaterMelon{
    String color;
    double weight;
    String shape;
    String origin;
    boolean ripe;
    int seeds;
    double price;
    String taste;
    String season;
    String variety;

    WaterMelon(String color, double weight, String shape, String origin,boolean ripe, int seeds, double price, String taste,String season, String variety){
        this.color=color;
        this.weight=weight;
        this.shape=shape;
        this.origin=origin;
        this.ripe=ripe;
        this.seeds=seeds;
        this.price=price;
        this.taste=taste;
        this.season=season;
        this.variety=variety;
    }

    void display(){
		System.out.println("....................");
        System.out.println("WaterMelon color:"+color);
        System.out.println("weight:"+weight);
        System.out.println("shape:"+shape );
        System.out.println("origin:"+origin);
        System.out.println(" ripe:"+ripe );
		System.out.println("seeds:"+seeds );
		System.out.println("price:"+price );
		System.out.println(" taste:"+taste );
		System.out.println("season:"+season );
		System.out.println(" variety:"+variety );
    }
}
