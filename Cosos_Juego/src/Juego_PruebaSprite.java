import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class Juego_PruebaSprite {
	
	
	// Creo un JFrame de prueba.
	static JFrame frame = new JFrame();
	static JLabel PJlabel = new JLabel("");
	private JTextField textField;
	
	public static void main(String[] args) {
     	
		
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		int pjx = 0;
		int pjy = 0;
		
		// Creo un JLaber.
		// A este JLaber le metemos un Icon, con la ruta de la imagen, 
		// posteriormente, le daremos unas coordenadas y tamaño.
		// Por último, añadirmos el JLaber a nuestro JFrame.
		
		
		PJlabel.setIcon(new ImageIcon( "/home/student/ggomez/eclipse/Cosos_Juego/src/Aragorn.png"));
		PJlabel.setBounds(pjx, pjy, 100, 100);
		frame.getContentPane().add(PJlabel);
		
		double contador = 0;
		int newPjx = pjx +100;
		while(pjx != newPjx){
			contador+=0.05;
			if(contador > 40000){
				PJlabel.setBounds(pjx, pjy, 100, 100);
				pjx++;
				contador = 0;
			}
		}		
		
	}

	//
	
	public class EscucharTeclas extends JFrame implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {}
		 
		@Override
		public void keyReleased(KeyEvent e) {}
		 
		@Override
		public void keyTyped(KeyEvent e) {}
	}
	
	/*public void PruebaEvento() {
			//textField.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
	    		actualiza(e.getKeyCode(), true);
	    		System.out.println("PATATA");
			}
	
			public void keyReleased(KeyEvent e) {
	    		actualiza(e.getKeyCode(), false);
			}

			private void actualiza(int keyCode, boolean pressed) {
	    		switch (keyCode) {
	        		case KeyEvent.VK_RIGHT:
	        			System.out.println("PATATA");
	        		break;
	    		}
			}
		});
	}
	//*/
	
}


//Notas:
//http://franvarvil.blogspot.com.es/2013/07/keylistener-programacion-java.html

	



            