// vista/MenuConsola.java
package vista;

import controlador.ContenidoAudioVisualControlador;
import modelo.Pelicula;

import java.util.Scanner;

public class MenuConsola {

    private ContenidoAudioVisualControlador controlador;
    private Scanner scanner;

    public MenuConsola() {
        controlador = new ContenidoAudioVisualControlador();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1:
                    controlador.cargarPeliculas("peliculas.csv");
                    System.out.println("Películas cargadas.");
                    break;
                case 2:
                    controlador.mostrarPeliculas();
                    break;
                case 3:
                    agregarNuevaPelicula();
                    break;
                case 4:
                    controlador.guardarPeliculas("peliculas.csv");
                    System.out.println("Películas guardadas.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n--- MENÚ PELÍCULAS ---");
        System.out.println("1. Cargar películas");
        System.out.println("2. Ver películas");
        System.out.println("3. Agregar nueva película");
        System.out.println("4. Guardar películas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarNuevaPelicula() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Año: ");
        int duracion = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("Duración: ");
        int duracion = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();

        Pelicula nueva = new Pelicula(titulo, duracion, genero, estudio, actores);
        controlador.agregarPelicula(nueva);
        System.out.println("Película agregada.");
    }
}
