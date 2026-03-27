class FoodIngredientsRunner {
    public static void main(String[] args) {
        String[] foodNames = {
            "pizza", "burger", "pasta", "salad", "rice", "chapati", "dosa", "idli", "samosa", "biryani",
            "curry", "naan", "paratha", "vada", "puri", "uttapam", "medu vada", "dhokla", "pav bhaji", "vada pav",
            "fried rice", "noodles", "sandwich", "french fries", "soup", "roti", "dal", "sabzi", "rasam", "sambar", "gulab jamun"
        };

        FoodIngredients.getIngredients(foodNames);
    }
}
