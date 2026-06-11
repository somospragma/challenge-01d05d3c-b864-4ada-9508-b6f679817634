# Desarrollo de una API REST para gestión de productos

En el contexto de una tienda en línea, necesitas desarrollar una API REST que permita la gestión de productos. Los productos tienen atributos como nombre, precio, stock y categoría. La API debe registrar productos, validar que no haya nombres duplicados y que los precios no sean negativos. Además, debe manejar correctamente los errores de validación y garantizar la idempotencia en las solicitudes.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot REST API |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de productos

**Objetivo:** Implementar la funcionalidad básica para registrar productos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Crear un endpoint POST para registrar productos.
- Validar que el nombre del producto no esté duplicado y que el precio sea positivo.
- Garantizar la idempotencia en las solicitudes de registro.

**Entregable:** Endpoint POST funcional para registrar productos con validaciones básicas y garantía de idempotencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo almacenar y comparar los nombres de los productos para evitar duplicados.
- Piensa en cómo manejar los errores de validación de manera consistente.

</details>

### Fase 2: Manejo de errores y validaciones

**Objetivo:** Mejorar la API para manejar correctamente los errores y validaciones.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar respuestas HTTP adecuadas para diferentes tipos de errores (por ejemplo, 400 para errores de validación).
- Documentar los errores utilizando Swagger.

**Entregable:** API con manejo mejorado de errores y validaciones, documentada con Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga los códigos de estado HTTP adecuados para diferentes tipos de errores.
- Reflexiona sobre cómo documentar los errores de manera clara y útil para los consumidores de la API.

</details>

### Fase 3: Optimización y refactorización

**Objetivo:** Optimizar y refactorizar la API para mejorar su rendimiento y mantenibilidad.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y eliminar duplicaciones de código.
- Optimizar las consultas a la base de datos.
- Refactorizar el código para mejorar su legibilidad y mantenibilidad.

**Entregable:** API refactorizada y optimizada con mejoras en rendimiento y mantenibilidad.

<details>
<summary>Pistas de conocimiento</summary>

- Busca patrones de diseño que puedan ayudarte a eliminar duplicaciones de código.
- Investiga técnicas para optimizar las consultas a la base de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un endpoint REST y cuál es su propósito en una API?
- **paraQueSirve**: ¿Para qué sirve la validación de datos en una API REST?
- **comoSeUsa**: ¿Cómo se usa Swagger para documentar una API REST?
- **erroresComunes**: ¿Cuáles son los errores comunes al desarrollar una API REST y cómo se pueden evitar?

## Criterios de Evaluacion

- Implementar un endpoint POST para registrar productos con validaciones básicas y garantía de idempotencia.
- Manejar correctamente los errores y validaciones en la API.
- Optimizar y refactorizar la API para mejorar su rendimiento y mantenibilidad.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
