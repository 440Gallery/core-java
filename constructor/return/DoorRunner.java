class DoorRunner {
    public static void main(String[] args) {
        Door door = new Door("Main", 7.5, 3.0);
		door.show();
        Lock lock = door.getLock();
        lock.display();
    }
}