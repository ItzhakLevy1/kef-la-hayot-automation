package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.LinksPage;
import utils.AllureAttachments;

public class LinksPageTests extends BaseTest{

    private LinksPage linksPage;

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Feature("Links page UI")
    @Owner("Itzhak Levy")
    @Description("TC-12: page With Empty Section")
    public void pageWithEmptySection() {
        linksPage = new LinksPage(driver);

        linksPage.navigateToLinksPage();

        linksPage.clickLinkToPTVStore();

        linksPage.highlightEmptyPTVStoreSection();

        AllureAttachments.saveScreenshot("TC-12: page With Empty Section", driver);
    }
}
