package ejercicio3;

public class Datos {
      private String Telefono;
      private String Nombre;
      private String Direccion;
      public Datos() {
    	  
      }
	public Datos(String telefono, String nombre, String direccion) {
	
		Telefono = telefono;
		Nombre = nombre;
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
      
}
