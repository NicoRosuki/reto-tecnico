package orangehrm.tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import orangehrm.pageobjects.ViewCandidates;

public class SearchCandidate {

  public static Performable byKeyword(String keyword) {
    return Task.where("{0} searches for candidates with keyword '#keyword'",
        Click.on(ViewCandidates.KEYWORDS),
        Enter.theValue(keyword).into(ViewCandidates.KEYWORDS),
        Click.on(ViewCandidates.SEARCH_BTN),
        WaitUntil.the(By.xpath("(//div[@role='row'])[3]"), isNotVisible()).forNoMoreThan(30).seconds());
  }

}
