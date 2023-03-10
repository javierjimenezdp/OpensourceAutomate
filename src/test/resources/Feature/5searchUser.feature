Feature: Yo como usuario deseo buscar un usuario aleatorio
  @Stories5 @Scenario5
  Scenario Outline:De la lista de usuarios seleccione uno aleatoriamente y verifique en el buscador
    Given ingreso al home de la pagina HRM con usuario y contraseña
    Given busco un usuario de la lista
    And extraigo el username, user_role, employee_name y el status
    And cargue los datos del usuario en el buscador
    And pueda observar los datos del usuario procedo a cambiar su <status> y guardar cambios
    When vuelva a realizar la busqueda del mismo usuario
    Then debera cargar la info actualizada

    Examples:
    |status|
    |Disabled|

