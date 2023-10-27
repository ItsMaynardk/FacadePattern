public class Valet implements HotelService {
    private String plateNumber;
    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void provideService() {
        System.out.println("Providing valet parking service on: " + plateNumber);
    }
    public void pickUpVehicle(){
        System.out.println("Picking up vehicle on: " + plateNumber);
    }
}