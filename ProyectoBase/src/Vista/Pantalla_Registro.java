package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pantalla_Registro extends JFrame {

	private JPanel contentPane;
	private JPanel panelDatosObligatorios;
	private JPanel panelDatosOpcionales;
	private JPanel panelCondiciones;
	private JPanel panelDatos2;
	private JPanel panelDatosOpcionales2;
	private JPanel panelTexto;
	private JPanel panelDatos;
	private JLabel lblDatosOpcionales;
	private JLabel lblFechaNac;
	private JLabel labelApellido;
	private JLabel labelNombreReal;
	private JLabel labelGenero;
	private JLabel lblNombre;
	private JLabel lblEmail;
	private JLabel lblContrasena;
	private JLabel lblRepetirContraseña;
	private JLabel lblDatosObligatorios;
	private JTextField textNombre;
	private JTextField textEmail;
	private JPasswordField passwordContrasena;
	private JPasswordField passwordRepetirContrasena;
	private JTextField textNombreReal;
	private JTextField textApell;
	private JTextField textFecha;
	private JButton btnRegistrar;
	private JButton buttonRestablecer;
	private JComboBox comboBoxGenero;

	
	public Pantalla_Registro(Controlador c1) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panelDatosObligatorios = new JPanel();
		panelDatosObligatorios.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelDatosOpcionales = new JPanel();
		panelDatosOpcionales.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelCondiciones = new JPanel();
		panelCondiciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelDatosObligatorios, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelCondiciones, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelDatosOpcionales, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDatosOpcionales, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
						.addComponent(panelDatosObligatorios, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelCondiciones, GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
					.addGap(29))
		);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pw1=new String(passwordContrasena.getPassword());
				String pw2=new String(passwordRepetirContrasena.getPassword());
				
				System.out.println(pw1+pw2);
				
				if (comprobarPassword(pw1, pw2))
				{
					if (comprobarEmail(textEmail.getText()))
					{
						
					}
					else
					{
						JOptionPane.showMessageDialog(Pantalla_Registro.this, "E-mail no valido, recuerde, nombre@dominio.es");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(Pantalla_Registro.this, "Los campos contraseña no coinciden");
				}
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		buttonRestablecer = new JButton("Restablecer");
		buttonRestablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textNombre.setText(null);
				textEmail.setText(null);
				passwordContrasena.setText(null);
				passwordRepetirContrasena.setText(null);
				textNombreReal.setText(null);
				textApell.setText(null);
				textFecha.setText(null);
				comboBoxGenero.setSelectedIndex(2);
			}
		});
		buttonRestablecer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l1=new Login();
				l1.setVisible(true);
				Pantalla_Registro.this.dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panelCondiciones = new GroupLayout(panelCondiciones);
		gl_panelCondiciones.setHorizontalGroup(
			gl_panelCondiciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCondiciones.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panelCondiciones.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnVolver, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnRegistrar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addGap(65)
					.addComponent(buttonRestablecer, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		gl_panelCondiciones.setVerticalGroup(
			gl_panelCondiciones.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCondiciones.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_panelCondiciones.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegistrar, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addComponent(buttonRestablecer, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(btnVolver)
					.addGap(33))
		);
		panelCondiciones.setLayout(gl_panelCondiciones);
		
		panelDatos2 = new JPanel();
		panelDatos2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		
		lblDatosOpcionales = new JLabel("Datos Opcionales:");
		lblDatosOpcionales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosOpcionales.setForeground(Color.RED);
		lblDatosOpcionales.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panelDatos2 = new GroupLayout(panelDatos2);
		gl_panelDatos2.setHorizontalGroup(
			gl_panelDatos2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 333, Short.MAX_VALUE)
				.addGroup(gl_panelDatos2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDatosOpcionales, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelDatos2.setVerticalGroup(
			gl_panelDatos2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 30, Short.MAX_VALUE)
				.addComponent(lblDatosOpcionales, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		panelDatos2.setLayout(gl_panelDatos2);
		
		
		
		panelDatosOpcionales2 = new JPanel();
		panelDatosOpcionales2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelDatosOpcionales2.setLayout(new GridLayout(8, 1, 0, 0));
		
		labelNombreReal = new JLabel("Nombre Real:");
		labelNombreReal.setHorizontalAlignment(SwingConstants.CENTER);
		labelNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatosOpcionales2.add(labelNombreReal);
		
		textNombreReal = new JTextField();
		textNombreReal.setHorizontalAlignment(SwingConstants.CENTER);
		textNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNombreReal.setColumns(10);
		panelDatosOpcionales2.add(textNombreReal);
		
		labelApellido = new JLabel("Apellido:");
		labelApellido.setHorizontalAlignment(SwingConstants.CENTER);
		labelApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatosOpcionales2.add(labelApellido);
		
		textApell = new JTextField();
		textApell.setHorizontalAlignment(SwingConstants.CENTER);
		textApell.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textApell.setColumns(10);
		panelDatosOpcionales2.add(textApell);
		
		labelGenero = new JLabel("Genero:");
		labelGenero.setHorizontalAlignment(SwingConstants.CENTER);
		labelGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatosOpcionales2.add(labelGenero);
		
		comboBoxGenero = new JComboBox();
		comboBoxGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxGenero.addItem("Otro...");
		comboBoxGenero.addItem("Hombre");
		comboBoxGenero.addItem("Mujer");
		panelDatosOpcionales2.add(comboBoxGenero);
		GroupLayout gl_panelDatosOpcionales = new GroupLayout(panelDatosOpcionales);
		gl_panelDatosOpcionales.setHorizontalGroup(
			gl_panelDatosOpcionales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatosOpcionales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDatosOpcionales.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDatos2, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(panelDatosOpcionales2, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelDatosOpcionales.setVerticalGroup(
			gl_panelDatosOpcionales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatosOpcionales.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelDatos2, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelDatosOpcionales2, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
					.addGap(7))
		);
		
		lblFechaNac = new JLabel("Fecha Nacimiento");
		lblFechaNac.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatosOpcionales2.add(lblFechaNac);
		
		textFecha = new JTextField();
		textFecha.setHorizontalAlignment(SwingConstants.CENTER);
		textFecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textFecha.setText("");
			}
		});
		textFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textFecha.setText("yyyy/mm/dd");
		panelDatosOpcionales2.add(textFecha);
		textFecha.setColumns(10);
		panelDatosOpcionales.setLayout(gl_panelDatosOpcionales);
		
		panelTexto = new JPanel();
		panelTexto.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		
		panelDatos = new JPanel();
		panelDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_panelDatosObligatorios = new GroupLayout(panelDatosObligatorios);
		gl_panelDatosObligatorios.setHorizontalGroup(
			gl_panelDatosObligatorios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatosObligatorios.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDatosObligatorios.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDatos, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(panelTexto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelDatosObligatorios.setVerticalGroup(
			gl_panelDatosObligatorios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDatosObligatorios.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelTexto, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelDatos, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
					.addGap(7))
		);
		panelDatos.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNombre = new JLabel("Nombre de Usuario:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textNombre);
		textNombre.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(textEmail);
		textEmail.setColumns(10);
		
		lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblContrasena);
		
		passwordContrasena = new JPasswordField();
		passwordContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		passwordContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(passwordContrasena);
		
		lblRepetirContraseña = new JLabel("Repetir Contrase\u00F1a:");
		lblRepetirContraseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRepetirContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(lblRepetirContraseña);
		
		passwordRepetirContrasena = new JPasswordField();
		passwordRepetirContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordRepetirContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		panelDatos.add(passwordRepetirContrasena);
		
		lblDatosObligatorios = new JLabel("Datos Obligatorios:");
		lblDatosObligatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosObligatorios.setForeground(Color.RED);
		lblDatosObligatorios.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panelTexto = new GroupLayout(panelTexto);
		gl_panelTexto.setHorizontalGroup(
			gl_panelTexto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTexto.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDatosObligatorios, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelTexto.setVerticalGroup(
			gl_panelTexto.createParallelGroup(Alignment.LEADING)
				.addComponent(lblDatosObligatorios, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		panelTexto.setLayout(gl_panelTexto);
		panelDatosObligatorios.setLayout(gl_panelDatosObligatorios);
		contentPane.setLayout(gl_contentPane);
	}
	
	public boolean comprobarFecha(String fecha)
	{
		fecha=fecha.replace("/", "");
		
		if (fecha.length()<8 || fecha.length()>8)
		{
			return false;
		}
		
		for (int cont=0; cont<fecha.length(); cont++)
		{
			if (Character.isLetter(fecha.charAt(cont)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public boolean comprobarPassword(String pw1, String pw2)
	{
		if (pw1.equals(pw2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean comprobarEmail(String email)
	{
		int arroba=0;
		int dominio=0;
		int posarroba=0;
		
		for (int cont=0; cont<email.length(); cont++)
		{
			if (cont!=0 && email.charAt(cont)=='@')
			{
				arroba++;
				posarroba=cont;
			}
			
			if (arroba==1 && email.charAt(cont)=='.' && cont>(posarroba+1))
			{
				dominio++;
			}
		}
		
		if (arroba==1 && dominio==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
