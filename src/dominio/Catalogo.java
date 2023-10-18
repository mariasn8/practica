package dominio;

import java.io.*;
import java.util.*;

/**
 * La clase catalogo permite añadir y mostrar las películas añadidas al catálogo, guarda todas las películas añadidas en un fichero
 * @param pelisCatalogo lista de las películas añadidas 
 *
 */

public class Catalogo{

	ArrayList<Pelicula> pelisCatalogo=new ArrayList<>();

	/**
	 * Constructor sin parámetros que invoca al método leerPelis() para que cada vez que se haga referencia a la clase lea las películas que tiene guardadas, si las tiene
	 *
	 */

	public Catalogo(){
		leerPelis();
	}

	/**
	 * Añade una película al catálogo escribiéndola en un fichero
	 *
	 */

	public void addPeli(Pelicula pelicula){
		pelisCatalogo.add(pelicula);
		escribirPelis();
	}

	/**
	 * Devuelve un ArrayList con la lista de películas del catálogo
	 * @return lista de películas del catálogo
	 *
	 */

	public ArrayList<Pelicula> getPelisCatalogo(){
		return pelisCatalogo;
	}

	/**
	 * Escribe las películas que se quieren añadir en un fichero para poder guradarlas
	 *
	 */

	public void escribirPelis(){   //escribe las peliculas en el fichero (volcar)
		try{
			FileWriter fw=new FileWriter("Catalogo.csv");
			for(Pelicula peli : pelisCatalogo){
				fw.write(peli.getTitulo()+","+peli.getDirector()+","+peli.getAnnoEstreno()+"\n");
				//hay que llamar al metodo desde el objeto, no la clase
			}
			fw.close();
		} catch(IOException ex){
			System.err.println(ex);
		}
	}

	/**
	 * Permite leer las películas que están escritas en el fichero y si este no existe lo crea
	 *
	 */

	public void leerPelis(){   //lee las pelis que hay en el fichero (cargar)
		try{
			File f=new File("Catalogo.csv");
			f.createNewFile();
			Scanner sc=new Scanner(f);  //para que lea el fichero f
			sc.useDelimiter(",|\n");  // | lo separa con: , y salto de línea
			while(sc.hasNext()){
				Pelicula peli=new Pelicula(sc.next(), sc.next(), Integer.parseInt(sc.next()));
				pelisCatalogo.add(peli);
			}
			sc.close();
		} catch(IOException ex){
			System.err.println("No hay películas en el catálogo");
		}
	}
			
	
	public void removePeli(Pelicula pelicula){
		pelisCatalogo.remove(pelicula);
		borrarPelis();
	}

	public void borrarPelis(){
		try{
			FileWriter fw=new FileWriter("Catalogo.csv");
			fw.write(" ");
		} catch(IOException ex){
			System.err.println(ex);
		}
	} 

}


