class CalendarRunner {
    public static void main(String[] args) {
        Calendar calendar=new Calendar(2026, "December", 31);
		calendar.show();
        Day day=calendar.getDay();
        day.display();
    }
}