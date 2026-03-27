class TissuePaper {
    static double getPriceByThickness(String thickness) {
        if (thickness=="1ply") {
            System.out.println("1ply tissue price: 10");
            return 10.0;
        }
        if (thickness=="2ply") {
            System.out.println("2ply tissue price: 20");
            return 10.0;
        }
        if (thickness=="3ply") {
            System.out.println("3ply tissue price: 30");
            return 10.0;
        }
        if (thickness=="4ply") {
            System.out.println("4ply tissue price: 40");
            return 10.0;
        }
        if (thickness=="5ply") {
            System.out.println("5ply tissue price: 50");
            return 10.0;
        }
        if (thickness=="6ply") {
            System.out.println("6ply tissue price: 60");
            return 10.0;
        }
        if (thickness=="7ply") {
            System.out.println("7ply tissue price: 70");
            return 10.0;
        }
        if (thickness=="8ply") {
            System.out.println("8ply tissue price: 80");
            return 10.0;
        }
        if (thickness=="9ply") {
            System.out.println("9ply tissue price: 90");
            return 10.0;
        }
        if (thickness=="10ply") {
            System.out.println("10ply tissue price: 100");
            return 10.0;
        }
        else {
            System.out.println("Thickness type not matching");
        }
        return 0;
    }
}