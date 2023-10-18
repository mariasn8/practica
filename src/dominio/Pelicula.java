package dominio;

/**
 * La clase Pelicula es la responsable de manejar la información sobre película, además permite crear una película y mostrar su título, director y año de estreno
 * 
 */


public class Pelicula{

	String titulo;
	String director;
	int annoEstreno;

	/**
	 * Constructor con parámetros
	 * @param titulo título de la película
	 * @param director director de la película
	 * @param annoEstreno año de estreno de la película
	 *
	 */

	public Pelicula(String titulo, String director, int annoEstreno){
		this.titulo=titulo;
		this.director=director;
		this.annoEstreno=annoEstreno;
	}

	/**
	 * Devuelve el título de la película
	 * @return título de la película
	 *
	 */
	public String getTitulo(){
		return titulo;
	}

	/**
	 * Devuelve el director de la película
	 * @return director de la película
	 *
	 */

	public String getDirector(){
		return director;
	}

	/**
	 * Devuelve el año de estreno de la película
	 * @return año de estreno de la película
	 *
	 */

	public int getAnnoEstreno(){
		return annoEstreno;
	}

	/**
	 * Devuelve una cadena de caracteres con el título, director y año de estreno de la película
	 * @return cadena de caracteres con la información de la película
	 *
	 */

	public String toString(){
		return "El título de la película es '"+getTitulo()+"', '"+getDirector()+"' es su director y "+getAnnoEstreno()+" es su año de estreno";
	}
}


