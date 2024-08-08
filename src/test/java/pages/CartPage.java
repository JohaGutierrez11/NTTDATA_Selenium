package pages;

public class CartPage extends BasePage{
    private String checkout = "checkout";


    public CartPage(){
        super(driver);
    }

    public void viewCart(){
        takeScreenshot("src/test/resources/screenshot/cart.png");
        clickElement(checkout);
    }






}
