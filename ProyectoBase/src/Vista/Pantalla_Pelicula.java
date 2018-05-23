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
	private JPanel panelVer;
	private JPanel panelReviewsCriticos;
	private JPanel panelReviewsUsuarios;
	private JPanel panelTituloUsuarios;
	private JPanel panelReviewsU;
	private JPanel panelComentarios;
	private JPanel panelPublicarComentarios;
	private JPanel panelComentariosPublicados;
	private JPanel panelTodosComentarios;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panelTituloAdmin;
	private JPanel panelComentariosAdmins;
	private JPanel panelPortada;
	private JLabel lblComentarios;
	private JLabel lblComentariosDeLos;
	private JLabel lblPublicarComentarios;
	private JLabel lblReviewsCriticos;
	private JLabel lblNombre;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JTextArea textComentarios;
	private JTextArea textReviewsAdmins;
	private JTextField textValoracionMedia;
	private JMenuBar menuBar;
	private JMenu mnNombreUsuario;
	private JButton btnCrearReview;
	private JButton btnPublicar;
	private JButton btnVerEnNetflix;
	private JButton btnComprarAmazon;
	private JButton btnValorar;
	private JButton btnComprarEntradas;
	private JScrollPane scrollPane_1;
	private JTextArea textReviewsUsuarios;
	private JTextArea textCrearComentarios;
	private JComboBox comboBoxMedia;

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
				CrearReview CR=new CrearReview();
				CR.setVisible(true);
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
		
		panelVer = new JPanel();
		panelVer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelReviewsCriticos = new JPanel();
		panelReviewsCriticos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelReviewsUsuarios = new JPanel();
		panelReviewsUsuarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelTituloUsuarios = new JPanel();
		panelTituloUsuarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		panelReviewsU = new JPanel();
		panelReviewsU.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		GroupLayout gl_panelReviewsUsuarios = new GroupLayout(panelReviewsUsuarios);
		gl_panelReviewsUsuarios.setHorizontalGroup(
			gl_panelReviewsUsuarios.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelReviewsUsuarios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelReviewsUsuarios.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelReviewsU, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
						.addComponent(panelTituloUsuarios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelReviewsUsuarios.setVerticalGroup(
			gl_panelReviewsUsuarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReviewsUsuarios.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTituloUsuarios, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelReviewsU, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addGap(7))
		);
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
		
		panelComentarios = new JPanel();
		panelComentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPantallaPelicula = new GroupLayout(contentPantallaPelicula);
		gl_contentPantallaPelicula.setHorizontalGroup(
			gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
						.addComponent(panelVer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelPelicula, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addComponent(panelReviewsCriticos, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelReviewsUsuarios, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
						.addComponent(panelComentarios, GroupLayout.PREFERRED_SIZE, 596, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_contentPantallaPelicula.setVerticalGroup(
			gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panelPelicula, 0, 0, Short.MAX_VALUE)
						.addComponent(panelReviewsCriticos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelReviewsUsuarios, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPantallaPelicula.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addComponent(panelVer, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPantallaPelicula.createSequentialGroup()
							.addComponent(panelComentarios, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
							.addGap(12))))
		);
		
		panelPublicarComentarios = new JPanel();
		panelPublicarComentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelComentariosPublicados = new JPanel();
		panelComentariosPublicados.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_panelComentarios = new GroupLayout(panelComentarios);
		gl_panelComentarios.setHorizontalGroup(
			gl_panelComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelComentarios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelComentarios.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelComentariosPublicados, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 569, Short.MAX_VALUE)
						.addComponent(panelPublicarComentarios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelComentarios.setVerticalGroup(
			gl_panelComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComentarios.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelPublicarComentarios, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelComentariosPublicados, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
					.addGap(8))
		);
		
		lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setHorizontalAlignment(SwingConstants.LEFT);
		lblComentarios.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		panelTodosComentarios = new JPanel();
		panelTodosComentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_panelComentariosPublicados = new GroupLayout(panelComentariosPublicados);
		gl_panelComentariosPublicados.setHorizontalGroup(
			gl_panelComentariosPublicados.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComentariosPublicados.createSequentialGroup()
					.addGroup(gl_panelComentariosPublicados.createParallelGroup(Alignment.LEADING)
						.addComponent(lblComentarios, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelTodosComentarios, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_panelComentariosPublicados.setVerticalGroup(
			gl_panelComentariosPublicados.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComentariosPublicados.createSequentialGroup()
					.addComponent(lblComentarios, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelTodosComentarios, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelTodosComentarios.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane_3 = new JScrollPane();
		panelTodosComentarios.add(scrollPane_3);
		
		textComentarios = new JTextArea();
		scrollPane_3.setViewportView(textComentarios);
		panelComentariosPublicados.setLayout(gl_panelComentariosPublicados);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		btnPublicar = new JButton("Publicar");
		btnPublicar.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		btnValorar = new JButton("Valorar");
		
		comboBoxMedia = new JComboBox();
		comboBoxMedia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxMedia.addItem(1);
		comboBoxMedia.addItem(2);
		comboBoxMedia.addItem(3);
		comboBoxMedia.addItem(4);
		comboBoxMedia.addItem(5);
		GroupLayout gl_panelPublicarComentarios = new GroupLayout(panelPublicarComentarios);
		gl_panelPublicarComentarios.setHorizontalGroup(
			gl_panelPublicarComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPublicarComentarios.createSequentialGroup()
					.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelPublicarComentarios.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnValorar, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxMedia, 0, 99, Short.MAX_VALUE)
						.addComponent(btnPublicar, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelPublicarComentarios.setVerticalGroup(
			gl_panelPublicarComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPublicarComentarios.createSequentialGroup()
					.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnValorar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBoxMedia, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelPublicarComentarios.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnPublicar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addGap(10))
		);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane_2 = new JScrollPane();
		panel_1.add(scrollPane_2);
		
		textCrearComentarios = new JTextArea();
		scrollPane_2.setViewportView(textCrearComentarios);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblPublicarComentarios = new JLabel("Publicar Comentarios:");
		lblPublicarComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblPublicarComentarios.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblPublicarComentarios);
		panelPublicarComentarios.setLayout(gl_panelPublicarComentarios);
		panelComentarios.setLayout(gl_panelComentarios);
		
		panelTituloAdmin = new JPanel();
		panelTituloAdmin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		
		panelComentariosAdmins = new JPanel();
		panelComentariosAdmins.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		GroupLayout gl_panelReviewsCriticos = new GroupLayout(panelReviewsCriticos);
		gl_panelReviewsCriticos.setHorizontalGroup(
			gl_panelReviewsCriticos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReviewsCriticos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelReviewsCriticos.createParallelGroup(Alignment.LEADING)
						.addComponent(panelTituloAdmin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
						.addComponent(panelComentariosAdmins, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelReviewsCriticos.setVerticalGroup(
			gl_panelReviewsCriticos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelReviewsCriticos.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTituloAdmin, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelComentariosAdmins, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(7))
		);
		panelComentariosAdmins.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPane = new JScrollPane();
		panelComentariosAdmins.add(scrollPane);
		
		textReviewsAdmins = new JTextArea();
		textReviewsAdmins.setEditable(false);
		scrollPane.setViewportView(textReviewsAdmins);
		
		lblReviewsCriticos = new JLabel("Reviews Criticos:");
		lblReviewsCriticos.setFont(new Font("Tahoma", Font.BOLD, 17));
		panelTituloAdmin.add(lblReviewsCriticos);
		panelReviewsCriticos.setLayout(gl_panelReviewsCriticos);
		panelVer.setLayout(new GridLayout(6, 0, 0, 0));
		
		btnVerEnNetflix = new JButton("Ver en Netflix");
		btnVerEnNetflix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelVer.add(btnVerEnNetflix);
		
		btnComprarAmazon = new JButton("Comprar en Amazon");
		btnComprarAmazon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnComprarAmazon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panelVer.add(btnComprarAmazon);
		
		btnComprarEntradas = new JButton("Comprar Entradas");
		btnComprarEntradas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelVer.add(btnComprarEntradas);
		
		textValoracionMedia = new JTextField();
		textValoracionMedia.setEditable(false);
		panelVer.add(textValoracionMedia);
		textValoracionMedia.setColumns(10);
		
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
