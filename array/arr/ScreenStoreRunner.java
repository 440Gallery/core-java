class ScreenStoreRunner{
    public static void main(String[] args){
        ScreenStore scStore=new ScreenStore();

        Screen s1 = new Screen("Samsung", 32, "1920x1080", "LED", true, 25000.0, "Black", 60, "VA", "UHD32");
        scStore.store(s1);

        Screen s2 = new Screen("LG", 24, "1366x768", "LED", false, 12000.0, "Black", 60, "TN", "LED24");
        scStore.store(s2);

        Screen s3 = new Screen("Sony", 43, "3840x2160", "OLED", true, 75000.0, "Black", 120, "OLED", "KD43");
        scStore.store(s3);

        Screen s4 = new Screen("Dell", 27, "2560x1440", "LED", true, 35000.0, "Black", 75, "IPS", "UW27");
        scStore.store(s4);

        Screen s5 = new Screen("HP", 24, "1920x1080", "LED", false, 14000.0, "Black", 60, "TN", "HP24");
        scStore.store(s5);

        Screen s6 = new Screen("Acer", 22, "1920x1080", "LED", false, 11000.0, "Black", 60, "TN", "K22");
        scStore.store(s6);

        Screen s7 = new Screen("Asus", 27, "2560x1440", "LED", true, 32000.0, "Black", 75, "IPS", "PG27");
        scStore.store(s7);

        Screen s8 = new Screen("Lenovo", 21, "1920x1080", "LED", false, 10000.0, "Black", 60, "TN", "L21");
        scStore.store(s8);

        Screen s9 = new Screen("MSI", 24, "1920x1080", "LED", true, 18000.0, "Black", 144, "IPS", "G24");
        scStore.store(s9);

        Screen s10 = new Screen("BenQ", 27, "1920x1080", "LED", false, 22000.0, "Black", 60, "VA", "GL27");
        scStore.store(s10);

        Screen s11 = new Screen("Philips", 24, "1920x1080", "LED", false, 13000.0, "Black", 60, "TN", "241");
        scStore.store(s11);

        Screen s12 = new Screen("ViewSonic", 27, "2560x1440", "LED", true, 38000.0, "Black", 75, "IPS", "VX27");
        scStore.store(s12);

        Screen s13 = new Screen("HP", 23, "1920x1080", "LED", true, 16000.0, "Black", 75, "VA", "V24");
        scStore.store(s13);

        Screen s14 = new Screen("Dell", 24, "1920x1080", "LED", false, 15000.0, "Black", 60, "TN", "P24");
        scStore.store(s14);

        Screen s15 = new Screen("Acer", 27, "2560x1440", "LED", true, 33000.0, "Black", 75, "IPS", "V27");
        scStore.store(s15);

        Screen s16 = new Screen("LG", 32, "3840x2160", "LED", true, 50000.0, "Black", 60, "VA", "32UN");
        scStore.store(s16);

        Screen s17 = new Screen("Samsung", 28, "3840x2160", "LED", true, 45000.0, "Black", 60, "IPS", "LU28");
        scStore.store(s17);

        Screen s18 = new Screen("Sony", 32, "1920x1080", "OLED", true, 60000.0, "Black", 60, "OLED", "OLED32");
        scStore.store(s18);

        Screen s19 = new Screen("BenQ", 27, "2560x1440", "LED", true, 28000.0, "Black", 75, "IPS", "EX27");
        scStore.store(s19);

        Screen s20 = new Screen("MSI", 24, "1920x1080", "LED", true, 20000.0, "Black", 144, "IPS", "G24F");
        scStore.store(s20);

        scStore.display();
    }
}
