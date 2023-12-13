package po;

import org.openqa.selenium.By;


public class HistoryPage extends ArticlePage {
    private static final By historyButton = By.xpath(xpathExpression:"//li[@id='ca-history']");

    public HistoryPage searchHistoryButton() {
        send(historyButton);
        return this;
    }
}

