class SoftDrink{
    String name;
    String brand;
    String flavor;
    String size;
    int calories;
    double sugarContent;
    double price;
    String packagingType;
    boolean isDiet;
    String expiryDate;

    public SoftDrink(String name,String brand,String flavor,String size,int calories,double sugarContent,double price,String packagingType,boolean isDiet,String expiryDate){
        this.name=name;
        this.brand=brand;
        this.flavor=flavor;
        this.size=size;
        this.calories=calories;
        this.sugarContent=sugarContent;
        this.price=price;
        this.packagingType=packagingType;
        this.isDiet=isDiet;
        this.expiryDate=expiryDate;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Brand:"+brand);
        System.out.println("Flavor:"+flavor);
        System.out.println("Size:"+size);
        System.out.println("Calories:"+calories);
        System.out.println("Sugar Content:"+sugarContent + " g");
        System.out.println("Price: ₹" + price);
        System.out.println("Packaging Type:"+packagingType);
        System.out.println("Diet:"+(isDiet ? "Yes" : "No"));
        System.out.println("Expiry Date:"+expiryDate);
    }
}