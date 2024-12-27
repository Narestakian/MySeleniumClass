package StepsSelenide;

import ElementsSelenide.AlertPageElements;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.open;

public class AlertPageSteps extends AlertPageElements {

    public void openAlertPage(){
        open("https://the-internet.herokuapp.com/javascript_alerts");
    }
    public void clickConfirmButton(){
        confirmButton.click();
    }

    public void clickOkButton(){
        okButton.click();
    }

    public void alertText(String text){
        okButton.shouldHave(Condition.text(text));

    }

}
