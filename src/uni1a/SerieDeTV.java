/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	// Atributos de la clase SerieDeTV
    private String canal;
    private List<Temporada> temporadas; // Relación de Composición 

    // Consructor de la clase SerieDeTV
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String canal) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.temporadas = new ArrayList<>();
    }

    
    // Métodos getter
    public String getCanal() {
        return canal;
    }
    
    public List<Temporada> getTemporadas(){
    	return temporadas;
    }

    // Métodos setter
    public void setCanal(String canal) {
        this.canal = canal;
    }
    
    public void agregarTemporada(int numero, int cantidadEpisodios) {
    	Temporada nueva = new Temporada(numero, cantidadEpisodios);
    	temporadas.add(nueva);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + getCanal());
        System.out.println("Temporadas: ");
        for (Temporada temporada : temporadas) {
        	System.out.println("- " + temporada.getNumero() + ", " + temporada.getCantidadEpisodios() + " episodios.");
        }
        System.out.println();
    }
}