package tests;

import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class RegistrationTests extends ApplicationManager {

    @Test
    public void registrationPositiveTest() {
        new HomePage(getDriver()).clicBtnLoginHeader();
        new LoginPage(getDriver()).typeLoginForm("my_email", "password");

    }


}
