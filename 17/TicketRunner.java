class TicketRunner {
    public static void main(String[] args) {
        System.out.println("By Place");
        Ticket.getPriceByPlace("Chennai");
        Ticket.getPriceByPlace("Mumbai");
        Ticket.getPriceByPlace("Delhi");
        Ticket.getPriceByPlace("Bangalore");
        Ticket.getPriceByPlace("Hyderabad");
        Ticket.getPriceByPlace("Kolkata");

        System.out.println("By Movie");
        Ticket.getPriceByMovie("RRR",    "VIP",    "PVR");
        Ticket.getPriceByMovie("RRR",    "Normal", "PVR");
        Ticket.getPriceByMovie("KGF",    "VIP",    "INOX");
        Ticket.getPriceByMovie("KGF",    "Normal", "INOX");
        Ticket.getPriceByMovie("Pushpa", "VIP",    "SPI");
        Ticket.getPriceByMovie("Pushpa", "Normal", "SPI");
        Ticket.getPriceByMovie("Vikram", "VIP",    "AGS");
        Ticket.getPriceByMovie("Vikram", "Normal", "AGS");
        Ticket.getPriceByMovie("Leo",    "VIP",    "GT mall");

        System.out.println("By Name and Email");
        Ticket.getEmailByName("Ram");
        Ticket.getEmailByName("Kumar");
        Ticket.getEmailByName("Priya");
        Ticket.getEmailByName("Ravi");
        Ticket.getEmailByName("Sita");
        Ticket.getEmailByName("John");

        System.out.println("By Name and Mobile");
        Ticket.getMobileByName("Ram");
        Ticket.getMobileByName("Kumar");
        Ticket.getMobileByName("Priya");
        Ticket.getMobileByName("Ravi");
        Ticket.getMobileByName("Sita");
        Ticket.getMobileByName("John");
    }
}