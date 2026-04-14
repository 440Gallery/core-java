class AlloyStore {
    String[] alloys = new String[5];
    int index = 0;

    void saveAlloy(String name) {
        if (name != null && index < alloys.length) {
            alloys[index] = name;
            System.out.println("Alloy saved: " + name+"index:"+this.index);
            index++;
        } else {
            System.out.println("Cannot save alloy");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null) {
            for (String temp : alloys) {
                if (name==temp){
                    System.out.println("Alloy found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("Alloy not found: " + name);
        }
    }
}