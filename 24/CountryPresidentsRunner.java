class CountryPresidentsRunner {
    public static void main(String[] args) {
        String[] countryNames = {
            "USA", "India", "China", "Indonesia", "South Africa", "France", "Germany", "Italy", "UK", "Argentina",
            "Brazil", "Canada", "Mexico", "Russia", "Ukraine", "Turkey", "Egypt", "Philippines", "Kenya", "Nigeria",
            "UAE", "Morocco", "Equatorial Guinea", "Eritrea", "Estonia", "Israel", "Italy", "El Salvador", "Gambia", "Gabon",
            "Azerbaijan", "Tajikistan", "Czechia", "Belarus", "Greece", "Greece", "Bulgaria", "Iceland", "Hungary", "Portugal",
            "Austria", "Czech Republic", "Serbia", "Ireland", "Lithuania", "Romania", "Poland", "Honduras", "Togo", "Greece",
            "Hungary", "Chile", "Peru", "Poland", "Portugal", "Qatar", "Qatar", "UK", "Japan", "Japan", "Jamaica", "Jamaica",
            "Ivory Coast", "Egypt", "Equatorial Guinea", "Estonia", "France", "Georgia", "Ireland", "Israel", "Portugal", "Poland"
        };

        CountryPresidents.getPresidents(countryNames);
    }
}
