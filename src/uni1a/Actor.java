package uni1a;

public class Actor {
	// Atributos de la clase Actor
    private String nombre;
    private int edad;

    // Constructor de la clase Actor
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getters
    public String getNombre() {
    	return nombre;
    }
   
    public int getEdad() {
    	return edad;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int tema) {
        this.edad = tema;
    } 
}
