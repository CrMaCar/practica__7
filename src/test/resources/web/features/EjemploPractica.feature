Feature: Como usuario, quiero navegar al sign in de la web Automation practice

  @Smoke @CmC
  Scenario: El usuario navega a "Sign in"
    Given el usuario navega a la web de Automation Practice
    When el usuario pulsa el botón "Sign in"
    Then el usuario verifica que se enseña la pagina de Sign in


