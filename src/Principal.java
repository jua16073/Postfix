import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iPila <String> miStack= new StackVector<String>(); 
		Scanner teclado = new Scanner(System.in);
		String resp= teclado.nextLine();
		miStack.push(resp);
		String cadena= miStack.pop();
		System.out.println(cadena);
	}

}
