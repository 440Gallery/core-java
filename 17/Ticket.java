class Ticket {
    class Ticket {
    static double getPriceByPlace(String place) {

        if (place=="Chennai") {
            System.out.println("Chennai ticket price: 30");
            return 30.0;
        }
        if (place=="Mumbai") {
            System.out.println("Mumbai ticket price: 30");
            return 30.0;
        }
        if (place=="Delhi") {
            System.out.println("Delhi ticket price: 30");
            return 30.0;
        }
        if (place=="Bangalore") {
            System.out.println("Bangalore ticket price: 30");
            return 30.0;
        }
        if (place=="Hyderabad") {
            System.out.println("Hyderabad ticket price: 30");
            return 30.0;
        }
        else {
            System.out.println("Place not matching");
        }
        return 0;
    }
	
    static double getPriceByMovie(String movie, String seatType, String theater) {

        if (movie=="RRR" && seatType=="VIP" && theater=="PVR") {
            System.out.println("RRR VIP PVR ticket price: 50");
            return 50.0;
        }
        if (movie=="RRR" && seatType=="Normal" && theater=="PVR") {
            System.out.println("RRR Normal PVR ticket price: 50");
            return 50.0;
        }
        if (movie=="KGF" && seatType=="VIP" && theater=="INOX") {
            System.out.println("KGF VIP INOX ticket price: 50");
            return 50.0;
        }
        if (movie=="KGF" && seatType=="Normal" && theater=="INOX") {
            System.out.println("KGF Normal INOX ticket price: 50");
            return 50.0;
        }
        if (movie=="Pushpa" && seatType=="VIP" && theater=="SPI") {
            System.out.println("Pushpa VIP SPI ticket price: 50");
            return 50.0;
        }
        if (movie=="Pushpa" && seatType=="Normal" && theater=="SPI") {
            System.out.println("Pushpa Normal SPI ticket price: 50");
            return 50.0;
        }
        if (movie=="Vikram" && seatType=="VIP" && theater=="AGS") {
            System.out.println("Vikram VIP AGS ticket price: 50");
            return 50.0;
        }
        if (movie=="Vikram" && seatType=="Normal" && theater=="AGS") {
            System.out.println("Vikram Normal AGS ticket price: 50");
            return 50.0;
        }
        else {
            System.out.println("Movie details not matching");
        }
        return 0;
    }
    static String getEmailByName(String name) {

        if (name=="Ram") {
            System.out.println("Ram email: ram@gmail.com");
            return "ram@gmail.com";
        }
        if (name=="Kumar") {
            System.out.println("Kumar email: kumar@gmail.com");
            return "kumar@gmail.com";
        }
        if (name=="Priya") {
            System.out.println("Priya email: priya@gmail.com");
            return "priya@gmail.com";
        }
        if (name=="Ravi") {
            System.out.println("Ravi email: ravi@gmail.com");
            return "ravi@gmail.com";
        }
        if (name=="Sita") {
            System.out.println("Sita email: sita@gmail.com");
            return "sita@gmail.com";
        }
        else {
            System.out.println("Name not matching");
        }
        return null;
    }
    static String getMobileByName(String name) {

        if (name=="Ram") {
            System.out.println("Ram mobile: 9876543210");
            return "9876543210";
        }
        if (name=="Kumar") {
            System.out.println("Kumar mobile: 9123456780");
            return "9123456780";
        }
        if (name=="Priya") {
            System.out.println("Priya mobile: 9988776655");
            return "9988776655";
        }
        if (name=="Ravi") {
            System.out.println("Ravi mobile: 9876501234");
            return "9876501234";
        }
        if (name=="Sita") {
            System.out.println("Sita mobile: 9765432100");
            return "9765432100";
        }
        else {
            System.out.println("Name not matching");
        }
        return null;
    }
}