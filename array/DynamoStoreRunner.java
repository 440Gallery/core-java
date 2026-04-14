class DynamoStoreRunner {
    public static void main(String[] args) {
        DynamoStore store = new DynamoStore();
        store.saveDynamo("Cycle Dynamo");
        store.saveDynamo("Hub Dynamo");
        store.saveDynamo("Bottle Dynamo");
        store.saveDynamo("DC Dynamo");
        store.saveDynamo("Mini Dynamo");
        store.search("DC Dynamo");
        store.search("Motor");
    }
}