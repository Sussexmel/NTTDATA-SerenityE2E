package org.example.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.utils.Constans.WEB_URL;

public class AutoE2E implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String  pathwebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathwebUrl));

    }
    public static Performable browserURL(){
        return instrumented(AutoE2E.class);
    }
}
