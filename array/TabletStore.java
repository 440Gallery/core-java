class TabletStore {
    String[] tablets = new String[5];
    int index = 0;

    void saveTablet(String name) {
		System.out.println("tablet saved")
        if (name != null){
			if(index < tablets.length) {
            tablets[index] = name;
            System.out.println("Tablet saved: " + name+"index:"+this.index);
            index++;
			}
        } else {
            System.out.println("Cannot save tablet");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null) {
            for (String temp : tablets) {
                if (name==temp){
                    System.out.println("Tablet found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Tablet not found: " + name);
        }
    }
}