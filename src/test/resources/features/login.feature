Feature: Inicio de sesión

  Scenario: Login exitoso

    Given el usuario se encuentra en la página de login
    When ingresa el usuario "tomsmith"
    And ingresa la contraseña "SuperSecretPassword!"
    And presiona el botón "Iniciar sesión"
    Then debería acceder a su cuenta


  Scenario Outline: Login con credenciales inválidas

    Given el usuario se encuentra en la página de login
    When ingresa el usuario "<usuario>"
    And ingresa la contraseña "<password>"
    And presiona el botón "Iniciar sesión"
    Then debería mostrar un mensaje de error

    Examples:
      | usuario           | password                |
      | tomsmith          | contraseñaIncorrecta    |
      | usuarioIncorrecto | SuperSecretPassword!    |