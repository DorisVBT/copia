package hotels.service.avail;

import java.util.Random;

public class AvailHotelService {

    public boolean isAvailable(String hotelName){
        Random random = new Random();
        return random.nextBoolean();
    }
}
