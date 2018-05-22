package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Vista.Login;
import controlador.Controlador;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contenedorPrincipal;
	private JTextField campoNom;
	private JTextField campoContra;
	
	
	private JMenu mnIdioma;
	private JMenuItem mntmEsp;
	private JMenuItem mntmEng;
	private JButton botonInicioSesion;
	private JButton botonNuevoUsuario;
	private JButton botonRecuperarPassword;
	private JLabel labelNombreUsuario;
	private JLabel labelPassword;
	
	private Controlador c1;
	private boolean conectado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		c1=new Controlador();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\miamme\\Desktop\\ico.png"));
		setTitle("REVIEWSX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 711);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(153, 0, 0));
		setJMenuBar(menuBar);
		
		mnIdioma = new JMenu("Idioma");
		mnIdioma.setBorder(null);
		mnIdioma.setMinimumSize(new Dimension(50, 50));
		mnIdioma.setBackground(Color.DARK_GRAY);
		mnIdioma.setForeground(Color.WHITE);
		menuBar.add(mnIdioma);
		
		mntmEsp = new JMenuItem("Espa\u00F1ol");
		mntmEsp.setForeground(Color.WHITE);
		mntmEsp.setBackground(new Color(153, 0, 0));
		mntmEsp.setIcon(new ImageIcon(Login.class.getResource("/assets/esp.png")));
		mnIdioma.add(mntmEsp);
		
		mntmEng = new JMenuItem("Ingles");
		mntmEng.setForeground(Color.WHITE);
		mntmEng.setBackground(new Color(153, 0, 0));
		mntmEng.setIcon(new ImageIcon(Login.class.getResource("/assets/eng.png")));
		mnIdioma.add(mntmEng);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBackground(new Color(38, 38, 38));
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		
		JPanel contenedorLogo = new JPanel();
		contenedorLogo.setBackground(new Color(38, 38, 38));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		
		JPanel contenedorCampos = new JPanel();
		contenedorCampos.setBackground(new Color(38, 38, 38));
		
		JSeparator separador1 = new JSeparator();
		separador1.setForeground(Color.WHITE);
		
		JPanel contenedorBotones = new JPanel();
		contenedorBotones.setBackground(new Color(38, 38, 38));
		GroupLayout gl_contenedorPrincipal = new GroupLayout(contenedorPrincipal);
		gl_contenedorPrincipal.setHorizontalGroup(
			gl_contenedorPrincipal.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addGap(130)
					.addGroup(gl_contenedorPrincipal.createParallelGroup(Alignment.TRAILING)
						.addComponent(contenedorLogo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
						.addComponent(contenedorCampos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
						.addComponent(separador1, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
						.addComponent(contenedorBotones, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
					.addGap(142))
		);
		gl_contenedorPrincipal.setVerticalGroup(
			gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedorPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(contenedorLogo, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separador1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(contenedorCampos, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(contenedorBotones, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		contenedorBotones.setLayout(new GridLayout(0, 5, 0, 0));
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_8);
		
		botonInicioSesion = new JButton("Iniciar Sesion");
		botonInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conectado=c1.primeraConex();
				
				if (conectado)
				{
					c1.desconectar();
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this, "No se puede conectar con la bbdd");
				}
				
				if (c1.loginUser(campoNom.getText(), campoContra.getText()))
				{
					JOptionPane.showMessageDialog(Login.this, "Dentro");
					Principal p1=new Principal(c1);
					p1.setVisible(true);
					Login.this.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this, "User/PW erróneos");
				}
			}
		});
		botonInicioSesion.setBackground(Color.WHITE);
		contenedorBotones.add(botonInicioSesion);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_9);
		
		botonNuevoUsuario = new JButton("Nuevo Usuario");
		botonNuevoUsuario.setBackground(Color.WHITE);
		contenedorBotones.add(botonNuevoUsuario);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_12);
		
		Component verticalStrut = Box.createVerticalStrut(50);
		contenedorBotones.add(verticalStrut);
		
		Component verticalStrut_1 = Box.createVerticalStrut(50);
		contenedorBotones.add(verticalStrut_1);
		
		Component verticalStrut_2 = Box.createVerticalStrut(50);
		contenedorBotones.add(verticalStrut_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		contenedorBotones.add(verticalStrut_3);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		contenedorBotones.add(verticalStrut_4);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_10);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_11);
		
		botonRecuperarPassword = new JButton("Recuperar Contrase\u00F1a");
		botonRecuperarPassword.setBackground(Color.WHITE);
		contenedorBotones.add(botonRecuperarPassword);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_13);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_14);
		contenedorCampos.setLayout(new GridLayout(4, 3, 0, 0));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_1);
		
		labelNombreUsuario = new JLabel("Nombre de Usuario");
		labelNombreUsuario.setForeground(Color.WHITE);
		labelNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		contenedorCampos.add(labelNombreUsuario);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut);
		
		campoNom = new JTextField();
		contenedorCampos.add(campoNom);
		campoNom.setColumns(10);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_3);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_4);
		
		labelPassword = new JLabel("Contrase\u00F1a");
		labelPassword.setForeground(Color.WHITE);
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		contenedorCampos.add(labelPassword);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_5);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_6);
		
		campoContra = new JTextField();
		contenedorCampos.add(campoContra);
		campoContra.setColumns(10);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_7);
		contenedorLogo.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel labelLogo = new JLabel("");
		
	      BufferedImage img = null;
	        try {
	            img = ImageIO.read(new File("assets/logo.png"));
	            Image Dimg=img.getScaledInstance(580, 350, Image.SCALE_SMOOTH);
		        ImageIcon iIcon= new ImageIcon(Dimg);
		        labelLogo.setHorizontalAlignment(SwingConstants.CENTER);
		        labelLogo.setIcon(iIcon);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
		contenedorLogo.add(labelLogo);
		contenedorPrincipal.setLayout(gl_contenedorPrincipal);
	}
}
