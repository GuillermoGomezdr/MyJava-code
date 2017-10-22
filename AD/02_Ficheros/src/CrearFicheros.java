import java.io.*;

public class CrearFicheros {

	public static void main(String[] args) {
		File fichero = new File("z:prueba.txt");
		
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
