package ElementsSelenide;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageElements {
    public SelenideElement usernameField = $("#username");
    public SelenideElement passwordField = $("#password");
    public SelenideElement loginButton = $("button[type='submit']");
    public SelenideElement flashMessage = $("div#flash");
}
