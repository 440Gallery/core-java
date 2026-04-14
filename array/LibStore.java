class LibStore{
	
	String[] books=new String[5];
    int index=0;
	
	void saveBook(String names){
		System.out.println("books save");
		
		if(names!=null){
			System.out.println("name is not null");
			
			if(index < books.length){
			this.books[index]=names;
			System.out.println("booksNames is saved"+"name:"+names +"index:"+this.index);
			index++;
			}
			
			else{
				System.out.println("cannot save more books");
				}
		}
		
		else{
			System.out.println("name is null");
		}

	}
	
	void search(String name)
	{
		boolean found = false;
		
		if(name!=null){
			System.out.println("names is not null");
			
			for (String temp : books) {
				
				if (temp == name){
					System.out.println("name is found: " + name);
					found = true;
					break; 
                }
			}
				if(!found){
					System.out.println("name is not found");
				}
           }
		else{
			System.out.println("names is null");
			}
	}
}