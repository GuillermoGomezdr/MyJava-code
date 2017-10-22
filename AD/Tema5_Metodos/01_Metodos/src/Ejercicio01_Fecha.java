
public class Ejercicio01_Fecha {
	
	private int dia, mes, anio;
	
	public Ejercicio01_Fecha() {
		dia = 1;
		mes = 1;
		anio = 2000;
	}
	
	
	public Ejercicio01_Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		anio = a;
	}
		
	
	// getters y setters
	public int getDia() { return dia; }
	public void setDia(int dia) { this.dia = dia; }

	public int getMes() { return mes; }
	public void setMes(int mes) { this.mes = mes; }

	public int getAnio() { return anio; }
	public void setAnio(int anio) { this.anio = anio; }


	// m�todos de esritura
	public String escribeCorto() {
		return dia + " // "+ mes + " // " + anio;
	}
	
	public String escribeLarga() {
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
						  "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		return "Hoy es d�as " + dia + " de " + meses[mes] + " del a�o " + anio + ".";
	}
	
	// m�todos espec�ficos
	public boolean correcta(int d, int m, int a) {
		boolean correcto = true;
		
		if(m > 0 && m <= 12) {
			if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if(d <= 0 && d > 31)
					correcto = false;
			} else if(m == 2) {
				if(a%4 == 0) {
					if(d <= 0 && d > 29)
						correcto = false;
				} else
					if(d <= 0 && d > 28)
						correcto = false;
			} else {
				if(d <= 0 && d > 30)
					correcto = false;
			}
		} else
			correcto = false;
		
		return correcto;
	}
}

/*
 * scroll =new JScrollPane(display);
 * scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALLWAYS);
 * nombreJPane.add(scroll);
 */