// controlador/ContenidoAudiovisualController.java
package controlador;

import modelo.*;
import util.ArchivoUtil;

import java.util.*;

public class ContenidoAudioVisualControlador {

    private List<Pelicula> peliculas;

    public ContenidoAudioVisualControlador() {
        peliculas = new ArrayList<>();
    }

    public void cargarPeliculas(String ruta) {
        List<Pelicula> datos = ArchivoUtil.leerPeliculasDesdeCSV(ruta);
        }
    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void agregarPelicula(Pelicula nueva) {
        peliculas.add(nueva);
    }

    public void guardarPeliculas(String ruta) {
        List<Pelicula> datos = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            datos.add(pelicula.toCSV().split(";"));
        }
        ArchivoUtil.guardarPeliculasEnCSV(datos, ruta);
    }
}
