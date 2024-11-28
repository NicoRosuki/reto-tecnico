package orangehrm.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import orangehrm.pageobjects.ApplicationStage;
import orangehrm.pageobjects.RecruitmentPage;
import orangehrm.pageobjects.ScheduleInterview;

public class ContinueApplicationProcessBy {

  public static Performable shortlistingCandidate() {
    return Task.where("{0} continues the application process by shortlisting candidates",
        Click.on(ApplicationStage.SHORTLIST_BTN),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

  public static Performable schedulingInterview(String interviewTitle, String interviewer, String interviewDate) {
    String interviewerFirstName = interviewer.split(" ")[0];

    return Task.where("{0} continues the application process by scheduling an interview",
        Click.on(ApplicationStage.SCHEDULE_BTN),
        Enter.theValue(interviewTitle).into(ScheduleInterview.INTERVIEW_TITLE),
        Enter.theValue(interviewerFirstName).into(ScheduleInterview.INTERVIEWER),
        Click.on(ScheduleInterview.INTERVIEWER_OPTION(interviewer)).afterWaitingUntilPresent(),
        Enter.theValue(interviewDate).into(ScheduleInterview.INTERVIEW_DATE),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

  public static Performable markingInterviewAsPassed() {
    return Task.where("{0} continues the application process by marking the interview as passed",
        Click.on(ApplicationStage.PASS_INTERVIEW_BTN),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

  public static Performable offeringJob() {
    return Task.where("{0} continues the application process by offering the candidate a job",
        Click.on(ApplicationStage.OFFER_JOB_BTN),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

  public static Performable hiringCandidate() {
    return Task.where("{0} continues the application process by hiring the candidate",
        Click.on(ApplicationStage.HIRE_BTN),
        Click.on(RecruitmentPage.SAVE_BTN));
  }

}
