package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ApplicationStage extends PageObject {

  public static final Target RECRUITMENT_STATUS = Target.the("Recruitment Status")
      .locatedBy(".orangehrm-recruitment-status>p");

  public static final Target SHORTLIST_BTN = Target.the("Shortlist Button")
      .locatedBy("//button[text()=' Shortlist ']");

  public static final Target SCHEDULE_BTN = Target.the("Schedule Interview Button")
      .locatedBy("//button[text()=' Schedule Interview ']");

  public static final Target PASS_INTERVIEW_BTN = Target.the("Mark Interview Pass Button")
      .locatedBy("//button[text()=' Mark Interview Passed ']");

  public static final Target OFFER_JOB_BTN = Target.the("Offer Job Button")
      .locatedBy("//button[text()=' Offer Job ']");

  public static final Target HIRE_BTN = Target.the("Hire Button")
      .locatedBy("//button[text()=' Hire ']");
}
