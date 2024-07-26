package org.example.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userinterfaces.CartPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletePurchase implements Task {

    public static CompletePurchase now() {
        return instrumented(CompletePurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.PLACE_ORDER_BUTTON),
                Enter.theValue("QA").into(CartPage.NAME_FIELD),
                Enter.theValue("Ecuador").into(CartPage.COUNTRY_FIELD),
                Enter.theValue("Quito").into(CartPage.CITY_FIELD),
                Enter.theValue("95012700118").into(CartPage.CREDIT_CARD_FIELD),
                Enter.theValue("Julio").into(CartPage.MONTH_FIELD),
                Enter.theValue("2024").into(CartPage.YEAR_FIELD),
                Click.on(CartPage.PURCHASE_BUTTON)
        );
    }
}