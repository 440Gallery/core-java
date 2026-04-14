class LibStoreRunner{
	public static void main(String[] args){
		LibStore libStore=new LibStore();
		libStore.saveBook("richdad poordad");
		libStore.saveBook("chemistry");
		libStore.saveBook("heliogo karanna");
		libStore.saveBook("malgudi days");
		libStore.saveBook("gitanjali");
		libStore.saveBook("god father");
		libStore.search("harry potter");
		libStore.search("god father");
		libStore.search(null);
	}
}