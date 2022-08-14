package Tests;

import BaseTest.BaseTest;
import Pages.SendNewEmailPage;
import org.junit.Test;

public class SendNewEmailWithBCCTest extends BaseTest {

    @Test
    public void sendNewEmailTestWithBCC() {
        SendNewEmailPage sendNewEmail = new SendNewEmailPage(Driver);
        sendNewEmail.SendNewEmailWithBCC_Yahoo("roman.dragos1@gmail.com",
                "roman.dragos1@gmail.com",
                "Subiect Mail",
                "Text email trimis");
    }
}
