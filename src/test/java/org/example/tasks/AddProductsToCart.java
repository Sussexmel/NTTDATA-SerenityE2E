package org.example.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.example.ui.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductsToCart implements Task {
    private final String product1;
    private final String product2;

    public AddProductsToCart(String product1, String product2) {
        this.product1 = product1;
        this.product2 = product2;
    }

    public static AddProductsToCart withProducts(String product1, String product2) {
        return instrumented(AddProductsToCart.class, product1, product2);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductPage.productLink(product1)),
                Click.on(ProductPage.ADD_TO_CART_BUTTON),
                // Agregar espera o confirmación si es necesario
                Click.on(ProductPage.HOME_LINK),
                Click.on(ProductPage.productLink(product2)),
                Click.on(ProductPage.ADD_TO_CART_BUTTON)
        );
    }
}
