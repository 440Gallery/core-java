class ProcessorRunner {
    public static void main(String[] args) {
        Processor.info();
        Processor.details(3.5, 12, 512);
        double speed = 4.2; int gen = 13; int storage = 1024;
        Processor.details(speed, gen, storage);
	}
}