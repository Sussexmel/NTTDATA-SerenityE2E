package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class LoginPage extends PageObject {
    public static final Target LOGIN_LINK = Target.the("login link")
            .located(By.id("login2"));
    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.id("loginusername"));
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.id("loginpassword"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//button[contains(text(),'Log in')]"));
    public static final Target SAMSUNG_GALAXY_S6 = Target.the("Samsung galaxy s6 link")
            .located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
    public static final Target HOME_LINK = Target.the("Home link")
            .located(By.cssSelector(".active > .nav-link"));
    public static final Target NEXUS_6 = Target.the("Nexus 6 link")
            .located(By.xpath("//a[contains(text(),'Nexus 6')]"));
    public static final Target CART_LINK = Target.the("Cart link")
            .located(By.id("cartur"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.cssSelector(".col-sm-12 > .btn"));
}


