package ElementsSelenide;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public  class AlertPageElements {
        public SelenideElement confirmButton = $("button[onclick='jsConfirm()'");
       public SelenideElement okButton = $("p[style='color:green']");

    }


