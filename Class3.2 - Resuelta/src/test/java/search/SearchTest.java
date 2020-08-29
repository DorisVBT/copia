package search;

import hotels.service.search.Search;
import hotels.service.search.SearchHotelService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SearchTest {

    @Test
    public void testGetAllHotels(){
        //Arrange
        SearchHotelService searchHotelService = mock(SearchHotelService.class);
        List<String> hotelsExpectedList = new ArrayList<>();
        hotelsExpectedList.add("Hotel_50");
        hotelsExpectedList.add("Hotel_70");
        hotelsExpectedList.add("Hotel_60");
        hotelsExpectedList.add("Hotel_80");
        when(searchHotelService.getHotels()).thenReturn(hotelsExpectedList.stream().collect(Collectors.toList()));
        Search search = new Search(searchHotelService);
        Collections.sort(hotelsExpectedList);

        //Act
        List<String> searchResult = search.getAllHotelList();

        //Assert
        Assert.assertEquals(searchResult, hotelsExpectedList);
    }

    @Test
    public void testGetFirstHotels(){
        //Arrange
        SearchHotelService searchHotelService = mock(SearchHotelService.class);
        List<String> hotelsExpectedList = new ArrayList<>();
        hotelsExpectedList.add("Hotel_50");
        hotelsExpectedList.add("Hotel_70");
        hotelsExpectedList.add("Hotel_60");
        hotelsExpectedList.add("Hotel_80");
        when(searchHotelService.getHotels()).thenReturn(hotelsExpectedList.stream().collect(Collectors.toList()));
        Search search = new Search(searchHotelService);

        //Act
        List<String> searchResult = search.getFirstHotels(2);

        //Assert
        Assert.assertTrue(searchResult.size() == 2);
        Assert.assertTrue(searchResult.get(0).equals(hotelsExpectedList.get(0)));
        Assert.assertTrue(searchResult.get(1).equals(hotelsExpectedList.get(1)));
    }
}
