Feature: Yo como usuario deseo eliminar el nuevo user registrado
  @Stories4 @Scenario4
  Scenario Outline: Loggin con nuevo usuario
    Given ingreso al home de la pagina HRM con <usuario> y <contraseña>
    Given ingreso al home de la pagina HRM con
    And me loggue con la cuenta de Admin que carga en el home de Orange
    And procedo a buscar cualquier usuario <empleado> en la lista
    When marco el checkbox y procedo a eliminar el usuario
    Then valido que al buscar el <admin>, no cargue nada.

Examples:
    |usuario|contraseña|
    |javierplata115|Javier123456.|
