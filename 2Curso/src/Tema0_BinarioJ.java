
public class Tema0_BinarioJ {
	/*Ejercicio 10: Implementar un programa que dado un número
	entero positivo obtenga su correspondiente número binario.*/
	
	public static void main(String[] args) {
		int numero = 2;
		String binario = "";
		
		do{
			binario += numero % 2;
			numero /= 2;
		} while(numero > 0);
		
		for(int i = binario.length() - 1; i >= 0; i--)
			System.out.print(binario.charAt(i));
		
	}
	
}