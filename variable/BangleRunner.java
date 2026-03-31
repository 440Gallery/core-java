class BangleRunner {
    public static void main(String[] args) {
        Bangle bangle1 = new Bangle();
        Bangle bangle2 = new Bangle();
        System.out.println("Bangle 1 Reference: " + bangle1);
        System.out.println("Bangle 2 Reference: " + bangle2);
       
        System.out.println("Brand: " + bangle1.brand);
        System.out.println("Material: " + bangle1.material);
        System.out.println("Color: " + bangle1.color);
        System.out.println("Price: " + bangle1.price);
        System.out.println("Size: " + bangle1.size);
        System.out.println("Weight: " + bangle1.weight + "g");
        System.out.println("Design: " + bangle1.design);
        System.out.println("Adjustable: " + bangle1.adjustable);
        System.out.println("Finish: " + bangle1.finish);
        System.out.println("Warranty Months: " + bangle1.warrantyMonths);
        System.out.println("Manufacturer: " + bangle1.manufacturer);
        System.out.println("Country of Origin: " + bangle1.countryOfOrigin);
        System.out.println("Model: " + bangle1.model);
        System.out.println("Barcode: " + bangle1.barcode);
        System.out.println("Discount: " + (bangle1.discount * 100) + "%");
        System.out.println("Quantity: " + bangle1.quantity);
        System.out.println("Handmade: " + bangle1.handmade);
        System.out.println("Style: " + bangle1.style);
        System.out.println("Occasion: " + bangle1.occasion);
        System.out.println("Gemstone: " + bangle1.gemstone);
        System.out.println("Plated: " + bangle1.plated);
        System.out.println("Clasp Type: " + bangle1.claspType);
        System.out.println("Thickness: " + bangle1.thickness + "mm");
        System.out.println("Shape: " + bangle1.shape);
        System.out.println("Hypoallergenic: " + bangle1.hypoallergenic);
        System.out.println("Collection: " + bangle1.collection);
    }
}