package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.EjemploPracticaService;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;

public class  LoginSteps extends PageSteps {
    @Given("el usuario navega a la pagina de login")
    public void IngresarPaginaLogin() {
        LoginService.irALogin();
    }

    @When("^el usuario ingresa sus credenciales (.*) y (.*)$")
    public void IngresarCredenciales(String usuario, String password) {
        LoginService.setUsuario(usuario);
        LoginService.setPassword(password);
        LoginService.ClickSingIn();
    }

    @Then("el usuario es redireccionado a my account")
    public void ValidarMyAccount() {
        MyAccountService.ValidarMyAccountPage();
    }



}
