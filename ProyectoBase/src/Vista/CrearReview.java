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
import javax.swing.JOptionPane;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CrearReview extends JFrame {

	private JPanel contentPane;
	private JPanel panelTitulo;
	private JPanel panelDatos;
	private JLabel lblCreacinReview;
	private JLabel lblTitulo;
	private JTextField textTitulo;
	private JLabel lblSinopsis;
	private JTextArea txtSinopsis;
	private JLabel lblTipo;
	private JLabel lblDirector;
	private JLabel lblDuracin;
	private JLabel lblProductora;
	private JTextField textProduc;
	private JTextField textDuracion;
	private JTextField textDirector;
	private JButton btnCrearReview;
	private JButton btnReestablecer;
	private JComboBox comboGenero;
	private JLabel lblGnero;

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
		
		textTitulo = new JTextField();
		textTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTitulo.setColumns(10);
		
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtSinopsis = new JTextArea();
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.addItem("");
		comboTipo.addItem("Pelicula");
		comboTipo.addItem("Serie");
		comboTipo.setSelectedItem("");
		
		comboTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboTipo.getSelectedItem().toString().compareTo("Pelicula")==0)
				{
					lblDirector.setText("Director: ");
					
					textDirector.setVisible(true);
					textDuracion.setVisible(true);
					textProduc.setVisible(true);
					comboGenero.setVisible(true);
					
					lblDirector.setVisible(true);
					lblDuracin.setVisible(true);
					lblProductora.setVisible(true);
					lblGnero.setVisible(true);
				}
				else
				{
					if (comboTipo.getSelectedItem().toString().compareTo("Serie")==0)
					{
						lblDirector.setText("Temporadas: ");
						lblDuracin.setText("Duración: ");
						lblProductora.setText("Productora: ");
						
						textDirector.setVisible(true);
						textDuracion.setVisible(true);
						textProduc.setVisible(true);
						comboGenero.setVisible(true);
						
						lblDirector.setVisible(true);
						lblDuracin.setVisible(true);
						lblProductora.setVisible(true);
						lblGnero.setVisible(true);
					}
					else
					{
						textDirector.setVisible(false);
						textDuracion.setVisible(false);
						textProduc.setVisible(false);
						comboGenero.setVisible(false);
						
						lblDirector.setVisible(false);
						lblDuracin.setVisible(false);
						lblProductora.setVisible(false);
						lblGnero.setVisible(false);
					}
				}
			}
		});
		
		lblDirector = new JLabel("Director: ");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblDuracin = new JLabel("Duraci\u00F3n: ");
		lblDuracin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblProductora = new JLabel("Productora: ");
		lblProductora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textProduc = new JTextField();
		textProduc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textProduc.setColumns(10);
		
		textDuracion = new JTextField();
		textDuracion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDuracion.setColumns(10);
		
		textDirector = new JTextField();
		textDirector.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDirector.setColumns(10);
		
		btnCrearReview = new JButton("Crear Review");
		btnCrearReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (camposRellenados(textTitulo.getText(), txtSinopsis.getText(), textDirector.getText(), textDuracion.getText(), textProduc.getText(), comboGenero.getSelectedItem().toString()))
				{
					if (comboTipo.getSelectedItem().toString().compareTo("Pelicula")==0)
					{
						if (comprobarDuracion(textDuracion.getText()))
						{
							int duracion=Integer.parseInt(textDuracion.getText());
							
							if (c1.insertarPelicula(textTitulo.getText(), txtSinopsis.getText(), textDirector.getText(), textProduc.getText(), duracion, c1.buscarGenero(comboGenero.getSelectedItem().toString())))
							{
								JOptionPane.showMessageDialog(CrearReview.this, "Película insertada con éxito");
							}
							else
							{
								JOptionPane.showMessageDialog(CrearReview.this, "Ha habido un error en la inserción, inténtelo de nuevo");
							}
						}
						else
						{
							JOptionPane.showMessageDialog(CrearReview.this, "El campo duración debe ser un número");
						}
					}
					
					if (comboTipo.getSelectedItem().toString().compareTo("Serie")==0)
					{
						if (comprobarDuracion(textDuracion.getText()) && comprobarTemporadas(textDirector.getText()))
						{
							int temporadas=Integer.parseInt(textDirector.getText());
							int duracion=Integer.parseInt(textDuracion.getText());
							
							if (c1.insertarSerie(textTitulo.getText(), txtSinopsis.getText(), temporadas, duracion, textProduc.getText(), c1.buscarGenero(comboGenero.getSelectedItem().toString())))
							{
								JOptionPane.showMessageDialog(CrearReview.this, "Serie insertada con éxito");
							}
							else
							{
								JOptionPane.showMessageDialog(CrearReview.this, "Ha habido un error en la inserción, inténtelo de nuevo");
							}
						}
						else
						{
							JOptionPane.showMessageDialog(CrearReview.this, "Los campos temporadas y duración deben ser un número");
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(CrearReview.this, "Rellene todos los campos");
				}
			}
		});
		
		btnReestablecer = new JButton("Reestablecer");
		btnReestablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textTitulo.setText(null);
				txtSinopsis.setText(null);
				comboTipo.setSelectedItem("");
				textDirector.setText(null);
				textDuracion.setText(null);
				textProduc.setText(null);
				comboGenero.setSelectedItem(null);
			}
		});
		
		lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		comboGenero = new JComboBox();
		comboGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaBusqueda pb1=new PantallaBusqueda(c1);
				pb1.setVisible(true);
				
				CrearReview.this.dispose();
			}
		});
		GroupLayout gl_panelDatos = new GroupLayout(panelDatos);
		gl_panelDatos.setHorizontalGroup(
			gl_panelDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
						.addComponent(txtSinopsis)
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelDatos.createSequentialGroup()
									.addComponent(lblTitulo)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblSinopsis))
							.addContainerGap(208, Short.MAX_VALUE))
						.addGroup(gl_panelDatos.createSequentialGroup()
							.addComponent(btnCrearReview)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReestablecer)
							.addGap(73)
							.addComponent(btnVolver)
							.addGap(24))
						.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
							.addComponent(comboTipo, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTipo)
							.addComponent(lblDirector)
							.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGnero)
								.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panelDatos.createSequentialGroup()
										.addComponent(lblDuracin)
										.addGap(18)
										.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
											.addComponent(textDirector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textDuracion)))
									.addGroup(gl_panelDatos.createSequentialGroup()
										.addComponent(lblProductora)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
											.addComponent(comboGenero, 0, 146, Short.MAX_VALUE)
											.addComponent(textProduc))))))))
		);
		gl_panelDatos.setVerticalGroup(
			gl_panelDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitulo)
						.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSinopsis)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSinopsis, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTipo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDirector)
						.addComponent(textDirector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDuracin)
						.addComponent(textDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProductora)
						.addComponent(textProduc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGnero)
						.addComponent(comboGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelDatos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDatos.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnReestablecer)
							.addComponent(btnVolver))
						.addComponent(btnCrearReview))
					.addGap(25))
		);
		panelDatos.setLayout(gl_panelDatos);
		panelTitulo.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblCreacinReview = new JLabel("Creaci\u00F3n Review");
		lblCreacinReview.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreacinReview.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelTitulo.add(lblCreacinReview);
		PanelArriba.setLayout(gl_PanelArriba);
		contentPane.setLayout(gl_contentPane);
		
		txtSinopsis.setLineWrap(true);
		
		textDirector.setVisible(false);
		textDuracion.setVisible(false);
		textProduc.setVisible(false);
		comboGenero.setVisible(false);
		
		lblDirector.setVisible(false);
		lblDuracin.setVisible(false);
		lblProductora.setVisible(false);
		lblGnero.setVisible(false);
		
		comboGenero.addItem("");
		comboGenero.addItem("Acción");
		comboGenero.addItem("Terror");
		comboGenero.addItem("Comedia");
		comboGenero.addItem("Ciencia Ficción");
	}
	
	public boolean comprobarDuracion(String duracion)
	{
		try
		{
			int dur=Integer.parseInt(duracion);
			return true;
		}
		catch (NumberFormatException nfe)
		{
			nfe.printStackTrace();
			return false;
		}
	}
	
	public boolean comprobarTemporadas(String temp)
	{
		try
		{
			int temporadas=Integer.parseInt(temp);
			return true;
		}
		catch (NumberFormatException nfe)
		{
			nfe.printStackTrace();
			return false;
		}
	}
	
	public boolean camposRellenados(String titulo, String sinopsis, String direc, String duracion, String productora, String genero)
	{
		if (titulo.length()>0 && sinopsis.length()>0 && direc.length()>0 && duracion.length()>0 && productora.length()>0 && genero.length()>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
