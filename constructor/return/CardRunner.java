class CardRunner{
    public static void main(String[] args){
        Bank bank = new Bank("SBI", "Tumkur", "Karnataka");
        bank.showBank();
		
        Card card = bank.getCardDetails();
        card.display();
    }
}
