import StepsSelenide.FillingFormSteps;
import Utils.SetUpClasses;
import org.testng.annotations.Test;

public class FillingFormTest extends SetUpClasses {
    FillingFormSteps fillingFormSteps = new FillingFormSteps();
    @Test
    public void Task5(){
        fillingFormSteps.openFillingFormPage();
        fillingFormSteps.clickOnFirstName("John");
        fillingFormSteps.clickOnLastName("Doe");
        fillingFormSteps.clickOnEmail("johndoe@example.com");
        fillingFormSteps.clickOnMessage(" This is a test message.");
        fillingFormSteps.clickOnSubmit();
        fillingFormSteps.checkSuccessMessage("Thank You for your Message!");

    }
}
