package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ViewCandidates extends PageObject {

  public static final Target ADD_BTN = Target.the("Add Button")
      .locatedBy("//button[text()=' Add ']");

  public static final Target KEYWORDS = Target.the("Keywords")
      .locatedBy("[placeholder='Enter comma seperated words...']");

  public static final Target SEARCH_BTN = Target.the("Add Button")
      .locatedBy("//button[text()=' Search ']");

  public static final Target VACANCY_CELL = Target.the("Vacancy Name Cell")
      .locatedBy("//div[@class='oxd-table-card']//div[2]/div");

  public static final Target CANDIDATE_CELL = Target.the("Candidate Name Cell")
      .locatedBy("//div[@class='oxd-table-card']//div[3]/div");

  public static final Target DATE_CELL = Target.the("Date Cell")
      .locatedBy("//div[@class='oxd-table-card']//div[5]/div");

  public static final Target STATUS_CELL = Target.the("Candidate Status Cell")
      .locatedBy("//div[@class='oxd-table-card']//div[6]/div");

}
