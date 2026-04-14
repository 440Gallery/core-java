class SparkPlugStore{
    String[] sparkPlugs = new String[5];
    int index = 0;

    void saveSparkPlug(String name) {
		System.out.println("sparkPlugs saved");
        if (name != null){
			if(index < sparkPlugs.length){
            sparkPlugs[index] = name;
            System.out.println("SparkPlug saved: " + name+"index:"+this.index);
            index++;
        } else {
            System.out.println("Cannot save spark plug");
        }
    }
    void search(String name) {
        boolean found = false;
        if (name != null){
            for (String temp : sparkPlugs) {
                if (name==temp){
					System.out.println("SparkPlug found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("SparkPlug not found: " + name);
        }
    }
}