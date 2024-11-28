package orangehrm.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import orangehrm.pageobjects.SidePanel;

public class GoTo {

  public static Performable recruitmentPage() {
    return Task.where("{0} navigates to the Recruitment page",
        Click.on(SidePanel.RECRUITMENT_LINK));
  }

}
