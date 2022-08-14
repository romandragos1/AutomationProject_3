package Tests;

import BaseTest.BaseTest;
import Pages.SendNewEmailPage;
import org.junit.Test;

public class SendNewEmailWithCCBCCAndAttachTest extends BaseTest {

    @Test
    public void sendNewEmailWithCCBCCAndAttachTest() {
        SendNewEmailPage sendNewEmail = new SendNewEmailPage(Driver);
        sendNewEmail.SendNewEmailWithCCBCCAndAttach_Yahoo("roman.dragos1@gmail.com",
                "roman.dragos1@gmail.com",
                "roman.dragos1@gmail.com",
                "Subiect Mail",
                "Text email trimis",
                "C:\\Backup\\Proiecte Testare\\Capture.JPG");
    }
}
