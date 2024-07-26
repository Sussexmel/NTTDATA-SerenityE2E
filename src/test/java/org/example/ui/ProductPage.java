package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));
}
