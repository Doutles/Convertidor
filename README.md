Este es un proyecto de conversor de monedas desarrollado en Java. El programa interactúa con la API de ExchangeRate-API para obtener los tipos de cambio y realizar conversiones entre distintas divisas. El programa presenta una interfaz textual a través de la consola, permitiendo al usuario seleccionar opciones para convertir monedas en un menú repetitivo.

## Características

- Conversión entre diferentes monedas utilizando tasas de cambio actualizadas.
- Menú interactivo con opciones para realizar conversiones o salir del programa.
- Manejo de excepciones cuando no se encuentran las monedas especificadas.
  
## Requisitos

Para ejecutar este proyecto, necesitarás lo siguiente:

- **Java 11** o superior
- Acceso a Internet para realizar solicitudes a la API de tasas de cambio.

## Instalación

1. **Clonar el repositorio**:

   git clone https://github.com/tu-usuario/currency-converter.git
   cd currency-converter
Configurar el API Key de ExchangeRate-API: Regístrate en ExchangeRate-API y obtén una API Key. Luego, actualiza la URL en la clase ExchangeRateService.java con tu clave:

java
Copiar código
String url = "https://v6.exchangerate-api.com/v6/TU_API_KEY/latest/" + baseCurrency;
Compilar y ejecutar: Si estás utilizando Maven, puedes compilar y ejecutar con los siguientes comandos:


Uso
Al ejecutar el programa, verás el siguiente menú:

markdown
Copiar código
==== Conversor de Monedas ====
1. Convertir moneda
2. Salir
Si eliges la opción "1", el programa solicitará:

La moneda base (ejemplo: USD).
La moneda objetivo (ejemplo: EUR).
La cantidad a convertir.
El programa mostrará el monto convertido basado en la tasa de cambio actual proporcionada por la API.

Puedes seguir realizando conversiones o elegir "2" para salir.

Estructura del Proyecto
Main.java: Clase principal que inicia la aplicación.
CurrencyConverter.java: Clase que gestiona la interfaz de usuario y el flujo del programa.
ExchangeRateService.java: Clase responsable de interactuar con la API de ExchangeRate-API.
HttpClientService.java: Clase que realiza las solicitudes HTTP.
ExchangeRateResponse.java: Clase modelo que almacena la respuesta de la API.
JsonParser.java: Clase que procesa las respuestas JSON.

Ejemplo de Ejecución

Copiar código
==== Conversor de Monedas ====
1. Convertir moneda
2. Salir
Elige una opción: 1
Introduce la moneda base (ej: USD): USD
Introduce la moneda a convertir (ej: EUR): EUR
Introduce la cantidad a convertir: 100
El monto convertido es: 92.50 EUR
Consideraciones
Asegúrate de manejar adecuadamente tu clave de la API para evitar que sea expuesta.
Verifica que tienes acceso a Internet al momento de ejecutar el programa, ya que depende de una API externa.
Contribución
Si deseas contribuir a este proyecto:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza los cambios y commitea (git commit -m "Añadir nueva funcionalidad").
Sube tus cambios a GitHub (git push origin feature/nueva-funcionalidad).
Crea un Pull Request.
