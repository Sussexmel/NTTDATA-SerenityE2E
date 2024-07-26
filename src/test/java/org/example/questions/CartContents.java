package org.example.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartContents implements Question<Boolean> {

    private static final Target CART_CONTENTS = Target.the("cart contents")
            .located(By.id("totalp"));

    public static Question<Boolean> areVisible() {
        return new CartContents();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CART_CONTENTS.resolveFor(actor).isVisible();
    }
}
