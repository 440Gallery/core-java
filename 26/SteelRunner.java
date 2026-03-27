class SteelRunner {
    public static void main(String[] args) {
        Steel s = new Steel();
        Steel s1 = new Steel();
        Steel s2 = new Steel();
        Steel s3 = new Steel();
        Steel s4 = new Steel();
        
        System.out.println("Default grade:" + s.grade);
        s.grade = "high";
        System.out.println("updated grade:" + s.grade);
        s1.grade = "low";
        System.out.println("grade:" + s1.grade);
        s2.grade = "medium";
        System.out.println("grade:" + s2.grade);
        s3.grade = "alloy";
        System.out.println("grade:" + s3.grade);
        s4.grade = "stainless";
        System.out.println("grade:" + s4.grade);

        System.out.println("default origin:" + s.origin);
        s.origin = "China";
        System.out.println("updated origin:" + s.origin);
        s1.origin = "Japan";
        System.out.println("origin:" + s1.origin);
        s2.origin = "Germany";
        System.out.println("origin:" + s2.origin);
        s3.origin = "USA";
        System.out.println("origin:" + s3.origin);
        s4.origin = "Korea";
        System.out.println("origin:" + s4.origin);

        System.out.println("default thickness:" + s.thickness);
        s.thickness = 15.0;
        System.out.println("updated thickness:" + s.thickness);
        s1.thickness = 20.0;
        System.out.println("thickness:" + s1.thickness);
        s2.thickness = 25.0;
        System.out.println("thickness:" + s2.thickness);
        s3.thickness = 30.0;
        System.out.println("thickness:" + s3.thickness);
        s4.thickness = 35.0;
        System.out.println("thickness:" + s4.thickness);

        System.out.println("default length:" + s.length);
        s.length = 120.0;
        System.out.println("updated length:" + s.length);
        s1.length = 140.0;
        System.out.println("length:" + s1.length);
        s2.length = 160.0;
        System.out.println("length:" + s2.length);
        s3.length = 180.0;
        System.out.println("length:" + s3.length);
        s4.length = 200.0;
        System.out.println("length:" + s4.length);

        System.out.println("default treatment:" + s.treatment);
        s.treatment = "heat";
        System.out.println("updated treatment:" + s.treatment);
        s1.treatment = "cold";
        System.out.println("treatment:" + s1.treatment);
        s2.treatment = "galvanized";
        System.out.println("treatment:" + s2.treatment);
        s3.treatment = "annealed";
        System.out.println("treatment:" + s3.treatment);
        s4.treatment = "quenched";
        System.out.println("treatment:" + s4.treatment);
    }
}