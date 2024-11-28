package orangehrm.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orangehrm.pageobjects.CandidateForm;
import orangehrm.pageobjects.RecruitmentPage;
import orangehrm.pageobjects.ViewCandidates;

public class AddNewCandidate {

  public static Performable withDetails(String firstName, String lastName, String email, String keyword) {

    return Task.where("{0} adds a new candidate with first name '#firstName', last name '#lastName' and email '#email'",
        Click.on(ViewCandidates.ADD_BTN),
        Enter.theValue(firstName).into(CandidateForm.FIRST_NAME),
        Enter.theValue(lastName).into(CandidateForm.LAST_NAME),
        Click.on(CandidateForm.VACANCY),
        Click.on(CandidateForm.VACANCY_OPTION),
        Enter.theValue(email).into(CandidateForm.EMAIL),
        Enter.theValue(keyword).into(CandidateForm.KEYWORDS),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

}
