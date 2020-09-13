package employee;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeePage;
import pages.LoginPage;

public class EmployeeTests extends BaseTest {

    @Test
    public void testAddEmployee(){
        LoginPage loginPage = new LoginPage(webDriver);
        EmployeePage employeePage = loginPage.loginAs("admin","admin123");
        employeePage.addEmployee("Juan","Juan@gmail.com","MTZ","522255",
                "Montevideo", "Uruguay", "11523");
        Assert.assertTrue(employeePage.isSuccessAlertVisible());
    }
}
