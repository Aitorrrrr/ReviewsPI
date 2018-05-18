package Vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JCheckBox;

public class Principal extends JFrame {

	private JPanel contenedorPrincipal;

	private JMenuBar menuBar;
	private JMenu menuUsuario;
	private JMenu menuIdioma;
	private JMenuItem menuIdiomaEsp;
	private JMenuItem menuIdiomaEng;
	
	private JLabel logo2;
	private JLabel bannerLateral;
	
	private JButton botonPaginaAnterior;
	private JButton botonPaginaSiguiente;
	
	private JLabel imagenReview1;
	private JLabel lblSinopsisReview1;
	private JTextField campoSinopsisReview1;
	private JLabel lblTituloReview1;
	private JButton botonVerReviews1;
	private JButton botonHacerReviews1;
	private JTextField campoPuntuacionReview1;
	
	private JLabel imagenReview2;
	private JLabel lblSinopsisReview2;
	private JTextField campoSinopsisReview2;
	private JLabel lblTituloReview2;
	private JButton botonVerReviews2;
	private JButton botonHacerReviews2;
	private JTextField campoPuntuacionReview2;
	
	private JTextField campoBuscar;
	private JLabel lblCategorias;
	private JLabel lblGeneros;
	private JLabel lblBuscar; 
	
	private JCheckBox genero1;
	private JCheckBox genero2;
	private JCheckBox genero3;
	private JCheckBox genero4;
	private JCheckBox genero5;
	private JCheckBox genero6;
	private JCheckBox genero7;
	private JCheckBox genero8;
	
