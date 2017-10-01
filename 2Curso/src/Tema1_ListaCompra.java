import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Dimension;

public class Tema1_ListaCompra {

	private JFrame frmListaDeLa;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private double totalCompra = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema1_ListaCompra window = new Tema1_ListaCompra();
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tema1_ListaCompra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmListaDeLa = new JFrame();
		frmListaDeLa.setResizable(false);
		frmListaDeLa.setTitle("Lista de la compra");
		frmListaDeLa.setBounds(100, 100, 485, 227);
		frmListaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);
		
		JLabel lblIdentificacinDelUsuario = new JLabel("Identificaci\u00F3n del usuario:");
		lblIdentificacinDelUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdentificacinDelUsuario.setBounds(20, 28, 150, 14);
		frmListaDeLa.getContentPane().add(lblIdentificacinDelUsuario);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(168, 25, 92, 20);
		frmListaDeLa.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar (\u20AC):");
		lblTotalAPagar.setBounds(270, 28, 102, 14);
		frmListaDeLa.getContentPane().add(lblTotalAPagar);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(371, 25, 86, 20);
		frmListaDeLa.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(20, 58, 57, 14);
		frmListaDeLa.getContentPane().add(lblProducto);
		
		textField_2 = new JTextField();
		
		textField_2.setBounds(87, 53, 83, 20);
		frmListaDeLa.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCantidadYPrecio = new JLabel("Cantidad y precio/unidad:");
		lblCantidadYPrecio.setBounds(176, 58, 143, 14);
		frmListaDeLa.getContentPane().add(lblCantidadYPrecio);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(323, 55, 44, 20);
		frmListaDeLa.getContentPane().add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(371, 55, 86, 20);
		frmListaDeLa.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(12, 12));
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
		scrollPane.setBounds(20, 95, 246, 76);
		frmListaDeLa.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("A\u00F1adir producto creado");
		
		btnNewButton.setBounds(274, 96, 183, 23);
		frmListaDeLa.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Finalizar compra");
		
		
		btnNewButton_1.setBounds(276, 148, 181, 23);
		frmListaDeLa.getContentPane().add(btnNewButton_1);
		
		
		
		// EVENTO del JFrame cuando se inicia
		frmListaDeLa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				comboBox.setSelectedItem(null);
			}
		});
		
		
		// EVENTO DEL A�ADIR PRODUCTO
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String producto = textField_2.getText().toString();  // "PATATAS"
				String cantidad = comboBox.getSelectedItem().toString(); // "2"
				String precio = textField_3.getText().toString(); // "0.5"
				
				double cantidadD = Double.parseDouble(cantidad); // 2
				double precioD = Double.parseDouble(precio); // 0.5
				double calculo = cantidadD * precioD; // 1
				
				totalCompra += calculo;
				textField_1.setText(String.valueOf(totalCompra));
				
				textArea.setText(textArea.getText()+producto + " ("+cantidad+") "+"-->"+ calculo+"\n");
				
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedItem(null);

			}
		});
		
		// EVENTO BOTON FINALIZAR COMPRA
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frmListaDeLa,"Hasta luego, debe pagar "+totalCompra, "Gracias por su compra", JOptionPane.INFORMATION_MESSAGE );
				
			}
		});
		
	}
}