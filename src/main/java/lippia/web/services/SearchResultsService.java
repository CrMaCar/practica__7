package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.SearchResultsConstants;
import org.testng.Assert;

public class SearchResultsService extends ActionManager {

    public static void validarBusqueda(String articulo){
        waitVisibility(SearchResultsConstants.TITLE_SEARCH_RESULT_CSS);
        Assert.assertTrue(getText(SearchResultsConstants.TITLE_SEARCH_RESULT_CSS).contains(articulo), "Articulo no encontrado");
    }


}
