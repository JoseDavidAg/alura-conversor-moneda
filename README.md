### Conversor de Moneda
##Descripción del Proyecto
Este proyecto es un conversor de moneda simple desarrollado en Java. Permite a los usuarios realizar conversiones entre diferentes divisas utilizando tasas de cambio obtenidas de una API externa. El objetivo principal es proporcionar una herramienta fácil de usar para calcular equivalencias monetarias rápidamente.

## Funcionalidades
Conversión de Moneda: El programa permite convertir valores entre las siguientes parejas de monedas:

Dólar estadounidense (USD) a Peso Argentino (ARS)

Peso Argentino (ARS) a Dólar estadounidense (USD)

Dólar estadounidense (USD) a Real Brasileño (BRL)

Real Brasileño (BRL) a Dólar estadounidense (USD)

Dólar estadounidense (USD) a Peso Colombiano (COP)

Peso Colombiano (COP) a Dólar estadounidense (USD)

Interfaz de Consola: Interacción mediante un menú numérico en la consola para seleccionar el tipo de conversión.

Consumo de API Externa: Utiliza una API de tasas de cambio (ExchangeRate-API) para obtener los valores de conversión en tiempo real.

Cálculo y Visualización: Calcula el valor convertido y lo muestra al usuario con formato de dos decimales.

## Cómo Pueden Usarlo los Usuarios
Para usar este conversor de moneda, sigue estos pasos:

Compilar y Ejecutar:

Asegúrate de tener un entorno de desarrollo Java (JDK) instalado.

Compila los archivos .java (ConversionDto.java, Conversion.java, Convertir.java, ConversorMoneda.java).

Ejecuta la clase principal ConversorMoneda.

Iniciar el Programa:

Al ejecutar, verás un mensaje de bienvenida y un menú de opciones en la consola.

Seleccionar Opción de Conversión:

Ingresa el número correspondiente a la conversión que deseas realizar (por ejemplo, 1 para Dólar a Peso Argentino).

Ingresar Valor a Convertir:

El programa te pedirá que ingreses el valor numérico que deseas convertir. Ingresa la cantidad y presiona Enter.

Ver Resultado:

El programa mostrará el resultado de la conversión, indicando el valor original, las monedas involucradas y el valor final convertido.

Continuar o Salir:

Después de cada conversión, el menú se mostrará nuevamente para que puedas realizar más conversiones o seleccionar la opción 7 para salir del programa.

## Requisitos Adicionales:

Se requiere conexión a internet para que el programa pueda acceder a la API de tasas de cambio.

La librería com.google.gson es necesaria para el procesamiento de las respuestas JSON de la API.

Dónde los Usuarios Pueden Encontrar Ayuda sobre Su Proyecto
Revisar el Código Fuente: El código fuente es la principal fuente de información. Puedes examinar las clases ConversorMoneda.java (para la lógica principal y el menú), Convertir.java (para la lógica de la API), Conversion.java y ConversionDto.java (para la estructura de datos).

## Reportar Problemas/Issues: En la sección Issues puede reportar errores o solicitar nuevas funcionalidades.

#Autores del Proyecto
@DavidAG
