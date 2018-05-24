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

public class Pantalla_Pelicula extends JFrame {

	private JPanel contentPantallaPelicula;
	private JPanel panelPelicula;
	private JPanel panelReviewsUsuarios;
	private JPanel panelTituloUsuarios;
	private JPanel panelReviewsU;
	private JPanel panelValorar;
	private JPanel panelPublicarComentarios;
	private JPanel panelValorar1;
	private JPanel panelPortada;
	private JLabel lblComentariosDeLos;
	private JLabel lblValorar;
	private JLabel lblNombre;
	private JScrollPane scrollPane_2;
	private JMenuBar menuBar;
	private JMenu mnNombreUsuario;
	private JButton btnCrearReview;
	private JButton btnPublicar;
	private JButton btnValorar;
	private JScrollPane scrollPane_1;
	private JTextArea textReviewsUsuarios;
	private JComboBox comboBoxMedia;
	private JLabel lblNombre_1;
	private JTextField textNombreReview;
	private JTextField textValoracionMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Pelicula frame = new Pantalla_Pelicula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pantalla_Pelicula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 690);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNombreUsuario = new JMenu("Nombre de Usuario");
		mnNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNombreUsuario);
		
		btnCrearReview = new JButton("Crear Review");
		btnCrearReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCrearReview.setFont(new Font("Tahoma", Font.BOLD, 20));
		menuBar.add(btnCrearReview);
		mnNombreUsuario.add("Cuenta");
		mnNombreUsuario.add("Configuracion");
		mnNombreUsuario.add("Salir");
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
		
		scrollPane_2 = new JScrollPane();
		
		btnPublicar = new JButton("Publicar");
		btnPublicar.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblPublicarComentario = new JLabel("Publicar Comentario:");
		lblPublicarComentario.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panelReviewsUsuarios = new GroupLayout(panelReviewsUsuarios);
		gl_panelReviewsUsuarios.setHorizontalGroup(
			gl_panelReviewsUsuarios.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelReviewsUsuarios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
							.addGroup(gl_panelReviewsUsuarios.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
									.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnPublicar, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addComponent(panelReviewsU, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
								.addComponent(panelTituloUsuarios, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
							.addComponent(lblPublicarComentario, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
							.addGap(312))))
		);
		gl_panelReviewsUsuarios.setVerticalGroup(
			gl_panelReviewsUsuarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTituloUsuarios, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelReviewsU, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPublicarComentario, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelReviewsUsuarios.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
							.addGap(22)
							.addComponent(btnPublicar, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
							.addGap(31))
						.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
							.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addContainerGap())))
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane_2.setViewportView(textArea);
		panelReviewsU.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane_1 = new JScrollPane();
		panelReviewsU.add(scrollPane_1);
		
		textReviewsUsuarios = new JTextArea();
		textReviewsUsuarios.setEditable(false);
		scrollPane_1.setViewportView(textReviewsUsuarios);
		
		lblComentariosDeLos = new JLabel("Rewiews de los Usuarios:");
		lblComentariosDeLos.setFont(new Font("Tahoma", Font.BOLD, 17));
		panelTituloUsuarios.add(lblComentariosDeLos);
		panelReviewsUsuarios.setLayout(gl_panelReviewsUsuarios);
		
		panelValorar = new JPanel();
		panelValorar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panelAgregarDatos = new JPanel();
		panelAgregarDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPantallaPelicula = new GroupLayout(contentPantallaPelicula);
		gl_contentPantallaPelicula.setHorizontalGroup(
			gl_contentPantallaPelicula.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelValorar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelPelicula, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
								.addComponent(panelAgregarDatos, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelReviewsUsuarios, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)))
					.addGap(3))
		);
		gl_contentPantallaPelicula.setVerticalGroup(
			gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelPelicula, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
						.addComponent(panelReviewsUsuarios, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panelAgregarDatos, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelValorar, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
		);
		
		lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		textNombreReview = new JTextField();
		textNombreReview.setEditable(false);
		textNombreReview.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textNombreReview.setColumns(10);
		
		JLabel labelValoracion = new JLabel("Valoracion Media:");
		labelValoracion.setHorizontalAlignment(SwingConstants.CENTER);
		labelValoracion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textValoracionMedia = new JTextField();
		textValoracionMedia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textValoracionMedia.setEditable(false);
		textValoracionMedia.setColumns(10);
		
		JButton btnVerNetflix = new JButton("Ver en Netfilx");
		
		JButton buttonComprarAmazon = new JButton("Comprar en Amazon");
		
		JButton buttonComprarEntradas = new JButton("Comprar Entradas");
		GroupLayout gl_panelAgregarDatos = new GroupLayout(panelAgregarDatos);
		gl_panelAgregarDatos.setHorizontalGroup(
			gl_panelAgregarDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAgregarDatos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAgregarDatos.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVerNetflix, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textNombreReview, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(lblNombre_1, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(labelValoracion, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(textValoracionMedia, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(buttonComprarAmazon, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(buttonComprarEntradas, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelAgregarDatos.setVerticalGroup(
			gl_panelAgregarDatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAgregarDatos.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textNombreReview, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(labelValoracion, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textValoracionMedia, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVerNetflix, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(buttonComprarAmazon, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(buttonComprarEntradas, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		panelAgregarDatos.setLayout(gl_panelAgregarDatos);
		panelValorar.setLayout(new GridLayout(0, 1, 0, 0));
		
		panelPublicarComentarios = new JPanel();
		panelPublicarComentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelValorar1 = new JPanel();
		panelValorar1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		comboBoxMedia = new JComboBox();
		comboBoxMedia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxMedia.addItem(1);
		comboBoxMedia.addItem(2);
		comboBoxMedia.addItem(3);
		comboBoxMedia.addItem(4);
		comboBoxMedia.addItem(5);
		
		
		btnValorar = new JButton("Valorar");
		GroupLayout gl_panelPublicarComentarios = new GroupLayout(panelPublicarComentarios);
		gl_panelPublicarComentarios.setHorizontalGroup(
			gl_panelPublicarComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPublicarComentarios.createSequentialGroup()
					.addGap(13)
					.addComponent(panelValorar1, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
					.addGap(29)
					.addComponent(comboBoxMedia, 0, 191, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(btnValorar, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelPublicarComentarios.setVerticalGroup(
			gl_panelPublicarComentarios.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPublicarComentarios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.LEADING)
						.addComponent(panelValorar1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPublicarComentarios.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnValorar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxMedia, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))))
					.addGap(27))
		);
		panelValorar1.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblValorar = new JLabel("Valorar");
		panelValorar1.add(lblValorar);
		lblValorar.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorar.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelPublicarComentarios.setLayout(gl_panelPublicarComentarios);
		panelValorar.add(panelPublicarComentarios);
		
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
	}
}
