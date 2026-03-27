class Fooditem{
	static double getpricebyitem(String item){
        if (item.equals("pizza")) {
            System.out.println("Pizza price: 20");
            return 20.0;
        }
        if (item.equals("burger")) {
            System.out.println("Burger price: 20");
            return 20.0;
        }
        if (item.equals("pasta")) {
            System.out.println("Pasta price: 20");
            return 20.0;
        }
        if (item.equals("noodles")) {
            System.out.println("Noodles price: 20");
            return 20.0;
        }
        if (item.equals("dosa")) {
            System.out.println("Dosa price: 20");
            return 20.0;
        }
        if (item.equals("idli")) {
            System.out.println("Idli price: 20");
            return 20.0;
        }
        if (item.equals("samosa")) {
            System.out.println("Samosa price: 20");
            return 20.0;
        }
        if (item.equals("sandwich")) {
            System.out.println("Sandwich price: 20");
            return 20.0;
        }
        if (item.equals("biryani")) {
            System.out.println("Biryani price: 20");
            return 20.0;
        }
        if (item.equals("paratha")) {
            System.out.println("Paratha price: 20");
            return 20.0;
        }
        else {
            System.out.println("Item not matching");
        }
        return 0;
    }
}