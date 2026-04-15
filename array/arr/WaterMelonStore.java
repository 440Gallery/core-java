class WaterMelonStore{
    WaterMelon[] melons=new WaterMelon[20];
    int count=0;

    void save(WaterMelon waterMelon){
		if(melons!=null){
			if (count < melons.length){
				melons[count]=waterMelon;
				System.out.println("melonsindex"+this.count);
				count++;
				}
		   else {
                System.out.println("Store is full!");
            }
        } else {
            System.out.println("WaterMelon is null");
        }
    }

    void displayAll(){
		System.out.println("Displaying all elemnts is an array");
		boolean found =false;
		
		for(WaterMelon waterMelon : this.melons){
			
			if(waterMelon != null){
				waterMelon.display();
				found = true;
			}
		}
		if(!found){
			System.out.println("Array cannot be null");
		}
	}
}
