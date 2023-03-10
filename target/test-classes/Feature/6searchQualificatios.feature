Feature: Yo como usuario deseo buscar y eliminar un record de Qualification
  @Stories6 @Scenario6
  Scenario Outline: Busquedad y eliminacion de 1 qualification
    Given ingreso al home de la pagina HRM con usuario y contraseña
    Given me dirija a qualification y filtre por <qualifications>
    And cargue la lista de todos los skills
    And desee eliminar el 4to de la lista
    When agrego un nuevo skill <nombre>, <descripcion> y guardo
    Then valido los primeros 3 skills

    Examples:
    |qualifications|nombre|descripcion|
    |Skills|seleniumWebDriver|Javier_qa_automated|


