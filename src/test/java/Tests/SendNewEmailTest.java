package Tests;

import BaseTest.BaseTest;
import Pages.SendNewEmailPage;
import org.junit.Test;

public class SendNewEmailTest extends BaseTest {

    @Test
    public void sendNewEmailTest() {
        SendNewEmailPage sendNewEmail = new SendNewEmailPage(Driver);
        sendNewEmail.SendNewEmail_Yahoo("roman.dragos1@gmail.com",
                "Subiect Mail",
                "Text email trimis");
    }
}
