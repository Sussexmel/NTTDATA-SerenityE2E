package org.example.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.tasks.Login;
import org.example.tasks.AddProductsToCart;
import org.example.tasks.CompletePurchase;
import org.example.questions.CartContents;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutomatizarE2ESteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} va a ingresar al sistema")
    public void vaAIngresarAlSistema(String actorName) {
        OnStage.theActorCalled(actorName).attemptsTo(
                Login.onDemoblaze()
        );
    }

    @When("deseo añadir dos productos al carrito")
    public void deseoAñadirDosProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductsToCart.withQuantity(2)
        );
    }

    @When("comprar los productos y finalizar la compra")
    public void comprarLosProductosYFinalizarLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompletePurchase.now()
        );
    }

    @Then("podrá realizar la compra exitosamente")
    public void podráRealizarLaCompraExitosamente() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Los productos en el carrito", CartContents.areVisible())
        );
    }
}

