package DiscountCalculator;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        FoodProduct apple = new FoodProduct(100.0);
        ElectronicsProduct laptop = new ElectronicsProduct(1000.0);
        ClothingProduct shirt = new ClothingProduct(50.0);

        System.out.println("Food product discount: $" + discountCalculator.calculateDiscount(apple));
        System.out.println("Electronics product discount: $" + discountCalculator.calculateDiscount(laptop));
        System.out.println("Clothing product discount: $" + discountCalculator.calculateDiscount(shirt));
    }
}

