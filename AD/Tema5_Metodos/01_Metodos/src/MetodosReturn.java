
public class MetodosReturn {

	/*
	// V1
	public static int buscarValor(int[] tabla, int valor) {
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] == valor) 
				return i;
		}
		return -1;
	}
	*/
	
	// V2
	public static int buscarValor(int[] tabla, int valor) {
		int devolver = -1;
		boolean encontrado = false;
		for(int i = 0; (i < tabla.length) && (!encontrado); i++) {
			if(tabla[i] == valor) { 
				devolver = i;
				encontrado = true;
			}
		}
		return devolver;
	}
	
	public static void escribirValores(int[] tabla) {
		for(int i = 0; i < tabla.length; i++)
			System.out.println(tabla[i]);
		
	}
	
 	public static void main(String[] args) {
		int[] miTabla = {12, 34, 44, 55, 19}; 

		int numero = buscarValor(miTabla, 44);
		System.out.println("La posici�n es: " + numero);
		
		escribirValores(miTabla);
	}

}
