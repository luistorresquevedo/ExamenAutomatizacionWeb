Feature: Product - Store

  Scenario Outline: Realizar el login - Store

  Given estoy en la página de la tienda "https://qalab.bensg.com/store"
  When doy click en la opción iniciar sesión
  And doy click en el link text cree una cuenta aquí
  And lleno los campos del formulario para el registro Tratamiento "<nombre>", "<apellidos>", "<email>", "<contraseña>", "<fechaNacimiento>"
  And doy click en el botón guardar
  Then debería visualizar mi usuario logeado en la pantalla
  Examples:
    |nombre|apellidos|email|contraseña|fechaNacimiento|
    | Luis | Torres  |luistorresquevedo@gmail.com|Luis_Torres7|07/03/1998|