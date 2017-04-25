
public class Alumno {
	int curso;
	int anioNacimiento;
	char sexo;
	
	public Alumno(int curso, int anioNacimiento, char sexo) {
		super();
		this.curso = curso;
		this.anioNacimiento = anioNacimiento;
		this.sexo = sexo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", anioNacimiento=" + anioNacimiento + ", sexo=" + sexo + "]";
	}
	
	
	
}
