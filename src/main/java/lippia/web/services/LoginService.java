package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginContants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void irALogin (){
        navigateTo(PropertyManager.getProperty("web.base.url")+"/index.php?controller=authentication&back=my-account");

    }
    public static void setUsuario (String usuario) {
        setInput(LoginContants.INPUT_EMAIL_CSS,usuario,true,true);
    }
    public static void setPassword (String password) {
        setInput(LoginContants.INPUT_PASSWORD_CSS, password, true);

    }
    public static void ClickSingIn () {
        click(LoginContants.BUTTON_SINGIN_CSS  );
    }

}
