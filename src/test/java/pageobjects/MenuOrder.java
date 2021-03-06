package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuOrder extends AbstractPage {

    public final static String titleMenuOrder = "Оформление заказа";

    @FindBy(xpath = "//div[@class='pageTitle']/h1")
    private WebElement labelCheckout;
    @FindBy(xpath = "//*[@id='basket_expand']//div[@class='cart-product-name title']")
    private WebElement labelPizzaMargherita;
    @FindBy(xpath = "//*[@id='basket_expand']//div[@class='cart-product-name title']")
    private WebElement labelDrink;

    private WebDriver driver;

    public MenuOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MenuOrder openPageMenuOrder() {
        driver.get(MENU_ORDER_PAGE);
        return this;
    }

    public boolean isPizzaInBasket(String pizzaName) {
        return labelPizzaMargherita.getText().contains(pizzaName);
    }

    public boolean isDrinkInBasket(String drinkName) {
        return labelDrink.getText().contains(drinkName);
    }

    public String getTitleCheckout() {
        return labelCheckout.getText();
    }
}
