Feature: Yo como usuario deseo agrgear un Qualification
  @Stories7 @Scenario7
  Scenario Outline: Agregar un nuevo skill en Qualification
    Given me dirija a qualification y filtre por <skills>
    And doy clic en agregar nuevo skill
    And agrego el <nombre> y <descripcion>
    When doy clic en salvar datos
    Then valido que al cargar la lista, este en la lista
    Examples:
      |skills|