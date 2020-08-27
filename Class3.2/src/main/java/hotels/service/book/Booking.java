package hotels.service.book;

public class Booking {

    private BookService bookService;

    public Booking(BookService bookService){
        this.bookService = bookService;
    }

    public String validateCreditCard(int cardNumber) {
        try {
            boolean isCreditCardValid = bookService.validateCreditCard(cardNumber);

            if(isCreditCardValid)
                return "La tarjeta de credito " + cardNumber + " es valida";
            return "La tarjeta de credito " + cardNumber + " NO es valida";

        }catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }

    public boolean validateSecureNumber(int secNumber){
        int secNumberLength = String.valueOf(secNumber).length();

        if(secNumberLength > 3)
            return true;
        return false;
    }

    public boolean pay(int cardNumber){
        int hotelPrice = bookService.getHotelPrice();
        int cardBalance = bookService.getCardBalance(cardNumber);

        if(cardBalance - hotelPrice > 0)
            return true;
        return false;
    }
}
