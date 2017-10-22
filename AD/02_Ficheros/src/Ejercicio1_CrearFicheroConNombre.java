import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_CrearFicheroConNombre {

	public static void main(String[] args) {
		String nombreFichero = "";
		
		Scanner scan = new Scanner(System.in);
		nombreFichero = scan.nextLine();
		scan.close();

		File fichero = new File(nombreFichero + ".txt");
		
		try {
			if(fichero.createNewFile() == true)
				System.out.println("El fichero se ha creado.");
			else
				System.out.println("El fichero no se ha creado.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}