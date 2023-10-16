package dominio;

import java.io.*;
import java.util.*;

public class Catalogo{

	ArrayList<Pelicula> pelisCatalogo=new ArrayList<>();

	public Catalogo(){
		leerPelis();
	}

	public void addPeli(Pelicula pelicula){
		pelisCatalogo.add(pelicula);
		escribirPelis();
	}

	public ArrayList<Pelicula> getPelisCatalogo(){
		return pelisCatalogo;
	}

	public void escribirPelis(){   //escribe las peliculas en el fichero (volcar)
		try{
			FileWriter fw=new FileWriter("Catalogo.csv");
			for(Pelicula peli : pelisCatalogo){
				fw.write(peli.getTitulo()+"\n"+peli.getDirector()+"\n"+peli.getAnnoEstreno()+"\n\n");
				//hay que llamar al metodo desde el objeto, no la clase
			}
			fw.close();
		} catch(IOException ex){
			System.err.println(ex);
		}
	}

	public void leerPelis(){   //lee las pelis que hay en el fichero (cargar)
		try{
			File f=new File("Catalogo.csv");
			f.createNewFile();
			Scanner sc=new Scanner(f);  //para que lea el fichero f
			sc.useDelimiter(" | ");  // | lo separa con: ,
			while(sc.hasNext()){
				Pelicula peli=new Pelicula(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.next()));
				pelisCatalogo.add(peli);
			}
			sc.close();
		} catch(IOException ex){
			System.err.println("No hay películas en el catálogo");
		}
	}
			
		

	/* public void borrarPeli(Pelicula pelicula){
		pelisCatalogo.remove(pelicula);
		borrarPelis();
	}

	public void borrarPelis(Pelicula peli){
		try{
			FileWriter fw=new FileWriter(Catalogo.csv);
			fw.write(" ");
		} catch(IOException ex){
			System.err.println(ex);
		}
	} */

}


