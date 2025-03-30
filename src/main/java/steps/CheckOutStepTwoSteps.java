package steps;

import pages.CheckOutStepTwoPage;

public class CheckOutStepTwoSteps extends BaseSteps {

    CheckOutStepTwoPage checkOutStepTwoPage = new CheckOutStepTwoPage();

    public void clickFinishButton() {
        checkOutStepTwoPage.pressFinishButton();
    }
}