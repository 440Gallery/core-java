class AeroplaneStore {
    String[] aeroplanes = new String[5];
    int index =0;

    void saveAeroplane(String name){
		System.out.println("saved aeroplane");
        if (name!= null){
			if(index < aeroplanes.length){
            aeroplanes[index] = name;
            System.out.println("Aeroplane saved:" + name + "index:"+ this.index);
            index++;
			}
        } else {
            System.out.println("Cannot save aeroplane");
        }
    }
	
    void search(String name) {
        boolean found = false;
        if(name!= null){
            for (String temp : aeroplanes) {
                if (name == temp){
                    System.out.println(" Aeroplane found: " + name);
                    found = true;
                    break;
				}
            }
        }
        if(!found){
            System.out.println("Aeroplane not found: " + name);
        }
    }
}