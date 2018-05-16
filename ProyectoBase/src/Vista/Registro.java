package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private Border bordejpanel;
	private JTextField textNombre;
	private JTextField textEmail;
	private JTextField textNombreReal;
	private JTextField textFechaNacimiento;
	private JPasswordField pwdContraseña;
	private JPasswordField passwordConfirmar;
	private JLabel labelEmail;
	private JLabel lblNombreDeUsuario;
	private JLabel lblConfirmarContrasea;
	private JLabel lblDatosOpcionales;
	private JLabel lblGenero;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblNombreReal;
	private JLabel lblSubirLaFoto;
	private JLabel lblDatos;
	private JLabel lblNewLabel;
	private JPanel Captcha;
	private JPanel Condiciones;
	private JPanel panel_1;
	private JRadioButton rdbtnCondiciones;
	private JRadioButton rdbtnNotificaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setForeground(Color.WHITE);
		panel.setBounds(38, 56, 408, 255);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		textNombre.setBounds(187, 39, 211, 35);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		textEmail.setColumns(10);
		textEmail.setBounds(187, 85, 211, 35);
		panel.add(textEmail);
		
		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(187, 131, 211, 35);
		panel.add(pwdContraseña);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(10, 131, 99, 35);
		panel.add(lblContrasea);
		
		labelEmail = new JLabel("Email:");
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelEmail.setBounds(10, 85, 99, 35);
		panel.add(labelEmail);
		
		lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreDeUsuario.setBounds(10, 39, 153, 35);
		panel.add(lblNombreDeUsuario);
		
		lblConfirmarContrasea = new JLabel("Confirmar Contrase\u00F1a:");
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConfirmarContrasea.setBounds(10, 175, 171, 35);
		panel.add(lblConfirmarContrasea);
		
		passwordConfirmar = new JPasswordField();
		passwordConfirmar.setBounds(187, 177, 211, 35);
		panel.add(passwordConfirmar);
		
		lblDatos = new JLabel("DATOS OBLIGATORIOS");
		lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDatos.setForeground(Color.GRAY);
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setBounds(99, 11, 284, 34);
		contentPane.add(lblDatos);
		
		lblDatosOpcionales = new JLabel("DATOS OPCIONALES");
		lblDatosOpcionales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosOpcionales.setForeground(Color.GRAY);
		lblDatosOpcionales.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDatosOpcionales.setBounds(522, 11, 284, 34);
		contentPane.add(lblDatosOpcionales);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(465, 56, 408, 255);
		contentPane.add(panel_1);
		
		textNombreReal = new JTextField();
		textNombreReal.setFont(new Font("Tahoma", Font.BOLD, 18));
		textNombreReal.setColumns(10);
		textNombreReal.setBounds(187, 39, 211, 35);
		panel_1.add(textNombreReal);
		
		textFechaNacimiento = new JTextField();
		textFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFechaNacimiento.setColumns(10);
		textFechaNacimiento.setBounds(187, 85, 211, 35);
		panel_1.add(textFechaNacimiento);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setBounds(10, 131, 99, 35);
		panel_1.add(lblGenero);
		
		lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaDeNacimiento.setBounds(10, 85, 167, 35);
		panel_1.add(lblFechaDeNacimiento);
		
		lblNombreReal = new JLabel("Nombre Real:");
		lblNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreReal.setBounds(10, 39, 153, 35);
		panel_1.add(lblNombreReal);
		
		lblSubirLaFoto = new JLabel("Subir foto:");
		lblSubirLaFoto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSubirLaFoto.setBounds(10, 175, 171, 35);
		panel_1.add(lblSubirLaFoto);
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxGenero.addItem("Hombre");
		comboBoxGenero.addItem("Mujer");
		comboBoxGenero.addItem("Otro...");
		comboBoxGenero.setBounds(187, 131, 211, 35);
		panel_1.add(comboBoxGenero);
		
		Captcha = new JPanel();
		Captcha.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Captcha.setBounds(38, 322, 408, 109);
		contentPane.add(Captcha);
		Captcha.setLayout(null);
		
		lblNewLabel = new JLabel("Captcha");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 22, 299, 63);
		Captcha.add(lblNewLabel);
		
		Condiciones = new JPanel();
		Condiciones.setLayout(null);
		Condiciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Condiciones.setBounds(465, 322, 408, 109);
		contentPane.add(Condiciones);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(77, 64, 126, 34);
		Condiciones.add(btnAceptar);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnRes = new JButton("Restablecer");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textNombre.setText(null);
				textEmail.setText(null);
				pwdContraseña.setText(null);
				passwordConfirmar.setText(null);
				textNombreReal.setText(null);
				textFechaNacimiento.setText(null);
				
			}
		});
		btnRes.setBounds(247, 64, 126, 34);
		Condiciones.add(btnRes);
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		rdbtnCondiciones = new JRadioButton("Acepto las condiciones de uso");
		rdbtnCondiciones.setSelected(false);
		rdbtnCondiciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnCondiciones.setBounds(77, 7, 296, 23);
		Condiciones.add(rdbtnCondiciones);
		
		rdbtnNotificaciones = new JRadioButton("Quiero recibir correos sobre noticias");
		rdbtnNotificaciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNotificaciones.setBounds(77, 33, 281, 23);
		Condiciones.add(rdbtnNotificaciones);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
