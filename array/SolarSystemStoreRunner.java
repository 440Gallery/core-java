class SolarSystemStoreRunner {
    public static void main(String[] args) {
        SolarSystemStore store = new SolarSystemStore();
        store.savePlanet("Mercury");
        store.savePlanet("Venus");
        store.savePlanet("Earth");
        store.savePlanet("Mars");
        store.savePlanet("Jupiter");
        store.search("Earth");
        store.search("Pluto");
    }
}