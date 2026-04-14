class JuiceStoreRunner {
    public static void main(String[] args) {
        JuiceStore store = new JuiceStore();
        store.saveJuice("Mango");
        store.saveJuice("Apple");
        store.saveJuice("Orange");
        store.saveJuice("Grape");
        store.saveJuice("Pineapple");
        store.search("Apple");
        store.search("Lemon");
    }
}