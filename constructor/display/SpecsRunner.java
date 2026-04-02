class SpecsRunner{
    public static void main(String[] args) {
        Specs s1=new Specs("RayBan","Full Rim","Photochromic","Black",4500,true,"Metal",25.0,"Classic","Medium");
        Specs s2=new Specs("Oakley","Half Rim","Polarized","Blue",6000,true,"Plastic",20.0,"Sport","Large");
        Specs s3=new Specs("Titan Eye+","Rimless","Normal","Brown",3000, false,"Titanium",18.0,"Formal","Small");
        s1.display();
        s2.display();
        s3.display();
    }
}