
public class Empleado extends General {
	double sueldo;
	char categoria;  // l -> limpieza \ a -> admin \ d -> directivo
	
	public Empleado(String dni, String nombre, String apellido1, String apellido2, double sueldo, char categoria) {
		super(dni, nombre, apellido1, apellido2);
		this.sueldo = sueldo;
		this.categoria = categoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", categoria=" + categoria + "]";
	}
	
	
}
