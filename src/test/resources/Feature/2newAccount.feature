Feature: Yo como usuario deseo registrar una nueva cuenta en Orange HRM
  @Stories2 @Scenario2
  Scenario Outline: Creacion exitosa de un nuevo usuario
    Given ingreso al home de la pagina HRM con usuario y contraseña
    Given en el home de la pagina de Orange HRM y me dirijo a admin
    And en el botón agregar una nueva cuenta doy clic
    And ingreso el role <data>
    And registro el <Status>
    And busco el nombre de un <empleado> aleatorio
    And valido mi <usuario>, <contrasena> y <confirmacion>
    When haya registrados mis datos, procedo a darle clic a salvar cambios
    Then realizo la busqueda del nuevo usuario <registrado>

Examples:
    |data|
    |1   |
    |2   |


