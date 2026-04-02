class ChainRunner{
    public static void main(String[] args){
        Chain c1=new Chain("Gold","Rope","20 inches",15.0,"Golden",25000,"Tanishq",true,"Wedding","Traditional");
        Chain c2=new Chain("Silver","Box","18 inches",12.0,"Silver",5000,"SilverLine",false,"Casual","Minimalist");
        Chain c3=new Chain("Platinum","Snake","22 inches",20.0,"White",75000,"PC Jewellers",false,"Anniversary","Modern");

        c1.display();
        c2.display();
        c3.display();
    }
}