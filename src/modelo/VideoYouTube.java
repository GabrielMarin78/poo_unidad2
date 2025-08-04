/**
 * Class VideoYouTube
 */
package modelo;

// Subclase 'VideoYouTube' que extiende de 'ContenidoAudiovisual'
public class VideoYouTube extends ContenidoAudiovisual {
	// Atributos de la clase 'VideoYoutube'
    private String canal;
    private int suscriptores;
    private int likes;

    // Constructor de la clase 'VideoYouTube'
    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int suscriptores, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.suscriptores = suscriptores;
        this.likes = likes;
    }

    // Métodos getter y setter para el campo 'canal'
    public String getCanal() {
        return canal;
    }
    
    public void setCanal(String canal) {
        this.canal = canal;
    }

    // Métodos getter y setter para el campo 'suscriptores'
    public int getSuscriptores() {
    	return suscriptores;
    }
    
    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    // Métodos getter y setter para el campo 'canal'
    public int getLikes() {
    	return likes;
    }

    public void setTema(int likes) {
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + getCanal());
        System.out.println("Suscriptores: " + getSuscriptores());        
        System.out.println("Likes: " + getLikes());        
        System.out.println();
    }
}