package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

/* -----Funciones Cumber(Given, when, then)-------- */
public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    @Given("el usuario se encuentra en la página de login")
    public void usuarioEnLogin() {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("ingresa el usuario {string}")
    public void ingresarUsuario(String username) {
        loginPage.ingresarUsuario(username);
    }

    @When("ingresa la contraseña {string}")
    public void ingresarPassword(String password) {
        loginPage.ingresarPassword(password);
    }

    @When("presiona el botón {string}")
    public void presionarBoton(String boton) {
        loginPage.hacerClickLogin();
    }

    @Then("debería acceder a su cuenta")
    public void validarLogin() {
       assertTrue(loginPage.loginExitoso()); //Se encarga de verificar que el resultado esperado se cumpla
        assertTrue(loginPage.apareceSecureArea());//Se encarga de verificar que aparezca el secure area
    }
    @Then("debería mostrar un mensaje de error")
    public void verificarMensajeError(){
        assertTrue(loginPage.apareceMensajeError());//Se enecarga de que el mensaje de error aparece en la página
        String mensaje = loginPage.obtenerMensajeError();//Si alguna comprobación falla, el test falla
        assertTrue(mensaje.contains("invalid")); //El mensaje de errorcontiene "invalid"
    }
    @After
    public void cerrarNavegador(){
        if(driver!= null){
            driver.quit();
        }
    }
}
