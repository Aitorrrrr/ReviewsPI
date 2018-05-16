package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Pantalla_Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textNombreUsuario;
	private JTextField textEmail;
	private JTextField textNombreReal;
	private JTextField textFechaNacimiento;
	private JTextField textGenero;

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
		setBounds(100, 100, 963, 619);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNombre.setEditable(false);
		textNombre.setText("Nombre de Usuario/Admin");
		menuBar.add(textNombre);
		textNombre.setColumns(10);
		
		JMenu mnCuenta = new JMenu("Cuenta");
		mnCuenta.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnCuenta);
		mnCuenta.add("Perfil");
		mnCuenta.add("Configuracion");
		mnCuenta.add("Salir");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNombre.setBounds(39, 11, 144, 39);
		contentPane.add(lblNombre);
		
		JPanel panelFotoPerfil = new JPanel();
		panelFotoPerfil.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelFotoPerfil.setBounds(10, 48, 210, 260);
		contentPane.add(panelFotoPerfil);
		
		JPanel Barra1 = new JPanel();
		Barra1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		Barra1.setBounds(246, 11, 4, 531);
		contentPane.add(Barra1);
		Barra1.setLayout(null);
		
		JPanel Barra2 = new JPanel();
		Barra2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		Barra2.setBounds(260, 154, 677, 4);
		contentPane.add(Barra2);
		
		JPanel panelBiografia = new JPanel();
		panelBiografia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		panelBiografia.setBounds(260, 11, 677, 133);
		contentPane.add(panelBiografia);
		panelBiografia.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreDeUsuario.setBounds(10, 11, 151, 28);
		panelBiografia.add(lblNombreDeUsuario);
		
		textNombreUsuario = new JTextField();
		textNombreUsuario.setEditable(false);
		textNombreUsuario.setBounds(166, 11, 145, 28);
		panelBiografia.add(textNombreUsuario);
		textNombreUsuario.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		textEmail.setBounds(166, 50, 145, 28);
		panelBiografia.add(textEmail);
		
		JLabel labelEmail = new JLabel("Email:");
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelEmail.setBounds(10, 50, 151, 28);
		panelBiografia.add(labelEmail);
		
		JLabel labelNombreReal = new JLabel("Nombre Real:");
		labelNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelNombreReal.setBounds(10, 89, 151, 28);
		panelBiografia.add(labelNombreReal);
		
		textNombreReal = new JTextField();
		textNombreReal.setEditable(false);
		textNombreReal.setColumns(10);
		textNombreReal.setBounds(166, 89, 145, 28);
		panelBiografia.add(textNombreReal);
		
		JLabel labelFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		labelFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelFechaNacimiento.setBounds(344, 11, 167, 28);
		panelBiografia.add(labelFechaNacimiento);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setEditable(false);
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(522, 13, 145, 28);
		panelBiografia.add(textFechaNacimiento);
		
		JLabel labelGenero = new JLabel("Genero:");
		labelGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelGenero.setBounds(344, 50, 167, 28);
		panelBiografia.add(labelGenero);
		
		textGenero = new JTextField();
		textGenero.setEditable(false);
		textGenero.setColumns(10);
		textGenero.setBounds(522, 54, 145, 28);
		panelBiografia.add(textGenero);
		
		JButton btnAnadirAmigo = new JButton("A\u00F1adir Amigo");
		btnAnadirAmigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAnadirAmigo.setBounds(10, 328, 210, 31);
		contentPane.add(btnAnadirAmigo);
		
		JButton buttonEnviarMensaje = new JButton("Enviar Mensaje");
		buttonEnviarMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonEnviarMensaje.setBounds(10, 370, 210, 31);
		contentPane.add(buttonEnviarMensaje);
		
		JButton buttonBloquearUsuario = new JButton("Bloquear Usuario");
		buttonBloquearUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonBloquearUsuario.setBounds(10, 412, 210, 31);
		contentPane.add(buttonBloquearUsuario);
		
		JPanel panelUltimasPublicaciones = new JPanel();
		panelUltimasPublicaciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		panelUltimasPublicaciones.setBounds(260, 169, 677, 373);
		contentPane.add(panelUltimasPublicaciones);
		panelUltimasPublicaciones.setLayout(null);
		
		JLabel lblUltimasPublicaciones = new JLabel("Ultimas Publicaciones:");
		lblUltimasPublicaciones.setForeground(Color.BLACK);
		lblUltimasPublicaciones.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUltimasPublicaciones.setBounds(10, 11, 235, 27);
		panelUltimasPublicaciones.add(lblUltimasPublicaciones);
	}

}
