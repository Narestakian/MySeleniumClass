import StepsSelenide.DropDownSteps;
import Utils.SetUpClasses;
import org.testng.annotations.Test;

public class DropDownCheckTest extends SetUpClasses {
    DropDownSteps dropDownSteps = new DropDownSteps();
    @Test
    public void Task2(){
        dropDownSteps.openDropDownPage();
        dropDownSteps.selectOption("Option 2");
        dropDownSteps.checkSelectedOption("Option 2");
    }
}