package uni1a;

public class Temporada {
	// Atributos de la clase Temporada
    private int numero;
    private int cantidadEpisodios;

    // Constructor de la clase Temporadas
    public Temporada(int numero, int cantidadEpisodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // Métodos getters
    public int getNumero() {
    	return numero;
    }
   
    public int getCantidadEpisodios() {
    	return cantidadEpisodios;
    }

    // Métodos setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setCantidadEpisodio(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    } 
}
