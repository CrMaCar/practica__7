package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.SearchResultsService;


public class SearchSteps extends PageSteps {
    @Given("el usuario navega a la pagina principal")
    public void ingresarAlHome() {
        HomeService.irAlHome();
    }

    @When("el usuario realiza una busqueda de (.*)")
    public void realizarBusquedaArticulo(String articulo) {
            HomeService.setSearch(articulo);
            HomeService.clickSearch();

    }

    @Then("el usuario verifica que se realizo la busqueda del articulo (.*)")
    public void validarBusquedaRealizada(String articulo) {
        SearchResultsService.validarBusqueda(articulo);

    }

}



