/**
 * Class Pelicula
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

// Subclase 'Pelicula' que extiende de 'ContenidoAudiovisual'
public class Pelicula extends ContenidoAudiovisual {
	// Atributos de la clase 'Pelicula'
    private String estudio;
    private List<Actor> actores; // Relación de Agregación

    // Constructor de la clase 'Pelicula'
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // Se inicializa la lista, pero los actores vienen de afuera
    }

    // Métodos getter y setter para el campo 'estudio'
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    public List<Actor> getActores() {
        return actores;
    }
    
    public void agregarActor(Actor actor) {
    	this.actores.add(actor);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + getEstudio());
        System.out.println("Actores: ");
        for (Actor actor : actores) {
        	System.out.println("- " + actor.getNombre() + ", " + actor.getEdad() + " años.");
        }
        System.out.println();
    }
}