class MonitorRunner {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        System.out.println("Monitor 1 Reference: " + monitor1);
        System.out.println("Monitor 2 Reference: " + monitor2);

        System.out.println("Brand: " + monitor1.brand);
        System.out.println("Model: " + monitor1.model);
        System.out.println("Display Type: " + monitor1.displayType);
        System.out.println("Screen Size: " + monitor1.screenSize + " inch");
        System.out.println("Resolution: " + monitor1.resolution);
        System.out.println("Refresh Rate: " + monitor1.refreshRate + " Hz");
        System.out.println("Response Time: " + monitor1.responseTime + " ms");
        System.out.println("Curved: " + monitor1.curved);
        System.out.println("Aspect Ratio: " + monitor1.aspectRatio);
        System.out.println("Brightness: " + monitor1.brightness + " nits");
        System.out.println("Panel Type: " + monitor1.panelType);
        System.out.println("HDR Support: " + monitor1.hdrSupport);
        System.out.println("Color: " + monitor1.color);
        System.out.println("Price: ₹" + monitor1.price);
        System.out.println("Warranty Months: " + monitor1.warrantyMonths);
        System.out.println("Manufacturer: " + monitor1.manufacturer);
        System.out.println("Country of Origin: " + monitor1.countryOfOrigin);
        System.out.println("Weight: " + monitor1.weight + " kg");
        System.out.println("Connectivity: " + monitor1.connectivity);
        System.out.println("Speakers Built-In: " + monitor1.speakersBuiltIn);
        System.out.println("Stand Type: " + monitor1.standType);
        System.out.println("Wall Mountable: " + monitor1.wallMountable);
        System.out.println("Barcode: " + monitor1.barcode);
        System.out.println("Discount: " + (monitor1.discount * 100) + "%");
        System.out.println("Quantity: " + monitor1.quantity);
        System.out.println("Energy Rating: " + monitor1.energyRating);
    }
}