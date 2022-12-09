
public class EjercicioEncapsulacion {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.setEdad(35);
		persona.setNombre("Evan");
		persona.setTelefono("1154789964");

		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Teléfono: " + persona.getTelefono());

	}
}

class Persona {
	private int edad;
	private String nombre;
	private String telefono;

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}
}
