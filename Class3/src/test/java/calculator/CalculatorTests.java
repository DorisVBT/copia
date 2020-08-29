package calculator;

import maths.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTests {

    @Test
    public void testSum(){
        //Arrange
        int expected = 15;
        Calculator calculator = new Calculator(5, 10);
        //Act
        int addResult = calculator.sum();
        //Assert
        Assert.assertEquals(addResult, expected);
    }

    @Test(dataProvider = "testSubtractDataProvider")
    public void testSubtract(int number1, int number2, int expectedResult){
        Calculator calculator = new Calculator(number1, number2);
        Assert.assertEquals(calculator.subtract(), expectedResult);
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator(5, 10);
        Assert.assertEquals(calculator.multiply(), 50);
    }

    @Test
    public void testDiv(){
        Calculator calculator = new Calculator(5, 10);
        Assert.assertEquals(calculator.div(), 0);
    }

    @DataProvider(name = "testSubtractDataProvider")
    public Object[][] testSubtractDataProvider(){
        return new Object[][]{
                {4, 2, 2},
                {8,-8, 16}
        };
    }
}
