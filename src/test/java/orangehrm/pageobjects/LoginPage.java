package orangehrm.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginPage extends PageObject {

        public static final Target USERNAME = Target.the("Username")
                        .locatedBy("[name='username']");

        public static final Target PASSWORD = Target.the("Password")
                        .locatedBy("[name='password']");

        public static final Target LOGIN_BTN = Target.the("Login Button")
                        .locatedBy("[type='submit']");
}
