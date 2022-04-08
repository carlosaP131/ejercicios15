/*****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: recibe la factura e imprime 
 **                                                                                                 
 * *************************************************************************************************/
package factura;

public class Principal {

	private static Factura tot = new Factura();

	public static void main(String[] args) {

		tot.setSubt(1000.0);
		System.out.println("subtotal sin iva $" + tot.getSubt());
		System.out.println("iva              $" + tot.getiva());
		System.out.println("total            $" + tot.gettot());
	}
}
