package orangehrm.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class AddCandidate extends PageObject {

        public static final Target FIRST_NAME = Target.the("First Name")
                        .locatedBy("[name='firstName']");

        public static final Target LAST_NAME = Target.the("Last Name")
                        .locatedBy("[name='lastName']");

        public static final Target VACANCY = Target.the("Vacancy")
                        .locatedBy("//div[text()='-- Select --']");

        public static final Target VACANCY_OPTION = Target.the("Vacancy Option")
                        .locatedBy("//span[text()='Payroll Administrator']");

        public static final Target EMAIL = Target.the("Email")
                        .locatedBy("//label[text()='Email']/../following-sibling::div/input");

}
