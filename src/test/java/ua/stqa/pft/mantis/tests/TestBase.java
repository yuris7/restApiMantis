package ua.stqa.pft.mantis.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ua.stqa.pft.mantis.appmanager.ApplicationManager;
import java.io.IOException;
import static org.openqa.selenium.remote.BrowserType.CHROME;


public class TestBase {


    protected static ApplicationManager app;

    static {
        app = new ApplicationManager(System.getProperty("browser", CHROME));
    }

    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {

        app.stop();
    }

}
