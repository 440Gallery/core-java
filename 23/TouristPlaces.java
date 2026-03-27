class TouristPlaces {
    public static void main(String[] args) {
        String[] touristPlaces = {
            "Taj Mahal", "Golden Temple", "Varanasi Ghats", "Jaipur Forts", "Kerala Backwaters",
            "Goa Beaches", "Mumbai Gateway", "Red Fort Delhi", "Hampi Ruins", "Rishikesh",
            "Ladakh", "Andaman Islands", "Darjeeling", "Udaipur Lakes", "Mysore Palace",
            "Konark Sun Temple", "Ajanta Caves", "Ellora Caves", "Qutub Minar", "India Gate",
            "Jaisalmer Fort", "Meghalaya Living Root Bridges", "Spiti Valley", "Ranthambore",
            "Ooty Hill Station", "Kodaikanal", "Coorg", "Kaziranga", "Sundarbans", "Manali"
        };
        
        int L = touristPlaces.length;
        System.out.println("Array size: " + L);

        System.out.println("Before update:" + touristPlaces[0]);
        touristPlaces[0] = "Great Wall of China";
        System.out.println("After update:" + touristPlaces[0]);

        for (int i = 0; i < L; i++) {
            System.out.println("  Tourist place:" + touristPlaces[i]);
        }

        for (int i = L - 1; i >= 0; i--) {
            System.out.println("  Tourist place Reverse:" + touristPlaces[i]);
        }
    }
}
