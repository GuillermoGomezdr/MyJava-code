//19.04.2017
public class Moto {
	String matricula;
	String marca;
	String modelo;
	int cilindrada;
	boolean itv;
	int anio;
	boolean proteccion;
	boolean pata;
	int ruedas;
	double capacidadDeposito;
	//En tipo -> 'u' = urbano / 'c' = carretera / 't' = todo
	char tipo;
	
	public Moto(String matricula, String marca, String modelo, int cilindrada, 
			boolean itv, int anio, boolean proteccion, boolean pata, int ruedas, 
			double capacidadDeposito, char tipo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.itv = itv;
		this.anio = anio;
		this.proteccion = proteccion;
		this.pata = pata;
		this.ruedas = ruedas;
		this.capacidadDeposito = capacidadDeposito;
		this.tipo = tipo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}


	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", itv=" + itv + ", anio=" + anio + ", proteccion=" + proteccion + ", pata=" + pata + ", ruedas="
				+ ruedas + ", capacidadDeposito=" + capacidadDeposito + ", tipo=" + tipo + "]";
	}
	
	public String PuedeIrPorCarretera(){
		if(tipo == 'c' || tipo == 't')
			return "Si";
		else
			return "No";
		
	}
	
	
	
}
