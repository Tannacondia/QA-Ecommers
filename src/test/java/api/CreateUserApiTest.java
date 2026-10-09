package api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUserApiTest {

    @Test
    void crearUsuario() {

        String body = """
                {
                    "title": "Prueba QA",
                    "body": "Test de API con REST Assured",
                    "userId": 1
                }
                """;

        given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("Prueba QA"))
                .body("body", equalTo("Test de API con REST Assured"))
                .body("userId", equalTo(1));
    }
}
