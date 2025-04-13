package steps;

import io.qameta.allure.Step;
import pages.CheckOutStepOnePage;

public class CheckOutStepOneSteps extends BaseSteps {

    private final CheckOutStepOnePage checkOutStepOnePage = new CheckOutStepOnePage();

    @Step
    public void checkOutPageOpened() {
        checkOutStepOnePage.verifyThatPageOpened();
    }

    @Step
    public void inputFirstName(String firstName) {
        checkOutStepOnePage.inputFirstName(firstName);
    }

    @Step
    public void inputLastName(String lastName) {
        checkOutStepOnePage.inputLastName(lastName);
    }

    @Step
    public void inputPostalCode(String postalCode) {
        checkOutStepOnePage.inputPostalCode(postalCode);
    }

    @Step
    public void pressContinueButton() {
        checkOutStepOnePage.pressContinueButton();
    }
}