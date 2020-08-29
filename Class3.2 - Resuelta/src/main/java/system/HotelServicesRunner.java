package system;

import hotels.service.avail.Avail;
import hotels.service.avail.AvailHotelService;
import hotels.service.book.Booking;
import hotels.service.book.BookService;
import hotels.service.search.Search;
import hotels.service.search.SearchHotelService;

public class HotelServicesRunner {
    public static void main(String[] args) {
        SearchHotelService searchHotelService = new SearchHotelService();
        Search search = new Search(searchHotelService);
        System.out.println("Hoteles disponibles: " + search.getAllHotelList());
        System.out.println("Hoteles disponibles: " + search.getFirstHotels(5));

        AvailHotelService availHotelService = new AvailHotelService();
        Avail avail = new Avail(availHotelService);
        System.out.println("Hoteles disponible?: " + avail.isAvailable("Hotel_80"));

        BookService bookService = new BookService();
        Booking book = new Booking(bookService);
        System.out.println("Validar numero de seguridad : " + book.validateSecureNumber(12));
        System.out.println("Realizar pago : " + book.pay(123456788));
        System.out.println("Validar tarjeta de credito : " + book.validateCreditCard(123456788));
    }
}
