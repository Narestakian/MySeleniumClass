import StepsSelenide.AlertPageSteps;
import Utils.SetUpClasses;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.confirm;

public class AlertPageTest extends SetUpClasses {
    AlertPageSteps  alertPageSteps = new  AlertPageSteps();
    @Test
    public void Task3(){
        alertPageSteps.openAlertPage();
        alertPageSteps.clickConfirmButton();
        confirm();
        alertPageSteps.clickOkButton();
        alertPageSteps.alertText("You clicked: Ok");

    }
}
