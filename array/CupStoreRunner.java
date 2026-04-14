class CupStoreRunner {
    public static void main(String[] args) {
        CupStore store = new CupStore();
        store.saveCup("Steel Cup");
        store.saveCup("Glass Cup");
        store.saveCup("Paper Cup");
        store.saveCup("Tea Cup");
        store.saveCup("Coffee Cup");
        store.search("Tea Cup");
        store.search("Bottle");
    }
}