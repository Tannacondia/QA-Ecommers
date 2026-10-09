package runners;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite //le indica a JUnit que esta clase esta en suite pruebas
@IncludeEngines("cucumber") //le dice a JUnit para esta prueba se utiliza Cucumber
@SelectPackages("features")//busca en los archivos de .features
@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "steps"
)// le dice a Cucumber que los metodos given, when, then estan en la carpeta steps
public class TestRunner {
}
