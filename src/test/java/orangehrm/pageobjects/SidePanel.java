package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SidePanel extends PageObject {

  public static final Target RECRUITMENT_LINK = Target.the("Recruitment Link")
      .locatedBy("a[href*='viewRecruitmentModule']");

}