Feature: Como usuario, quiero ingresar mis credenciales para entrar a mi cuenta

  @Smoke @CmC @PruebaLogin
  Scenario Outline: El usuario ingresa a la cuenta con credenciales validas
    Given el usuario navega a la pagina de login
    When el usuario ingresa sus credenciales <usuario> y <password>
    Then el usuario es redireccionado a my account
    Examples:
      |usuario  | password  |
      |prueba@prueba2021.com  | 123456  |


