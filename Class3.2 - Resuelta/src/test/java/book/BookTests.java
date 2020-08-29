package book;

import hotels.service.book.BookService;
import hotels.service.book.Booking;
import jdk.jshell.spi.ExecutionControl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookTests {

    @Test
    public void testValidateCreditCard() throws ExecutionControl.NotImplementedException {
        //Arrange
        int cardNumber = 1235687;
        BookService bookService = mock(BookService.class);
        when(bookService.validateCreditCard(cardNumber)).thenReturn(true);
        Booking booking = new Booking(bookService);

        //Act
        String message = booking.validateCreditCard(cardNumber);

        //Assert
        Assert.assertFalse(message.contains("Error"), "El mensaje de validacion contiene: Error");
        Assert.assertFalse(message.contains("NO es valida"), "El mensaje de validacion contiene: NO es valida");
    }

    @Test
    public void testValidateSecureNumber() {
        //Arrange
        BookService bookService = new BookService();
        Booking booking = new Booking(bookService);
        int secNumber = 123;

        //Act
        boolean isSecuredNumberValid = booking.validateSecureNumber(secNumber);

        //Assert
        Assert.assertTrue(isSecuredNumberValid, "El secNumber " + secNumber + " debe tener una longitud mayor o igual a 3");
    }

    @Test
    public void testPay() {
        //Arrange
        int cardNumber = 1235687;
        BookService bookService = mock(BookService.class);
        when(bookService.getHotelPrice()).thenReturn(100);
        when(bookService.getCardBalance(1235687)).thenReturn(150);
        Booking booking = new Booking(bookService);

        //Act
        boolean isPayOk  = booking.pay(cardNumber);

        //Assert
        Assert.assertTrue(isPayOk);
    }

}
