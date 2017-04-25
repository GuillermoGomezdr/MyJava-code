//05.04.2017
public class Coche extends Vehiculo {

	//1. Añadir los atributos de la clase

	String color;
	double precio;
	double peso;
	char combustible;
	int plazas;
	
	public Coche(String matricula, String marca, String modelo, int cilindrada, boolean itv, String color,
			double precio, double peso, char combustible, int plazas) {
		super(matricula, marca, modelo, cilindrada, itv);
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.combustible = combustible;
		this.plazas = plazas;
	}

	
}
