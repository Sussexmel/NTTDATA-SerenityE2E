package org.example.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.example.userinterfaces.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductsToCart implements Task {

    private final int quantity;

    public AddProductsToCart(int quantity) {
        this.quantity = quantity;
    }

    public static AddProductsToCart withQuantity(int quantity) {
        return instrumented(AddProductsToCart.class, quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(org.example.ui.LoginPage.SAMSUNG_GALAXY_S6),
                Click.on(ProductPage.ADD_TO_CART_BUTTON),
                Switch.toAlert().andAccept(),
                Click.on(org.example.ui.LoginPage.HOME_LINK),
                Click.on(org.example.ui.LoginPage.NEXUS_6),
                Click.on(ProductPage.ADD_TO_CART_BUTTON),
                Switch.toAlert().andAccept(),
                Click.on(org.example.ui.LoginPage.CART_LINK)

        );
    }
}
