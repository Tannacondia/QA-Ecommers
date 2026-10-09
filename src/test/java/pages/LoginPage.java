package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By secureAreaTitle = By.cssSelector("h2");
    private By errorMenssage = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void ingresarPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void hacerClickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean loginExitoso() {
        return driver.getCurrentUrl().contains("/secure");
    }  //Se encarga de interactuar o consultar la página

    public boolean apareceSecureArea() {
        return driver.findElement(secureAreaTitle).isDisplayed();
    }
    public boolean apareceMensajeError() {
        return driver.findElement(errorMenssage).isDisplayed();
    }//Comprueba si el mensaje está visible

    public String obtenerMensajeError(){
        return driver.findElement(errorMenssage).getText();
    }//Obtiene el texto que aparece en pantalla
}