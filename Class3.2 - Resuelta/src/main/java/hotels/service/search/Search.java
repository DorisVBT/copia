package hotels.service.search;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

    private SearchHotelService searchHotelService;

    public Search(SearchHotelService searchHotelService){
        this.searchHotelService = searchHotelService;
    }

    public List<String> getAllHotelList(){
        List<String> resultList = searchHotelService.getHotels();
        Collections.sort(resultList);
        return resultList;
    }

    public List<String> getFirstHotels(int count){
        List<String> list = searchHotelService.getHotels();
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
