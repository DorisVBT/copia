package hotels.service.book;

import jdk.jshell.spi.ExecutionControl;
import java.util.Random;

public class BookService {

    public boolean validateCreditCard(int cardNumber) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Metodo No implementado");
    }

    public int getCardBalance(int cardNumber){
        int max = 100000;
        int min = 0;
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public int getHotelPrice(){
        int max = 10000;
        int min = 0;
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
