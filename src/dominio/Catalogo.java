package dominio;

import java.io.*;
import java.util.*;

/**
 * La clase catalogo permite añadir, borrar y mostrar las películas que haya en el catálogo, guardando todas las películas en un fichero
 *
 */

public class Catalogo{

	private String nombreFichero="Catalogo.csv";

	ArrayList<Pelicula> pelisCatalogo=new ArrayList<>();

	/**
	 * Constructor sin parámetros
	 *
	 */

	public Catalogo(){
		leerPelis();
	}

	/**
	 * Añade una película al catálogo escribiéndola en un fichero
	 * @param pelicula película a añadir
	 *
	 */

	public void addPeli(Pelicula pelicula){
		if(!pelisCatalogo.isEmpty()) 
			pelicula.setId(pelisCatalogo.get(pelisCatalogo.size()-1).getId()+1);
			//coge el id de la última peli del catálogo y se suma 1
		else
			pelicula.setId(1);
		pelisCatalogo.add(pelicula);
		escribirPelis();
	}

	/**
	 * Borra la película del catálogo y del fichero
	 * @param pelicula película a borrar
	 *
	 */

	public void borrarPeli(Pelicula pelicula){
		pelisCatalogo.remove(pelicula);
		nuevoId();
		escribirPelis();
	}


	private void nuevoId(){  //pone un nuevo id a la peli para que queden ordenados después de borrar una
		int id=1;
		for(Pelicula pelicula:pelisCatalogo){
			pelicula.setId(id);
			id++;
		}
	}

	/**
	 * Modifica una película ya añadida al catálogo
	 * @param pelicula película a modificar
	 *
	 */

	public void modicarPeli(Pelicula pelicula){
		pelisCatalogo.remove(pelicula);
		nuevoId();
		pelicula.setId(pelisCatalogo.get(pelisCatalogo.size()-1).getId()+1);
		//suma 1 al id de la última peli
		pelisCatalogo.add(pelicula);
		escribirPelis();
	}

	/**
	 * Devuelve las películas que están en el catálogo
	 * @return lista de películas del catálogo
	 *
	 */

	public ArrayList<Pelicula> getPelisCatalogo(){
		return pelisCatalogo;
	}

	/**
	 * Escribe las películas que se quieren añadir en un fichero para poder guardarlas
	 *
	 */

	public void escribirPelis(){   //escribe las peliculas en el fichero (volcar)
		try{
			FileWriter fw=new FileWriter(nombreFichero);

			for(Pelicula peli : pelisCatalogo){
				fw.write(peli.getId()+","+peli.getTitulo()+","+peli.getDirector()+","+peli.getAnnoEstreno()+"\n");
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
			File f=new File(nombreFichero);
			f.createNewFile();
			Scanner sc=new Scanner(f);  //para que lea el fichero f
			sc.useDelimiter(",|\n");  // | lo separa con: , y salto de línea
			while(sc.hasNext()){
				Pelicula peli=new Pelicula(Integer.parseInt(sc.next()), sc.next(), sc.next(), Integer.parseInt(sc.next()));
				pelisCatalogo.add(peli);
			}
			sc.close();
		} catch(IOException ex){
			System.err.println("No hay películas en el catálogo");
		}
	}
}

