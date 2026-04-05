class ChainRunner{
    public static void main(String[] args){
		Chain chain1=new Chain();
		Chain chain2=new Chain("Gold","Rope");
		Chain chain3=new Chain("Platinum","Snake","22 inches");
        Chain c1=new Chain("Gold","Rope","20 inches",15.0,"Golden",25000,"Tanishq",true,"Wedding","Traditional");
        Chain c2=new Chain("Silver","Box","18 inches",12.0,"Silver",5000,"SilverLine",false,"Casual","Minimalist");
        Chain c3=new Chain("Platinum","Snake","22 inches",20.0,"White",75000,"PC Jewellers",false,"Anniversary","Modern");
		
		chain1.display();
		chain2.display();
		chain3.display();
        c1.display();
        c2.display();
        c3.display();
    }
}