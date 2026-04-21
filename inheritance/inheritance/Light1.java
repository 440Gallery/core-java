class Light1 extends Candle{
	Light1(){
		super("red",20.0);
	}
	Light1(int brightnes,int duration){
		this.brightnes=brightnes;
		this.duration=duration;
	}
	void display(){
		System.out.println(brightnes);
		System.out.println(duration);
		System.out.println(color);
		System.out.println(price);
	}
}