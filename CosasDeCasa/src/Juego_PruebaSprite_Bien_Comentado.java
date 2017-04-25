import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Juego_PruebaSprite_Bien_Comentado{
	
	static JFrame window = new JFrame();					// Creo un JFrame de prueba.
	static JLabel PJlabel = new JLabel("");					// Creo un JLaber.
	static boolean movRight = false;						// Creamos una variable booleana para cada tipo de movimiento,
	static boolean movLeft = false;							// y las inicializamos como false.
	static boolean movUp = false;
	static boolean movDown = false;
	
	public static void main (String[] args) {
     	
		
		window.setBounds(100, 100, 1000, 1000);						// Damos unas propiedades b�sicas al JFrame.
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		window.setVisible(true);
		
		
		int pjx = 0;										// Declaramos variables para las coordenadas de X e Y que se usar� el Pj.
		int pjy = 0;

		PJlabel.setIcon(new ImageIcon( ".//Juego_CajonDeSastre//Pj_Estados//Frente_Iddle.png"));			// A este JLaber le metemos un Icon, con la ruta de la imagen, 
		PJlabel.setBounds(pjx, pjy, 100, 100);											// posteriormente, le daremos unas coordenadas y tama�o.
		window.getContentPane().add(PJlabel);											// Por �ltimo, a�adirmos el JLaber a nuestro JFrame.
		
		window.addKeyListener(new KeyListener() {			// A�adimos un KeyListener para detectar los eventos del telcado (pulsar teclas)

			@Override
			public void keyPressed(KeyEvent e) {			// Cuando se pulsa una tecla...
				switch (e.getKeyCode()) {
			    	case KeyEvent.VK_D:						// ...Y esa tecla es la  D,
			    		movRight = true;					// ponemos a true el movimiento hacia la derecha.
			    	break;
			    	case KeyEvent.VK_A:						// ... Y esa tecla es la A,
			    		movLeft = true;						// ponemos a true el movimiento hacia la izquierda.
			    	break;
			    	case KeyEvent.VK_W:						// ... Y esa tecla es la W,
			    		movUp = true;						// ponemos a true el movimiento hacia arriba.
			    	break;
			    	case KeyEvent.VK_S:						// ... Y esa tecla es la S,
			    		movDown = true;						// ponemos a true el movimiento hacia abajo.
			    	break;
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {}			// Esto detectar� cuando la tecla se deja de presionar.
			@Override
			public void keyTyped(KeyEvent e) {}				// Esto detectar� cuando una serie de teclas especiales es pulsada.
															// Tanto en Released como el Typed es obligado ponerlos al usar un KeyListener,
		});													// se le de o no uso. Si se quita, dar� un error.
		
															// (Lo que se hace a continuaci�n, no se realiza en el keyPressed porque var�a su comportamiento)
		while(true){										// Durante el resto del programa, ejecutaremos un bucle infinito. 
			
			System.out.println(movRight+"//"+movLeft+"//"+movUp+"//"+movDown);		// Sin esto, no funciona el bucle. Muy raro. Buscar motivo.
			pjx = Movimiento(movRight, 'x', 100, pjx, pjy);					// Comprobaremos mediante una funci�n si un movimiento se ha puesto a true... 
			pjx = Movimiento(movLeft, 'x', -100, pjx, pjy);					// ... la funci�n ejecutar� el movimiento, y devolver� la posici�n actual ...
			pjy = Movimiento(movUp, 'y', -100, pjy, pjx);					// ... del personaje.
			pjy = Movimiento(movDown, 'y', 100, pjy, pjx);
			movRight = false;												// Ponemos todos las variables de movimiento a false.
			movLeft = false;
			movUp = false;
			movDown = false;
			
		}
	}
	
	// Par�metros a pasar en la funci�n:
	//		boolean direccion -> La variable booleana de movimiento, si se pasa a true, pasar�n cosas (explicado m�s adelante).
	//		char eje -> Nos dir� si el movimiento se realiza en el eje x o y.
	//		int recorrido -> La distancia que recorrer� el personaje y sobretodo lo importante, si lo hace en direcci�n positiva o negativa.
	//		int CoordCamb e int CoordStatic -> Pasamos la coordenada que cambiar� y la que se mantendr� est�tica.
	
	public static int Movimiento(boolean direccion, char eje, int recorrido, int CoordCamb, int CoordStatic){
		double contador = 0;														//Crearemos una variable que nos servir� de contador.
		if(direccion == true){														//Si una variable de movimiento es true, haremos:
			int newCoord = CoordCamb + recorrido;										//1. Calcularemos la coordenada final.
			while(CoordCamb != newCoord){												//2. Siempre que la coordenada actual, sea distinta que la final...
				contador+=0.05;															//3. ... Incrementa el contador en 0.05 (valor arbitrario para controlar la velocidad de movimiento)
				if(contador > 100000){													//4. ... Si contador es mayor que loquesea (valor arbitrario para controlar la velocidad de movimiento)
					if(eje == 'x')														//5. ... Comprobamos is nos movemos en X o en Y , y nos movemos.
						PJlabel.setBounds(CoordCamb, CoordStatic, 100, 100);			
					else if(eje == 'y')
						PJlabel.setBounds(CoordStatic, CoordCamb, 100, 100);
					if(recorrido > 0)													//6. ... Comprobamos si vamos hacia un valor positivo y negativo,		
						CoordCamb++;													// y incrementamos (o disminuimos) la coordenada en la que se mueve el Pj.
					else
						CoordCamb--;
					contador = 0;														//7. Reseteamos el contador.
				}
			}
		}
		return CoordCamb;																//8. Una vez acabado todo, devolvemos la posici�n actual del Pj.
	}

}


	



            