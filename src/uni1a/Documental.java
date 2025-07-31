/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
	// Atributos de la clase Documental
    private String tema;
    private Investigador investigador; // Relación de Asociación

    
    // Constructor de la clase Documental
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    // Métodos getter
    public String getTema() {
        return tema;
    }

    // Métodos setter
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + getTema());
        System.out.println("Investigador: " + investigador.getNombre() + " - " + investigador.getEspecialidad());        
        System.out.println();
    }
}