package steps;

import io.qameta.allure.Step;
import pages.CheckOutStepTwoPage;

public class CheckOutStepTwoSteps extends BaseSteps {

    CheckOutStepTwoPage checkOutStepTwoPage = new CheckOutStepTwoPage();

    @Step
    public void clickFinishButton() {
        checkOutStepTwoPage.pressFinishButton();
    }
}