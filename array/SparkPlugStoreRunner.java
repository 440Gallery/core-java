class SparkPlugStoreRunner {
    public static void main(String[] args) {
        SparkPlugStore store = new SparkPlugStore();
        store.saveSparkPlug("Copper Plug");
        store.saveSparkPlug("Iridium Plug");
        store.saveSparkPlug("Platinum Plug");
        store.saveSparkPlug("Double Platinum");
        store.saveSparkPlug("Racing Plug");
        store.search("Iridium Plug");
        store.search("Battery");
    }
}