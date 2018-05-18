package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
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
	protected JPanel panelFoto;
	protected JPanel panelBiografia;
	protected JPanel panelComentarios;
	protected JPanel panelPublicaciones;
	protected JPanel panelComents;
	protected JPanel panelNombre;
	protected JPanel panelDatos;
	protected JPanel panelFotoUsuario;
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
	protected JLabel lblUsuario;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Usuario frame = new Pantalla_Usuario();
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
	public Pantalla_Usuario() {
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
		
		panelFoto = new JPanel();
		panelFoto.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelBiografia = new JPanel();
		panelBiografia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelComentarios = new JPanel();
		panelComentarios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelFoto, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelComentarios, GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
						.addComponent(panelBiografia, GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panelFoto, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
							.addGap(83))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panelBiografia, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelComentarios, GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
							.addGap(21))))
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
					.addComponent(panelDatos, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
					.addGap(21))
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
		
		panelNombre = new JPanel();
		panelNombre.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 204, 255), new Color(51, 204, 255)));
		
		panelFotoUsuario = new JPanel();
		panelFotoUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 51, 0), new Color(255, 51, 0)));
		GroupLayout gl_panelFoto = new GroupLayout(panelFoto);
		gl_panelFoto.setHorizontalGroup(
			gl_panelFoto.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelFoto.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(13))
				.addGroup(gl_panelFoto.createSequentialGroup()
					.addGap(13)
					.addComponent(panelFotoUsuario, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelFoto.setVerticalGroup(
			gl_panelFoto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelFoto.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelNombre, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelFotoUsuario, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
					.addGap(52))
		);
		panelFotoUsuario.setLayout(new GridLayout(1, 0, 0, 0));
		panelNombre.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		panelNombre.add(lblUsuario);
		panelFoto.setLayout(gl_panelFoto);
		contentPane.setLayout(gl_contentPane);
	}
}
