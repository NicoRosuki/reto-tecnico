package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ViewCandidates extends PageObject {

  public static final Target ADD_BTN = Target.the("Add Button")
      .locatedBy("//button[text()=' Add ']");

}
