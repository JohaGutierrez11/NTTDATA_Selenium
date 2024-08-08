package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class PurchaseSteps {

    LoginPage login = new LoginPage();
    SelectItems addItem = new SelectItems();
    CartPage cart = new CartPage();
    CheckoutInformation form = new CheckoutInformation();
    BillsPage bill = new BillsPage();
    Message mssg = new Message();

    @Given("The user navigates to SauceDemo")
    public void navigate(){
        login.navigateToSauceDemo();
    }

    @And("The user logins with user {string} and password {string}")
    public void loginForm(String user, String pass){
        login.writeForm(user,pass);
    }

     @And("The user clicks on button login")
    public void lbtn(){
        login.buttonLogin();
    }

    @When("The user chooses two items")
    public void chooseItems(){
        addItem.addItems();
    }

    @And("The user views the shopping cart")
    public void seeCartPage(){
        addItem.seeCart();
    }

    @Then("The user proceeds to checkout")
    public void checkoutCart(){
        cart.viewCart();
    }

    @Then("The user complete the information form with name {string}, last name {string} and Zip Code {string}")
    public void completeFormInformation(String name, String lastname,String zipCode){
        form.completeForm(name,lastname,zipCode);

    }

    @And("The user sees the bill")
    public void bills(){
        bill.finishPurchase();

    }

    @Then("The user sees the message {string}")
    public void messageBox(String messageExcept){
        mssg.compareMessage(messageExcept);
        mssg.close();
    }

}
