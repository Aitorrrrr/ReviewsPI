package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
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
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JCheckBox;

import controlador.Controlador;
import modelo.Idioma;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class PantallaBusqueda extends JFrame {

	private JPanel contenedorPrincipal;

	private JMenuBar menuBar;
	private JMenu menuUsuario;
	
	private JLabel logo2;
	
	private JLabel imagenReview2;
	private JLabel lblSinopsis;
	private JTextField campoSinopsisArriba;
	private JLabel lblTitulo;
	private JButton botonVerReviews2;
	private JButton botonHacerReviews2;
	private JTextField campoPuntuacionArriba;
	
	private JTextField campoBuscar;
	private JLabel lblCategorias;
	private JLabel lblGeneros;
	private JLabel lblBuscar; 
	
	private JCheckBox genero1;
	private JCheckBox genero2;
	private JCheckBox genero3;
	private JCheckBox genero4;
	
	private JButton botonCateg1;
	private JButton botonCateg2;
	private JButton botonBuscar;
	
	private int cont;
	
	private boolean peliculas;
	private boolean series;
	
	public PantallaBusqueda(Controlador c1) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PantallaBusqueda.class.getResource("/assets/ico.png")));
		setTitle("REVIEWX");
		Idioma idio = new Idioma();
		cont=0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1643, 912);
		
		menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(new Color(102, 0, 0));
		setJMenuBar(menuBar);
		
		menuUsuario = new JMenu("[NOMBRE DE USUARIO AQUI]");
		menuUsuario.setForeground(Color.WHITE);
		menuBar.add(menuUsuario);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBackground(new Color(38, 38, 38));
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		
		menuUsuario.setText(c1.getUserLogged().getAlias());
		
		JPanel contenedorMenu = new JPanel();
		contenedorMenu.setBackground(new Color(38, 38, 38));
		
		JSeparator separador2 = new JSeparator();
		separador2.setOrientation(SwingConstants.VERTICAL);
		
		JPanel contenedorReviews = new JPanel();
		contenedorReviews.setBackground(new Color(38, 38, 38));
		
		logo2 = new JLabel("");
		
		
		
		
		 BufferedImage img = null;
	        try {
	            img = ImageIO.read(Login.class.getResource("/assets/logo.png"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        Image Dimg= img.getScaledInstance(210, 150, Image.SCALE_SMOOTH);
	        ImageIcon iIcon= new ImageIcon(Dimg);
	        logo2.setHorizontalAlignment(SwingConstants.CENTER);
	        logo2.setIcon(iIcon);
		
		
		
		
		
		JSeparator separador1 = new JSeparator();
		separador1.setOrientation(SwingConstants.VERTICAL);
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
					.addGap(84)
					.addComponent(contenedorReviews, GroupLayout.PREFERRED_SIZE, 1041, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
					.addComponent(separador1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		gl_contenedorPrincipal.setVerticalGroup(
			gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addGroup(gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contenedorPrincipal.createSequentialGroup()
							.addContainerGap()
							.addComponent(contenedorMenu, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(logo2))
						.addGroup(gl_contenedorPrincipal.createSequentialGroup()
							.addGap(30)
							.addComponent(separador1, GroupLayout.PREFERRED_SIZE, 762, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contenedorPrincipal.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
								.addComponent(contenedorReviews, GroupLayout.PREFERRED_SIZE, 817, GroupLayout.PREFERRED_SIZE)
								.addComponent(separador2, GroupLayout.PREFERRED_SIZE, 762, GroupLayout.PREFERRED_SIZE))))
					.addGap(21))
		);
		
		JPanel contenedorReview1 = new JPanel();
		contenedorReview1.setBackground(new Color(38, 38, 38));
		
		JSeparator separadorReviews2 = new JSeparator();
		GroupLayout gl_contenedorReviews = new GroupLayout(contenedorReviews);
		gl_contenedorReviews.setHorizontalGroup(
			gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorReviews.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
						.addComponent(separadorReviews2, GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
						.addComponent(contenedorReview1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE))
					.addGap(20))
		);
		gl_contenedorReviews.setVerticalGroup(
			gl_contenedorReviews.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorReviews.createSequentialGroup()
					.addGap(50)
					.addComponent(contenedorReview1, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addGap(50)
					.addComponent(separadorReviews2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(470))
		);
		
		imagenReview2 = new JLabel("");
		imagenReview2.setHorizontalAlignment(SwingConstants.CENTER);
		imagenReview2.setIcon(new ImageIcon(PantallaBusqueda.class.getResource("/assets/poster_placeholder.png")));
		
		lblTitulo = new JLabel("<TITULO>");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator SeparadorRev2 = new JSeparator();
		SeparadorRev2.setOrientation(SwingConstants.VERTICAL);
		
		campoSinopsisArriba = new JTextField();
		campoSinopsisArriba.setBackground(Color.WHITE);
		campoSinopsisArriba.setEditable(false);
		campoSinopsisArriba.setColumns(10);
		
		campoPuntuacionArriba = new JTextField();
		campoPuntuacionArriba.setForeground(Color.WHITE);
		campoPuntuacionArriba.setBackground(new Color(38, 38, 38));
		campoPuntuacionArriba.setEditable(false);
		campoPuntuacionArriba.setFont(new Font("Tahoma", Font.PLAIN, 30));
		campoPuntuacionArriba.setHorizontalAlignment(SwingConstants.CENTER);
		campoPuntuacionArriba.setText("10/10");
		campoPuntuacionArriba.setColumns(10);
		
		lblSinopsis = new JLabel(idio.traduz("synopsis"));
		lblSinopsis.setForeground(Color.WHITE);
		lblSinopsis.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinopsis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		botonHacerReviews2 = new JButton(idio.traduz("button_newReview"));
		botonHacerReviews2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearReview cr1=new CrearReview(c1);
				cr1.setVisible(true);
				
				PantallaBusqueda.this.dispose();
			}
		});
		botonHacerReviews2.setBackground(Color.WHITE);
		
		botonVerReviews2 = new JButton(idio.traduz("button_seeReview"));
		botonVerReviews2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (peliculas)
				{
					Pantalla_Pelicula pp=new Pantalla_Pelicula(c1, true);
					pp.setVisible(true);
					
					PantallaBusqueda.this.dispose();
				}
				
				if (series)
				{
					Pantalla_Pelicula pp=new Pantalla_Pelicula(c1, false);
					pp.setVisible(true);
					
					PantallaBusqueda.this.dispose();
				}
				
				if (!peliculas && !series)
				{
					boolean tipo=c1.tipoReview(lblTitulo.getText());
					
					Pantalla_Pelicula pp=new Pantalla_Pelicula(c1, tipo);
					pp.setVisible(true);
					
					PantallaBusqueda.this.dispose();
				}
			}
		});
		botonVerReviews2.setBackground(Color.WHITE);
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
									.addComponent(lblSinopsis, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
									.addGap(86))
								.addGroup(gl_contenedorReview1.createSequentialGroup()
									.addGap(18)
									.addComponent(campoSinopsisArriba, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGap(5))
						.addGroup(Alignment.TRAILING, gl_contenedorReview1.createSequentialGroup()
							.addGap(119)
							.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
							.addGap(62)))
					.addComponent(campoPuntuacionArriba, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(campoPuntuacionArriba, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contenedorReview1.createSequentialGroup()
							.addGroup(gl_contenedorReview1.createParallelGroup(Alignment.TRAILING)
								.addComponent(SeparadorRev2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
								.addComponent(imagenReview2, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_contenedorReview1.createSequentialGroup()
									.addComponent(lblTitulo)
									.addGap(18)
									.addComponent(lblSinopsis, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(campoSinopsisArriba, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
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
		contenedorBusqueda.setBackground(new Color(38, 38, 38));
		
		JSeparator separadorMenu1 = new JSeparator();
		
		JPanel contenedorCategorias = new JPanel();
		contenedorCategorias.setBackground(new Color(38, 38, 38));
		
		lblCategorias = new JLabel(idio.traduz("categories"));
		lblCategorias.setForeground(Color.WHITE);
		lblCategorias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategorias.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		lblGeneros = new JLabel(idio.traduz("genres"));
		lblGeneros.setForeground(Color.WHITE);
		lblGeneros.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneros.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JPanel contenedorGeneros = new JPanel();
		contenedorGeneros.setBackground(new Color(38, 38, 38));
		
		JSeparator separadorMenu2 = new JSeparator();
		
		JSeparator separadorMenu3 = new JSeparator();
		
		lblBuscar = new JLabel(idio.traduz("search"));
		lblBuscar.setForeground(Color.WHITE);
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
		
		genero1 = new JCheckBox(idio.traduz("gen_action"));
		genero1.setForeground(Color.WHITE);
		genero1.setBackground(new Color(38, 38, 38));
		genero1.setHorizontalAlignment(SwingConstants.CENTER);
		genero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (genero1.isSelected())
				{
					genero2.setEnabled(false);
					genero3.setEnabled(false);
					genero4.setEnabled(false);
				}
				else
				{
					genero2.setEnabled(true);
					genero3.setEnabled(true);
					genero4.setEnabled(true);
				}
			}
		});
		genero1.setEnabled(false);
		contenedorGeneros.add(genero1);
		
		genero2 = new JCheckBox(idio.traduz("gen_horror"));
		genero2.setForeground(Color.WHITE);
		genero2.setBackground(new Color(38, 38, 38));
		genero2.setHorizontalAlignment(SwingConstants.CENTER);
		genero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (genero2.isSelected())
				{
					genero1.setEnabled(false);
					genero3.setEnabled(false);
					genero4.setEnabled(false);
				}
				else
				{
					genero1.setEnabled(true);
					genero3.setEnabled(true);
					genero4.setEnabled(true);
				}
			}
		});
		genero2.setEnabled(false);
		contenedorGeneros.add(genero2);
		
		genero3 = new JCheckBox(idio.traduz("gen_comedy"));
		genero3.setForeground(Color.WHITE);
		genero3.setBackground(new Color(38, 38, 38));
		genero3.setHorizontalAlignment(SwingConstants.CENTER);
		genero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (genero3.isSelected())
				{
					genero1.setEnabled(false);
					genero2.setEnabled(false);
					genero4.setEnabled(false);
				}
				else
				{
					genero1.setEnabled(true);
					genero2.setEnabled(true);
					genero4.setEnabled(true);
				}
			}
		});
		genero3.setEnabled(false);
		contenedorGeneros.add(genero3);
		
		genero4 = new JCheckBox(idio.traduz("gen_scienceFiction"));
		genero4.setForeground(Color.WHITE);
		genero4.setBackground(new Color(38, 38, 38));
		genero4.setHorizontalAlignment(SwingConstants.CENTER);
		genero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (genero4.isSelected())
				{
					genero1.setEnabled(false);
					genero2.setEnabled(false);
					genero3.setEnabled(false);
				}
				else
				{
					genero1.setEnabled(true);
					genero2.setEnabled(true);
					genero3.setEnabled(true);
				}
			}
		});
		genero4.setEnabled(false);
		contenedorGeneros.add(genero4);
		contenedorCategorias.setLayout(new GridLayout(2, 0, 0, 0));
		
		
		
		botonCateg1 = new JButton(idio.traduz("button_movies"));
		botonCateg1.setBackground(Color.WHITE);
		botonCateg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				genero1.setEnabled(true);
				genero2.setEnabled(true);
				genero3.setEnabled(true);
				genero4.setEnabled(true);
				
				if (series==true)
				{
					series=false;
					peliculas=true;
				}
				else
				{
					peliculas=true;
				}
			}
		});
		contenedorCategorias.add(botonCateg1);
		
		botonCateg2 = new JButton(idio.traduz("button_shows"));
		botonCateg2.setBackground(Color.WHITE);
		botonCateg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				genero1.setEnabled(true);
				genero2.setEnabled(true);
				genero3.setEnabled(true);
				genero4.setEnabled(true);
				
				if (peliculas==true)
				{
					peliculas=false;
					series=true;
				}
				else
				{
					series=true;
				}
			}
		});
		contenedorCategorias.add(botonCateg2);
		contenedorBusqueda.setLayout(new GridLayout(2, 1, 0, 0));
		
		campoBuscar = new JTextField();
		contenedorBusqueda.add(campoBuscar);
		campoBuscar.setColumns(10);
		
		botonBuscar = new JButton(idio.traduz("search"));
		botonBuscar.setBackground(Color.WHITE);
		botonBuscar.setForeground(Color.BLACK);
		botonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (peliculas==true)
				{
					if (c1.buscarPelicula(campoBuscar.getText(), lblTitulo, campoSinopsisArriba, campoPuntuacionArriba))
					{
						c1.reviewBuscado(c1.idReview(lblTitulo.getText()), lblTitulo.getText());
						contenedorReview1.setVisible(true);
					}
				}
				
				if (series==true)
				{
					if (c1.buscarSerie(campoBuscar.getText(), lblTitulo, campoSinopsisArriba, campoPuntuacionArriba)) 
					{
						c1.reviewBuscado(c1.idReview(lblTitulo.getText()), lblTitulo.getText());
						contenedorReview1.setVisible(true);
					}
						
				}
				
				if (peliculas==false && series==false)
				{
					if (c1.buscarReview(campoBuscar.getText(), lblTitulo, campoSinopsisArriba, campoPuntuacionArriba))
					{
						{
								c1.reviewBuscado(c1.idReview(lblTitulo.getText()), lblTitulo.getText());
								contenedorReview1.setVisible(true);
						}
					}
				}
			}
		});
		contenedorBusqueda.add(botonBuscar);
		contenedorMenu.setLayout(gl_contenedorMenu);
		contenedorPrincipal.setLayout(gl_contenedorPrincipal);
		
		contenedorReview1.setVisible(false);
	}
}

