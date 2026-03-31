class Runner{
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook();
        NoteBook notebook2 = new NoteBook();
        System.out.println("Notebook 1 Reference: " + notebook1);
        System.out.println("Notebook 2 Reference: " + notebook2);

        System.out.println("Brand: " + notebook1.brand);
        System.out.println("Model: " + notebook1.model);
        System.out.println("Color: " + notebook1.color);
        System.out.println("Pages: " + notebook1.pages);
        System.out.println("Cover Type: " + notebook1.coverType);
        System.out.println("Price: " + notebook1.price);
        System.out.println("Hardcover: " + notebook1.hardcover);
        System.out.println("Size: " + notebook1.size);
        System.out.println("Lines per Page: " + notebook1.linesPerPage);
        System.out.println("Paper Quality: " + notebook1.paperQuality);
        System.out.println("Spiral Bound: " + notebook1.spiralBound);
        System.out.println("Ruling: " + notebook1.ruling);
        System.out.println("Thickness: " + notebook1.thickness + "mm");
        System.out.println("Manufacturer: " + notebook1.manufacturer);
        System.out.println("Weight: " + notebook1.weight + "kg");
        System.out.println("Quantity: " + notebook1.quantity);
        System.out.println("Material: " + notebook1.material);
        System.out.println("Perforated: " + notebook1.perforated);
        System.out.println("Index Type: " + notebook1.indexType);
        System.out.println("Chapters: " + notebook1.chapters);
        System.out.println("Pocket: " + notebook1.pocket);
        System.out.println("Elastic Band: " + notebook1.elasticBand);
        System.out.println("Pen Loop: " + notebook1.penLoop);
        System.out.println("Warranty Months: " + notebook1.warrantyMonths);
        System.out.println("Barcode: " + notebook1.barcode);
        System.out.println("Discount: " + (notebook1.discount * 100) + "%");
    }
}