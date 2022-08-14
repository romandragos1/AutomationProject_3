package Tests;

import BaseTest.BaseTest;
import Pages.EmptyTrashFolderPage;
import org.junit.Test;

public class EmptyTrashFolderTest extends BaseTest {

    @Test
    public void emptyTrashFolderTest() {
        EmptyTrashFolderPage emptyTrashFolder = new EmptyTrashFolderPage(Driver);
        emptyTrashFolder.emptyTrashFolder_Yahoo();
    }
}
