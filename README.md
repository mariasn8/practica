# Catálogo de películas

Esta aplicación de un catálogo de películas permite que se añadan y muestren las películas disponibles.

Para descargar el proyecto en su ordenador y clonar el repositorio escriba: **`git clone https://github.com/mariasn8/practica.git`**

Una vez lo tiene descargado introdúzcase en él escribiendo: **`cd practica`**

Después para generar el .jar que será el archivo que podrá ejecutar, introduzca: **`make jar`**

Para ejecutar el archivo .jar que acabamos de generar, teclee: **`java -jar catalogoPelis.jar <instruccion>`**

Las instrucciones que podemos introducir son:
	
	java -jar catalogoPelis.jar anadir <"titulo"> <"director"> <año de estreno> - Permite añadir una nueva película al catálogo

	java -jar catalogoPelis.jar mostrar - Muestra las películas que hemos añadido anteriormente. En caso de que no haya ninguna película no hará nada

	java -jar catalogoPelis.jar ayuda - Enseña una ayuda con las instrucciones que se pueden ejecutar

Ejemplos:

	java -jar catalogoPelis.jar anadir <"Mujercitas"> <"Gillian Armstrong"> <1994>
	
	java -jar catalogoPelis.jar mostrar
	
	java -jar catalogoPelis.jar ayuda

Para poder generar el javadoc de todo el proyecto escriba: **`make javadoc`**. Al hacerlo el javadoc aparecerá en el directorio(una carpeta) html

