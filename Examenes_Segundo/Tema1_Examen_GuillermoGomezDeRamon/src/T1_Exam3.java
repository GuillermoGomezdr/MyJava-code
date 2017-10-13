import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;

public class T1_Exam3 {

	private JFrame frmViajesDam;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField precioFinal;
	private JTextField txtTitular;
	private JTextField txtNumTarjeta;
	private JTextField txtCVV;
	private JTextField txtIbanEs;
	private JTextField txtBanco;

	
	float[][] precios = {{}, {0, 30, 15}, {0, 20, 12}, {0, 50, 25}, {0, 35, 20}};
	int origen = 0, destino = 0, idaVuelta = 2;
	int descuento = 0;
	int billetes = 1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T1_Exam3 window = new T1_Exam3();
					window.frmViajesDam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public T1_Exam3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViajesDam = new JFrame();
		frmViajesDam.setTitle("VIAJES DAM");
		frmViajesDam.setResizable(false);
		frmViajesDam.setBounds(100, 100, 683, 410);
		frmViajesDam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViajesDam.getContentPane().setLayout(null);
		
		JLabel lblCaractersticasDeSu = new JLabel("Caracter\u00EDsticas de su billete de viaje:");
		lblCaractersticasDeSu.setBounds(26, 27, 220, 21);
		frmViajesDam.getContentPane().add(lblCaractersticasDeSu);
		
		JLabel lblOrigen = new JLabel("Origen:*");
		lblOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrigen.setBounds(54, 50, 52, 21);
		frmViajesDam.getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:*");
		lblDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestino.setBounds(54, 75, 52, 21);
		frmViajesDam.getContentPane().add(lblDestino);
		
		JLabel lblNDeBilletes = new JLabel("N\u00BA de billetes:");
		lblNDeBilletes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeBilletes.setBounds(22, 100, 84, 21);
		frmViajesDam.getContentPane().add(lblNDeBilletes);
		
		JLabel lblTipoDeViaje = new JLabel("Tipo de viaje:");
		lblTipoDeViaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeViaje.setBounds(24, 126, 82, 21);
		frmViajesDam.getContentPane().add(lblTipoDeViaje);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormaDePago.setBounds(10, 151, 94, 21);
		frmViajesDam.getContentPane().add(lblFormaDePago);
		
		JLabel lblDescuentos = new JLabel("Descuentos:");
		lblDescuentos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescuentos.setBounds(22, 176, 82, 21);
		frmViajesDam.getContentPane().add(lblDescuentos);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalAPagar.setBounds(22, 298, 82, 21);
		frmViajesDam.getContentPane().add(lblTotalAPagar);
		
