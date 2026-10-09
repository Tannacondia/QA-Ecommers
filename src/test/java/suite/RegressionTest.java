package suite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import runners.TestRunner;

@Suite//Le dice a JUnit: esta clase no es un test individual. Es una suite: utilizala para agrupar y ejecutar otros tests.
@SelectPackages({
        "api",
        "tests"
})
@SelectClasses({
        TestRunner.class
})
public class RegressionTest {
}
