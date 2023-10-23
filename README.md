# Catálogo de películas

Esta aplicación de un catálogo de películas, permite que se añadan y muestren las películas que hay en él.

## Instalación

Para instalar la aplicación, introduzca: **`make jar`**

## Ejecución

Para ejecutar el archivo .jar que se acaba de generar, teclee: **`java -jar catalogoPelis.jar <instruccion>`**

Las instrucciones que se pueden introducir son:
	
	java -jar catalogoPelis.jar anadir <"titulo"> <"director"> <año de estreno> - Permite añadir una nueva película al catálogo

	java -jar catalogoPelis.jar mostrar - Muestra las películas que hemos añadido anteriormente. En caso de que no haya ninguna película no hará nada

	java -jar catalogoPelis.jar ayuda - Enseña una ayuda con las instrucciones que se pueden ejecutar

Ejemplos:

	java -jar catalogoPelis.jar anadir "Mujercitas" "Gillian Armstrong" 1994
	
	java -jar catalogoPelis.jar mostrar
	
	java -jar catalogoPelis.jar ayuda

## Generación del Javadoc

Por último para poder generar el javadoc de todo el proyecto escriba: **`make javadoc`**. Al hacerlo el javadoc aparecerá en el directorio (una carpeta) html

//##Estructura interna de la aplicación
//aqui iria el archivo UML

