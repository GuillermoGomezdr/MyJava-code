
public class Tema0_Ejercicio10 {

	static int convertir(int num, int n){
		if(num/2 == 1)
			return (int) (num%2*Math.pow(10, n++) + Math.pow(10, n));
		return (int) (num%2*Math.pow(10, n++) + convertir(num/2, n));
	}
	
	public static void main(String[] args) {
		int resultado = convertir(6, 0);
		System.out.println("El n�mero 6 en binario es: " + resultado);
	}

}