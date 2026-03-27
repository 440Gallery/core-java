class LipstickBrands {

    public static void main(String[] args) {

        String[] lipstickBrands = { "MAC","NYX","Maybelline","L'Oreal","Revlon","Charlotte Tilbury","NARS", "Bobbi Brown","Dior","Chanel"};
		
		int L=lipstickBrands.length;
        System.out.println("Array size: " + L);

        System.out.println("Before update:" + lipstickBrands[0]);
        lipstickBrands[0] = "Urban Decay";
        System.out.println("After  update:" + lipstickBrands[0]);

        for (int i = 0; i<L; i++){
            System.out.println("  lipstickBrands:" + lipstickBrands[i]);
        }

        for (int i = L - 1; i >= 0; i--){
            System.out.println("  lipstickBrands Reverse:" + lipstickBrands[i]);
        }
    }
}
