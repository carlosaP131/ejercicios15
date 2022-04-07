package ejercicio1;

public class Declaracion {
	private double x;
	private double y;
	
	public Declaracion() {
		
	}
	public Declaracion(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public double getsuma() {
		return x+y;
	}
	public double getresta() {
		return x-y;
	}
	public double getMul() {
		return x*y;
	}
	public double getDiv() {
		return x/y;
	}
	public double getX() {
		return x;
	}
	public double setX(int x) {
		return this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
