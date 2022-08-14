package Tests;

import BaseTest.BaseTest;
import Pages.SendNewEmailPage;
import org.junit.Test;

public class SendNewEmailWithCCTest extends BaseTest {

    @Test
    public void sendNewEmailTestWithCC() {
        SendNewEmailPage sendNewEmail = new SendNewEmailPage(Driver);
        sendNewEmail.SendNewEmailWithCC_Yahoo("roman.dragos1@gmail.com",
                "roman.dragos1@gmail.com",
                "Subiect Mail",
                "Text email trimis");
    }
}
