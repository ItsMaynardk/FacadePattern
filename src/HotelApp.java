public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        frontDesk.demandService(new Valet("JMA25"));
        frontDesk.demandService(new HouseKeeping(1828));
        frontDesk.demandService(new Cart(3));
    }
}