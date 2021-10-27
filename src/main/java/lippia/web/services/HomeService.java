package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class HomeService extends ActionManager {

    public static void irAlHome(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void setSearch(String valor){
        setInput(HomeConstants.INPUT_SEARCH_CSS, valor);
    }

    public static void clickSearch(){
        click( HomeConstants.BUTTON_SEARCH_CSS);
    }

}
