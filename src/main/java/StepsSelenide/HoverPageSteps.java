package StepsSelenide;

import ElementsSelenide.HoverPageElements;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class HoverPageSteps extends HoverPageElements {

    public void openHoverPage(){
        open("https://webdriveruniversity.com/Actions/index.html#");
    }
    public void hoverOnElement(){
        hoverButton.click();
    }

    public void clickOnLinkButton(){
        linkButton.click();
    }

    public void checkAlertText(String text){
        Assert.assertTrue(switchTo().alert().getText().contains(text));

    }
}
