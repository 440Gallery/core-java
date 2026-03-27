class CarModels {
    public static void main(String[] args) {
        String[] carModels = {
            "Maruti Suzuki Dzire", "Hyundai Creta", "Maruti Brezza", "Tata Nexon",
            "Tata Punch", "Maruti Ertiga", "Mahindra Scorpio N", "Hyundai Venue",
            "Maruti Wagon R", "Mahindra XUV 3XO", "Kia Seltos", "Toyota Innova",
            "Toyota Urban Cruiser Hyryder", "Honda City", "Maruti Swift",
            "Mahindra Thar", "Hyundai Verna", "Tata Tiago", "Maruti Fronx",
            "Kia Sonet", "Renault Duster", "Skoda Kushaq", "Nissan Magnite",
            "MG Hector", "Mahindra Bolero"
        };
        
        int L = carModels.length;
        System.out.println("Array size: " + L);

        System.out.println("Before update:" + carModels[0]);
        carModels[0] = "Toyota Camry";
        System.out.println("After update:" + carModels[0]);

        for (int i = 0; i < L; i++) {
            System.out.println("  Car model:" + carModels[i]);
        }

        for (int i = L - 1; i >= 0; i--) {
            System.out.println("  Car model Reverse:" + carModels[i]);
        }
    }
}
