class CityRunner {
    public static void main(String[] args) {
        City city=new City("Bengaluru", 12000000, "Technology");
		city.show();
        Tower tower=city.getTower();
        tower.display();
    }
}