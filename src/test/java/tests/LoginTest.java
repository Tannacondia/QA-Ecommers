package tests;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoginTest {
    @Test
    void loginTest() {

        String usuario = "admin";

        assertEquals("admin", usuario);
    }
}
