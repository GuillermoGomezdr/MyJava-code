
public class Tema0_Ejercicio9 {
	
	static int factorial(int n){
		if(n == 1)
			return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		int resultado = factorial(5);
		System.out.println("El factorial de 5 es: " + resultado);

	}
}
