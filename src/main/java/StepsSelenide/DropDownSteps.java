package StepsSelenide;

import ElementsSelenide.DropDownElements;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.open;

public class DropDownSteps extends DropDownElements {

    public void openDropDownPage() {

        open("https://the-internet.herokuapp.com/dropdown");
    }


    public void selectOption(String option){
        dropDown.selectOption(option);

    }
    public void checkSelectedOption(String option){
        dropDown.getSelectedOption().shouldHave(Condition.text(option));
    }

}
