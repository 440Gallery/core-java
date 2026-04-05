class SpecsRunner{
    public static void main(String[] args) {
		Specs.specs1=new Specs();
		Specs.specs2=new Specs("RayBan","Full Rim");
		Specs.specs3=new Specs("lenskart","Half Rim","Polarized");
        Specs s1=new Specs("RayBan","Full Rim","Photochromic","Black",4500,true,"Metal",25.0,"Classic","Medium");
        Specs s2=new Specs("lenskart","Half Rim","Polarized","Blue",6000,true,"Plastic",20.0,"Sport","Large");
        Specs s3=new Specs("Titan Eye+","Rimless","Normal","Brown",3000, false,"Titanium",18.0,"Formal","Small");
		specs1.display();
		specs2.display();
		specs3.display();
        s1.display();
        s2.display();
        s3.display();
    }
}