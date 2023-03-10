Feature: Deseo inicar sesion con valores por defecto
  @Stories1 @Scenario1
  Scenario: Inicio sesion con los dato del usuario en pantalla
    Given extraiga los valores de la pagina
    When me loguee con usuario y contraseña
    Then valido el home del usuario nuevo
    