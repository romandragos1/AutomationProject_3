package Tests;

import BaseTest.BaseTest;
import Pages.EmptySpamFolderPage;
import org.junit.Test;

public class EmptySpamFolderTest extends BaseTest {

    @Test
    public void emptySpamFolderTest() {
        EmptySpamFolderPage emptySpamFolder = new EmptySpamFolderPage(Driver);
        emptySpamFolder.emptySpamFolder_Yahoo();
    }
}
