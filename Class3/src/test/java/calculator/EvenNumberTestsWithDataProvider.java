package calculator;

import maths.EvenNumber;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EvenNumberTestsWithDataProvider {

    @Test(dataProvider = "testIsEvenNumberDataProvider")
    public void testIsEvenNumber(int number, boolean expected){
        //Arrange
        EvenNumber evenNumber = new EvenNumber();
        //Act
        boolean isEvenNumberResult = evenNumber.isEvenNumber(number);
        //Assert
        Assert.assertEquals(isEvenNumberResult, expected);
    }

    @DataProvider(name = "testIsEvenNumberDataProvider")
    public Object[][] testIsEvenNumberDataProvider(){
        return new Object[][]{
                {4, true},
                {108, true},
                {5, false}
        };
    }
}
