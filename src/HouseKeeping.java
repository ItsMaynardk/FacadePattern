public class HouseKeeping implements HotelService {
    private int roomNumber;
    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void provideService() {
        System.out.println("Providing housekeeping service for room number: " + roomNumber);
    }
    public void cleanRoom(){
        System.out.println("Cleaning room: " + roomNumber);
    }
}