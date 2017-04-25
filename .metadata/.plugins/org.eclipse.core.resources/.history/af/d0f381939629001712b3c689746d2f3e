//05.04.2017
public class Coche {

	//1. Añadir los atributos de la clase
	String matricula;
	String marca;
	String modelo;
	String color;
	double precio;
	int cilindrada;
	double peso;
	char combustible;
	boolean itv;
	int plazas;
	
	//2. Método/s constructor/es
	public Coche(String matricula, String marca, String modelo, String color, double precio, int cilindrada,
			double peso, char combustible, boolean itv, int plazas) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cilindrada = cilindrada;
		this.peso = peso;
		this.combustible = combustible;
		this.itv = itv;
		this.plazas = plazas;
	}

	
	//3. Crear los métodos GET y SET
	// GET nos devuelve el valor de un atributo
	// Set nos cambia el valor de un atributo
		
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//4. Crear método toString
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" +
				marca + ", modelo=" + modelo + ", color=" + color
				+ ", precio=" + precio + ", cilindrada=" + cilindrada +
				", peso=" + peso + ", combustible="+ combustible +
				", itv=" + itv + ", plazas=" + plazas + "]";
	}

	//5. Creación manual de métodos
	// Método que añade un 21% de IVA al precio del coche.
	
	public double precioConIVA(){
		return precio*1.21;
	}
	

}
