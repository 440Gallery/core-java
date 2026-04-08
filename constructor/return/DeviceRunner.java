class DeviceRunner{
    public static void main(String[] args) {
		Device device=new Device("oppo","d",7000);
		device.show();
        Charger charger = device.getCharger();
        charger.display();
    }
}
