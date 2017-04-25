
public class Principal {

	public static void main(String[] args) {
		//Creando objetos de la clase Coche
		//NombreClase nombreObjeto = new nombreClase (loquesea);

		Coche cocheJoseM = new Coche("4279DHD", "Audi", "A3", 
							"Negro", 3999.99, 1900, 1200, 'd', true, 5);
		
		Coche cochePatata = new Coche("0276XYZ", "Patatamovil", "PA1A1A", 
				"Amarillo", 9999.99, 1234, 500, 'd', true, 2);
		
		Coche batmovil = new Coche("8888BAT", "Batmovil", "BAT", 
				"Negro", 999999.99, 3000, 1600, 'b', true, 1);
		
		Coche supercoche = new Coche("1000SUP", "Citroen", "B1", 
				"Cyan", 999.99, 1000, 100, 'd', false, 4);
		
		//Podemos ver el valor con un System.out.println
		//Dentro de los paréntesis, el nombre de lo que queramos, ejm: cochePatata
		//Seguido de un punto, y el getter o el setter.
		System.out.println(cochePatata.getColor());
		System.out.println(batmovil.getModelo());
		
		//Para cambiar el valor, usaremos un setter.
		supercoche.setColor("Azul claro");
		System.out.println("El color del supercoche es "+supercoche.getColor());
	
		//Para imprimir todos los valores:
		System.out.println(cochePatata.toString());
		
		//Patata, caso 5
		System.out.println("El precio con IVA será de "+cochePatata.precioConIVA());
	}

}
