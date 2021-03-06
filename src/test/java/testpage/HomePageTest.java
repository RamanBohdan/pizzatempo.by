package testpage;

import org.testng.annotations.Test;
import pageobjects.HomePage;

import static org.testng.Assert.assertEquals;

public class HomePageTest extends AbstractTest {

    @Test
    public void testHomePageWithTitle() {
        HomePage homePage = new HomePage(driver).openPage();

        assertEquals(homePage.getTitleShortNumber(), HomePage.titleShortNumberPhone);
        assertEquals(homePage.getTitleBasketPizza(), HomePage.titleBasketPizza);
        assertEquals(homePage.getTitlePizzaLogoHome(), HomePage.titlePizzaLogo);
        assertEquals(homePage.getTitlePizzaBurgerHome(), HomePage.titlePizzaBurger);
        assertEquals(homePage.getTitlePizzaHotHome(), HomePage.titlePizzaHot);
        assertEquals(homePage.getTitlePizzaSaladHome(), HomePage.titlePizzaSalad);
        assertEquals(homePage.getTitlePizzaSaleHome(), HomePage.titlePizzaSale);
        assertEquals(homePage.getTitlePizzaWaterHome(), HomePage.titlePizzaWater);
    }
}
