package uni1a;

public class Temporada {
	// Atributos de la clase 'Temporada'
    private int numero;
    private int cantidadEpisodios;

    // Constructor de la clase 'Temporada'
    public Temporada(int numero, int cantidadEpisodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    // Métodos getter y setter para el campo 'numero'
    public int getNumero() {
    	return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

 // Métodos getter y setter para el campo 'cantidadEpisodios'
    public int getCantidadEpisodios() {
    	return cantidadEpisodios;
    }
    
    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    } 
}
