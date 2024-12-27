package ElementsSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FillingFormElements {
    public SelenideElement firstNameElement = $("[name= 'first_name']");
    public SelenideElement lastNameElement = $("[name= 'last_name']");
    public SelenideElement emailElement = $("[name= 'email']");
    public SelenideElement messageElement = $("[name= 'message']");
    public SelenideElement submitElement = $("input[value= 'SUBMIT']");

    public SelenideElement successMessage = $("body");
}
