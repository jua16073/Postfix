
/**
 * @author Rodrigo Juarez Jui 16073
 * @author Michelle Bloomfield Fong 16803
 *
 */

public class Calculadora implements iCalculadora{
	
	iPila <String> miStack= new StackVector<String>();
	double a;
	double b;
	
	public Calculadora(String n){
		String datos[]= n.split(" ");
		int x=0;
		while (x< datos.length){
			miStack.push(datos[x]);
			x++;
		}
	}
	

	/**
	 * @param a
	 * @param b
	 * @return la suma de los enteros
	 */
	@Override
	public double suma(int a, int b){
		
		int c = a+b;
		return c;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la resta de los enteros
	 */
	@Override
	public double resta(int a, int b){
		int c = a-b;
		return c;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la multiplicacion de los enteros
	 */
	public double multiplicacion(int a, int b){
		int c = a*b;
		return c;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return la division de los enteros
	 */
	@Override
	public double division(int a, int b){
		int c = a/b;
		return c;
	}
	
	@Override
	public double operar(String n){
		double x=0;
		
		return x;
	}
	
	
	
}


