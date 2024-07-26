package org.example.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregar_productos_carrito.feature",
        glue = "org/example",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@successful")

public class RunnerE2E {

}
