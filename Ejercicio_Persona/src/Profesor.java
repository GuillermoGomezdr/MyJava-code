
public class Profesor extends General {
	double sueldo;
	int aniosExperiencia;
	boolean esFijo;
	
	public Profesor(String dni, String nombre, String apellido1, String apellido2, double sueldo, int aniosExperiencia,
			boolean esFijo) {
		super(dni, nombre, apellido1, apellido2);
		this.sueldo = sueldo;
		this.aniosExperiencia = aniosExperiencia;
		this.esFijo = esFijo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public boolean isEsFijo() {
		return esFijo;
	}

	public void setEsFijo(boolean esFijo) {
		this.esFijo = esFijo;
	}

	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", aniosExperiencia=" + aniosExperiencia + ", esFijo=" + esFijo + "]";
	}
	
	
}
