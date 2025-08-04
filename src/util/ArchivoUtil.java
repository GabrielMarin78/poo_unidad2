package util;

import java.io.*;
import java.util.*;
import modelo.*;

public class ArchivoUtil {
    // Leer películas desde archivo CSV
    public static List<Pelicula> leerPeliculasDesdeCSV(String ruta) {
        List<Pelicula> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Formato esperado: titulo,duracion,genero,estudio,nombre1:edad1;nombre2:edad2
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String titulo = partes[0];
                    int duracion = Integer.parseInt(partes[1]);
                    String genero = partes[2];
                    String estudio = partes[3];
                    String actoresCSV = partes[4]; // nombre1:edad1;nombre2:edad2

                    Pelicula pelicula = new Pelicula(titulo, duracion, genero, estudio);

                    if (!actoresCSV.isEmpty()) {
                        String[] actoresDatos = actoresCSV.split(";");
                        for (String actorStr : actoresDatos) {
                            String[] datos = actorStr.split(":");
                            if (datos.length == 2) {
                                String nombre = datos[0];
                                int edad = Integer.parseInt(datos[1]);
                                Actor actor = new Actor(nombre, edad);
                                pelicula.agregarActor(actor);
                            }
                        }
                    }

                    peliculas.add(pelicula);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + ruta);
        }
        return peliculas;
    }

    // Guardar películas en archivo CSV
    public static void guardarPeliculasEnCSV(List<Pelicula> peliculas, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Pelicula pelicula : peliculas) {
                StringBuilder actoresStr = new StringBuilder();
                for (Actor actor : pelicula.getActores()) {
                    if (actoresStr.length() > 0) actoresStr.append(";");
                    actoresStr.append(actor.getNombre()).append(":").append(actor.getEdad());
                }

                String linea = String.join(",",
                        pelicula.getTitulo(),
                        String.valueOf(pelicula.getDuracionEnMinutos()),
                        pelicula.getGenero(),
                        pelicula.getEstudio(),
                        actoresStr.toString()
                );

                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + ruta);
        }
    }
    
    // Leer series desde archivo CSV
    public static List<SerieDeTV> leerSeriesDesdeCSV(String ruta) {
        List<SerieDeTV> series = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",", -1);
                String titulo = partes[0];
                int duracion = Integer.parseInt(partes[1]);
                String genero = partes[2];
                String canal = partes[3];
                String temporadasStr = partes[4]; // formato: num:episodios;num:episodios;...

                SerieDeTV serie = new SerieDeTV(titulo, duracion, genero, canal);
                if (!temporadasStr.isEmpty()) {
                    String[] temporadas = temporadasStr.split(";");
                    for (String t : temporadas) {
                        String[] datos = t.split(":");
                        int numero = Integer.parseInt(datos[0]);
                        int episodios = Integer.parseInt(datos[1]);
                        serie.agregarTemporada(numero, episodios);
                    }
                }
                series.add(serie);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + ruta);
        }
        return series;
    }

    // Guardar series en archivo CSV
    public static void guardarSeriesEnCSV(List<SerieDeTV> series, String ruta) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (SerieDeTV serie : series) {
                StringBuilder sb = new StringBuilder();
                sb.append(serie.getTitulo()).append(",");
                sb.append(serie.getDuracionEnMinutos()).append(",");
                sb.append(serie.getGenero()).append(",");
                sb.append(serie.getCanal()).append(",");
                for (Temporada temporada : serie.getTemporadas()) {
                    sb.append(temporada.getNumero()).append(":").append(temporada.getCantidadEpisodios()).append(";");
                }
                pw.println(sb.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + ruta);
        }
    }
    
    // Leer documentales desde archivo CSV
    public static List<Documental> leerDocumentalesDesdeCSV(String ruta) {
        List<Documental> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",", -1);
                String titulo = partes[0];
                int duracion = Integer.parseInt(partes[1]);
                String genero = partes[2];
                String tema = partes[3];
                String nombreInv = partes[4];
                String especialidad = partes[5];

                Investigador investigador = new Investigador(nombreInv, especialidad);
                Documental documental = new Documental(titulo, duracion, genero, tema, investigador);
                lista.add(documental);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + ruta);
        }
        return lista;
    }

    // Guardar documentales en archivo CSV
    public static void guardarDocumentalesEnCSV(List<Documental> documentales, String ruta) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (Documental documental : documentales) {
                pw.println(documental.getTitulo() + "," +
                           documental.getDuracionEnMinutos() + "," +
                           documental.getGenero() + "," +
                           documental.getTema() + "," +
                           documental.getInvestigador().getNombre() + "," +
                           documental.getInvestigador().getEspecialidad());
            }
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + ruta);
        }
    }
}
	