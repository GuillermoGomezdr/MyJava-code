import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import javax.swing.JPasswordField;

public class T1_P1_Registro {

	private JFrame frmRegistro;
	private JTextField textNombre;
	private JLabel lblContrasea;
	private JLabel lblNacionalidad;
	private JTextField textCorreo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField textPass;

	
	public T1_P1_Registro() {
		initialize();
		frmRegistro.setVisible(true);
	}


	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setResizable(false);
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 333, 456);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		JLabel lblPatata = new JLabel("Nombre de usuario*:");
		lblPatata.setBounds(10, 11, 164, 19);
		frmRegistro.getContentPane().add(lblPatata);
		
		textNombre = new JTextField();
		textNombre.setBounds(132, 11, 185, 20);
		frmRegistro.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a*:");
		lblContrasea.setBounds(10, 36, 164, 19);
		frmRegistro.getContentPane().add(lblContrasea);
		
		lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(10, 91, 164, 19);
		frmRegistro.getContentPane().add(lblNacionalidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Selecciona una -", "Espa\u00F1ola", "Inglesa", "Francesa", "Otra"}));
		comboBox.setBounds(132, 91, 185, 20);
		frmRegistro.getContentPane().add(comboBox);
		
		JCheckBox aceptarT = new JCheckBox("* Admito haber le\u00EDdo y aceptado las normas.");
		aceptarT.setBounds(6, 364, 311, 23);
		frmRegistro.getContentPane().add(aceptarT);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(10, 395, 147, 23);
		frmRegistro.getContentPane().add(btnRegistrarse);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico*:");
		lblCorreoElectrnico.setBounds(10, 61, 164, 19);
		frmRegistro.getContentPane().add(lblCorreoElectrnico);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(132, 61, 185, 20);
		frmRegistro.getContentPane().add(textCorreo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(170, 394, 147, 23);
		frmRegistro.getContentPane().add(btnCancelar);
		
		JLabel lblRangoDeEdad = new JLabel("Rango de edad*:");
		lblRangoDeEdad.setBounds(10, 121, 164, 19);
		frmRegistro.getContentPane().add(lblRangoDeEdad);
		
		JRadioButton rdbtnMenorDe = new JRadioButton("Menor de 18");
		buttonGroup.add(rdbtnMenorDe);
		rdbtnMenorDe.setBounds(132, 119, 109, 23);
		frmRegistro.getContentPane().add(rdbtnMenorDe);
		
		JRadioButton rdbtnEntreY = new JRadioButton("Entre 18 y 30");
		rdbtnEntreY.setSelected(true);
		buttonGroup.add(rdbtnEntreY);
		rdbtnEntreY.setBounds(132, 141, 109, 23);
		frmRegistro.getContentPane().add(rdbtnEntreY);
		
		JRadioButton rdbtnMayorDe = new JRadioButton("Mayor de 30");
		buttonGroup.add(rdbtnMayorDe);
		rdbtnMayorDe.setBounds(132, 163, 109, 23);
		frmRegistro.getContentPane().add(rdbtnMayorDe);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(133, 200, 184, 153);
		frmRegistro.getContentPane().add(calendar);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(6, 200, 164, 19);
		frmRegistro.getContentPane().add(lblFechaDeNacimiento);
		
		textPass = new JPasswordField();
		textPass.setBounds(132, 35, 185, 20);
		frmRegistro.getContentPane().add(textPass);
		
		
		// EVENTOS
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T1_P1_Login login = new T1_P1_Login();
				frmRegistro.dispose();
			}
		});
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textNombre.getText().length() > 0 && textPass.getText().length() > 0 && 
				   textCorreo.getText().length() > 0 && aceptarT.isSelected()){
					T1_P1_Traductor traductor = new T1_P1_Traductor();
					frmRegistro.dispose();
				} else {
					JOptionPane.showMessageDialog(null, 
					"Error al registrarse. Asegurese de que todos los campos marcados con * est�n correctamente rellenados. ",
					"Error de registro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
}
