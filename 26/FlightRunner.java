class FlightRunner {
    public static void main(String[] args) {
        Flight f = new Flight();
        Flight f1 = new Flight();
        Flight f2 = new Flight();
        Flight f3 = new Flight();
        Flight f4 = new Flight();

        System.out.println("Default colour:" + f.airline);
        f.airline = "AirIndia";
        System.out.println("updated color:" + f.airline);
        f1.airline = "Vistara";
        System.out.println("clour:" + f1.airline);
        f2.airline = "SpiceJet";
        System.out.println("clour:" + f2.airline);
        f3.airline = "AkasaAir";
        System.out.println("clour:" + f3.airline);
        f4.airline = "GoFirst";
        System.out.println("clour:" + f4.airline);

        System.out.println("default country:" + f.destination);
        f.destination = "Mumbai";
        System.out.println("updated country:" + f.destination);
        f1.destination = "Bangalore";
        System.out.println("country:" + f1.destination);
        f2.destination = "Chennai";
        System.out.println("country:" + f2.destination);
        f3.destination = "Hyderabad";
        System.out.println("country:" + f3.destination);
        f4.destination = "Kolkata";
        System.out.println("country:" + f4.destination);

        System.out.println("default width :" + f.duration);
        f.duration = 3.0;
        System.out.println("updated  width:" + f.duration);
        f1.duration = 1.5;
        System.out.println(" width:" + f1.duration);
        f2.duration = 2.0;
        System.out.println(" width:" + f2.duration);
        f3.duration = 4.5;
        System.out.println(" width:" + f3.duration);
        f4.duration = 5.0;
        System.out.println(" width:" + f4.duration);

        System.out.println("default height:" + f.price);
        f.price = 6500.0;
        System.out.println("updated height:" + f.price);
        f1.price = 3500.0;
        System.out.println("height:" + f1.price);
        f2.price = 5000.0;
        System.out.println("height:" + f2.price);
        f3.price = 8500.0;
        System.out.println("height:" + f3.price);
        f4.price = 12000.0;
        System.out.println("height:" + f4.price);

        System.out.println("default materials:" + f.flightClass);
        f.flightClass = "Business";
        System.out.println("updated materials:" + f.flightClass);
        f1.flightClass = "PremiumEconomy";
        System.out.println("materials:" + f1.flightClass);
        f2.flightClass = "FirstClass";
        System.out.println("materials:" + f2.flightClass);
        f3.flightClass = "Economy";
        System.out.println("materials:" + f3.flightClass);
        f4.flightClass = "EconomyLite";
        System.out.println("materials:" + f4.flightClass);
    }
}