package pages;

public class Message extends BasePage{

    private String message = ".complete-header";
    public Message(){
        super();
    }

    public Boolean compareMessage(String messageTxt){
        return verifyMessage(message,messageTxt);
    }

    public void close(){
        closeBrowser();
    }

}
