package org.example.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.tasks.AddProductsToCart;
import org.example.tasks.CompletePurchase;
import org.example.tasks.Login;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.example.ui.LoginPage;
import org.example.userinterfaces.CartPage;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.screenplay.targets.Target;

public class AutomatizarE2ESteps {

    @Dado("^\"usuario\" va a ingresar al sistema$")
    public void usuarioVaAIngresarAlSistema() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario").wasAbleTo(Login.onDemoblaze());
    }

    @Dado("^que el usuario abre el navegador en la página web$")
    public void usuarioAbreElNavegador() {
        OnStage.theActorCalled("usuario").attemptsTo(
                Open.browserOn().the(LoginPage.class)
        );
    }

    @Cuando("^añade los productos \"([^\"]*)\" y \"([^\"]*)\" al carrito$")
    public void añadeLosProductosAlCarrito(String producto1, String producto2) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsToCart.withProducts(producto1, producto2));
    }

    @Cuando("^compra los productos y finaliza la compra$")
    public void compraLosProductosYFinalizaLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LoginPage.CART_LINK),
                CompletePurchase.now()
        );
    }

    @Entonces("^podrá realizar la compra exitosamente$")
    public void podráRealizarLaCompraExitosamente() {
        OnStage.theActorInTheSpotlight().should();
    }

}
