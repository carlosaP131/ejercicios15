package ejercicio1;
    
public class Principal {
	public static Declaracion vari;
	public static void main(String[] args) {
		vari = new Declaracion();
		vari.setX(144);
		vari.setY(999);
		System.out.println("valor de x "+ vari.getX());
		System.out.println("valor de y "+vari.getY());
		System.out.println("la suma es "+vari.getsuma());
		System.out.println("la resta es "+vari.getresta());
		System.out.println("la mutiplicación es "+vari.getMul());
		System.out.println("la divición es  "+vari.getDiv());
		

	}

}
