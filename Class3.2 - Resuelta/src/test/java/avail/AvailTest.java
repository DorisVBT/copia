package avail;

import hotels.service.avail.Avail;
import hotels.service.avail.AvailHotelService;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AvailTest {

    @Test
    public void testIsHotelAvailable(){
        //Arrange
        AvailHotelService availHotelService = mock(AvailHotelService.class);
        when(availHotelService.isAvailable("Hotel_51")).thenReturn(true);
        Avail avail = new Avail(availHotelService);

        //Act
        boolean isHotelAvailable = avail.isAvailable("Hotel_51");

        //Assert
        Assert.assertTrue(isHotelAvailable);
    }
}
