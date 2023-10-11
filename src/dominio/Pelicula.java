package dominio;

public class Pelicula{

	String titulo;
	String director;
	int annoEstreno;

	public Pelicula(String titulo, String director, int annoEstreno){
		this.titulo=titulo;
		this.director=director;
		this.annoEstreno=annoEstreno;
	}

	public String getTitulo(){
		return titulo;
	}

	public String getDirector(){
		return director;
	}

	public int getAnnoEstreno(){
		return annoEstreno;
	}

	public String toString(){
		return getTitulo()+" es su título, "+getDirector()+" su director y "+getAnnoEstreno()+" su año de estreno";
	}
}


