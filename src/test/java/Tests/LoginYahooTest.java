package Tests;

import BaseTest.BaseTest;
import Pages.LoginYahooPage;
import org.junit.Test;

public class LoginYahooTest extends BaseTest {

    @Test
    public void loginYahooTest() {
        LoginYahooPage loginYahoo = new LoginYahooPage(Driver);
        loginYahoo.login_Yahoo("fake.test.mail.automation@gmail.com", "aut123!@#sDf");
    }
}
