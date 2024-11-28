package orangehrm.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import orangehrm.pageobjects.LoginPage;

public class Login {

  public static Performable withCredentials(String userName, String password) {
    return Task.where("{0} logs in with username '#userName' and password '#password'",
        Enter.theValue(userName).into(LoginPage.USERNAME),
        Enter.theValue(password).into(LoginPage.PASSWORD),
        Click.on(LoginPage.LOGIN_BTN));
  }

}
