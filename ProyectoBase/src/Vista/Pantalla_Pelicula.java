package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButton;


public class Pantalla_Pelicula extends JFrame {

	private JPanel contentPane;
	private JPanel ImagenPelicula;
	private JPanel Comentarios;
	private JTextArea textAgregarComentario;
	private JTextArea textComentarios;
	private JLabel lblPublicarComentario;
	private JLabel lblComentarios;
	private JLabel lblTitulo;
	private JButton btnNetflix;
	private JButton btnComprarEnAmazon;
	private JButton btnComprarEntradas;
	private JButton btnPublicarComentario;
	private JScrollPane scrollPublicarComentarios;
	private JScrollPane scrollComentarios;
	private JPanel ReviewAdmin;
	private JPanel ReviewUsuario;
	private JLabel lblReviewAdmin;
	private JLabel lblReviewsUsuarios;
	private JMenuBar menuBar;
	private JMenu mnCuenta;
	private JTextField textNombreUsuario;
	private JButton buttonValorar;
	private JTextField txtValoracinMedia;
	private Choice choiceValoracion;
	private JButton btnAgregarComentario;
	
	

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
		setBounds(100, 100, 969, 656);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		textNombreUsuario = new JTextField();
		textNombreUsuario.setEditable(false);
		textNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNombreUsuario.setText("Nombre de Usuario");
		menuBar.add(textNombreUsuario);
		textNombreUsuario.setColumns(10);
		
		btnAgregarComentario = new JButton("Crear un nuevo comentario");
		btnAgregarComentario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		menuBar.add(btnAgregarComentario);
		
		mnCuenta = new JMenu("Cuenta");
		mnCuenta.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnCuenta);
		mnCuenta.add("Perfil");
		mnCuenta.add("Configuración");
		mnCuenta.add("Salir...");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitulo = new JLabel("TITULO");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 0, 159, 32);
		contentPane.add(lblTitulo);
		
		ImagenPelicula = new JPanel();
		ImagenPelicula.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		ImagenPelicula.setBounds(10, 31, 159, 232);
		contentPane.add(ImagenPelicula);
		
		btnNetflix = new JButton("Ver en Netflix");
		btnNetflix.setBounds(10, 274, 159, 32);
		contentPane.add(btnNetflix);
		
		btnComprarEnAmazon = new JButton("Comprar en Amazon");
		btnComprarEnAmazon.setBounds(10, 317, 159, 32);
		contentPane.add(btnComprarEnAmazon);
		
		btnComprarEntradas = new JButton("Comprar Entradas");
		btnComprarEntradas.setBounds(10, 360, 159, 32);
		contentPane.add(btnComprarEntradas);
		
		Comentarios = new JPanel();
		Comentarios.setForeground(Color.WHITE);
		Comentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.RED, Color.RED));
		Comentarios.setBounds(179, 274, 731, 312);
		contentPane.add(Comentarios);
		Comentarios.setLayout(null);
		
		scrollPublicarComentarios = new JScrollPane();
		scrollPublicarComentarios.setBounds(10, 36, 595, 50);
		Comentarios.add(scrollPublicarComentarios);
		
		textAgregarComentario = new JTextArea();
		scrollPublicarComentarios.setViewportView(textAgregarComentario);
		
		btnPublicarComentario = new JButton("Publicar");
		btnPublicarComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textComentarios.setText(textComentarios.getText()+"\n"+textAgregarComentario.getText()+"\n");
			}
		});
		btnPublicarComentario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPublicarComentario.setBounds(615, 36, 106, 50);
		Comentarios.add(btnPublicarComentario);
		
		lblPublicarComentario = new JLabel("Publicar Comentarios:");
		lblPublicarComentario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPublicarComentario.setBounds(10, 11, 186, 25);
		Comentarios.add(lblPublicarComentario);
		
		lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblComentarios.setBounds(10, 108, 153, 20);
		Comentarios.add(lblComentarios);
		
		scrollComentarios = new JScrollPane();
		scrollComentarios.setBounds(10, 139, 711, 162);
		Comentarios.add(scrollComentarios);
		
		textComentarios = new JTextArea();
		textComentarios.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textComentarios.setEditable(false);
		scrollComentarios.setViewportView(textComentarios);
		
		ReviewAdmin = new JPanel();
		ReviewAdmin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		ReviewAdmin.setBounds(179, 31, 361, 233);
		contentPane.add(ReviewAdmin);
		ReviewAdmin.setLayout(null);
		
		ReviewUsuario = new JPanel();
		ReviewUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		ReviewUsuario.setBounds(550, 31, 360, 233);
		contentPane.add(ReviewUsuario);
		
		lblReviewAdmin = new JLabel("Reviews Criticos:");
		lblReviewAdmin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReviewAdmin.setBounds(193, 6, 159, 20);
		contentPane.add(lblReviewAdmin);
		
		lblReviewsUsuarios = new JLabel("Reviews de los Usuarios:");
		lblReviewsUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReviewsUsuarios.setBounds(565, 11, 189, 14);
		contentPane.add(lblReviewsUsuarios);
		
		buttonValorar = new JButton("Valorar");
		buttonValorar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonValorar.setBounds(10, 473, 159, 32);
		contentPane.add(buttonValorar);
		
		txtValoracinMedia = new JTextField();
		txtValoracinMedia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtValoracinMedia.setHorizontalAlignment(SwingConstants.CENTER);
		txtValoracinMedia.setText("Valoraci\u00F3n media");
		txtValoracinMedia.setEditable(false);
		txtValoracinMedia.setBounds(10, 403, 159, 30);
		contentPane.add(txtValoracinMedia);
		txtValoracinMedia.setColumns(10);
		
		choiceValoracion = new Choice();
		choiceValoracion.setForeground(Color.BLACK);
		choiceValoracion.setFont(new Font("Dialog", Font.PLAIN, 16));
		choiceValoracion.setBackground(Color.CYAN);
		choiceValoracion.add("1");
		choiceValoracion.add("2");
		choiceValoracion.add("3");
		choiceValoracion.add("4");
		choiceValoracion.add("5");
		choiceValoracion.setBounds(10, 440, 159, 30);
		contentPane.add(choiceValoracion);
	}
}
