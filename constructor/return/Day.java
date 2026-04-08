class Day{
    String name;
    boolean holiday;
    String season;
    Day(String name,boolean holiday,String season){
        this.name=name;
        this.holiday=holiday;
        this.season=season;
    }
    void display(){
        System.out.println("Day:" +this.name);
		System.out.println("Holiday:" +this.holiday);
		System.out.println("Season:" +this.season);
    }
}
