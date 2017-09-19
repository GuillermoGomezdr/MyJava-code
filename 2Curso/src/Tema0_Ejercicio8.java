
public class Tema0_Ejercicio8 {

	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int suma = 0;
		
		for(int i = 0; i < array[0].length; i++)
			for(int o = 0; o < array[1].length; o++)
					suma+= array[i][o];
		
		System.out.println(suma);

	}

}