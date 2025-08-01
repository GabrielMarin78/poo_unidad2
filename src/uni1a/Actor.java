package uni1a;

public class Actor {
	// Atributos de la clase 'Actor'
    private String nombre;
    private int edad;

    // Constructor de la clase 'Actor'
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter para el campo 'nombre'
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el campo 'edad'
    public int getEdad() {
    	return edad;
    }
 
    public void setEdad(int tema) {
        this.edad = tema;
    } 
}
