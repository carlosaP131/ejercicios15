/*****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: calcula la base impuesta de una factura    
 **                                                                                                 
 * *************************************************************************************************/
package factura;

public class Factura {
	private double iva = 16;
	private double subt;

	public Factura() {

	}

	public Factura(double iva, double subt) {

		this.iva = 16;
		this.subt = subt;
	}

	public double getiva() {
		return ((this.iva) / 100) * subt;
	}

	public double gettot() {
		return (((this.iva) / 100) * subt) + subt;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getSubt() {
		return subt;
	}

	public void setSubt(double subt) {
		this.subt = subt;
	}

}
