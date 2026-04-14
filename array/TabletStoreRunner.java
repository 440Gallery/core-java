class TabletStoreRunner {
    public static void main(String[] args) {
        TabletStore store = new TabletStore();
        store.saveTablet("Dolo");
        store.saveTablet("Paracetamol");
        store.saveTablet("Crocin");
        store.saveTablet("Aspirin");
        store.saveTablet("Cetirizine");
        store.search("Crocin");
        store.search("Gelusil");
    }
}