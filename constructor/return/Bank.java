class Bank{
    String bankName;
    String branch;
    String location;

    Bank(String bankName, String branch, String location) {
        this.bankName = bankName;
        this.branch = branch;
        this.location = location;
    }
    void showBank(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
        System.out.println("Location: " + location);
    }
    public Card getCardDetails(){
        Card card = new Card("Anusha", 987654);
        return card;
    }
}
