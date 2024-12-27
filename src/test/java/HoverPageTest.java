import StepsSelenide.HoverPageSteps;
import Utils.SetUpClasses;
import org.testng.annotations.Test;

public class HoverPageTest extends SetUpClasses {
    HoverPageSteps hoverPageSteps = new HoverPageSteps();
    @Test
    public void Task4(){
        hoverPageSteps.openHoverPage();
        hoverPageSteps.hoverOnElement();
        hoverPageSteps.clickOnLinkButton();
        hoverPageSteps.checkAlertText("Well done you clicked on the link!");
    }
}
