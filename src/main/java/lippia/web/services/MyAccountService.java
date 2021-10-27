package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstant;
import org.testng.Assert;

public class MyAccountService extends ActionManager {
    public static void ValidarMyAccountPage() {
        waitVisibility(MyAccountConstant.TITLE_MYACCOUNT);
    Assert.assertEquals(getText(MyAccountConstant.TITLE_MYACCOUNT),"MY ACCOUNT");
    }

}
