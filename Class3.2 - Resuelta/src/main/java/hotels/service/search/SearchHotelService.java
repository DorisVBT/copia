package hotels.service.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchHotelService {

    private List<String> hotelsList;

    public SearchHotelService(){
        hotelsList = new ArrayList<>();
        hotelsList.add("Hotel_MTV");
        hotelsList.add("Hotel_Bolivia");
        hotelsList.add("Hotel_Peru");
        hotelsList.add("Hotel_BCN");
        hotelsList.add("Hotel_Pinar");
        hotelsList.add("Hotel_20");
        hotelsList.add("Hotel_30");
        hotelsList.add("Hotel_40");
        hotelsList.add("Hotel_50");
        hotelsList.add("Hotel_60");
        hotelsList.add("Hotel_70");
        hotelsList.add("Hotel_80");
        hotelsList.add("Hotel_90");
    }

    public List<String> getHotels(){
        Collections.shuffle(hotelsList);
        return hotelsList;
    }
}
