package pages;

public class Message extends BasePage{

    private String message = ".complete-header";
    public Message(){
        super(driver);
    }

    public Boolean compareMessage(String messageTxt){
        return verifyMessage(message,messageTxt);
    }

    public void close(){
        closeBrowser();
    }

}
