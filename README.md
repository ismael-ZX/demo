# 🚀 API REST - Gestión de Solicitudes (Examen Parcial)

API REST desarrollada con **Java 21** y **Spring Boot 3.x** para la gestión y seguimiento de solicitudes de soporte técnico.

## 🛠️ Tecnologías y Stack
* **Lenguaje:** Java 21
* **Framework:** Spring Boot 3.x
* **Gestor de dependencias:** Maven
* **Herramientas de prueba:** Postman
* **Arquitectura:** Patrón en capas (Model, Service, Controller, Exception Handling)

---

## 📋 Endpoints de la API

| Método HTTP | Endpoint | Descripción | Código de Respuesta |
| :--- | :--- | :--- | :--- |
| **POST** | `/api/solicitudes` | Registra una nueva solicitud con cliente y técnico. | `201 Created` |
| **GET** | `/api/solicitudes` | Lista todas las solicitudes almacenadas en memoria. | `200 OK` |
| **GET** | `/api/solicitudes/{id}` | Consulta una solicitud específica por su ID. | `200 OK` / `404 Not Found` |
| **PUT** | `/api/solicitudes/{id}` | Actualiza los datos de una solicitud existente. | `200 OK` / `404 Not Found` |
| **DELETE** | `/api/solicitudes/{id}` | Elimina una solicitud del registro en memoria. | `204 No Content` / `404 Not Found` |

---

## ⚙️ Cómo ejecutar el proyecto
1. Clona el repositorio o descarga el código fuente.
2. Abre el proyecto en **IntelliJ IDEA** como un proyecto Maven.
3. Ejecuta la clase principal de la aplicación Spring Boot (`DemoApplication.java`).
4. La API estará corriendo localmente en: `http://localhost:8080`
