package poo;

import uni1a.*;
import poo.util.ArchivoUtil;
import java.util.List;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		// Ruta a los archivo CSV
        String rutaPeliculas = "data/peliculas.csv";
        String rutaSeries = "data/series.csv";
        String rutaDocumentales = "data/documentales.csv";

        
        // Leer películas desde el archivo
        List<Pelicula> peliculas = ArchivoUtil.leerPeliculasDesdeCSV(rutaPeliculas);

        System.out.println("<<< Catálogo de Contenido Audiovisual: >>>\n");

        // Mostrar las películas leídas
        for (Pelicula pelicula : peliculas) {
            pelicula.mostrarDetalles();
        }
		
        List<SerieDeTV> series = ArchivoUtil.leerSeriesDesdeCSV(rutaSeries);
        List<Documental> documentales = ArchivoUtil.leerDocumentalesDesdeCSV(rutaDocumentales);

        for (SerieDeTV serie : series) serie.mostrarDetalles();
        for (Documental documental : documentales) documental.mostrarDetalles();

        ArchivoUtil.guardarSeriesEnCSV(series, rutaSeries);
        ArchivoUtil.guardarDocumentalesEnCSV(documentales, rutaDocumentales);
        
        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[2];
        contenidos[0] = new VideoYouTube("POO", 10, "Programación", "Todo Code", 1000, 500);
        contenidos[1] = new Cortometraje("Galápagos", 20, "Turismo", "Valentina Quintero");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
        
        // Se puede agregar una nueva película de forma manual
        Pelicula nueva = new Pelicula("Matrix", 136, "Ciencia Ficción", "Warner Bros");
        nueva.agregarActor(new uni1a.Actor("Keanu Reeves", 55));
        peliculas.add(nueva);

        // Guardar nuevamente todas las películas en el archivo
        ArchivoUtil.guardarPeliculasEnCSV(peliculas, rutaPeliculas);

        System.out.println("Películas guardadas correctamente.");
        
    }
}