class CupStore {
    String[] cups = new String[5];
    int index = 0;

    void saveCup(String name) {
        if (name != null){
			System.out.println("name is not null");
			if(index < cups.length) {
            cups[index] = name;
            System.out.println("Cup saved: " + name+"index:"+this.index);
            index++;
			}
        } else {
            System.out.println("Cannot save cup");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null) {
            for (String temp : cups) {
                if (name==temp) {
                    System.out.println("Cup found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Cup not found: " + name);
        }
    }
}