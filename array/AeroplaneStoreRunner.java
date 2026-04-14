class AeroplaneStoreRunner {
    public static void main(String[] args) {
        AeroplaneStore store = new AeroplaneStore();
        store.saveAeroplane("Boeing");
        store.saveAeroplane("Airbus");
        store.saveAeroplane("Cessna");
        store.saveAeroplane("Concorde");
        store.saveAeroplane("Embraer");
        store.search("Airbus");
        store.search("Helicopter");
    }
}