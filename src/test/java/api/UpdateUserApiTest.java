package api;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UpdateUserApiTest {

    @Test
    void actualizarPost() {

        String body = """
                {
                    "id": 1,
                    "title": "Usuario actualizado",
                    "body": "Datos modificados con REST Assured",
                    "userId": 1
                }
                """;

        given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Usuario actualizado"))
                .body("body", equalTo("Datos modificados con REST Assured"))
                .body("userId", equalTo(1));
    }
}
