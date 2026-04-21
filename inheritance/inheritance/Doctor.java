class Doctor{
    String name;
    int age;
    String specialization;
    double salary;
    int exp;
	Doctor(String name){
		this("amit", 26, "Genral", 50000, 1);
	}
    Doctor(String name, int age, String specialization, double salary, int exp) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.salary = salary;
        this.exp = exp;
    }
}