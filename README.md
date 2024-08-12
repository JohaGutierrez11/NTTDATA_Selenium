# E2E con Selenium

## Tabla de contenido
1. [Información general](#info-general)
2. [Tecnologías](#tecnologias)
3. [Instalación](#instalacion)
4. [Instrucciones para ejecutar la prueba](#ejec-test)
5. [Colaboración](#colaboracion)


### Inforación general
***
El presente proyecto utiliza el framework Selenium para realizar pruebas automatizadas E2E de "SauceDemo". Se realizaró un caso de prueba, el cual tiene los siguientes pasos de prueba: 
• Autenticarse con el usuario: standard_user y password: secret_sauce
• Agregar dos productos al carrito
• Visualizar el carrito
• Completar el formulario de compra
• Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”

## Tecnologias
***
Las tecnologias que se utilizaron para este proyectos son
* Máquina local, con sistema Operativo Windows 11
* [IntelliJ IDEA 2023.1.5](https://www.jetbrains.com/idea/download/?section=windows): Version 17.0.7
* [JDK](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html): Version 1.8
* [GRADLE](https://maven.apache.org/docs/3.9.2/release-notes.html): Version 7.6
* [Selenium](https://www.selenium.dev/): Version 4.8.3
* [Cucumber](https://cucumber.io/): Version 7.14
## Instalación
***
El proyecto se encuentra en GitHub, para clonar el repositorio de debe realizar los siguientes pasos: 
```
$ cd ../path/to/the/file
$ git clone https://github.com/JohaGutierrez11/NTTDATA_Selenium.git
```
Información adicional: Para concluir la instalación del proyecto, se debe:
```
* Abrir la aplicacion Intellij
* Ir a la opción Archivo
* Dar clic en la opción Abrir
* Elegir la carpeta que se clonó
* git checkout master 
```
## Instrucciones para ejecutar los test
* Ejecutar todas las pruebas del proyecto, se utiliza el comando:
```
gradle clean test
```
* Ver el reporte generado con cucumber
```
target/cucumber-reports.html
```
## Colaboración
***
Para realizar el proyecto se utilizaron las siguientes fuentes.
* [Cucumber Reporting](https://github.com/damianszczepanik/cucumber-reporting?tab=readme-ov-file)
