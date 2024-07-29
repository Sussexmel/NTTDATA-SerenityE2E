package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.cssSelector(".col-sm-12 > .btn"));

    public static final Target HOME_LINK = Target.the("Home link")
            .located(By.cssSelector(".active > .nav-link"));

    public static Target productLink(String productName) {
        return Target.the(productName + " link")
                .located(By.xpath("//a[contains(text(),'" + productName + "')]"));
    }
}
