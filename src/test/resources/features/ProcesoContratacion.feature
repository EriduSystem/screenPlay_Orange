# author: Santiago Bedoya
# language: es


Característica: Proceso de contratación en "OrangeHRM"

  @ProcesoContratacion
  Escenario: Agregar y verificar que el nuevo candidato quede en el sistema como contratado

    Dado "Santiago" abre el sitio web de prueba
    Cuando inicia sesión y se visualiza la pagina de "Dashboard"
    Y "Santiago" selecciona reclutamiento y hace clic en el botón agregar un candidato
    Y "Santiago" ingresa los datos del candidato con información válida
    # Entonces los datos deberían coincidir con los ingresados y el estado debería ser "Hired"


