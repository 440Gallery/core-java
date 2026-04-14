class SolarSystemStore {
    String[] planets = new String[5];
    int index = 0;

    void savePlanet(String name) {
        if (name != null ){
			System.out.println("name is not null");
			
			if(index < planets.length) {
            planets[index] = name;
            System.out.println("Planet saved: " + name +"index:"+this.index);
            index++;
		}
        } else {
            System.out.println("Cannot save planet");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null) {
            for (String temp : planets) {
                if (name ==temp) {
                    System.out.println("Planet found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Planet not found: " + name);
        }
    }
}