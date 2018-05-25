package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;

import controlador.Controlador;
import javax.swing.JMenuItem;

public class Pantalla_Pelicula extends JFrame {

	private JPanel contentPantallaPelicula;
	private JPanel panelPelicula;
	private JPanel panelReviewsUsuarios;
	private JPanel panelTituloUsuarios;
	private JPanel panelReviewsU;
	private JPanel panelPortada;
	private JPanel panelAgregarDatos;
	private JLabel lblSinopsis;
	private JLabel lblNombre;
	private JLabel labelValoracion;
	private JMenuBar menuBar;
	private JMenu mnNombreUsuario;
	private JButton btnCrearReview;
	private JScrollPane scrollPane_1;
	private JTextArea textSinopsis;
	private JLabel lblTitulo;
	private JTextField textTitulo;
	private JTextField textValoracionMedia;
	private JTextField textDirec;
	private JLabel lblDuracin;
	private JTextField textDuracin;
	private JLabel lblProductora;
	private JTextField textProductora;
	private JLabel lblComentariosDelReview;
	private JButton btnConfirmar;
	private JMenuItem mntmPerfil;

	public Pantalla_Pelicula(Controlador c1, boolean tipo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 690);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNombreUsuario = new JMenu("Nombre de Usuario");
		mnNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNombreUsuario);
		mnNombreUsuario.add("Perfil");
		mnNombreUsuario.add("Salir...");
		
		btnCrearReview = new JButton("Crear Review");
		btnCrearReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearReview cr=new CrearReview(c1);
				cr.setVisible(true);
				
				Pantalla_Pelicula.this.dispose();
			}
		});
		btnCrearReview.setFont(new Font("Tahoma", Font.BOLD, 20));
		menuBar.add(btnCrearReview);
		contentPantallaPelicula = new JPanel();
		contentPantallaPelicula.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPantallaPelicula);
		
		panelPelicula = new JPanel();
		panelPelicula.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelReviewsUsuarios = new JPanel();
		panelReviewsUsuarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelTituloUsuarios = new JPanel();
		panelTituloUsuarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		panelReviewsU = new JPanel();
		panelReviewsU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		lblComentariosDelReview = new JLabel("Comentarios del Review");
		lblComentariosDelReview.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panelReviewsUsuarios = new GroupLayout(panelReviewsUsuarios);
		gl_panelReviewsUsuarios.setHorizontalGroup(
			gl_panelReviewsUsuarios.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelReviewsUsuarios.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(panelReviewsU, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(panelTituloUsuarios, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(lblComentariosDelReview, Alignment.LEADING))
					.addContainerGap())
		);
		gl_panelReviewsUsuarios.setVerticalGroup(
			gl_panelReviewsUsuarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTituloUsuarios, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelReviewsU, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblComentariosDelReview)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextArea textComentarios = new JTextArea();
		scrollPane.setViewportView(textComentarios);
		panelReviewsU.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane_1 = new JScrollPane();
		panelReviewsU.add(scrollPane_1);
		
		textSinopsis = new JTextArea();
		textSinopsis.setEditable(false);
		scrollPane_1.setViewportView(textSinopsis);
		
		lblSinopsis = new JLabel("Sinopsis");
		lblSinopsis.setFont(new Font("Tahoma", Font.BOLD, 17));
		panelTituloUsuarios.add(lblSinopsis);
		panelReviewsUsuarios.setLayout(gl_panelReviewsUsuarios);
		
		panelAgregarDatos = new JPanel();
		panelAgregarDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel lblCrearComentario = new JLabel("Comentar Review");
		lblCrearComentario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JTextArea textCreacion = new JTextArea();
		
		JComboBox comboNota = new JComboBox();
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comprobarRellenos(textCreacion.getText(), comboNota.getSelectedItem().toString()))
				{
					int valor=Integer.parseInt(comboNota.getSelectedItem().toString());
					
					if (c1.crearComentario(textCreacion.getText(), valor))
					{
						JOptionPane.showMessageDialog(Pantalla_Pelicula.this, "Comentario guardado");
					}
					else
					{
						JOptionPane.showMessageDialog(Pantalla_Pelicula.this, "Error al guardar el comentario, inténtelo de nuevo");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(Pantalla_Pelicula.this, "Debes introducir un texto y una valoración para guardar tu comentario");
				}
			}
		});
		GroupLayout gl_contentPantallaPelicula = new GroupLayout(contentPantallaPelicula);
		gl_contentPantallaPelicula.setHorizontalGroup(
			gl_contentPantallaPelicula.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
								.addComponent(panelAgregarDatos, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
								.addComponent(panelPelicula, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
								.addComponent(lblCrearComentario))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelReviewsUsuarios, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addComponent(textCreacion, GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
							.addContainerGap())))
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addGap(594)
					.addComponent(comboNota, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnComentar, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPantallaPelicula.setVerticalGroup(
			gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelPelicula, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addComponent(panelReviewsUsuarios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addComponent(panelAgregarDatos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblCrearComentario)
							.addGap(5)))
					.addComponent(textCreacion, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboNota, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnComentar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
		);
		
		lblTitulo = new JLabel("Nombre:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		textTitulo = new JTextField();
		textTitulo.setEditable(false);
		textTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textTitulo.setColumns(10);
		
		labelValoracion = new JLabel("Valoracion Media:");
		labelValoracion.setHorizontalAlignment(SwingConstants.CENTER);
		labelValoracion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textValoracionMedia = new JTextField();
		textValoracionMedia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textValoracionMedia.setEditable(false);
		textValoracionMedia.setColumns(10);
		
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setHorizontalAlignment(SwingConstants.CENTER);
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textDirec = new JTextField();
		textDirec.setEditable(false);
		textDirec.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textDirec.setColumns(10);
		
		lblDuracin = new JLabel("Duraci\u00F3n: ");
		lblDuracin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuracin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textDuracin = new JTextField();
		textDuracin.setEditable(false);
		textDuracin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textDuracin.setColumns(10);
		
		lblProductora = new JLabel("Productora: ");
		lblProductora.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textProductora = new JTextField();
		textProductora.setEditable(false);
		textProductora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textProductora.setColumns(10);
		
		JButton btnEditarReview = new JButton("Editar");
		btnEditarReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textDirec.setEditable(true);
				textDuracin.setEditable(true);
				textProductora.setEditable(true);
			}
		});
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipo==true)
				{
					int duracion=Integer.parseInt(textDuracin.getText());
					
					c1.actualizarPelicula(textDirec.getText(), duracion, textProductora.getText());
				}
				else
				{
					int temporadas=Integer.parseInt(textDirec.getText());
					int duracion=Integer.parseInt(textDuracin.getText());
					
					c1.actualizarSerie(temporadas, duracion, textProductora.getText());
				}
			}
		});
		GroupLayout gl_panelAgregarDatos = new GroupLayout(panelAgregarDatos);
		gl_panelAgregarDatos.setHorizontalGroup(
			gl_panelAgregarDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAgregarDatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAgregarDatos.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProductora, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textDuracin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textTitulo, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(labelValoracion, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textValoracionMedia, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(lblDirector, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textDirec, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(lblDuracin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textProductora, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addGroup(gl_panelAgregarDatos.createSequentialGroup()
							.addComponent(btnEditarReview, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnConfirmar)))
					.addContainerGap())
		);
		gl_panelAgregarDatos.setVerticalGroup(
			gl_panelAgregarDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAgregarDatos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(labelValoracion, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textValoracionMedia, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDirector)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textDirec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDuracin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textDuracin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblProductora)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textProductora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAgregarDatos.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditarReview)
						.addComponent(btnConfirmar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelAgregarDatos.setLayout(gl_panelAgregarDatos);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		panelPortada = new JPanel();
		panelPortada.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		GroupLayout gl_panelPelicula = new GroupLayout(panelPelicula);
		gl_panelPelicula.setHorizontalGroup(
			gl_panelPelicula.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelPelicula.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPelicula.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelPortada, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(lblNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelPelicula.setVerticalGroup(
			gl_panelPelicula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPelicula.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelPortada, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addGap(61))
		);
		GroupLayout gl_panelPortada = new GroupLayout(panelPortada);
		gl_panelPortada.setHorizontalGroup(
			gl_panelPortada.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
		);
		gl_panelPortada.setVerticalGroup(
			gl_panelPortada.createParallelGroup(Alignment.LEADING)
				.addGap(0, 297, Short.MAX_VALUE)
		);
		panelPortada.setLayout(gl_panelPortada);
		panelPelicula.setLayout(gl_panelPelicula);
		contentPantallaPelicula.setLayout(gl_contentPantallaPelicula);
		
		textSinopsis.setLineWrap(true);
		textComentarios.setLineWrap(true);
		textCreacion.setLineWrap(true);
		
		comboNota.addItem("");
		comboNota.addItem("0");
		comboNota.addItem("1");
		comboNota.addItem("2");
		comboNota.addItem("3");
		comboNota.addItem("4");
		comboNota.addItem("5");
		comboNota.addItem("6");
		comboNota.addItem("7");
		comboNota.addItem("8");
		comboNota.addItem("9");
		comboNota.addItem("10");
		
		if (!tipo)
		{
			lblDirector.setText("Temporadas: ");
			c1.datosSerie(textTitulo, textValoracionMedia, textDirec, textDuracin, textProductora, textSinopsis);
		}
		else
		{
			c1.datosPelicula(textTitulo, textValoracionMedia, textDirec, textDuracin, textProductora, textSinopsis);
		}
		
		mnNombreUsuario.setText(c1.getUserLogged().getAlias());
		
		mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla_Usuario pu1=new Pantalla_Usuario(c1);
				pu1.setVisible(true);
				
				Pantalla_Pelicula.this.dispose();
			}
		});
		mnNombreUsuario.add(mntmPerfil);
		c1.mostrarComentarios(textComentarios);
		
		
	}
	
	public boolean comprobarRellenos(String texto, String valoracion)
	{
		if (texto.length()>0 && valoracion.length()>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
