package ejercicio3;

public class Principal {
       public static Datos usuario;
	public static void main(String[] args) {
		usuario=new Datos();
		usuario.setNombre("Carlos Aurelio Alcántara Pérez");
		usuario.setTelefono("9511039405");
		usuario.setDireccion("Reforma sin número Miahuatlan Oaxaca");
		System.out.println("Nombre del usuario: "+usuario.getNombre()+"\nTelefono: "+usuario.getTelefono()+"\nDireccion: "+usuario.getDireccion());
	}

}
