class ClockRunner {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock();
        System.out.println("Clock 1 Reference: " + clock1);
        System.out.println("Clock 2 Reference: " + clock2);

        System.out.println("\nBrand: " + clock1.brand);
        System.out.println("Type: " + clock1.type);
        System.out.println("Color: " + clock1.color);
        System.out.println("Price: " + clock1.price);
        System.out.println("Digital: " + clock1.digital);
        System.out.println("Material: " + clock1.material);
        System.out.println("Warranty Months: " + clock1.warrantyMonths);
        System.out.println("Power Source: " + clock1.powerSource);
        System.out.println("Weight: " + clock1.weight + "kg");
        System.out.println("Shape: " + clock1.shape);
        System.out.println("Display Type: " + clock1.displayType);
        System.out.println("Alarm: " + clock1.alarm);
        System.out.println("Country of Origin: " + clock1.countryOfOrigin);
        System.out.println("Manufacturer: " + clock1.manufacturer);
        System.out.println("Battery Life Hours: " + clock1.batteryLifeHours);
        System.out.println("Size: " + clock1.size);
        System.out.println("Wall Mounted: " + clock1.wallMounted);
        System.out.println("Style: " + clock1.style);
        System.out.println("Model: " + clock1.model);
        System.out.println("Barcode: " + clock1.barcode);
        System.out.println("Discount: " + (clock1.discount * 100) + "%");
        System.out.println("Quantity: " + clock1.quantity);
        System.out.println("Waterproof: " + clock1.waterproof);
        System.out.println("Dial Type: " + clock1.dialType);
        System.out.println("Thickness: " + clock1.thickness + "mm");
        System.out.println("Glass Type: " + clock1.glassType);
    }
}