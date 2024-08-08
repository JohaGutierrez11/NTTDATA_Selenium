package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private String username = "user-name";
    private String pass = "password";
    private String btnLogin = "login-button";

    public LoginPage() {
        super(driver);
    }

    public void navigateToSauceDemo() {
        navigateTo("https://www.saucedemo.com/");
    }

    public void writeForm(String user, String password) {
        write(username, user);
        write(pass, password);
        takeScreenshot("src/test/resources/screenshot/login.png");
    }

    public void buttonLogin() {
        clickElement(btnLogin);
    }
}
