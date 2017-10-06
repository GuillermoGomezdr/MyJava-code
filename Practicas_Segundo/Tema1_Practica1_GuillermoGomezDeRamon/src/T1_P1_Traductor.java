import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class T1_P1_Traductor{

	private JFrame frmTraductorDePalabras;
	private JTextField campoATraducir;
	private JTextField campoTraducido;
	private JButton btnSalir;
	private JLabel lblIdioma;

	private int idioma = 0; // 0 -> Sin elegir
							// 1 -> Inglés
							// 3 -Z Francés
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T1_P1_Traductor window = new T1_P1_Traductor();
					window.frmTraductorDePalabras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	private static String getStringFromInputStream(InputStream contenido) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(contenido));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();
	}

	/**
	 * Create the application.
	 */
	public T1_P1_Traductor() {
		initialize();
		frmTraductorDePalabras.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTraductorDePalabras = new JFrame();
		frmTraductorDePalabras.setResizable(false);
		frmTraductorDePalabras.setTitle("Traductor");
		frmTraductorDePalabras.setBounds(100, 100, 238, 277);
		frmTraductorDePalabras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraductorDePalabras.getContentPane().setLayout(null);
		
		campoATraducir = new JTextField();
		campoATraducir.setBounds(10, 36, 212, 20);
		frmTraductorDePalabras.getContentPane().add(campoATraducir);
		campoATraducir.setColumns(10);
		
		JLabel lblPalabraATraducir = new JLabel("Palabra a traducir:");
		lblPalabraATraducir.setBounds(10, 11, 149, 25);
		frmTraductorDePalabras.getContentPane().add(lblPalabraATraducir);
		
		JLabel lblPalabraTraducida = new JLabel("Palabra traducida:");
		lblPalabraTraducida.setBounds(10, 125, 149, 25);
		frmTraductorDePalabras.getContentPane().add(lblPalabraTraducida);
		
		campoTraducido = new JTextField();
		campoTraducido.setEditable(false);
		campoTraducido.setColumns(10);
		campoTraducido.setBounds(10, 150, 212, 20);
		frmTraductorDePalabras.getContentPane().add(campoTraducido);
		
		JButton btnTraducir = new JButton("Traducir");
		btnTraducir.setBounds(10, 181, 212, 23);
		frmTraductorDePalabras.getContentPane().add(btnTraducir);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(120, 215, 102, 23);
		frmTraductorDePalabras.getContentPane().add(btnSalir);
		
		lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(10, 67, 149, 25);
		frmTraductorDePalabras.getContentPane().add(lblIdioma);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Elige un idioma -", "Ingl\u00E9s", "Franc\u00E9s"}));
		comboBox.setBounds(10, 94, 212, 20);
		frmTraductorDePalabras.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Desloguear");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 215, 102, 23);
		frmTraductorDePalabras.getContentPane().add(btnNewButton);
		
		
		//EVENTOS
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				idioma = comboBox.getSelectedIndex();
			}
		});
		
		
		
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String palabra = campoATraducir.getText().toString();
				String web = "";
				URL url = null;
				InputStream contenido = null;
				
				
				try{
					if(idioma == 1)
						url = new URL("http://www.wordreference.com/es/en/translation.asp?spen="+palabra);
					else if(idioma ==2)
						url = new URL("http://www.wordreference.com/esfr/"+palabra);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				
				
				if(idioma == 1 || idioma == 2) {
					
					try {
						contenido = url.openStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					web = getStringFromInputStream(contenido);;

					String textoComun ="<td class='ToWrd' >";
					int aux = 0;
				
					web = web.substring(web.indexOf(textoComun) + textoComun.length());
					while(web.charAt(aux) != '<')
						aux++;
					web = web.substring(0, aux);

					campoTraducido.setText(web);
					
					if(campoATraducir.getText().toString().equals(""))
						campoTraducido.setText("¡No hay palabra que traducir!");
				} else 
					campoTraducido.setText("¡No has seleccionado idioma!");
			}
		});
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] opciones = {"Si", "No"};
				int numOpcion = JOptionPane.showOptionDialog(null, "¿Desea salir?", "Saliendo", 
															 JOptionPane.YES_NO_CANCEL_OPTION, 
															 JOptionPane.QUESTION_MESSAGE, null, 
															 opciones, opciones[0]);
				
				if(numOpcion == 0){
					frmTraductorDePalabras.dispose();
				}
			}
		});
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] opciones = {"Si", "No"};
				int numOpcion = JOptionPane.showOptionDialog(null, "¿Seguro que quieres desloguear?", 
															"Saliendo", 
															JOptionPane.YES_NO_CANCEL_OPTION, 
															JOptionPane.QUESTION_MESSAGE, null, 
															opciones, opciones[0]);
				if(numOpcion == 0){
					T1_P1_Login login = new T1_P1_Login();
					frmTraductorDePalabras.dispose();
				}
			}
		});
	}
}
