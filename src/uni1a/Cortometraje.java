/**
 * Class Cortometraje
 */
package uni1a;

// Subclase 'Cortometraje' que extiende de 'ContenidoAudiovisual'
public class Cortometraje extends ContenidoAudiovisual {
	// Atributos de la clase 'Cortometraje'
    private String director;

    // Constructor de la clase 'Cortometraje'
    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
    }

    // Métodos getter y setter para el campo 'director'
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + getDirector());
        System.out.println();
    }
}