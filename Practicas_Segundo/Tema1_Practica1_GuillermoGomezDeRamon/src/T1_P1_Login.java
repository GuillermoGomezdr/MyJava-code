import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class T1_P1_Login {

	private JFrame frmLogin;
	private JTextField textUser;
	private JLabel lblContraseo;
	private JPasswordField textPassw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T1_P1_Login window = new T1_P1_Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public T1_P1_Login() {
		initialize();
		frmLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 272, 193);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(10, 11, 145, 20);
		frmLogin.getContentPane().add(lblNewLabel);
		
		textUser = new JTextField();
		textUser.setBounds(10, 37, 244, 20);
		frmLogin.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		lblContraseo = new JLabel("Contrase\u00F1a:");
		lblContraseo.setBounds(10, 68, 145, 20);
		frmLogin.getContentPane().add(lblContraseo);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(10, 131, 117, 23);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setBounds(137, 131, 117, 23);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		textPassw = new JPasswordField();
		textPassw.setBounds(10, 94, 244, 20);
		frmLogin.getContentPane().add(textPassw);
		
		// EVENTOS
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textUser.getText().length() > 0 &&  textUser.getText().equals(textPassw.getText()) ){
					T1_P1_Traductor registro = new T1_P1_Traductor();
					frmLogin.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Error al loguear. Vuelve a intentarlo.",
												  "Error de logueo", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T1_P1_Registro registro = new T1_P1_Registro();
				frmLogin.dispose();
			}
		});
	}
}
