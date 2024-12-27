package StepsSelenide;

import ElementsSelenide.LoginPageElements;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.open;


public class LoginPageSteps extends LoginPageElements {
    public void SuccessLogin() {

        open("https://the-internet.herokuapp.com/login");
    }

    public void setUsername(String username) {
        usernameField.setValue(username);

    }

    public void setPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickButton() {
        loginButton.click();
    }

    public void checkFleshMessageText(String message) {
        flashMessage.shouldHave(Condition.text(message));

    }
}

