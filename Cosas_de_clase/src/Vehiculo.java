//1. Creamos la clase Padre
public class Vehiculo {
	
	//Atributos
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected int cilindrada;
	protected boolean itv;
	
	//Constructor
	public Vehiculo(String matricula, String marca, String modelo, int cilindrada, boolean itv) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.itv = itv;
	}

	// Getters y Setters
	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected int getCilindrada() {
		return cilindrada;
	}

	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	protected boolean isItv() {
		return itv;
	}

	protected void setItv(boolean itv) {
		this.itv = itv;
	}

	//toString
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + ", itv=" + itv + "]";
	}
	
	
	
	
}
