package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

import controlador.Controlador;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JButton;

public class Pantalla_Usuario extends JFrame {

	protected JPanel contentPane;
	protected JPanel panelBiografia;
	protected JPanel panelComentarios;
	protected JPanel panelPublicaciones;
	protected JPanel panelComents;
	protected JPanel panelDatos;
	protected JLabel lblUltimasPublicaciones;
	protected JMenuBar menuBar;
	protected JScrollPane scrollComentarios;
	protected JTextArea textComentarios;
	protected JLabel lblNombre;
	protected JLabel lblNombreReal;
	protected JLabel lblEmail;
	protected JLabel lblGenero;
	protected JLabel lblFechaNacimiento;
	protected JTextField textNombre;
	protected JTextField textEmail;
	protected JTextField textNombreReal;
	protected JTextField textGenero;
	protected JTextField textFechaNacimiento;

	public Pantalla_Usuario(Controlador c1) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 621);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNombreUsuario = new JMenu("Nombre de Usuario");
		mnNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnNombreUsuario);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		mnNombreUsuario.add("Perfil");
		mnNombreUsuario.add("Configuración");
		mnNombreUsuario.add("Salir...");
		
		panelBiografia = new JPanel();
		panelBiografia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelComentarios = new JPanel();
		panelComentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelComentarios, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
						.addComponent(panelBiografia, GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelBiografia, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelComentarios, GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
					.addGap(21))
		);
		
		panelPublicaciones = new JPanel();
		panelPublicaciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 51, 0), new Color(255, 51, 0)));
		
		panelComents = new JPanel();
		GroupLayout gl_panelComentarios = new GroupLayout(panelComentarios);
		gl_panelComentarios.setHorizontalGroup(
			gl_panelComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComentarios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelComentarios.createParallelGroup(Alignment.LEADING)
						.addComponent(panelPublicaciones, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
						.addGroup(gl_panelComentarios.createSequentialGroup()
							.addComponent(panelComents, GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
							.addGap(2)))
					.addContainerGap())
		);
		gl_panelComentarios.setVerticalGroup(
			gl_panelComentarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComentarios.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelPublicaciones, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelComents, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
					.addGap(8))
		);
		panelComents.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollComentarios = new JScrollPane();
		panelComents.add(scrollComentarios);
		
		textComentarios = new JTextArea();
		textComentarios.setEditable(false);
		scrollComentarios.setViewportView(textComentarios);
		panelPublicaciones.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblUltimasPublicaciones = new JLabel("Ultimas Publicaciones: ");
		lblUltimasPublicaciones.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblUltimasPublicaciones.setHorizontalAlignment(SwingConstants.CENTER);
		panelPublicaciones.add(lblUltimasPublicaciones);
		panelComentarios.setLayout(gl_panelComentarios);
		
		panelDatos = new JPanel();
		panelDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 51, 0), new Color(255, 51, 0)));
		GroupLayout gl_panelBiografia = new GroupLayout(panelBiografia);
		gl_panelBiografia.setHorizontalGroup(
			gl_panelBiografia.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBiografia.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelDatos, GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
					.addGap(13))
		);
		gl_panelBiografia.setVerticalGroup(
			gl_panelBiografia.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBiografia.createSequentialGroup()
					.addComponent(panelDatos, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelDatos.setLayout(new GridLayout(5, 8, 0, 0));
		
		lblNombre = new JLabel("Nombre de Usuario:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textNombre);
		textNombre.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textEmail);
		textEmail.setColumns(10);
		
		lblNombreReal = new JLabel("Nombre Real:");
		lblNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreReal.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblNombreReal);
		
		textNombreReal = new JTextField();
		textNombreReal.setEditable(false);
		textNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textNombreReal);
		textNombreReal.setColumns(10);
		
		lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblFechaNacimiento);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setEditable(false);
		textFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textFechaNacimiento);
		textFechaNacimiento.setColumns(10);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblGenero);
		
		textGenero = new JTextField();
		textGenero.setEditable(false);
		textGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textGenero);
		textGenero.setColumns(10);
		panelBiografia.setLayout(gl_panelBiografia);
		
		contentPane.setLayout(gl_contentPane);
		
		c1.MostrarComentariosUsuario("1", textComentarios);
		c1.MostrarNombreUsuario("1", textNombre);
		c1.MostrarEmail("1", textEmail);
		c1.MostrarFechaNacimiento("1", textFechaNacimiento);
		c1.mostrarNombreApellidos("1", textNombreReal);
		c1.Genero("1", textGenero);
	}
}
