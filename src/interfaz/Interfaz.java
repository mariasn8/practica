package interfaz;

import java.util.*;

import dominio.*;

public class Interfaz{
	private static String negrita = "\u001B[1m";
	private static String normal = "\033[0m";
	private static String rojo = "\u001B[31m";
	private static String blanco = "\u001B[37m";
	public static void ejecutar(String[] instruccion){

// Si escribo `java -cp bin puntoEntrada.Principal añadir Juan García Martínez`entonces
// `instruccion[0]` es `añadir`
// `instruccion[1]` es `Juan`
// `instruccion[2]` es `García`
// `instruccion[3]` es `Martínez`

		Catalogo cat = new Catalogo();
		if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1){
			mostrarPeliculas(cat);
		}
		else if (instruccion[0].equalsIgnoreCase("anadir") && instruccion.length == 4){
			Pelicula peli = new Pelicula(instruccion[1], instruccion[2], Integer.parseInt(instruccion[3]));
			cat.addPeli(peli);
		}
		else if (instruccion[0].equalsIgnoreCase("ayuda") && instruccion.length == 1){
			ayuda();
		}
		//else if (instruccion[0].equalsIgnoreCase("borrar") && instruccion.length == 2){
			//cat.removePeli(getTitulo());
		//}
		else{
			System.out.println(rojo + "El formato utilizado en la entrada es incorrecto" + blanco);
			ayuda();
		}
	}

	private static void mostrarPeliculas(Catalogo cat){
		ArrayList<Pelicula> listaPelis = cat.getPelisCatalogo();
		for(Pelicula pelicula : listaPelis){
			System.out.println(pelicula);
		}

	}

	private static void ayuda(){
		System.out.println("\n"+negrita+"DESCRIPCIÓN"+normal);
		System.out.println("\tEsta aplicación ofrece las siguientes funcionalidades:\n\n" + 
				"\t- Permite añadir una nueva película al catálogo\n" + 
				"\t- Permite mostrar las películas del catálogo");
		System.out.println(negrita+"FORMATO"+normal);
		System.out.println("\tPara añadir una nueva película, se escribe:\n");
		System.out.println("\t\t" + negrita+ "java -cp bin aplicacion.Principal anadir <'titulo'> <'director'> <año de estreno>"+normal+"\n");
		System.out.println("\tPara mostrar las películas del catálogo, se teclea:\n");
		System.out.println("\t\t" + negrita + "java -cp bin aplicacion.Principal mostrar" + normal + "\n");
		System.out.println("\tPara mostrar esta ayuda, se escribe:\n");
		System.out.println("\t\t" + negrita +"java -cp bin aplicacion.Principal ayuda" + normal + "\n");
		System.out.println(negrita+"EJEMPLOS"+normal);
		System.out.println("\tEjemplo 1\n");
		System.out.println("\t\t" + negrita +"java -cp bin aplicacion.Principal anadir 'Matrix' 'Lana Wachowsky' 1999" + normal + "\n");
		System.out.println("\tEjemplo 2\n");
		System.out.println("\t\t" + negrita + "java -cp bin aplicacion.Principal mostrar" + normal+ "\n");
		System.out.println("\tEjemplo 3\n");
		System.out.println("\t\t" + negrita + "java -cp bin aplicacion.Principal ayuda" + normal + "\n");
	}

}
