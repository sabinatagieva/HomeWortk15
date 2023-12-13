import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.ArticlePage;
import po.HistoryPage;
import po.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MainClassTest extends BaseTest {

    @Test(dataProvider = "search_provider", groups = {"Smoke"})
    void shouldBeUbisoftArticle(String search) {

        new SearchPage()
                .searchUbisoftArticle(search)
                .clickEnter()
                .clickOnUbisoftArticle();

        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft").isEqualTo("Ubisoft");

    }

    @Test(groups = {"Regression"})
    void shouldBeVisibleHistoryPage() {
        new HistoryPage()
                .searchHistoryButton();
        assertThat(new HistoryPage().firstHeadingHistory()).as("The text must be")
                .isEqualTo("Заглавная страница: история изменений");
    }

    @DataProvider(name = "search_provider")
    public Object[][] search_methods() {
        return new Object[][]{
                {"Ubisoft"},
                {"Bl"}
        };
    }

}
