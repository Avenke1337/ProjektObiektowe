public abstract class Order implements Discountable{
    @Override
    public void applyDiscount() {
        double cena = Cart.getTotalPrice();
        cena *= 0.9;

    }

}
