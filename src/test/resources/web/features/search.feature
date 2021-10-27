Feature: Como usuario, quiero ingresar mis credenciales para entrar a mi cuenta

  @Smoke @CmC @PruebaSearch
  Scenario Outline: El usuario realiza una busqueda de indumentaria
    Given el usuario navega a la pagina principal
    When  el usuario realiza una busqueda de <articulo>
    Then  el usuario verifica que se realizo la busqueda del articulo <articulo>
    Examples:
    |articulo|
    |HAT|
    |DRESS|
    |T-SHORT|