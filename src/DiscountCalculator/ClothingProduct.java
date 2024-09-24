package DiscountCalculator;

class ClothingProduct implements Product {
    private double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.15;
    }

    public double getPrice() {
        return price;
    }
}
