import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_ejemplo01 {


		public static void main(String[] args) {
			String[] lista = {"Pepe", "Ana", "Juan"};
			
			escribirFichero(lista);
			
			//Vaciamos la lista, para comprobar bien luego que puede leer.
			lista[0] = "";
			lista[1] = "";
			lista[2] = "";
			
			leerFichero(lista);
			imprimirTabla(lista);
			
		}
		
		public static void escribirFichero(String[] lista) {	
			try {															//1. Crear fichero.
				File fichero = new File("ficheroNombresBuffered.txt");
				FileWriter ficheroEscritura = new FileWriter(fichero);
				BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);
				
																			//2. Escribir nombres.
				for(int i = 0; i<lista.length;i++) {
					ficheroBuffer.write(lista[i]);
					ficheroBuffer.newLine();
				}
																			//3. Cerrar fichero.
				ficheroBuffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		public static void leerFichero(String[] lista) {
			try {															//1. Crear fichero.
				File fichero = new File("ficheroNombresBuffered.txt");
				FileReader ficheroLectura = new FileReader(fichero);
				BufferedReader ficheroBuffer = new BufferedReader(ficheroLectura);
																			//2. Leer nombres con String. Cuando read devuelve null, 
																			//   se ha llegado al final del fichero.			
				String linea;
				int i = 0;
				
				linea = ficheroBuffer.readLine();
				
				while(linea != null) {
					lista[i] = linea;
					i++;
					linea = ficheroBuffer.readLine();
				}
																			//3. Cerrar fichero.
				ficheroBuffer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		public static void imprimirTabla(String[] lista) {
			System.out.println("Contenido de la tabla:");
			for(int i = 0; i < lista.length; i++) {
				System.out.println("Posición "+i+" : "+lista[i]);
			}
			
		}

}

