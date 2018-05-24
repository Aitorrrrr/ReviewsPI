package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import controlador.Controlador;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;

public class CrearReview extends JFrame {

	private JPanel contentPane;
	private JPanel panelTitulo;
	private JPanel panelDatos;
	private JLabel lblCreacinReview;
	private JLabel lblTitulo;
	private JTextField textField;
	private JLabel lblSinopsis;
	private JTextArea txtrAreasinopsis;
	private JLabel lblTipo;
	private JLabel lblDirector;
	private JLabel lblDuracin;
	private JLabel lblProductora;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnCrearReview;
	private JButton btnReestablecer;

	public CrearReview(Controlador c1) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panelTitulo = new JPanel();
		panelTitulo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel PanelArriba = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(PanelArriba, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(PanelArriba, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
		);
		
		panelTitulo = new JPanel();
		
		panelDatos = new JPanel();
		GroupLayout gl_PanelArriba = new GroupLayout(PanelArriba);
		gl_PanelArriba.setHorizontalGroup(
			gl_PanelArriba.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_PanelArriba.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PanelArriba.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelDatos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
						.addComponent(panelTitulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_PanelArriba.setVerticalGroup(
			gl_PanelArriba.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelArriba.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelDatos, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		lblTitulo = new JLabel("Titulo: ");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtrAreasinopsis = new JTextArea();
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox comboBox = new JComboBox();
		
		lblDirector = new JLabel("Director: ");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblDuracin = new JLabel("Duraci\u00F3n: ");
		lblDuracin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblProductora = new JLabel("Productora: ");
		lblProductora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		
		btnCrearReview = new JButton("Crear Review");
		
		btnReestablecer = new JButton("Reestablecer");
		GroupLayout gl_panelDatos = new GroupLayout(panelDatos);
		gl_panelDatos.setHorizontalGroup(
			gl_panelDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addComponent(txtrAreasinopsis, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelDatos.createSequentialGroup()
									.addComponent(lblTitulo)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblSinopsis))
							.addContainerGap(99, Short.MAX_VALUE))
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addComponent(lblTipo)
							.addContainerGap(352, Short.MAX_VALUE))
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addComponent(lblDirector)
							.addContainerGap(317, Short.MAX_VALUE))
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addGroup(gl_panelDatos.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_panelDatos.createSequentialGroup()
									.addComponent(lblProductora)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1))
								.addGroup(Alignment.LEADING, gl_panelDatos.createSequentialGroup()
									.addComponent(lblDuracin)
									.addGap(18)
									.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2))))
							.addContainerGap())
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addComponent(btnCrearReview)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReestablecer)
							.addContainerGap())))
		);
		gl_panelDatos.setVerticalGroup(
			gl_panelDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitulo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSinopsis)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrAreasinopsis, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTipo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDirector)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDuracin)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProductora)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReestablecer)
						.addComponent(btnCrearReview))
					.addGap(32))
		);
		panelDatos.setLayout(gl_panelDatos);
		panelTitulo.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblCreacinReview = new JLabel("Creaci\u00F3n Review");
		lblCreacinReview.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreacinReview.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelTitulo.add(lblCreacinReview);
		PanelArriba.setLayout(gl_PanelArriba);
		contentPane.setLayout(gl_contentPane);
		
		txtrAreasinopsis.setLineWrap(true);
		
		comboBox.addItem("Pelicula");
		comboBox.addItem("Serie");
	}
}
