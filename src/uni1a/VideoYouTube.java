/**
 * Class VideoYouTube
 */
package uni1a;

// Subclase 'VideoYouTube' que extiende de 'ContenidoAudiovisual'
public class VideoYouTube extends ContenidoAudiovisual {
	// Atributos de la clase 'VideoYoutube'
    private String canal;
    private int seguidores;
    private int likes;

    // Constructor de la clase 'VideoYouTube'
    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int seguidores, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.seguidores = seguidores;
        this.likes = likes;
    }

    // Métodos getter y setter para el campo 'canal'
    public String getCanal() {
        return canal;
    }
    
    public void setCanal(String canal) {
        this.canal = canal;
    }

    // Métodos getter y setter para el campo 'seguidores'
    public int getSeguidores() {
    	return seguidores;
    }
    
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
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
        System.out.println("Seguidores: " + getSeguidores());        
        System.out.println("Likes: " + getLikes());        
        System.out.println();
    }
}