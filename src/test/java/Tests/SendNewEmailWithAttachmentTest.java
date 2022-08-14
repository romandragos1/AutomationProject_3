package Tests;

import BaseTest.BaseTest;
import Pages.SendNewEmailPage;
import org.junit.Test;

public class SendNewEmailWithAttachmentTest extends BaseTest {

    @Test
    public void sendNewEmailWithAttachmentTest() {
        SendNewEmailPage sendNewEmail = new SendNewEmailPage(Driver);
        sendNewEmail.SendNewEmailWithAttachment_Yahoo("roman.dragos1@gmail.com",
                "Subiect Mail",
                "Text email trimis",
                "C:\\Backup\\Proiecte Testare\\Capture.JPG");
    }
}
