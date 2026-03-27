class CountryPresidents {
    static String[] getPresidents(String[] countryNames) {
        System.out.println("executing country presidents");
        
        if(countryNames == null) {
            System.out.println("invalid");
            return null;
        }
        String[] presidentsList = {
            "Donald Trump",        // USA
            "Droupadi Murmu",       // India  
            "Xi Jinping",          // China
            "Joko Widodo",         // Indonesia
            "Cyril Ramaphosa",     // South Africa
            "Emmanuel Macron",     // France
            "Olaf Scholz",         // Germany
            "Giorgia Meloni",      // Italy
            "Keir Starmer",        // UK (PM)
            "Javier Milei",        // Argentina
            "Luiz Inácio Lula",    // Brazil
            "Justin Trudeau",      // Canada (PM)
            "Andrés López",        // Mexico
            "Vladimir Putin",      // Russia
            "Volodymyr Zelensky",  // Ukraine
            "Recep Tayyip",        // Turkey
            "Abdel Fattah el-Sisi", // Egypt
            "Ferdinand Marcos",    // Philippines
            "William Ruto",        // Kenya
            "Bola Tinubu",         // Nigeria
            "Sheikh Mohamed",      // UAE
            "Mohammed VI",         // Morocco
            "Teodoro Obiang",      // Equatorial Guinea
            "Isaias Afwerki",      // Eritrea
            "Alar Karis",          // Estonia
            "Isaac Herzog",        // Israel
            "Sergio Mattarella",   // Italy (President)
            "Nayib Bukele",        // El Salvador
            "Adama Barrow",        // Gambia
            "Brice Oligui",        // Gabon
            "Ilham Aliyev",        // Azerbaijan
            "Emomali Rahmon",      // Tajikistan
            "Petr Pavel",          // Czechia
            "Alexander Lukashenko", // Belarus
            "Kyriakos Mitsokis",   // Greece (PM)
            "Katerina Sakellaropoulou", // Greece (President)
            "Rumen Radev",         // Bulgaria
            "Guðni Jóhannesson",   // Iceland
            "János Áder",          // Hungary
            "Marcelo Rebelo",      // Portugal
            "Alexander Van der Bellen", // Austria
            "Miloš Zeman",         // Czech Republic
            "Aleksandar Vučić",    // Serbia
            "Michael D. Higgins",  // Ireland
            "Gitanas Nausėda",     // Lithuania
            "Klaus Iohannis",      // Romania
            "Andrzej Duda",        // Poland
            "Nasry Asfura",        // Honduras
            "Jean-Lucien Savi",    // Togo
            "Konstantinos Tasoulas", // Greece
            "Tamás Sulyok",        // Hungary
            "Michelle Bachelet",   // Chile
            "José María Balcázar", // Peru
            "Karol Nawrocki",      // Poland
            "António José Seguro", // Portugal
            "Sheikh Tamim",        // Qatar
            "Mohammed bin Abdulrahman", // Qatar PM
            "Charles III",         // UK (King)
            "Naruhito",            // Japan (Emperor)
            "Sanae Takaichi",      // Japan PM
            "Andrew Holness",      // Jamaica
            "Sir Patrick Allen",   // Jamaica GG
            "Robert Beugré",       // Ivory Coast
            "Mostafa Madbouly",    // Egypt PM
            "Manuel Osa Nsue",     // Equatorial Guinea PM
            "Kristen Michal",      // Estonia PM
            "Sébastien Lecornu",   // France PM
            "Irakli Kobakhidze",   // Georgia PM
            "Micheál Martin",      // Ireland PM
            "Benjamin Netanyahu",  // Israel PM
            "Luís Montenegro",     // Portugal PM
            "Donald Tusk"          // Poland PM
        };
        int size=countryNames.length;
        System.out.println(size);
        for(int i = 0; i < size; i++) {
            System.out.println("country " + countryNames[i] + ": " + presidentsList[i]);
        }
        return presidentsList;
    }
}
