package po;

import base.mathods.BaseMethods;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethods {

    private static final By firstHeading = By.xpath("//h1[@id='firstHeading']/span");
    private static final By firstHeadingHistory = By.xpath("//h1[@id='firstHeading']");

    public String getHeadingOfArticle() {
        return getText(firstHeading);
    }
    public String firstHeadingHistory() {
        return getText(firstHeadingHistory);
    }
}
