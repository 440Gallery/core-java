public class Refrigerator {
    public static void coolFood() {
        System.out.println("Refrigerator: Cooling your food at 4°C.");
    }
    public static void storeVeggies() {
        System.out.println("Refrigerator: Storing fresh vegetables.");
    }
    public static void freezeIce() {
        System.out.println("Refrigerator: Freezer compartment active.");
    }
    public static void displayTemp() {
        System.out.println("Refrigerator: Current temp: 4°C.");
    }
    public static void powerOn() {
        System.out.println("Refrigerator: Powered on and running.");
    }

    public static void main(String[] args) {
        //Refrigerator Simulation
        powerOn();
        displayTemp();
        coolFood();
        storeVeggies();
        freezeIce();
    }
}
