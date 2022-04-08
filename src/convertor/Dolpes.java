/*****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripición:este programa convierte dolares a pesos  
 **                                                                                                 
 * *************************************************************************************************/
package convertor;

public class Dolpes {
	private double valor_peso ;
	private double valor_dolares;

	public Dolpes() {

	}

	public Dolpes(double valor_peso, double valor_dolares) {

		this.valor_peso = 19.99;
		this.valor_dolares = valor_dolares;
	}

	public double getValordol() {
		return this.valor_peso * this.valor_dolares;
	}

	public double getValor_peso() {
		return valor_peso;
	}

	public void setValor_peso(double valor_peso) {
		this.valor_peso = valor_peso;
	}

	public double getValor_dolares() {
		return valor_dolares;
	}

	public void setValor_dolares(double valor_dolares) {
		this.valor_dolares = valor_dolares;
	}
}
