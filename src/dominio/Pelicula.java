package dominio;

/**
 * La clase Pelicula es la responsable de manejar la información sobre película, además permite crear una película y mostrar su título, director y año de estreno
 * 
 */


public class Pelicula{

	private String titulo;
	private String director;
	private int annoEstreno;
	private int id;

	/**
	 * Constructor con parámetros
	 * @param id id de la película
	 * @param titulo título de la película
	 * @param director director de la película
	 * @param annoEstreno año de estreno de la película
	 *
	 */

	public Pelicula(int id, String titulo, String director, int annoEstreno){
		this.id=id;
		this.titulo=titulo;
		this.director=director;
		this.annoEstreno=annoEstreno;
	}

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
	 * Constructor con parámetros
	 * @param id id de la película
	 */

	public Pelicula(int id){
		this.id=id;
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
	 * Devuelve el id de la película
	 * @return id de la película
	 */

	public int getId(){
		return id;
	}

	/**
	 * Asigna un id a una película
	 * @param id id de la película
	 */

	public void setId(int id){
		this.id=id;
	}

	/**
	 * Comprueba que el id introducido coincida con el de la película
	 * @return id de la película
	 *
	 */

	@Override
	public boolean equals(Object obj){
		Pelicula peli=(Pelicula) obj;
		return id==peli.id;
	}

	/**
	 * Devuelve una cadena de caracteres con el título, director y año de estreno de la película
	 * @return cadena de caracteres con la información de la película
	 *
	 */

	@Override
	public String toString(){
		return "Id: "+getId()+". Su título es: '"+getTitulo()+"', su director/a es: '"+getDirector()+"' y su año de estreno es: "+getAnnoEstreno();
	}
}


