class CountryStoreRunner{
	public static void main(String[] args) {
		//Address address=new Address(String no,int pincode,State state);
		President president=new President("virat",30,null);
		State[] states =new State[1];
		Country country =new Country("india",president,states);
		CountryStore store=new CountryStore();
		store.save(country);
	}
}