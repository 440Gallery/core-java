class FoodIngredients {
    static String[] getIngredients(String[] foodNames) {
        System.out.println("executing a food ingredients");

        if(foodNames == null) {
            System.out.println("invalid");
            return null;
        }

        String[] ingredientsList = {
            "flour,cheese,tomato sauce,pepperoni",      // pizza
            "bun,beef patty,lettuce,cheese,tomato",     // burger  
            "pasta,tomato sauce,parmesan,basil",        // pasta
            "lettuce,tomato,cucumber,olive oil",        // salad
            "rice,water",                               // rice
            "wheat flour,water,salt",                   // chapati
            "rice,urad dal,salt",                       // dosa
            "rice,urad dal",                            // idli
            "flour,potato,peas,spices",                 // samosa
            "rice,chicken,yogurt,spices",               // biryani
            "vegetables,spices,tomato,onion",           // curry
            "flour,yogurt,milk",                        // naan
            "wheat flour,oil",                          // paratha
            "urad dal,spices",                          // vada
            "wheat flour,oil",                          // puri
            "rice batter,onion,tomato",                 // uttapam
            "urad dal",                                 // medu vada
            "rice flour,yogurt",                        // dhokla
            "potato,pav,spices",                        // pav bhaji
            "vada,pav",                                 // vada pav
            "rice,vegetables,soy sauce",                // fried rice
            "noodles,vegetables,sauce",                 // noodles
            "bread,vegetables",                         // sandwich
            "potato,oil,salt",                          // french fries
            "vegetables,stock,spices",                  // soup
            "wheat flour,water",                        // roti
            "lentils,spices,tempering",                 // dal
            "vegetables,spices",                        // sabzi
            "lentils,tomato,tamarind",                  // rasam
            "lentils,vegetables,spices",                // sambar
            "milk,sugar,khoya"                          // gulab jamun
        };
        int size=foodNames.length;
        System.out.println(size);
        for(int i = 0; i < size; i++) {
            System.out.println("food " + foodNames[i] + ": " + ingredientsList[i]);
        }

        return ingredientsList;
    }
}
