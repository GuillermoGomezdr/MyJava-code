package miniSudoku;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ButtonGroup;

public class T1_P2_Principal {

	private JFrame frmMinisudoku;
	private JPanel panel;
	private JPanel panel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton btnResolverAutomtico;
	private JButton btnComprobarSudoku;
	private JRadioButton rdbtnNoRedimensionable;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnReiniciar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Sudoku prueba = new Sudoku();
		
		boolean solved = prueba.solve(new Cell(0, 0));
		if (!solved) {
			System.out.println("SUDOKU cannot be solved.");
			return;
		}
		
		System.out.println("SOLUTION\n");
		
		printGrid(prueba.getGrid());
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T1_P2_Principal window = new T1_P2_Principal();
					window.frmMinisudoku.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public T1_P2_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinisudoku = new JFrame();
		frmMinisudoku.setTitle("MiniSudoku");
		frmMinisudoku.setBounds(100, 100, 300, 300);
		frmMinisudoku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinisudoku.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 50));
		frmMinisudoku.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		btnComprobarSudoku = new JButton("Comprobar");
		btnComprobarSudoku.setBounds(142, 0, 142, 25);
		btnComprobarSudoku.setPreferredSize(new Dimension(100, 25));
		panel.add(btnComprobarSudoku);
		
		btnResolverAutomtico = new JButton("Resolver auto");
		btnResolverAutomtico.setBounds(0, 0, 142, 25);
		panel.add(btnResolverAutomtico);
		btnResolverAutomtico.setPreferredSize(new Dimension(142, 25));
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setPreferredSize(new Dimension(147, 25));
		btnReiniciar.setBounds(0, 25, 142, 25);
		panel.add(btnReiniciar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setPreferredSize(new Dimension(100, 25));
		btnSalir.setBounds(142, 25, 142, 25);
		panel.add(btnSalir);
		
		
		
		panel_1 = new JPanel();
		frmMinisudoku.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setText("2");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 11, 30, 30);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(40, 11, 30, 30);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 41, 30, 30);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("3");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(40, 41, 30, 30);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(80, 11, 30, 30);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(110, 11, 30, 30);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(80, 41, 30, 30);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("4");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(110, 41, 30, 30);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("3");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(10, 81, 30, 30);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("4");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(10, 111, 30, 30);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(40, 111, 30, 30);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		textField_11.setBounds(40, 81, 30, 30);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(80, 81, 30, 30);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("1");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(110, 81, 30, 30);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		textField_14.setBounds(110, 111, 30, 30);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("3");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(80, 111, 30, 30);
		panel_1.add(textField_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(143, 10));
		frmMinisudoku.getContentPane().add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(null);
		
		JCheckBox chckbxSombreado = new JCheckBox("Sombreado");
		chckbxSombreado.setBounds(5, 5, 139, 23);
		chckbxSombreado.setSelected(true);
		panel_2.add(chckbxSombreado);
		
		JRadioButton rdbtnRedimensionable = new JRadioButton("Redimensionable");
		rdbtnRedimensionable.setSelected(true);
		buttonGroup.add(rdbtnRedimensionable);
		rdbtnRedimensionable.setBounds(5, 31, 139, 23);
		panel_2.add(rdbtnRedimensionable);
		
		rdbtnNoRedimensionable = new JRadioButton("No redimensionable");
		buttonGroup.add(rdbtnNoRedimensionable);
		rdbtnNoRedimensionable.setBounds(5, 57, 139, 23);
		panel_2.add(rdbtnNoRedimensionable);
		
		// Agrupamos
		
		JTextField[][] allFields= {{textField, textField_1, textField_4, textField_5},
				   {textField_2, textField_3,textField_6, textField_7}, 
				   {textField_8, textField_11, textField_12, textField_13},
				   {textField_9,textField_10, textField_15, textField_14}};
		JTextField[] preSeleccionados = {textField, textField_3, textField_7, textField_8, 
										 textField_9, textField_13, textField_15};
		JTextField[] preVacios = {textField_1, textField_4, textField_5, textField_2, textField_6,  
								  textField_10, textField_11, textField_12,textField_14};
		// EVENTOS
				btnResolverAutomtico.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Sudoku miniSudoku = new Sudoku();

						for(int i = 0; i < 4; i++) {
							for(int o = 0; o < 4; o++) {
								allFields[i][o].setText(String.valueOf(miniSudoku.grid[i][o]));
								allFields[i][o].setEditable(false);
							}
						}
					}
				});

		btnComprobarSudoku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sudoku miniSudoku = new Sudoku();
				
				for(int i = 0; i < 4; i++) {
					for(int o = 0; o < 4; o++) {
						if(!allFields[i][o].getText().equals(String.valueOf(miniSudoku.grid[i][o]))) {
						//if(allFields[i][o].getText() != (String.valueOf(miniSudoku.grid[i][o]))){
							JOptionPane.showMessageDialog(null, 
								"El resultado del Sudoku es erróneo.",
								"Corrección", JOptionPane.ERROR_MESSAGE);
							System.out.println("Linea:"+i+" // Columna:"+o+"// Num Introducido: "+ allFields[i][o].getText() + " // Num Real: " + (String.valueOf(miniSudoku.grid[i][o])));
							return;
						}
					}
				}
				
				JOptionPane.showMessageDialog(null, 
						"Enhorabuena, has completado el sudoku con éxito.",
						"Corrección", JOptionPane.INFORMATION_MESSAGE);
					return;
			}
		});
		
		

		chckbxSombreado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSombreado.isSelected()) {
					for(int i = 0; i < preSeleccionados.length; i++) {
						preSeleccionados[i].setBackground(new Color (240,240,240));
					}
				}else {
					for(int i = 0; i < 4; i++) {
						for(int o = 0; o < 4; o++) {
							allFields[i][o].setBackground(Color.WHITE);
						}
					}
				}
			}
		});
		

		rdbtnRedimensionable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnRedimensionable.isSelected()) {
					frmMinisudoku.setResizable(true);
				}
			}
		});
		

		rdbtnNoRedimensionable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNoRedimensionable.isSelected()) {
					frmMinisudoku.setResizable(false);
				}
			}
		});
		

		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < preVacios.length; i++) {
					preVacios[i].setText(" ");
					preVacios[i].setEditable(true);
				}
			}
		});

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMinisudoku.dispose();
			}
		});
		
	}

	// utility to print the grid
		static void printGrid(int grid[][]) {
			for (int row = 0; row < Sudoku.getN(); row++) {
				for (int col = 0; col < Sudoku.getN(); col++)
					System.out.print(grid[row][col]);
				System.out.println();
			}
		}
}
