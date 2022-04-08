/*****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripición:este programa este programa converte pesos a dolares 
 **                                                                                                 
 * *************************************************************************************************/
package convertor;

public class Pesdol {
	private double valor_peso;
	private double valor_dolares;

	public Pesdol() {

	}

	public Pesdol(double valor_peso, double valor_dolares) {

		this.valor_peso = valor_peso;
		this.valor_dolares  = 0.050;
	}

	public double getValorpes() {
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
