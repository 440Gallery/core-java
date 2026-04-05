class ArtMaterialRunner{
    public static void main(String[] args) {
		ArtMaterial artmaterial=new ArtMaterial();
		ArtMaterial artmaterial1=new ArtMaterial("Clay","Shilpi");
		ArtMaterial artmaterial2=new ArtMaterial("Pencil","Apsara","Drawing");
        ArtMaterial clay=new ArtMaterial("Clay","Shilpi","Craft","Natural",150.0,2,"Soil",true,"Sculpting","500g Pack");
        ArtMaterial gum=new ArtMaterial("Gum","Fevicol","Adhesive","White",50.0,1,"Synthetic",false,"Sticking","200ml Tube");
        ArtMaterial pencil=new ArtMaterial("Pencil","Apsara","Drawing","Black",10.0,12,"Wood",true,"Sketching","HB");
		
        artmaterial.display();
        artmaterial1.display();
		artmaterial2.display();
        clay.display();
        gum.display();
        pencil.display();
    }
}