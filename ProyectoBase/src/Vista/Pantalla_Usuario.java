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
import modelo.Idioma;

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
import javax.swing.JOptionPane;
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
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JMenuItem;

public class Pantalla_Usuario extends JFrame {
	
	Idioma idio = new Idioma();

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
	private JPanel btnActuEmail;
	private JTextField textUser;
	private JTextField textNombre;
	private JTextField textApell;
	private JTextField textEmail;
	private JButton btnEditarUser;
	private JButton btnEditarNombre;
	private JButton btnEditarApell;
	private JButton btnEditarEmail;
	private JButton btnActualizarUser;
	private JButton btnActuNombre;
	private JButton btnActuApell;
	private JButton btnActuGenero;
	private JButton button_3;
	private JButton btnEditGenero;
	private JMenuItem mntmMenuPrincipal;

	public Pantalla_Usuario(Controlador c1) {
		
		setTitle("REVIEWX");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pantalla_Usuario.class.getResource("/assets/ico.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 621);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNombreUsuario = new JMenu("Nombre de Usuario");
		mnNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnNombreUsuario);
		
		mntmMenuPrincipal = new JMenuItem("Menu principal");
		mntmMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaBusqueda pb=new PantallaBusqueda(c1);
				pb.setVisible(true);
				
				dispose();
			}
		});
		mnNombreUsuario.add(mntmMenuPrincipal);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(38, 38, 38));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		mnNombreUsuario.add("Perfil");
		mnNombreUsuario.add("Configuración");
		mnNombreUsuario.add("Salir...");
		
		panelBiografia = new JPanel();
		panelBiografia.setBackground(new Color(38, 38, 38));
		panelBiografia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelComentarios = new JPanel();
		panelComentarios.setBackground(new Color(38, 38, 38));
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
		panelPublicaciones.setBackground(new Color(38, 38, 38));
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
		
		lblUltimasPublicaciones = new JLabel(idio.traduz("latest_posts"));
		lblUltimasPublicaciones.setForeground(Color.WHITE);
		lblUltimasPublicaciones.setBackground(new Color(38, 38, 38));
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
		panelDatos.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnActuEmail = new JPanel();
		btnActuEmail.setBackground(new Color(38, 38, 38));
		GridBagLayout gbl_btnActuEmail = new GridBagLayout();
		gbl_btnActuEmail.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_btnActuEmail.rowHeights = new int[]{33, 33, 33, 33, 33, 0};
		gbl_btnActuEmail.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_btnActuEmail.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		btnActuEmail.setLayout(gbl_btnActuEmail);
		
		JLabel lblNombreUsuario = new JLabel(idio.traduz("user_name2"));
		lblNombreUsuario.setForeground(Color.WHITE);
		lblNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombreUsuario = new GridBagConstraints();
		gbc_lblNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreUsuario.gridx = 4;
		gbc_lblNombreUsuario.gridy = 0;
		btnActuEmail.add(lblNombreUsuario, gbc_lblNombreUsuario);
		
		textUser = new JTextField();
		textUser.setEditable(false);
		GridBagConstraints gbc_textUser = new GridBagConstraints();
		gbc_textUser.gridwidth = 3;
		gbc_textUser.insets = new Insets(0, 0, 5, 5);
		gbc_textUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUser.gridx = 9;
		gbc_textUser.gridy = 0;
		btnActuEmail.add(textUser, gbc_textUser);
		textUser.setColumns(10);
		
		btnEditarUser = new JButton(idio.traduz("button_edit"));
		btnEditarUser.setBackground(Color.WHITE);
		btnEditarUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textUser.isEditable())
				{
					textUser.setEditable(false);
				}
				else
				{
					textUser.setEditable(true);
				}
			}
		});
		GridBagConstraints gbc_btnEditarUser = new GridBagConstraints();
		gbc_btnEditarUser.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarUser.gridx = 13;
		gbc_btnEditarUser.gridy = 0;
		btnActuEmail.add(btnEditarUser, gbc_btnEditarUser);
		
		btnActualizarUser = new JButton(idio.traduz("buton_update"));
		btnActualizarUser.setBackground(Color.WHITE);
		btnActualizarUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.actualizarAlias(textUser.getText());
			}
		});
		GridBagConstraints gbc_btnActualizarUser = new GridBagConstraints();
		gbc_btnActualizarUser.insets = new Insets(0, 0, 5, 0);
		gbc_btnActualizarUser.gridx = 14;
		gbc_btnActualizarUser.gridy = 0;
		btnActuEmail.add(btnActualizarUser, gbc_btnActualizarUser);
		
		JLabel lblNombreReal = new JLabel(idio.traduz("real_name"));
		lblNombreReal.setForeground(Color.WHITE);
		lblNombreReal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombreReal = new GridBagConstraints();
		gbc_lblNombreReal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreReal.gridx = 4;
		gbc_lblNombreReal.gridy = 1;
		btnActuEmail.add(lblNombreReal, gbc_lblNombreReal);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 3;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 9;
		gbc_textNombre.gridy = 1;
		btnActuEmail.add(textNombre, gbc_textNombre);
		
		btnEditarNombre = new JButton(idio.traduz("button_edit"));
		btnEditarNombre.setBackground(Color.WHITE);
		btnEditarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNombre.isEditable())
				{
					textNombre.setEditable(false);
				}
				else
				{
					textNombre.setEditable(true);
				}
			}
		});
		GridBagConstraints gbc_btnEditarNombre = new GridBagConstraints();
		gbc_btnEditarNombre.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarNombre.gridx = 13;
		gbc_btnEditarNombre.gridy = 1;
		btnActuEmail.add(btnEditarNombre, gbc_btnEditarNombre);
		
		btnActuNombre = new JButton(idio.traduz("buton_update"));
		btnActuNombre.setBackground(Color.WHITE);
		btnActuNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.actualizarNombre(textNombre.getText());
			}
		});
		GridBagConstraints gbc_btnActuNombre = new GridBagConstraints();
		gbc_btnActuNombre.insets = new Insets(0, 0, 5, 0);
		gbc_btnActuNombre.gridx = 14;
		gbc_btnActuNombre.gridy = 1;
		btnActuEmail.add(btnActuNombre, gbc_btnActuNombre);
		
		JLabel lblApellido = new JLabel(idio.traduz("last_name"));
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 4;
		gbc_lblApellido.gridy = 2;
		btnActuEmail.add(lblApellido, gbc_lblApellido);
		
		textApell = new JTextField();
		textApell.setEditable(false);
		textApell.setColumns(10);
		GridBagConstraints gbc_textApell = new GridBagConstraints();
		gbc_textApell.gridwidth = 3;
		gbc_textApell.insets = new Insets(0, 0, 5, 5);
		gbc_textApell.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApell.gridx = 9;
		gbc_textApell.gridy = 2;
		btnActuEmail.add(textApell, gbc_textApell);
		
		btnEditarApell = new JButton(idio.traduz("button_edit"));
		btnEditarApell.setBackground(Color.WHITE);
		btnEditarApell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textApell.isEditable())
				{
					textApell.setEditable(false);
				}
				else
				{
					textApell.setEditable(true);
				}
			}
		});
		GridBagConstraints gbc_btnEditarApell = new GridBagConstraints();
		gbc_btnEditarApell.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarApell.gridx = 13;
		gbc_btnEditarApell.gridy = 2;
		btnActuEmail.add(btnEditarApell, gbc_btnEditarApell);
		
		btnActuApell = new JButton(idio.traduz("buton_update"));
		btnActuApell.setBackground(Color.WHITE);
		btnActuApell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.actualizarApellido(textApell.getText());
			}
		});
		GridBagConstraints gbc_btnActuApell = new GridBagConstraints();
		gbc_btnActuApell.insets = new Insets(0, 0, 5, 0);
		gbc_btnActuApell.gridx = 14;
		gbc_btnActuApell.gridy = 2;
		btnActuEmail.add(btnActuApell, gbc_btnActuApell);
		
		JLabel lblGnero = new JLabel(idio.traduz("gender"));
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 4;
		gbc_lblGnero.gridy = 3;
		btnActuEmail.add(lblGnero, gbc_lblGnero);
		
		JComboBox comboGenero = new JComboBox();
		GridBagConstraints gbc_comboGenero = new GridBagConstraints();
		gbc_comboGenero.gridwidth = 3;
		gbc_comboGenero.insets = new Insets(0, 0, 5, 5);
		gbc_comboGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboGenero.gridx = 9;
		gbc_comboGenero.gridy = 3;
		btnActuEmail.add(comboGenero, gbc_comboGenero);
		GridBagConstraints gbc_btnEditarGenero = new GridBagConstraints();
		gbc_btnEditarGenero.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarGenero.gridx = 13;
		gbc_btnEditarGenero.gridy = 3;
		comboGenero.setEditable(false);
		comboGenero.setEnabled(false);
		
		comboGenero.addItem(idio.traduz("male"));
		comboGenero.addItem(idio.traduz("female"));
		
		btnEditGenero = new JButton(idio.traduz("button_edit"));
		btnEditGenero.setBackground(Color.WHITE);
		btnEditGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboGenero.isEnabled())
				{
					comboGenero.setEnabled(false);
				}
				else
				{
					comboGenero.setEnabled(true);
				}
			}
		});
		GridBagConstraints gbc_btnEditGenero = new GridBagConstraints();
		gbc_btnEditGenero.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditGenero.gridx = 13;
		gbc_btnEditGenero.gridy = 3;
		btnActuEmail.add(btnEditGenero, gbc_btnEditGenero);
		
		btnActuGenero = new JButton(idio.traduz("buton_update"));
		btnActuGenero.setBackground(Color.WHITE);
		btnActuGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.actualizarGenero(sacarGenero(comboGenero.getSelectedItem().toString()));
			}
		});
		GridBagConstraints gbc_btnActuGenero = new GridBagConstraints();
		gbc_btnActuGenero.insets = new Insets(0, 0, 5, 0);
		gbc_btnActuGenero.gridx = 14;
		gbc_btnActuGenero.gridy = 3;
		btnActuEmail.add(btnActuGenero, gbc_btnActuGenero);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmail.gridx = 4;
		gbc_lblEmail.gridy = 4;
		btnActuEmail.add(lblEmail, gbc_lblEmail);
		panelDatos.add(btnActuEmail);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.gridwidth = 3;
		gbc_textEmail.insets = new Insets(0, 0, 0, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 9;
		gbc_textEmail.gridy = 4;
		btnActuEmail.add(textEmail, gbc_textEmail);
		panelBiografia.setLayout(gl_panelBiografia);
		
		contentPane.setLayout(gl_contentPane);
		
		btnEditarEmail = new JButton(idio.traduz("button_edit"));
		btnEditarEmail.setBackground(Color.WHITE);
		btnEditarEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textEmail.isEditable())
				{
					textEmail.setEditable(false);
				}
				else
				{
					textEmail.setEditable(true);
				}
			}
		});
		GridBagConstraints gbc_btnEditarEmail = new GridBagConstraints();
		gbc_btnEditarEmail.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditarEmail.gridx = 13;
		gbc_btnEditarEmail.gridy = 4;
		btnActuEmail.add(btnEditarEmail, gbc_btnEditarEmail);
		
		button_3 = new JButton(idio.traduz("buton_update"));
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comprobarEmail(textEmail.getText()))
				{
					c1.actualizarEmail(textEmail.getText());
				}
				else
				{
					JOptionPane.showMessageDialog(Pantalla_Usuario.this, "E-mail incorrecto, recuerde, nombre@dominio.es");
				}
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.gridx = 14;
		gbc_button_3.gridy = 4;
		btnActuEmail.add(button_3, gbc_button_3);
		
		c1.datosUser(textUser, textNombre, textApell, textEmail, comboGenero);
		c1.mostrarComentariosUser(textComentarios);
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
	
	public boolean sacarGenero(String genero) 
	{
		if (genero=="Hombre")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
