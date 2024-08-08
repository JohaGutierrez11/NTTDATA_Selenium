package pages;

public class CheckoutInformation extends BasePage {

    private String name = "first-name";
    private String lastName = "last-name";
    private String zipCode= "postal-code";
    private String btnContinue= "continue";

    public CheckoutInformation(){
        super(driver);
    }

    public void completeForm(String firstName, String lastN, String zip){
        write(name,firstName);
        write(lastName,lastN);
        write(zipCode,zip);
        takeScreenshot("src/test/resources/screenshot/formInformation.png");
        clickElement(btnContinue);
    }
}
