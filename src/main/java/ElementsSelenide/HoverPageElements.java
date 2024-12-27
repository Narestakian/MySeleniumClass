package ElementsSelenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HoverPageElements {
    public SelenideElement hoverButton = $x("//button [text()='Hover Over Me First!']");
    public SelenideElement linkButton = $x("//button [text()='Hover Over Me First!']")
            .sibling(0).$("a");
}
