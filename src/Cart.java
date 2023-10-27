public class Cart implements HotelService {
    private int numberOfCarts;
    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void provideService() {
        System.out.println("Providing luggage cart(s): " + numberOfCarts);
    }
    public void requestCart(int numberOfCarts) {
        System.out.println("Requested luggage cart(s): " + numberOfCarts);
    }
}