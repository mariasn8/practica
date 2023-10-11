package dominio;

import java.io.*;
import java.util.*;

public class Catalogo{

	ArrayList<Pelicula> pelisCatalogo=new ArrayList<>();

	public void addPeli(Pelicula pelicula){
		pelisCatalogo.add(pelicula);
	}

	public ArrayList<Pelicula> getPelisCatalogo(){
		return pelisCatalogo;
	}

	public void escribirPelis(){   //escribe las películas en el fichero (volcar)
		try{
			FileWriter fw=new FileWriter("Catalogo.csv");
			for(Pelicula peli : pelisCatalogo){
				fw.write(peli.getTitulo()+", "+peli.getDirector()+", "+peli.getAnnoEstreno()+"\n");
				//hay que llamar al método desde el objeto, no la clase
			}
		} catch(IOException ex){
			System.err.println(ex);
		}
	}

	public void leerPelis(){   //lee las pelis que hay en el fichero (cargar)
		try{
			File f=new File("Catalogo.csv");
			f.createNewFile();
			Scanner sc=new Scanner(f);  //para que lea el fichero f

			
		

	/* public void borrarPeli(Pelicula pelicula){
		pelisCatalogo.remove(pelicula);
	} */
}


