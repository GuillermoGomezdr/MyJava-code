
public class Ejercicio01_NIF {
	private int dni;
	private char letra;
	
	public Ejercicio01_NIF(char l, int d) {
		letra = l;
		dni = d;
	}
	
	// getters y setters
	public int getDni() { return dni; }
	public void setDni(int dni) { this.dni = dni; }
	
	public char getLetra() { return letra; }
	public void setLetra(char letra) { this.letra = letra;}
	
	// m�todos de escritura
	public String escribir(int num, char letra) {
		return "El NIF es: " + dni + letra + ".";
	}

	// m�todos espec�ficos
	public void calculoDeLetra() {
		char[] posiblesLetras = {'T',	'R',	'W',	'A',	'G',	'M',	'Y',	'F',	'P',	'D',	'X', 'B',
								 'N',	'J',	'Z',	'S',	'Q',	'V',	'H',	'L',	'C',	'K',	'E'};
		letra = posiblesLetras[dni%23];
	}
	
	public boolean comprobarLetra() {
		boolean comprobar = false;
		char[] posiblesLetras = {'T',	'R',	'W',	'A',	'G',	'M',	'Y',	'F',	'P',	'D',	'X', 'B',
				 'N',	'J',	'Z',	'S',	'Q',	'V',	'H',	'L',	'C',	'K',	'E'};
		if(posiblesLetras[dni%22] == letra)
			comprobar = true;
		
		return comprobar;
	}
}