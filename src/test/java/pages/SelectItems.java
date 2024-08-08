package pages;

public class SelectItems extends BasePage{

    private String itemOne = "add-to-cart-sauce-labs-bolt-t-shirt";
    private String itemTwo = "add-to-cart-test.allthethings()-t-shirt-(red)";
    private String cartOption = "shopping_cart_link";

    public SelectItems(){
        super(driver);
    }

    public void addItems(){
        clickElement(itemOne);
        clickElement(itemTwo);
        takeScreenshot("src/test/resources/screenshot/items.png");
    }

    public void seeCart(){
        clickElementName(cartOption);
    }
}
