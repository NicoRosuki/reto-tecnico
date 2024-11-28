package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ScheduleInterview extends PageObject {

        public static final Target INTERVIEW_TITLE = Target.the("Interview Title")
                        .locatedBy("//label[text()='Interview Title']/../following-sibling::div/input");

        public static final Target INTERVIEWER = Target.the("Interviewer")
                        .locatedBy("[placeholder='Type for hints...']");

        public static final Target INTERVIEW_DATE = Target.the("Interview Date")
                        .locatedBy("[placeholder='yyyy-dd-mm']");

        public static Target INTERVIEWER_OPTION(String interviewerName) {
                return Target.the("Interviewer Option")
                                .locatedBy("//span[text()='{0}']").of(interviewerName);
        }

}
