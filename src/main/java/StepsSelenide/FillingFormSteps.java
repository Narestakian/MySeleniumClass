package StepsSelenide;

import ElementsSelenide.FillingFormElements;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class FillingFormSteps extends FillingFormElements {
    public void openFillingFormPage(){
        open("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    public void clickOnFirstName(String text){
        firstNameElement.setValue(text);
    }
    public void clickOnLastName(String text){
        lastNameElement.setValue(text);
    }
    public void clickOnEmail(String text){
        emailElement.setValue(text);
    }
    public void clickOnMessage(String text){
        messageElement.setValue(text);
    }
    public void clickOnSubmit(){
        submitElement.click();
    }
    public void checkSuccessMessage(String text){
        successMessage.shouldBe(Condition.visible).shouldHave(Condition.text(text));
    }
}
