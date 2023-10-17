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
		return "El título de la película es '"+getTitulo()+"', '"+getDirector()+"' es su director y "+getAnnoEstreno()+" es su año de estreno";
	}
}


