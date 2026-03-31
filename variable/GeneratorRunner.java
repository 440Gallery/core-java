class GeneratorRunner {
    public static void main(String[] args) {
        Generator gen1 = new Generator();
        Generator gen2 = new Generator();
        System.out.println("Generator 1 Reference: " + gen1);
        System.out.println("Generator 2 Reference: " + gen2);

        System.out.println("\nBrand: " + gen1.brand);
        System.out.println("Model: " + gen1.model);
        System.out.println("Type: " + gen1.type);
        System.out.println("Power Output: " + gen1.powerOutputKW + " kW");
        System.out.println("Fuel Type: " + gen1.fuelType);
        System.out.println("Fuel Capacity: " + gen1.fuelCapacityLiters + " L");
        System.out.println("Runtime Hours: " + gen1.runtimeHours);
        System.out.println("Portable: " + gen1.portable);
        System.out.println("Weight: " + gen1.weight + " kg");
        System.out.println("Color: " + gen1.color);
        System.out.println("Price: ₹" + gen1.price);
        System.out.println("Warranty Months: " + gen1.warrantyMonths);
        System.out.println("Manufacturer: " + gen1.manufacturer);
        System.out.println("Country of Origin: " + gen1.countryOfOrigin);
        System.out.println("Inverter Technology: " + gen1.inverterTechnology);
        System.out.println("Cooling System: " + gen1.coolingSystem);
        System.out.println("Noise Level: " + gen1.noiseLevelDB + " dB");
        System.out.println("Start Type: " + gen1.startType);
        System.out.println("Automatic Transfer Switch: " + gen1.automaticTransferSwitch);
        System.out.println("Barcode: " + gen1.barcode);
        System.out.println("Discount: " + (gen1.discount * 100) + "%");
        System.out.println("Quantity: " + gen1.quantity);
        System.out.println("Material: " + gen1.material);
        System.out.println("Eco Mode: " + gen1.ecoMode);
        System.out.println("Control Panel Type: " + gen1.controlPanelType);
        System.out.println("Dimensions: " + gen1.dimensionsCM + " cm");
        System.out.println("Safety Features: " + gen1.safetyFeatures);
    }
}