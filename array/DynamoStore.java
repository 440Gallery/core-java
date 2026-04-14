class DynamoStore {
    String[] dynamos = new String[5];
    int index = 0;
    void saveDynamo(String name) {
		System.out.println("DynamoStore item");
        if (name != null) {
			if(index < dynamos.length) {
            dynamos[index] = name;
            System.out.println("Dynamo saved: " + name+"index:"+this.index);
            index++;
			}
        } else {
            System.out.println("Cannot save dynamo");
        }
    }

    void search(String name) {
        boolean found = false;
        if (name != null){
            for (String temp : dynamos) {
                if (name == temp) {
                    System.out.println("Dynamo found: " + name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Dynamo not found: " + name);
        }
    }
}