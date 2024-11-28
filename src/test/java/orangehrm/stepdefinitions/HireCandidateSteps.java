package orangehrm.stepdefinitions;

import java.util.UUID;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import orangehrm.pageobjects.ViewCandidates;
import orangehrm.tasks.*;
import orangehrm.utils.CommonUtils;

public class HireCandidateSteps {

    String keyword = UUID.randomUUID().toString();
    String todayDate = CommonUtils.getTodayInCustomFormat();

    @Given("{actor} is on the login page")
    public void actor_is_in_login_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLoginPage());
    }

    @When("{actor} logs in with valid credentials")
    public void actor_logs_in(Actor actor) {
        actor.attemptsTo(Login.withCredentials("Admin", "admin123"));
    }

    @And("{actor} adds the new candidate {string} {string} with email {string}")
    public void actor_adds_a_new_candidate(Actor actor, String firstName, String lastName, String email) {
        actor.attemptsTo(GoTo.recruitmentPage());
        actor.attemptsTo(AddNewCandidate.withDetails(firstName, lastName, email, keyword));
    }

    @And("{actor} completes the hiring process for the candidate")
    public void actor_completes_hiring_process(Actor actor) {
        actor.attemptsTo(ContinueApplicationProcessBy.shortlistingCandidate());
        actor.attemptsTo(
                ContinueApplicationProcessBy.schedulingInterview("Technical Interview", "Ranga  Akunuri",
                        "2024-31-12"));
        actor.attemptsTo(ContinueApplicationProcessBy.markingInterviewAsPassed());
        actor.attemptsTo(ContinueApplicationProcessBy.offeringJob());
        actor.attemptsTo(ContinueApplicationProcessBy.hiringCandidate());
    }

    @Then("{actor} sees the candidate has the status {string} and candidate data is correct")
    public void candidate_has_status(Actor actor, String status) {
        actor.attemptsTo(GoTo.recruitmentPage());
        actor.attemptsTo(SearchCandidate.byKeyword(keyword));
        actor.attemptsTo(Ensure.that(ViewCandidates.VACANCY_CELL).text().isEqualTo("Payroll Administrator"));
        actor.attemptsTo(Ensure.that(ViewCandidates.CANDIDATE_CELL).text().isEqualTo("Juan Perez"));
        actor.attemptsTo(Ensure.that(ViewCandidates.DATE_CELL).text().isEqualTo(todayDate));
        actor.attemptsTo(Ensure.that(ViewCandidates.STATUS_CELL).text().isEqualTo(status));
    }

}