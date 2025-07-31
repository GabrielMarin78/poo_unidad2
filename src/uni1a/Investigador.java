package uni1a;

public class Investigador {
	// Atributos de la clase Investigador
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String campo) {
        this.nombre = nombre;
        this.especialidad = campo;
    }

    // Métodos getters
    public String getNombre() {
    	return nombre;
    }
   
    public String getEspecialidad() {
    	return especialidad;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    } 
}	
