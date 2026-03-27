class GunModels {
    public static void main(String[] args) {
        String[] gunModels = {
            "Glock 17", "Glock 19", "Glock 30", "Sig Sauer P365", "Sig P226",
            "Beretta 92", "Smith & Wesson M&P", "Colt 1911", "CZ 75", "HK USP",
            "Walther PPQ", "Springfield Hellcat", "Taurus GX4", "Springfield Echelon",
            "Mossberg 500", "Remington 870", "AK-47", "AR-15", "Sig P320",
            "Glock 19 Gen 5", "CZ Shadow 2", "Sig MCX Spear", "Beretta A300",
            "Smith & Wesson Bodyguard", "Ruger LCR", "PSA Dagger",
            "Wilson Combat EDC X9", "Glock 30S", "Smith & Wesson M&P 2.0", "CZ P-10"
        };
        
        int L = gunModels.length;
        System.out.println("Array size: " + L);

        System.out.println("Before update:" + gunModels[0]);
        gunModels[0] = "Colt 1911";
        System.out.println("After update:" + gunModels[0]);

        for (int i = 0; i < L; i++) {
            System.out.println("  Gun model:" + gunModels[i]);
        }

        for (int i = L; i >= 0; i--) {
            System.out.println("  Gun model Reverse:" + gunModels[i]);
        }
    }
}
