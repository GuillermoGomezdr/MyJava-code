import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3_MenuOpciones {

	public static void main(String[] args) {
		int ePrograma = 0;
		boolean ejecutando = true;
		File fichero = null;
		String nombre;
		
		System.out.println("Programa menú. Las opciones son: \n"
							+ "1. Crear fichero.\n"
							+ "2. Mostrar información del fichero.\n"
							+ "3. Mostrar longitud del fichero.\n"
							+ "4. Comprobar la existencia del fichero.\n"
							+ "5. Borrar fichero.\n"
							+ "6. Salir del programa.\n");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(ejecutando) {
			ePrograma = Integer.parseInt(scan.nextLine());
			
			//ePrograma++;
			System.out.println(ePrograma+".");
			
			
			switch (ePrograma) {
			case 1:
				System.out.println("Introduce el nombre del fichero:");
				nombre = scan.nextLine();
				fichero = new File(nombre + ".txt");
			
				try {
					if(fichero.createNewFile() == true)
						System.out.println("El fichero se ha creado.");
					else
						System.out.println("El fichero no se ha creado.");
				
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			break;
			
			case 2:
				System.out.println("Introduce el nombre del fichero del que quieras saber la información:");
				nombre = scan.nextLine();
				fichero = new File(nombre + ".txt");
				
				if(fichero.exists())
					System.out.println("Nombre del fichero: " + fichero.getName().toString() +"\n" +
									   "Ruta absoluta: " + fichero.getAbsolutePath() +"\n" +
									   "Ruta relativa: " + fichero.getPath()  +"\n" +
									   "Longitud: " + fichero.length());
				else
					System.out.println("El nombre introducido no corresponde a ningún fichero.");
			break;
			
			case 3:
				System.out.println("Introduce el nombre del fichero del que quieras conocer la longitud:");
				nombre = scan.nextLine();
				fichero = new File(nombre + ".txt");
				
				if(fichero.exists())
					System.out.println("La longitud del fichero es de " + fichero.length());
				else
					System.out.println("El nombre introducido no corresponde a ningún fichero.");
			break;
			
			case 4:
				System.out.println("Introduce el nombre del fichero para comprobar su existencia:");
				nombre = scan.nextLine();
				fichero = new File(nombre + ".txt");
				if(fichero.exists())
					System.out.println("El fichero existe.");
				else
					System.out.println("El fichero no existe.");
			break;
			
			case 5:
				System.out.println("Introduce el nombre del fichero que desees borrar:");
				nombre = scan.nextLine();
				fichero = new File(nombre + ".txt");
				
				if(fichero.exists()) {
					System.out.println("Borrando fichero...");
					fichero.delete();
				} else
					System.out.println("El nombre introducido no corresponde a ningún fichero.");
			break;
			

			case 6:
				System.out.println("Cerrando programa...");
				ejecutando = false;
			break;
			}
		}
		
		scan.close();
	}

}