		JComboBox cbOrigen = new JComboBox();
		cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"", "MADRID", "BARCELONA"}));
		cbOrigen.setBounds(122, 50, 136, 20);
		frmViajesDam.getContentPane().add(cbOrigen);
		
		JComboBox cbDestino = new JComboBox();
		cbDestino.setModel(new DefaultComboBoxModel(new String[] {"", "BILBAO", "ZARAGOZA"}));
		cbDestino.setBounds(122, 75, 136, 20);
		frmViajesDam.getContentPane().add(cbDestino);
		
		JRadioButton btnIdaVuelta = new JRadioButton("Ida/Vta");
		buttonGroup.add(btnIdaVuelta);
		btnIdaVuelta.setSelected(true);
		btnIdaVuelta.setBounds(120, 125, 75, 23);
		frmViajesDam.getContentPane().add(btnIdaVuelta);
		
		JRadioButton btnSoloIda = new JRadioButton("S\u00F3lo Ida");
		buttonGroup.add(btnSoloIda);
		btnSoloIda.setBounds(202, 125, 109, 23);
		frmViajesDam.getContentPane().add(btnSoloIda);
		
		JRadioButton btnTarjeta = new JRadioButton("Tarjeta");
		buttonGroup_1.add(btnTarjeta);
		btnTarjeta.setSelected(true);
		btnTarjeta.setBounds(120, 150, 75, 23);
		frmViajesDam.getContentPane().add(btnTarjeta);
		
		JRadioButton btnIban = new JRadioButton("IBAN (+5%)");
		buttonGroup_1.add(btnIban);
		btnIban.setBounds(202, 150, 109, 23);
		frmViajesDam.getContentPane().add(btnIban);
		
		JComboBox cbBilletes = new JComboBox();
		cbBilletes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		cbBilletes.setBounds(122, 100, 52, 20);
		frmViajesDam.getContentPane().add(cbBilletes);
		
		JCheckBox chFamiliaNum = new JCheckBox("Familia numerosa (-10%)");
		chFamiliaNum.setBounds(120, 175, 178, 23);
		frmViajesDam.getContentPane().add(chFamiliaNum);
		
		JCheckBox chCarneJov = new JCheckBox("Carn\u00E9 joven (-8%)");
		chCarneJov.setBounds(120, 200, 159, 23);
		frmViajesDam.getContentPane().add(chCarneJov);
		
		JCheckBox chDesempleado = new JCheckBox("Desempleado (-6%)");
		chDesempleado.setBounds(120, 225, 159, 23);
		frmViajesDam.getContentPane().add(chDesempleado);
		
		precioFinal = new JTextField();
		precioFinal.setSelectionColor(Color.BLACK);
		precioFinal.setEditable(false);
		precioFinal.setBounds(120, 298, 86, 20);
		frmViajesDam.getContentPane().add(precioFinal);
		precioFinal.setColumns(10);
		
		JLabel lbluros = new JLabel("\u20ACuros");
		lbluros.setBounds(216, 298, 82, 21);
		frmViajesDam.getContentPane().add(lbluros);
		
		JLabel lblMtodosDePago = new JLabel("M\u00E9todos de Pago:");
		lblMtodosDePago.setBounds(325, 27, 220, 21);
		frmViajesDam.getContentPane().add(lblMtodosDePago);
		
		JPanel panel_Tarjeta = new JPanel();
		panel_Tarjeta.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_Tarjeta.setBounds(325, 50, 324, 114);
		frmViajesDam.getContentPane().add(panel_Tarjeta);
		panel_Tarjeta.setLayout(null);
		
		JLabel lblCatosTarjeta = new JLabel("Datos Tarjeta:");
		lblCatosTarjeta.setBounds(10, 5, 84, 21);
		panel_Tarjeta.add(lblCatosTarjeta);
		
		JLabel lblTitular = new JLabel("Titular:*");
		lblTitular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitular.setBounds(10, 30, 63, 21);
		panel_Tarjeta.add(lblTitular);
		
		JLabel lblNTarjeta = new JLabel("N\u00BA Tarjeta:*");
		lblNTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNTarjeta.setBounds(-11, 55, 84, 21);
		panel_Tarjeta.add(lblNTarjeta);
		
		JLabel lblCvv = new JLabel("CVV:*");
		lblCvv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCvv.setBounds(10, 80, 63, 21);
		panel_Tarjeta.add(lblCvv);
		
		txtTitular = new JTextField();
		txtTitular.setBounds(83, 30, 231, 20);
		panel_Tarjeta.add(txtTitular);
		txtTitular.setColumns(10);
		
		txtNumTarjeta = new JTextField();
		txtNumTarjeta.setColumns(10);
		txtNumTarjeta.setBounds(83, 55, 173, 20);
		panel_Tarjeta.add(txtNumTarjeta);
		
		JLabel lblDigit = new JLabel("16 DIGIT");
		lblDigit.setHorizontalAlignment(SwingConstants.LEFT);
		lblDigit.setBounds(266, 55, 58, 21);
		panel_Tarjeta.add(lblDigit);
		
		txtCVV = new JTextField();
		txtCVV.setColumns(10);
		txtCVV.setBounds(83, 80, 39, 20);
		panel_Tarjeta.add(txtCVV);
		
		JLabel lblDigit_1 = new JLabel("3 DIGIT");
		lblDigit_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDigit_1.setBounds(126, 80, 58, 21);
		panel_Tarjeta.add(lblDigit_1);
		
		JComboBox cbTipoTarjeta = new JComboBox();
		cbTipoTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbTipoTarjeta.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD"}));
		cbTipoTarjeta.setBounds(210, 80, 104, 20);
		panel_Tarjeta.add(cbTipoTarjeta);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(165, 80, 42, 21);
		panel_Tarjeta.add(lblTipo);
		
		JPanel panel_IBAN = new JPanel();
		panel_IBAN.setVisible(false);
		panel_IBAN.setLayout(null);
		panel_IBAN.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_IBAN.setBounds(325, 176, 324, 87);
		frmViajesDam.getContentPane().add(panel_IBAN);
		
		JLabel lblDatosCuentaIban = new JLabel("Datos cuenta IBAN:");
		lblDatosCuentaIban.setBounds(10, 5, 128, 21);
		panel_IBAN.add(lblDatosCuentaIban);
		
		JLabel lblBanco = new JLabel("BANCO:*");
		lblBanco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBanco.setBounds(-11, 55, 84, 21);
		panel_IBAN.add(lblBanco);
		
		txtIbanEs = new JTextField();
		txtIbanEs.setColumns(10);
		txtIbanEs.setBounds(83, 30, 173, 20);
		panel_IBAN.add(txtIbanEs);
		
		txtBanco = new JTextField();
		txtBanco.setColumns(10);
		txtBanco.setBounds(83, 55, 231, 20);
		panel_IBAN.add(txtBanco);
		
		JLabel lblDigit_2 = new JLabel("22 DIGIT");
		lblDigit_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblDigit_2.setBounds(266, 30, 58, 21);
		panel_IBAN.add(lblDigit_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(325, 273, 324, 75);
		frmViajesDam.getContentPane().add(scrollPane);
		
		JTextArea txtResumen = new JTextArea();
		scrollPane.setViewportView(txtResumen);
		txtResumen.setEditable(false);
		txtResumen.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnProcederAlPago = new JButton("Proceder al pago");
		btnProcederAlPago.setBounds(17, 325, 136, 23);
		frmViajesDam.getContentPane().add(btnProcederAlPago);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(163, 325, 95, 23);
		frmViajesDam.getContentPane().add(btnSalir);
		
		JLabel lblIbanEs = new JLabel("IBAN - ES:*");
		lblIbanEs.setBounds(579, 298, 63, 21);
		frmViajesDam.getContentPane().add(lblIbanEs);
		lblIbanEs.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		// EVENTOS

		// Realizar cambio entre IBAN y Tarjeta.
		btnIban.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Tarjeta.setVisible(false);
				panel_IBAN.setVisible(true);
				
				descuento -= 5;
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		

		btnTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_IBAN.setVisible(false);
				panel_Tarjeta.setVisible(true);
				
				descuento += 5;
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));

			}
		});
		


		// Seleccionar origen y destino
		cbOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbOrigen.getSelectedItem().toString().equals("MADRID")) {
					origen = 1;
				} else if (cbOrigen.getSelectedItem().toString().equals("BARCELONA")) {
					origen = 2;
				} else 
					origen = 0;
				
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		

		cbDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbDestino.getSelectedItem().toString().equals("BILBAO")) {
					destino = 1;
				}else if (cbDestino.getSelectedItem().toString().equals("ZARAGOZA")) {
					destino = 2;
				} else
					destino = 0;
				
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		
		// Seleccionar entre ida y vuelta

		btnIdaVuelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idaVuelta = 2;
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		

		btnSoloIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idaVuelta = 0;
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		
		// Seleccionar el número de billetes
		
		cbBilletes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbBilletes.getSelectedItem().toString().equals("1")) {
					billetes = 1;
				} else if(cbBilletes.getSelectedItem().toString().equals("2")) {
					billetes = 2;
				} else if(cbBilletes.getSelectedItem().toString().equals("3")) {
					billetes = 3;
				} else if(cbBilletes.getSelectedItem().toString().equals("4")) {
					billetes = 4;
				} else
					billetes = 0;

				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		
		
		// Seleccionador de descuentos
		
		chFamiliaNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chFamiliaNum.isSelected())
					descuento += 10;
				else
					descuento -= 10;
				
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		
		chCarneJov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chCarneJov.isSelected())
					descuento += 8;
				else
					descuento -= 8;
				
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		
		chDesempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chDesempleado.isSelected())
					descuento += 6;
				else
					descuento -= 6;
				
				precioFinal.setText(String.valueOf(calcularPrecio(precios[origen+idaVuelta][destino], descuento, billetes)));
			}
		});
		
		
		// Proceder Pago
		

		btnProcederAlPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(origen == 0 || destino == 0) {
					JOptionPane.showMessageDialog(null, "Datos de viaje incompletos ", "Error de datos", JOptionPane.ERROR_MESSAGE);
				} else {
					if(btnTarjeta.isSelected()) {
						if(txtTitular.getText().length() > 0 && txtNumTarjeta.getText().length() >= 16 && txtCVV .getText().length() >= 3) {
							txtResumen.setText("RESUMEN DE SU COMPRA\nOrigen: " + cbOrigen.getSelectedItem().toString() + 
											   "\nDestino: "+ cbDestino.getSelectedItem().toString() +
											   "\nNúmero de billetes: " + billetes + 
											   "\nTotal pagado: " + precioFinal.getText().toString() + "€");
							
							txtTitular.setText("");
							txtNumTarjeta.setText("");
							txtCVV.setText("");
							
							cbOrigen.setSelectedIndex(0);
							cbDestino.setSelectedIndex(0);
							
							precioFinal.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Datos de compra incorrectos ", "Error de compra", JOptionPane.ERROR_MESSAGE);
						}
					} else if(btnIban.isSelected()) {
						if(txtIbanEs.getText().length() >= 22 && txtBanco.getText().length() > 0) {
							txtResumen.setText("RESUMEN DE SU COMPRA\nOrigen: " + cbOrigen.getSelectedItem().toString() + 
									   "\nDestino: "+ cbDestino.getSelectedItem().toString() +
									   "\nNúmero de billetes: " + billetes + 
									   "\nTotal pagado: " + precioFinal.getText().toString() + "€");
							
							txtIbanEs.setText("");
							txtBanco.setText("");
							
							cbOrigen.setSelectedIndex(0);
							cbDestino.setSelectedIndex(0);
							
							precioFinal.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Datos de compra incorrectos ", "Error de compra", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});
		
		
		// Botón de salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] opciones = {"No", "Si"};
				int numOpcion = JOptionPane.showOptionDialog(null, "¿Realmente desea salir?", 
															"Salir", 
															JOptionPane.YES_NO_CANCEL_OPTION, 
															JOptionPane.QUESTION_MESSAGE, null, 
															opciones, opciones[0]);
				if(numOpcion == 1){
					frmViajesDam.dispose();
				}		
			}
		});
		
	}
	
	// Aquí calcularemos el precio final
	public float calcularPrecio(float precioViaje, int descuento, int numBilletes) {
		System.out.println(precioViaje + "*"+ numBilletes + " - (" + precioViaje*numBilletes + "*" + descuento + "/100)");
		//return precioViaje * numBilletes - ((precioViaje*numBilletes) * descuento / 100) ;
		//float precioSinDescuento = (float) ()
		//double eurosDescontados = (precioViaje * numBilletes * descuento / 100);
		//return precioViaje * numBilletes  ;
		
		double eurosDescontados = (precioViaje * numBilletes * descuento / 100.0);
		return (float) (precioViaje * numBilletes - eurosDescontados) ;
	}
}
