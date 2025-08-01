package uni1a;

public class Investigador {
	// Atributos de la clase 'Investigador'
    private String nombre;
    private String especialidad;

    // Constructor de la clase 'Investigador'
    public Investigador(String nombre, String campo) {
        this.nombre = nombre;
        this.especialidad = campo;
    }

    // Métodos getter y setter para el campo 'nombre'
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el campo 'especialidad'
    public String getEspecialidad() {
    	return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    } 
}	
