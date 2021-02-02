# HCL America Inc.
**Simpli-Learn 🤪 Capstone Project**
**By Phil Fernandez**
## Concepts Covered
**Backend**
 - Java 8
 - Spring Boot/MVC
 - Spring Data JPA
 - Spring Session
 - Spring Security
 - MySQL

 **Frontend**
 - JSP
 - JSTL
 - Bootstrap
 - CSS
 - HTML
 - JavaScript


----------


All business logic is implemented on the backend with the
help of Java 8 and Spring Boot.

All frontend work is done using Java Server Pages, along with Java Standard Tag Library, and the Bootstrap CSS and JS libraries.
The frontend is completely processed server side, and delivered to the client web
browser's DOM.

## Test User and Password
### Username `phil`
### Password `phil`

## To Build/Run

- `git clone https://github.com/philFernandez/Capstone_HCL.git`
- `cd Capstone_HCL`
- On Mac or Linux
	-  `./mvnw spring-boot:run`
- On Windows
	- `.\mvnw.cmd spring-boot:run`
- 🤓

## Some Notes on Testing and Running

You will need to go into `application.properties` and change the setting
pertaining to JDBC and database to match those of your system. Currently
This project is setup to use MySql 8, with a database called `Simpli`. 
MySql is required because of the dependencies laid out in the `pom.xml`
but the database name, username, and password can be changed to meet 
the needs of the person testing. All database setup beyond this is
done automatically by the backend. Website user is added, products
are added, etc. See [above](#Test-User-and-Password) for default website username and password.



