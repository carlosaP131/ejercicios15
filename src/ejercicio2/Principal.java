/*****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: imprime el nombre 
 **                                                                                                 
 * *************************************************************************************************/

package ejercicio2;

public class Principal {
            public static Mostrar_Nom nom;
	public static void main(String[] args) {
		nom= new Mostrar_Nom();
		nom.setNombre("Carlos Aurelio Alcántara Pérez");
		System.out.println("mi nombre es "+nom.getimprimir());
	}

}
