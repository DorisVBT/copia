package hotels.service.avail;

public class Avail {

    private AvailHotelService availHotelService;

    public Avail(AvailHotelService availHotelService){
        this.availHotelService = availHotelService;
    }

    public boolean isAvailable(String hotelName){
        return availHotelService.isAvailable(hotelName);
    }
}
