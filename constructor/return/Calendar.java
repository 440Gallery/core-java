class Calendar{
    int year;
    String month;
    int totalDays;

    public Calendar(int year,String month,int totalDays){
        this.year=year;
        this.month=month;
        this.totalDays=totalDays;
    }
	void show(){
        System.out.println("year:" +this.year);
		System.out.println("month:" +this.month);
		System.out.println("totalDays:" +this.totalDays);
    }
    public Day getDay() {
        Day day=new Day("wednesday",false,"summer");
		return day;
    }
}
