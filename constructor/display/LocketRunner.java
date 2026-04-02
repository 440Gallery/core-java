class LocketRunner{
    public static void main(String[] args) {
        Locket l1=new Locket("Gold","Heart","Golden",15.5,"Floral","Thin",25000,"Tanishq",true,"Anniversary");
        Locket l2=new Locket("Silver","Oval","Silver",12.0,"Minimalist","Box",5000,"SilverLine",false,"Birthday");
        Locket l3=new Locket("Platinum","Round","White",20.0,"Diamond","Rope",75000,"Jewellers",true,"Wedding");
        l1.display();
        l2.display();
        l3.display();
    }
}