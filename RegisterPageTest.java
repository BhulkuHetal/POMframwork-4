import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.HomePage;
import com.demo.nopcommerce.Pages.LoginPage;
import com.demo.nopcommerce.Pages.RegisterPage;
import com.demo.nopcommerce.Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {

    BasePage basePage;
    Properties prop;
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePages;
    RegisterPage registerPage;

    @BeforeTest //BeforeTest for only 1 browser
    public void openBrowser() throws InterruptedException {

        basePage = new BasePage();//I will initialise basePage here
        prop = basePage.initialiseProperties();
        String browser = prop.getProperty("browser");
        driver = basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("urlhome"));
        loginPage = new LoginPage(driver);
        registerPage = loginPage.doRegister();


    }

    @Test(priority = 1)
    public void verifyRegisterPageTitle() {
        String title = registerPage.getRegisterPageTitle();
        System.out.println("Register page title is:" + title);
        Assert.assertEquals(title, Constants.REGISTER_PAGE_TITLE);
    }
//    @DataProvider
//    public Object[][] getRegTestData() {
//        Object[][] data = ExcelUtils.getRegData(Constants.REG_SHEET_NAME);
//        return data;

    //@Test (priority = 2, dataProvider = "getRegTestData")
    // public void createRegister(String fn, String ln, String email, String CN, String pwd, String cpwd,String Regname,
    //String Yourname,String day, String month,String year)
    // { registerPages.registerUser(fn,ln,email,CN,pwd,cpwd,Regname,Yourname,day,month,year);}
    @Test(priority = 2)
    public void registerTest() throws InterruptedException {
        registerPage.registerUser(prop.getProperty("fn"), prop.getProperty("ln"),prop.getProperty("day"),prop.getProperty("month"),
                prop.getProperty("year"),prop.getProperty("email"),prop.getProperty("CN"),prop.getProperty("pwd"),
                prop.getProperty("cpwd"),prop.getProperty("Regname"), prop.getProperty("Yourname") );}


    @AfterTest
    public void tearDown() {
        driver.quit();

    }

}


