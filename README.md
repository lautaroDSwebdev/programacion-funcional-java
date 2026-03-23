# ⚡ Temas de Programación Funcional

Una guía de referencia rápida sobre los pilares de la programación funcional moderna, centrada en la legibilidad y la eficiencia del código.

---

## 🧩 Conceptos Fundamentales

### 👤 Clases Anónimas
Son clases locales sin nombre que se declaran e instancian al mismo tiempo. Útiles cuando se necesita una implementación única de una interfaz o clase abstracta sin crear un archivo separado.

### 🏹 Expresiones Lambda
La unidad básica de la programación funcional. Permiten tratar la funcionalidad como un argumento de método o el código como datos, reduciendo drásticamente la verbosidad de las clases anónimas.

### 📦 Optionals
Un contenedor para valores que pueden o no estar presentes. Ayudan a evitar el clásico `NullPointerException` y fomentan un estilo de programación más defensivo y claro.

---

## 🛠️ Herramientas de Ejecución

### 🔗 Referencia a Métodos
Una forma aún más compacta de escribir lambdas cuando solo se está llamando a un método existente. Se identifican por el operador de doble dos puntos `::`.

### 🌊 Streams
Una secuencia de elementos que admite diferentes tipos de operaciones para procesar datos de manera declarativa. No modifican la fuente original, sino que crean una vista procesada de los datos.

### 🚀 Parallel Streams
Permiten ejecutar operaciones de Stream de forma paralela aprovechando los múltiples núcleos del procesador. Es ideal para procesar grandes volúmenes de datos donde las tareas son independientes entre sí.

### 📥 Stream Collectors
La fase final de un Stream. Se utilizan para transformar los elementos procesados en una estructura de datos final, como una `List`, `Set` o un valor agregado.

---

## 💡 Notas de Implementación

* **Inmutabilidad:** Siempre busca que las funciones dentro de tus Streams no tengan efectos secundarios.
* **Rendimiento:** Usa `parallelStream()` con precaución; no siempre es más rápido para colecciones pequeñas debido al costo de gestión de hilos.
* **Legibilidad:** Si una cadena de Streams se vuelve demasiado larga, considera refactorizar pasos intermedios en métodos con nombres descriptivos.

---

> "El código esmerado es el que parece que fue escrito por alguien a quien le importa."