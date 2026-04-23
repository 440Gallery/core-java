class MobileRunner{
	public static void main(String[] args)
	{
	Mobile m =new Mobile();
    Mobile m2 =new Mobile("Samsung");
	m2.show();
    Mobile m3 =new Mobile("Apple", 80000);
	m3.show();
	Apps a = new Apps();
    a.GameApps();
    a.EditingApps();
    }
}