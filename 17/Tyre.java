class Tyre {
    static double getPriceByBrandAndSize(String brand, String size) {
        // MRF brand
        if (brand=="MRF" && size=="small") {
            System.out.println("MRF small tyre price: 12");
            return 12.0;
        }
        if (brand=="MRF" && size=="medium") {
            System.out.println("MRF medium tyre price: 12");
            return 12.0;
        }
        if (brand=="MRF" && size=="large") {
            System.out.println("MRF large tyre price: 12");
            return 12.0;
        }
        // Apollo brand
        if (brand=="Apollo" && size=="small") {
            System.out.println("Apollo small tyre price: 12");
            return 12.0;
        }
        if (brand=="Apollo" && size=="medium") {
            System.out.println("Apollo medium tyre price: 12");
            return 12.0;
        }
        if (brand=="Apollo"&& size=="large") {
            System.out.println("Apollo large tyre price: 12");
            return 12.0;
        }
        // CEAT brand
        if (brand=="CEAT" && size=="small") {
            System.out.println("CEAT small tyre price: 12");
            return 12.0;
        }
        if (brand=="CEAT" && size=="medium") {
            System.out.println("CEAT medium tyre price: 12");
            return 12.0;
        }
        if (brand=="CEAT" && size=="large") {
            System.out.println("CEAT large tyre price: 12");
            return 12.0;
        }

        // Bridgestone brand
        if (brand=="Bridgestone" && size=="small") {
            System.out.println("Bridgestone small tyre price: 12");
            return 12.0;
        }
        if (brand=="Bridgestone" && size=="medium") {
            System.out.println("Bridgestone medium tyre price: 12");
            return 12.0;
        }
        if (brand=="Bridgestone" && size=="large") {
            System.out.println("Bridgestone large tyre price: 12");
            return 12.0;
        }

        // JK Tyre brand
        if (brand=="JK" && size=="small") {
            System.out.println("JK small tyre price: 12");
            return 12.0;
        }
        if (brand=="JK" && size=="medium") {
            System.out.println("JK medium tyre price: 12");
            return 12.0;
        }
        if (brand=="JK" && size=="large") {
            System.out.println("JK large tyre price: 12");
            return 12.0;
        }

        // Goodyear brand
        if (brand=="Goodyear" && size=="small") {
            System.out.println("Goodyear small tyre price: 12");
            return 12.0;
        }
        if (brand=="Goodyear" && size=="medium") {
            System.out.println("Goodyear medium tyre price: 12");
            return 12.0;
        }
        if (brand=="Goodyear" && size=="large") {
            System.out.println("Goodyear large tyre price: 12");
            return 12.0;
        }

        // Michelin brand
        if (brand=="Michelin" && size=="small") {
            System.out.println("Michelin small tyre price: 12");
            return 12.0;
        }
        if (brand=="Michelin" && size=="medium") {
            System.out.println("Michelin medium tyre price: 12");
            return 12.0;
        }
        if (brand=="Michelin" && size=="large") {
            System.out.println("Michelin large tyre price: 12");
            return 12.0;
        }
        // Continental brand
        if (brand=="Continental"&& size.equals("small") {
            System.out.println("Continental small tyre price: 12");
            return 12.0;
        }
        if (brand=="Continental" && size=="medium") {
            System.out.println("Continental medium tyre price: 12");
            return 12.0;
        }
        if (brand=="Continental" && size=="large") {
            System.out.println("Continental large tyre price: 12");
            return 12.0;
        }

        // Pirelli brand
        if (brand=="Pirelli" && size=="small"){
            System.out.println("Pirelli small tyre price: 12");
            return 12.0;
        }
        if (brand=="Pirelli" && size=="medium") {
            System.out.println("Pirelli medium tyre price: 12");
            return 12.0;
        }
        if (brand=="Pirelli"&& size=="large") {
            System.out.println("Pirelli large tyre price: 12");
            return 12.0;
        }

        else {
            System.out.println("Brand and size not matching");
        }
        return 0;
    }
}