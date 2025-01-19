# LiterAlura
Challenge desarrollado en el marco de la cursada del programa ONE (Oracle Next Education), Alura Latam.

## Literalura Challenge

Literalura es una aplicación de backend desarrollada con Java y Spring Boot utilizando una base de dato de PostgreSQL para buscar y registrar información de libros de la API Gutendex.com. Su propósito es proporcionar una interfaz para gestionar la base de datos, realizar operaciones CRUD y facilitar el desarrollo de soluciones relacionadas con la gestión de datos literarios. Este proyecto tiene como objetivo servir como base para una aplicación más compleja que se desarrollará con el tiempo.

## Características
* Gestión de conexiones a una base de datos PostgreSQL.
* Configuración de la base de datos y parámetros de conexión a través de variables de entorno.
* Utilización de Spring Data JPA para interactuar con la base de datos de forma eficiente.
* Seguridad básica para la gestión de datos sensibles (como contraseñas) a través de la configuración externa.
  
## Tecnologías utilizadas
* Java 17 o superior
* Spring Boot (2.x)
* Spring Data JPA
* PostgreSQL
* Maven como herramienta de gestión de dependencias

## API Gutendex
https://gutendex.com/

## Requisitos previos
Antes de ejecutar la aplicación, asegúrate de tener configurado lo siguiente:
Java 17 o superior instalado.
PostgreSQL instalado y configurado. Deberás tener una base de datos PostgreSQL configurada y disponible para conectar con la aplicación.
Maven instalado.

## Instalación
Sigue los siguientes pasos para configurar y ejecutar la aplicación en tu máquina local.

* Clonar el repositorio:
Primero, clona el repositorio de Literalura desde GitHub:
git clone https://github.com/LuissinaMD/literAlura.git

* Configurar las variables de entorno:
En el archivo application.properties, puedes establecer las credenciales de la base de datos. Sin embargo, se recomienda definir estas variables como variables de entorno para mantener la seguridad de la aplicación como ejemplo:
spring.datasource.url=jdbc:postgresql://localhost:5432/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Estructura del Proyecto
El proyecto tiene la siguiente estructura de paquetes/directorios:

challenge_literalura/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── literalura/
│   │   │           ├── dto/
│   │   │           ├── model/
                    ├── principal/
│   │   │           ├── repository/
                    └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
├── target/
│   └── (Archivos generados por Maven)
├── .gitignore
├── pom.xml
└── README.md

* dto/: Contiene la información sobre los datos de libros y autores.
* model/: Contiene las entidades JPA que representan las tablas de la base de datos.
* principal/: Contiene el menú que se muestra en consola.
* repository/: Contiene los repositorios que gestionan las interacciones con la base de datos.
* service/: Contiene la lógica de consumo de la API.

## Contribución
Si deseas contribuir al proyecto, siéntete libre de abrir un pull request. Asegúrate de seguir las siguientes pautas:

* Asegúrate de que tu código pase las pruebas.
* Escribe documentación si es necesario.
* Asegúrate de que tu código esté limpio y siga las convenciones de Java.

## Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
