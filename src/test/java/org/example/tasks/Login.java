package org.example.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private org.example.ui.LoginPage loginPage;

    public static Login onDemoblaze() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(loginPage),
                Click.on(LoginPage.LOGIN_LINK),
                Enter.theValue("username").into(LoginPage.USERNAME_FIELD),
                Enter.theValue("password").into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}