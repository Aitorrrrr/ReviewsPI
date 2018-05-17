package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Login extends JFrame {

	private JPanel contenedorPrincipal;
	private JTextField campoNombreUsuario;
	private JTextField campoUsuario;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnIdioma = new JMenu("Idioma");
		menuBar.add(mnIdioma);
		
		JMenuItem mntmEspaol = new JMenuItem("Espa\u00F1ol");
		mntmEspaol.setIcon(new ImageIcon(Login.class.getResource("/assets/esp.png")));
		mnIdioma.add(mntmEspaol);
		
		JMenuItem mntmIngles = new JMenuItem("Ingles");
		mntmIngles.setIcon(new ImageIcon(Login.class.getResource("/assets/eng.png")));
		mnIdioma.add(mntmIngles);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		
		JPanel contenedorLogo = new JPanel();
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		
		JPanel contenedorCampos = new JPanel();
		
		JSeparator separador1 = new JSeparator();
		separador1.setForeground(Color.BLACK);
		
		JPanel contenedorBotones = new JPanel();
		GroupLayout gl_contenedorPrincipal = new GroupLayout(contenedorPrincipal);
		gl_contenedorPrincipal.setHorizontalGroup(
			gl_contenedorPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contenedorPrincipal.createSequentialGroup()
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
					.addGap(40)
					.addComponent(contenedorLogo, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(separador1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(contenedorCampos, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(contenedorBotones, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		contenedorBotones.setLayout(new GridLayout(0, 5, 0, 0));
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_8);
		
		JButton botonInicioSesion = new JButton("Iniciar Sesion");
		contenedorBotones.add(botonInicioSesion);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_9);
		
		JButton botonNuevoUsuario = new JButton("Nuevo Usuario");
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
		
		JButton botonRecuperarPassword = new JButton("Recuperar Contrase\u00F1a");
		contenedorBotones.add(botonRecuperarPassword);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_13);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		contenedorBotones.add(horizontalStrut_14);
		contenedorCampos.setLayout(new GridLayout(4, 3, 0, 0));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_1);
		
		JLabel labelNombreUsuario = new JLabel("Nombre de Usuario");
		labelNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		contenedorCampos.add(labelNombreUsuario);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut);
		
		campoNombreUsuario = new JTextField();
		contenedorCampos.add(campoNombreUsuario);
		campoNombreUsuario.setColumns(10);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_3);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_4);
		
		JLabel labelPassword = new JLabel("Contrase\u00F1a");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		contenedorCampos.add(labelPassword);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_5);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_6);
		
		campoUsuario = new JTextField();
		contenedorCampos.add(campoUsuario);
		campoUsuario.setColumns(10);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		contenedorCampos.add(horizontalStrut_7);
		contenedorLogo.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setHorizontalAlignment(SwingConstants.CENTER);
		labelLogo.setIcon(new ImageIcon(Login.class.getResource("/assets/placeholder.png")));
		contenedorLogo.add(labelLogo);
		contenedorPrincipal.setLayout(gl_contenedorPrincipal);
	}
}
