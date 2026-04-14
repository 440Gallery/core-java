class JuiceStore {
    String[] juices = new String[5];
    int index = 0;

    void saveJuice(String name) {
        if (name != null){
			if(index < juices.length) {
            juices[index] = name;
            System.out.println("Juice saved: " + name+"index:"+this.index);
            index++;
			}
        } else {
            System.out.println("Cannot save juice");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null) {
            for (String temp : juices) {
                if (name==temp) {
                    System.out.println("Juice found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Juice not found: " + name);
        }
    }
}