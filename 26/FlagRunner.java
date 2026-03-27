class FlagRunner
{
	public static void main(String[] args)
	{
	Flag f=new Flag();
	Flag f1=new Flag();
	Flag f2=new Flag();
	Flag f3=new Flag();
	Flag f4=new Flag();
	
	System.out.println("Default colour:"+f.color);
	f.color="white";
	System.out.println("updated color:"+f.color);
	f1.color="black";
	System.out.println("clour:"+f1.color);
    f2.color="yellow";
	System.out.println("clour:"+f2.color);
	f3.color="brown";
	System.out.println("clour:"+f3.color);
	f4.color="grey";
	System.out.println("clour:"+f4.color);
	
	System.out.println("default country:"+f.country);
	f.country="Japan";
	System.out.println("updated country:"+f.country);
	f1.country="France";
	System.out.println("country:"+f1.country);
    f2.country="Brazil";
	System.out.println("country:"+f2.country);
	f3.country="Germany";
	System.out.println("country:"+f3.country);
	f4.country="China";
	System.out.println("country:"+f4.country);
	
    System.out.println("default width :"+f.width );
	f.width =110.0;
	System.out.println("updated  width:"+f.width );
	f1.width =120.0;
	System.out.println(" width:"+f1.width );
    f2.width =130.0;
	System.out.println(" width:"+f2.width );
	f3.width =140.0;
	System.out.println(" width:"+f3.width );
	f4.width =150.0;
	System.out.println(" width:"+f4.width );
	
    System.out.println("default height:" + f.height);
    f.height = 110.0;
    System.out.println("updated height:" + f.height);
    f1.height = 120.0;
    System.out.println("height:" + f1.height);
    f2.height = 130.0;
    System.out.println("height:" + f2.height);
    f3.height = 140.0;
    System.out.println("height:" + f3.height);
    f4.height = 150.0;
    System.out.println("height:" + f4.height);
	
	System.out.println("default materials:" + f.materials);
    f.materials = "steel";
    System.out.println("updated materials:" + f.materials);
    f1.materials = "aluminum";
    System.out.println("materials:" + f1.materials);
    f2.materials = "plastic";
    System.out.println("materials:" + f2.materials);
    f3.materials = "carbon fiber";
    System.out.println("materials:" + f3.materials);
    f4.materials = "titanium";
    System.out.println("materials:" + f4.materials);

	
	
	}
}