package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResaPage {

String Title =
    By MeillVentBy = By.cssSelector("a.nav-a");

    By HigtecBy = By.cssSelector("");

    By ThirdProdBy = By.cssSelector("");






//Open Meilleures Ventes//

    public void


    public String getProductTitle(int index) {
        WebElement cartItem = driver.findElements(cartItemBy).get(index);
        return cartItem.findElement(productTitleBy).getText();


    }


      Assert.assertEquals(driver.findElement(textSelector).getText(), expectedText, "The text is not similar");

}