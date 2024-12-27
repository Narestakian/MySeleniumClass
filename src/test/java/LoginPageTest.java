import StepsSelenide.LoginPageSteps;
import Utils.SetUpClasses;
import org.testng.annotations.Test;


public class LoginPageTest extends SetUpClasses {
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    @Test
    public void Task1(){
        loginPageSteps.SuccessLogin();
        loginPageSteps.setUsername("tomsmith");
        loginPageSteps.setPassword("SuperSecretPassword!");
        loginPageSteps.clickButton();
        loginPageSteps.checkFleshMessageText("You logged into a secure area!");

    }
}
