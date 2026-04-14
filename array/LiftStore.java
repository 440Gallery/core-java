class LiftStore {
    String[] lifts = new String[5];
    int index = 0;

    void saveLift(String name){
		System.out.println("liftstore saved");
        if (name != null){
			if(index < lifts.length) {
            lifts[index] = name;
            System.out.println("Lift saved: " + name);
            index++;
			}
        } else {
            System.out.println("Cannot save lift");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null){
            for (String temp : lifts){
                if (name == temp){
                    System.out.println("Lift found:" + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("Lift not found: " + name);
        }
    }
}