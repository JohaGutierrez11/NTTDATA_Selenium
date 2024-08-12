package pages;

public class BillsPage extends BasePage{

    private String btnFish = "finish";


    public BillsPage(){
        super();
    }

    public void finishPurchase(){
        takeScreenshot("src/test/resources/screenshot/bills.png");
        clickElement(btnFish);
    }
}

