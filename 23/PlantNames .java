class PlantNames {
    public static void main(String[] args) {
        String[] plantNames = {
            "Snake Plant", "Money Plant", "Aloe Vera", "Peace Lily", "Spider Plant",
            "Rubber Plant", "Areca Palm", "ZZ Plant", "Pothos", "Philodendron",
            "Chinese Evergreen", "Dracaena", "Fiddle Leaf Fig", "Parlour Palm",
            "Jade Plant", "Caladium", "Marigold", "Tulsi", "Rose", "Hibiscus",
            "Neem", "Bamboo", "Sunflower", "Lavender", "Basil"
        };
        
        int L = plantNames.length;
        System.out.println("Array size: " + L);

        System.out.println("Before update:" + plantNames[0]);
        plantNames[0] = "Monstera";
        System.out.println("After update:" + plantNames[0]);

        for (int i = 0; i < L; i++) {
            System.out.println("  Plant name:" + plantNames[i]);
        }

        for (int i = L - 1; i >= 0; i--) {
            System.out.println("  Plant name Reverse:" + plantNames[i]);
        }
    }
}