	private JButton botonCateg1;
	private JButton botonCateg2;
	private JButton botonCateg3;
	private JButton botonCateg4;
	private JButton botonBuscar; 
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1643, 912);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuUsuario = new JMenu("[NOMBRE DE USUARIO AQUI]");
		menuBar.add(menuUsuario);
		
		menuIdioma = new JMenu("Idioma");
		menuBar.add(menuIdioma);
		
		menuIdiomaEsp = new JMenuItem("Espa\u00F1ol");
		menuIdiomaEsp.setIcon(new ImageIcon(Principal.class.getResource("/assets/esp.png")));
		menuIdioma.add(menuIdiomaEsp);
		
		menuIdiomaEng = new JMenuItem("Ingles");
		menuIdiomaEng.setIcon(new ImageIcon(Principal.class.getResource("/assets/eng.png")));
		menuIdioma.add(menuIdiomaEng);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		
		JPanel contenedorMenu = new JPanel();
		
		JSeparator separador2 = new JSeparator();
		separador2.setOrientation(SwingConstants.VERTICAL);
		
		JPanel contenedorReviews = new JPanel();
		
		logo2 = new JLabel("");
		logo2.setIcon(new ImageIcon(Principal.class.getResource("/assets/placeholder2.png")));
		
		JSeparator separador1 = new JSeparator();
		separador1.setOrientation(SwingConstants.VERTICAL);
		
		bannerLateral = new JLabel("");
		bannerLateral.setIcon(new ImageIcon(Principal.class.getResource("/assets/placeholder3.png")));
		GroupLayout gl_contenedorPrincipal = new GroupLayout(contenedorPrincipal);
		gl_contenedorPrincipal.setHorizontalGroup(
			gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(contenedorMenu, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contenedorPrincipal.createSequentialGroup()
							.addGap(24)
							.addComponent(logo2)))
					.addGap(59)
					.addComponent(separador2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(contenedorReviews, GroupLayout.PREFERRED_SIZE, 1041, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(separador1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bannerLateral, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_contenedorPrincipal.setVerticalGroup(
			gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addComponent(contenedorReviews, GroupLayout.PREFERRED_SIZE, 817, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(contenedorMenu, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(logo2))
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addGap(30)
					.addComponent(separador2, GroupLayout.PREFERRED_SIZE, 762, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addGap(33)
					.addComponent(separador1, GroupLayout.PREFERRED_SIZE, 762, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(bannerLateral, GroupLayout.PREFERRED_SIZE, 836, GroupLayout.PREFERRED_SIZE))
		);
		
		JPanel contenedorReview1 = new JPanel();
		
		JSeparator separadorReviews2 = new JSeparator();
		
		botonPaginaAnterior = new JButton("<- Pagina Anterior");
		
		botonPaginaSiguiente = new JButton("Pagina Siguiente ->");
		
		JSeparator separadorReviews1 = new JSeparator();
		
		JPanel contenedorReview2 = new JPanel();
		
		imagenReview1 = new JLabel("");
		imagenReview1.setIcon(new ImageIcon(Principal.class.getResource("/assets/poster_placeholder.png")));
		imagenReview1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator SeparadorRev1 = new JSeparator();
		SeparadorRev1.setOrientation(SwingConstants.VERTICAL);
		
		lblSinopsisReview1 = new JLabel("SINOPSIS");
		lblSinopsisReview1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinopsisReview1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		campoSinopsisReview1 = new JTextField();
		campoSinopsisReview1.setEditable(false);
		campoSinopsisReview1.setColumns(10);
		
		lblTituloReview1 = new JLabel("TITULO");
		lblTituloReview1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloReview1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		campoPuntuacionReview1 = new JTextField();
		campoPuntuacionReview1.setText("10/10");
		campoPuntuacionReview1.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntuacionReview1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		campoPuntuacionReview1.setEditable(false);
		campoPuntuacionReview1.setColumns(10);
		
		botonVerReviews1 = new JButton("Ver Reviews");
		
		botonHacerReviews1 = new JButton("Hacer Review");
		GroupLayout gl_contenedorReview2 = new GroupLayout(contenedorReview2);
		gl_contenedorReview2.setHorizontalGroup(
			gl_contenedorReview2.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 993, Short.MAX_VALUE)
				.addGroup(gl_contenedorReview2.createSequentialGroup()
					.addContainerGap()
					.addComponent(imagenReview1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(SeparadorRev1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contenedorReview2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contenedorReview2.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_contenedorReview2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contenedorReview2.createSequentialGroup()
									.addGap(113)
									.addComponent(lblSinopsisReview1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
									.addGap(86))
								.addGroup(gl_contenedorReview2.createSequentialGroup()
									.addGap(18)
									.addComponent(campoSinopsisReview1, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGap(5))
						.addGroup(gl_contenedorReview2.createSequentialGroup()
							.addGap(119)
							.addComponent(lblTituloReview1, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
							.addGap(62)))
					.addComponent(campoPuntuacionReview1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contenedorReview2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(botonVerReviews1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(botonHacerReviews1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(34))
		);
		gl_contenedorReview2.setVerticalGroup(
			gl_contenedorReview2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 245, Short.MAX_VALUE)
				.addGroup(gl_contenedorReview2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contenedorReview2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contenedorReview2.createSequentialGroup()
							.addComponent(campoPuntuacionReview1, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contenedorReview2.createSequentialGroup()
							.addGroup(gl_contenedorReview2.createParallelGroup(Alignment.LEADING)
								.addComponent(SeparadorRev1, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
								.addComponent(imagenReview1, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
								.addGroup(gl_contenedorReview2.createSequentialGroup()
									.addComponent(lblTituloReview1)
									.addGap(18)
									.addComponent(lblSinopsisReview1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(campoSinopsisReview1, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
							.addContainerGap())
						.addGroup(gl_contenedorReview2.createSequentialGroup()
							.addComponent(botonVerReviews1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(botonHacerReviews1)
							.addGap(20))))
		);
		contenedorReview2.setLayout(gl_contenedorReview2);
		GroupLayout gl_contenedorReviews = new GroupLayout(contenedorReviews);
		gl_contenedorReviews.setHorizontalGroup(
			gl_contenedorReviews.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contenedorReviews.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addGroup(gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contenedorReviews.createSequentialGroup()
							.addComponent(botonPaginaAnterior)
							.addPreferredGap(ComponentPlacement.RELATED, 752, Short.MAX_VALUE)
							.addComponent(botonPaginaSiguiente))
						.addComponent(separadorReviews1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 993, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contenedorReviews.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contenedorReviews.createSequentialGroup()
							.addComponent(contenedorReview2, GroupLayout.PREFERRED_SIZE, 993, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contenedorReviews.createSequentialGroup()
							.addGroup(gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
								.addComponent(separadorReviews2, GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
								.addComponent(contenedorReview1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE))
							.addGap(20))))
		);
		gl_contenedorReviews.setVerticalGroup(
			gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorReviews.createSequentialGroup()
					.addGap(50)
					.addComponent(contenedorReview1, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addGap(50)
					.addComponent(separadorReviews2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(contenedorReview2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
					.addGap(94)
					.addComponent(separadorReviews1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contenedorReviews.createParallelGroup(Alignment.BASELINE)
						.addComponent(botonPaginaAnterior)
						.addComponent(botonPaginaSiguiente))
					.addGap(27))
		);
		
		imagenReview2 = new JLabel("");
		imagenReview2.setHorizontalAlignment(SwingConstants.CENTER);
		imagenReview2.setIcon(new ImageIcon(Principal.class.getResource("/assets/poster_placeholder.png")));
		
		lblTituloReview2 = new JLabel("TITULO");
		lblTituloReview2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloReview2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator SeparadorRev2 = new JSeparator();
		SeparadorRev2.setOrientation(SwingConstants.VERTICAL);
		
		campoSinopsisReview2 = new JTextField();
		campoSinopsisReview2.setEditable(false);
		campoSinopsisReview2.setColumns(10);
		
		campoPuntuacionReview2 = new JTextField();
		campoPuntuacionReview2.setEditable(false);
		campoPuntuacionReview2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		campoPuntuacionReview2.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntuacionReview2.setText("10/10");
		campoPuntuacionReview2.setColumns(10);
		
		lblSinopsisReview2 = new JLabel("SINOPSIS");
		lblSinopsisReview2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinopsisReview2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		botonHacerReviews2 = new JButton("Hacer Review");
		
		botonVerReviews2 = new JButton("Ver Reviews");
		GroupLayout gl_contenedorReview1 = new GroupLayout(contenedorReview1);
		gl_contenedorReview1.setHorizontalGroup(
			gl_contenedorReview1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contenedorReview1.createSequentialGroup()
					.addContainerGap()
					.addComponent(imagenReview2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(SeparadorRev2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contenedorReview1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contenedorReview1.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_contenedorReview1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contenedorReview1.createSequentialGroup()
									.addGap(113)
									.addComponent(lblSinopsisReview2, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
									.addGap(86))
								.addGroup(gl_contenedorReview1.createSequentialGroup()
									.addGap(18)
									.addComponent(campoSinopsisReview2, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGap(5))
						.addGroup(Alignment.TRAILING, gl_contenedorReview1.createSequentialGroup()
							.addGap(119)
							.addComponent(lblTituloReview2, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
							.addGap(62)))
					.addComponent(campoPuntuacionReview2, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contenedorReview1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(botonVerReviews2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(botonHacerReviews2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(34))
		);
		gl_contenedorReview1.setVerticalGroup(
			gl_contenedorReview1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorReview1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contenedorReview1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contenedorReview1.createSequentialGroup()
							.addComponent(campoPuntuacionReview2, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contenedorReview1.createSequentialGroup()
							.addGroup(gl_contenedorReview1.createParallelGroup(Alignment.TRAILING)
								.addComponent(SeparadorRev2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
								.addComponent(imagenReview2, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_contenedorReview1.createSequentialGroup()
									.addComponent(lblTituloReview2)
									.addGap(18)
									.addComponent(lblSinopsisReview2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(campoSinopsisReview2, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contenedorReview1.createSequentialGroup()
							.addComponent(botonVerReviews2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(botonHacerReviews2)
							.addGap(20))))
		);
		contenedorReview1.setLayout(gl_contenedorReview1);
		contenedorReviews.setLayout(gl_contenedorReviews);
		
		JPanel contenedorBusqueda = new JPanel();
		
		JSeparator separadorMenu1 = new JSeparator();
		
		JPanel contenedorCategorias = new JPanel();
		
		lblCategorias = new JLabel("Categorias");
		lblCategorias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategorias.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		lblGeneros = new JLabel("Generos");
		lblGeneros.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneros.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JPanel contenedorGeneros = new JPanel();
		
		JSeparator separadorMenu2 = new JSeparator();
		
		JSeparator separadorMenu3 = new JSeparator();
		
		lblBuscar = new JLabel("Buscar");
		lblBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GroupLayout gl_contenedorMenu = new GroupLayout(contenedorMenu);
		gl_contenedorMenu.setHorizontalGroup(
			gl_contenedorMenu.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contenedorMenu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contenedorMenu.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contenedorMenu.createSequentialGroup()
							.addGroup(gl_contenedorMenu.createParallelGroup(Alignment.LEADING)
								.addComponent(contenedorGeneros, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(contenedorCategorias, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(separadorMenu1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(contenedorBusqueda, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(lblCategorias, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(lblGeneros, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(separadorMenu2, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(separadorMenu3, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
							.addGap(10))
						.addGroup(Alignment.TRAILING, gl_contenedorMenu.createSequentialGroup()
							.addComponent(lblBuscar, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contenedorMenu.setVerticalGroup(
			gl_contenedorMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorMenu.createSequentialGroup()
					.addComponent(lblBuscar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(contenedorBusqueda, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separadorMenu1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblCategorias)
					.addGap(10)
					.addComponent(contenedorCategorias, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(separadorMenu2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblGeneros, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(contenedorGeneros, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(separadorMenu3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		contenedorGeneros.setLayout(new GridLayout(4, 2, 0, 0));
		
		genero1 = new JCheckBox("New check box");
		contenedorGeneros.add(genero1);
		
		genero2 = new JCheckBox("New check box");
		contenedorGeneros.add(genero2);
		
		genero3 = new JCheckBox("New check box");
		contenedorGeneros.add(genero3);
		
		genero4 = new JCheckBox("New check box");
		contenedorGeneros.add(genero4);
		
		genero5 = new JCheckBox("New check box");
		contenedorGeneros.add(genero5);
		
		genero6 = new JCheckBox("New check box");
		contenedorGeneros.add(genero6);
		
		genero7 = new JCheckBox("New check box");
		contenedorGeneros.add(genero7);
		
		genero8 = new JCheckBox("New check box");
		contenedorGeneros.add(genero8);
		contenedorCategorias.setLayout(new GridLayout(4, 0, 0, 0));
		
		botonCateg1 = new JButton("Peliculas");
		contenedorCategorias.add(botonCateg1);
		
		botonCateg2 = new JButton("Series");
		contenedorCategorias.add(botonCateg2);
		
		botonCateg3 = new JButton("Videojuegos");
		contenedorCategorias.add(botonCateg3);
		
		botonCateg4 = new JButton("Libros");
		contenedorCategorias.add(botonCateg4);
		contenedorBusqueda.setLayout(new GridLayout(2, 1, 0, 0));
		
		campoBuscar = new JTextField();
		contenedorBusqueda.add(campoBuscar);
		campoBuscar.setColumns(10);
		
		botonBuscar = new JButton("Buscar");
		contenedorBusqueda.add(botonBuscar);
		contenedorMenu.setLayout(gl_contenedorMenu);
		contenedorPrincipal.setLayout(gl_contenedorPrincipal);
	}
}
