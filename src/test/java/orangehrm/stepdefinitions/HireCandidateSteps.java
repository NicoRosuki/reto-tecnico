package orangehrm.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import orangehrm.pageobjects.ApplicationStage;
import orangehrm.tasks.*;

public class HireCandidateSteps {

    @Given("{actor} is on the login page")
    public void actor_is_in_login_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLoginPage());
    }

    @When("{actor} logs in with valid credentials")
    public void actor_logs_in(Actor actor) {
        actor.attemptsTo(Login.withCredentials("Admin", "admin123"));
    }

    @And("{actor} navigates to the Recruitment page")
    public void actor_navigates_to_the_recruitment_page(Actor actor) {
        actor.attemptsTo(GoTo.recruitmentPage());
    }

    @And("{actor} adds a new candidate with valid details")
    public void actor_adds_a_new_candidate(Actor actor) {
        actor.attemptsTo(AddNewCandidate.withDetails("Juan", "Perez", "jperez1234@email.com"));
    }

    @And("{actor} shortlists the candidate")
    public void actor_shortlists_the_candidate(Actor actor) {
        actor.attemptsTo(ContinueApplicationProcessBy.shortlistingCandidate());
    }

    @And("{actor} schedules an interview for the candidate")
    public void actor_schedules_interview(Actor actor) {
        actor.attemptsTo(
                ContinueApplicationProcessBy.schedulingInterview("Technical Interview", "Ranga  Akunuri",
                        "2024-31-12"));
    }

    @And("{actor} marks the interview as passed")
    public void actor_marks_interview_as_passed(Actor actor) {
        actor.attemptsTo(ContinueApplicationProcessBy.markingInterviewAsPassed());
    }

    @And("{actor} offers the candidate a job")
    public void actor_offers_job(Actor actor) {
        actor.attemptsTo(ContinueApplicationProcessBy.offeringJob());
    }

    @And("{actor} hires the candidate")
    public void actor_hires_candidate(Actor actor) {
        actor.attemptsTo(ContinueApplicationProcessBy.hiringCandidate());
    }

    @Then("{actor} sees the candidate has the status {string}")
    public void candidate_has_status(Actor actor, String status) {
        actor.attemptsTo(Ensure.that(ApplicationStage.RECRUITMENT_STATUS).text().contains(status));
    }

}