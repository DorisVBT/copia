package calculator;

import maths.EvenNumber;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EvenNumberTests {

    @Test
    public void testIsEvenNumber(int number){
        EvenNumber evenNumber = new EvenNumber();
        Assert.assertTrue(evenNumber.isEvenNumber(number));
    }

    @Test
    public void testIsNotEvenNumber(){
        //Arrange
        EvenNumber evenNumber = new EvenNumber();
        //Act
        boolean isEvenNumberResult = evenNumber.isEvenNumber(5);
        //Assert
        Assert.assertFalse(isEvenNumberResult);
    }
}
