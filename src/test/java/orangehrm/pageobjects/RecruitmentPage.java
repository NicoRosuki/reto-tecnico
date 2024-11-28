package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class RecruitmentPage extends PageObject {

  public static final Target SAVE_BTN = Target.the("Save Button")
      .locatedBy("//button[text()=' Save ']");

}
