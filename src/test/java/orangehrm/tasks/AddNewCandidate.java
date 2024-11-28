package orangehrm.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orangehrm.pageobjects.AddCandidate;
import orangehrm.pageobjects.RecruitmentPage;
import orangehrm.pageobjects.ViewCandidates;

public class AddNewCandidate {

  public static Performable withDetails(String firstName, String lastName, String email) {
    return Task.where("{0} adds a new candidate with first name '#firstName', last name '#lastName' and email '#email'",
        Click.on(ViewCandidates.ADD_BTN),
        Enter.theValue(firstName).into(AddCandidate.FIRST_NAME),
        Enter.theValue(lastName).into(AddCandidate.LAST_NAME),
        Click.on(AddCandidate.VACANCY),
        Click.on(AddCandidate.VACANCY_OPTION),
        Enter.theValue(email).into(AddCandidate.EMAIL),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

}
