class TapeRunner{
    public static void main(String[] args) {
        ColorTape ct= new ColorTape();
        ct.brand ="tapebrand";
        ct.color= "white";
        ct.width=2.5;
        ct.price=30.0;

        ct.cut();
        ct.roll();
        ct.material();
        ct.displayInfo();
    }
}
