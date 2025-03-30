package steps;

import pages.CheckOutStepOnePage;

public class CheckOutStepOneSteps extends BaseSteps {

    private final CheckOutStepOnePage checkOutStepOnePage = new CheckOutStepOnePage();

    public void checkOutPageOpened() {
        checkOutStepOnePage.verifyThatPageOpened();
    }

    public void inputFirstName(String firstName) {
        checkOutStepOnePage.inputFirstName(firstName);
    }

    public void inputLastName(String lastName) {
        checkOutStepOnePage.inputLastName(lastName);
    }

    public void inputPostalCode(String postalCode) {
        checkOutStepOnePage.inputPostalCode(postalCode);
    }

    public void pressContinueButton() {
        checkOutStepOnePage.pressContinueButton();
    }
}