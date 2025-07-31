package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("<<< Catálogo de Contenido Audiovisual: >>>\n");
        
        // Crear instancias de las clases asociadas a las subclases
        Actor actor1 = new Actor ("Zoe Zaldana", 30);
        Actor actor2 = new Actor("Laura Gómez", 28);

        Investigador investigador1 = new Investigador ("Dr. Julio Torres", "Astronomy");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        contenidos[0] = pelicula;
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", "Netflix");
        serie.agregarTemporada(1, 10);
        serie.agregarTemporada(2, 8);
        contenidos[1] = serie;
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", investigador1);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}