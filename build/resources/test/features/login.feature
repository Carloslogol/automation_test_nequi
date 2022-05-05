# language: es
  @login_application
  Característica: Logueo de usuario en nequi

    Como un usuario de nequi
    Yo quiero loguearme en el aplicativo
    Para usar sus servicios

  @inicio_sesion_correcto
  Esquema del escenario: : Inicio de sesión con validacion correcta
    Dado que el usuario este dentro de la aplicacion
    Cuando el usuario ingrese <numero>, <contrasena> y presione el boton continuar
    Entonces saldra un mensaje de inicio correcto
    Ejemplos:
      | numero     | contrasena |
      | 67083881 | 1234       |