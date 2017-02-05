import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hola= "5 8 + 4 - 8 * 4 /";
		Calculadora calc= new Calculadora(hola);
		System.out.println(calc.operar(hola));
	}

}
