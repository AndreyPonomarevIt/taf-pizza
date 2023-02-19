import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TerraPizzaTest {
   WebDriver driver;
    @Before
    public void initObject() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get(TerraPizza.URL_TERRA_PIZZA);
    }
    @Test
    public void testTerraPizza() {
        WebElement btnMenu=driver.findElement(By.xpath(TerraPizza.BTN_MENU));
        Unit.waitTimeFor(1);
        btnMenu.click();
        WebElement btnPizza=driver.findElement(By.xpath(TerraPizza.BTN_PIZZA));
        Unit.waitTimeFor(1);
        btnPizza.click();
        WebElement labelPizzaMargarita=driver.findElement(By.xpath(TerraPizza.LABEL_PIZZA_MARGARITA));
        Unit.waitTimeFor(1);
        labelPizzaMargarita.click();
        WebElement btnAddBasket=driver.findElement(By.xpath(TerraPizza.BTN_ADD_BASKET_PIZZA_MARGARITA));
        Unit.waitTimeFor(1);
        btnAddBasket.click();
        WebElement btnExit=driver.findElement(By.xpath(TerraPizza.BTN_EXIT));
        Unit.waitTimeFor(1);
        btnExit.click();
        WebElement clickLabelBasket=driver.findElement(By.xpath(TerraPizza.CLICK_LABEL_BASKET));
        Unit.waitTimeFor(1);
        clickLabelBasket.click();
        Unit.waitTimeFor(5);
        WebElement checkLogoMargarita=driver.findElement(By.xpath(TerraPizza.CHECK_LABEL_MARGARITA));
        checkLogoMargarita.getText();
        Unit.waitTimeFor(2);
        Assert.assertEquals("Пицца Маргарита Классическая 32 см",checkLogoMargarita.getText());
    }
    @Test
    public void testTerraPizzaAndDrink() {
        WebElement btnMenu=driver.findElement(By.xpath(TerraPizza.BTN_MENU));
        Unit.waitTimeFor(1);
        btnMenu.click();
        WebElement btnPizza=driver.findElement(By.xpath(TerraPizza.BTN_PIZZA));
        Unit.waitTimeFor(1);
        btnPizza.click();
        WebElement labelPizzaMargarita=driver.findElement(By.xpath(TerraPizza.LABEL_PIZZA_MARGARITA));
        Unit.waitTimeFor(1);
        labelPizzaMargarita.click();
        WebElement btnAddBasket=driver.findElement(By.xpath(TerraPizza.BTN_ADD_BASKET_PIZZA_MARGARITA));
        Unit.waitTimeFor(1);
        btnAddBasket.click();
        WebElement btnExit=driver.findElement(By.xpath(TerraPizza.BTN_EXIT));
        Unit.waitTimeFor(1);
        btnExit.click();
        WebElement clickBtnBar=driver.findElement(By.xpath(TerraPizza.CLICK_BTN_BAR));
        Unit.waitTimeFor(3);
        clickBtnBar.click();
        WebElement clickLabelBorjomi=driver.findElement(By.xpath(TerraPizza.CLICK_LABEL_BORJOMI));
        Unit.waitTimeFor(5);
        clickLabelBorjomi.click();
        WebElement clickBtnBasketBorjomi=driver.findElement(By.xpath(TerraPizza.CLICK_BTN_BASKET_BORJOMI));
        Unit.waitTimeFor(3);
        clickBtnBasketBorjomi.click();
        WebElement clickCrossPageBorjomi=driver.findElement(By.xpath(TerraPizza.CLICK_CROSS_PAGE_BORJOMI));
        Unit.waitTimeFor(1);
        clickCrossPageBorjomi.click();
        Unit.waitTimeFor(5);
        WebElement clickLabelBasket=driver.findElement(By.xpath(TerraPizza.CLICK_LABEL_BASKET));
        Unit.waitTimeFor(1);
        clickLabelBasket.click();
        WebElement checkLogoMargarita=driver.findElement(By.xpath(TerraPizza.CHECK_LABEL_MARGARITA));
        checkLogoMargarita.getText();
        Unit.waitTimeFor(2);
        WebElement checkLabelBorjomi=driver.findElement(By.xpath(TerraPizza.CHECK_LABEL_BORJOMI));
        checkLabelBorjomi.getText();
        Unit.waitTimeFor(2);
        Assert.assertEquals("Пицца Маргарита Классическая 32 см",checkLogoMargarita.getText());
        Assert.assertEquals("Вода минеральная \"Боржоми\" (Грузия)",checkLabelBorjomi.getText());
    }

   @After
    public void endTest() {
        driver.quit();
    }
}
