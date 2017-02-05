import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
public class Principal {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Principal x = new Principal();
		 
		String hola= x.lectura();
		Calculadora calc= new Calculadora(hola);
		System.out.println(calc.operar(hola));
		
		
	}
	
	String lectura() throws IOException{
		
		
		String a = null; 
		
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		
		while(reader.ready()){
			a = reader.readLine();
			return a;
		}
		return a;
	
		
	}

}
