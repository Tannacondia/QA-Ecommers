package api;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class DeleteUserApiTest {

    @Test
    void eliminarUsuario() {

        given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200);
    }
}