
public class Tema0_Fibonacci {

	static int fibon(int n){	
		if (n == 0 || n == 1)
			return 1;
		return fibon(n-1) + fibon(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = fibon(8);
		
		System.out.println("El resultado es: "+resultado);

	}

}
