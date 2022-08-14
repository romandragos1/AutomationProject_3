package Tests;

import BaseTest.BaseTest;
import Pages.SendNewEmailPage;
import org.junit.Test;

public class SendNewEmailWithCCAndBCCTest extends BaseTest {

    @Test
    public void sendNewEmailTestWithCCAndBCC() {
        SendNewEmailPage sendNewEmail = new SendNewEmailPage(Driver);
        sendNewEmail.SendNewEmailWithCCAndBCC_Yahoo("roman.dragos1@gmail.com",
                "roman.dragos1@gmail.com",
                "roman.dragos1@gmail.com",
                "Subiect Mail",
                "Text email trimis");
    }
}
