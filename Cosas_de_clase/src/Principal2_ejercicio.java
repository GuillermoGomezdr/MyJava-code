
public class Principal2_ejercicio {

	public static void main(String[] args) {
		Moto vespa = new Moto("1234POP", "vespa", "vespa946", 124, true, 1946,
					 false, false, 2, 9.8, 't');
		Moto cocoTaxi = new Moto("7835MAP", "cocoTaxi", "cocoTaxiv285", 150, true,
				1996, true, true, 3, 12.34, 'u');
		Moto motoBMW = new Moto("6991BMW", "BMW", "BMW R nineT 2014", 1170, true,
				2014, true, false, 2, 17.45, 'c');
		
		cocoTaxi.setAnio(1995);
		System.out.println("El año del coco taxi es "+cocoTaxi.getAnio());
		
		System.out.println(vespa.toString());
	
		System.out.println("La vespa "+vespa.PuedeIrPorCarretera()+" puede ir por carretera");
		System.out.println("El coco taxi "+cocoTaxi.PuedeIrPorCarretera()+" puede ir por carretera");
	}
}
