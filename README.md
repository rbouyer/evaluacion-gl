Readme Ejercicio Evaluación GlobalLogic

	A continuación se detallan los procedimientos para ejecución y aspectos de implementación


Bibliotecas, frameworks y herramientas utilizados
	1. Spring Boot 2.5.14
	2. Gradle 7.3.3
	3. Java 8
	4. JUnit 4.12
	5. Hibernate 5.4.2
	6. Eclipse 2020-06 (4.16.0)

Ejecución
	Tanto la ejecución del servicio, como de los tests se puede realizar desde línea de comandos
	1. Para contruir: gradlew build
	2. Para ejecutar servicio: gradlew bootRun
	3. Para ejecutar las pruebas unitarias: gradle test --tests IntegrationTest

Endpoints
	1. El endpoint /signup debe ser un POST a url http://localhost:8082/sign-up, incluyendo en el cuerpo del request el JSON correspondiente a los datos del usuario a registar
	2. El endpoint /login debe ser un GET a url http://localhost:8082/login?token=<token>, donde en el query parameter token se debe asociar el token obtenido en response de paso anterior (signup)

Consideraciones Generales
	1. La carpeta "diagrams" contiene la documentación requerida para el proyecto
	2. Se utiliza tipo de datos UUID para asignar el id del usuario
	3. La password se encripta y guarda encriptada en base de datos, en login se desencripta para desplegar contenido original
	4. En cada llamada al endpoint /login el token se renueva incluyendo este en el response correspondiente
	5. Por defecto se activa el usuario al crearlo (isActive)
	6. Las pruebas unitarias ejecutadas en Eclipse dan sobre un 90% de code coverage