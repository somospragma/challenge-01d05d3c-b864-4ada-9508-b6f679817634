# Desarrollo de una API REST en un dominio de banca

Se requiere desarrollar una API REST para gestionar operaciones bancarias. La API debe permitir la creación, lectura, actualización y eliminación de cuentas bancarias. El sistema debe validar que los números de cuenta sean únicos y que los saldos no sean negativos. Además, se debe asegurar que la API sea idempotente para las operaciones de creación y actualización de cuentas. El dominio incluye actores como 'cliente', 'gestor de cuentas' y'sistema de auditoría'. Las operaciones deben ser consistentes y tolerantes a fallos temporales del sistema de auditoría.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot REST API |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y modelado de datos

**Objetivo:** Definir el dominio y modelar las entidades necesarias para la API.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los actores y sus interacciones en el dominio de la banca.
- Modelar las entidades 'cuenta bancaria' y 'cliente' con sus atributos y relaciones.
- Establecer las reglas de validación para los números de cuenta y los saldos.

**Entregable:** Diagrama de entidades y reglas de validación documentadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las relaciones entre las entidades y cómo se validarán los datos.
- Piensa en cómo garantizar la unicidad de los números de cuenta.

</details>

### Fase 2: Implementación de las operaciones CRUD

**Objetivo:** Implementar las operaciones de creación, lectura, actualización y eliminación de cuentas bancarias.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Desarrollar los endpoints REST para las operaciones CRUD de cuentas bancarias.
- Asegurar que las operaciones de creación y actualización sean idempotentes.
- Implementar la validación de los números de cuenta y los saldos.

**Entregable:** Endpoints REST funcionales para las operaciones CRUD de cuentas bancarias.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las operaciones de creación y actualización deben ser idempotentes.
- Considera cómo manejar los errores de validación y los fallos temporales del sistema de auditoría.

</details>

### Fase 3: Integración con el sistema de auditoría

**Objetivo:** Integrar la API con el sistema de auditoría para registrar las operaciones realizadas.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar la integración con el sistema de auditoría para registrar las operaciones de creación, lectura, actualización y eliminación de cuentas bancarias.
- Asegurar que la API continúe funcionando correctamente ante fallos temporales del sistema de auditoría.

**Entregable:** API REST integrada con el sistema de auditoría, capaz de registrar las operaciones realizadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar los fallos temporales del sistema de auditoría para asegurar la consistencia de las operaciones.
- Piensa en cómo garantizar que la API continúe funcionando correctamente ante estos fallos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cuáles son sus componentes principales?
- **paraQueSirve**: ¿Para qué sirve una API REST en el contexto de una aplicación bancaria?
- **comoSeUsa**: ¿Cómo se usan los endpoints REST para realizar operaciones CRUD en una API?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API REST y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración de una API REST con un sistema de auditoría?

## Criterios de Evaluacion

- Definición clara del dominio y modelado de entidades.
- Implementación correcta de los endpoints REST para las operaciones CRUD.
- Garantía de idempotencia en las operaciones de creación y actualización.
- Validación correcta de los números de cuenta y los saldos.
- Integración exitosa con el sistema de auditoría y manejo de fallos temporales.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
