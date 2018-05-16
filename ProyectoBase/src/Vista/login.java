package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class login extends JFrame {

	private JPanel contLogo;
	private JTextField campEmail;
	private JTextField campoPassword;
	private JLabel logo;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JButton btnIniciarSesion;
	private JButton btnRecuperarContr;
	private JButton btnNuevoUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Nombre generico de Aplicacion #4578");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contLogo = new JPanel();
		contLogo.setBorder(new EmptyBorder(5, 5, 5, 5));
		contLogo.setLayout(new BorderLayout(0, 0));
		setContentPane(contLogo);
		
		logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("E:\\Florida\\PI\\TEST.png"));
		contLogo.add(logo, BorderLayout.NORTH);
		
		JPanel contCampos = new JPanel();
		contLogo.add(contCampos, BorderLayout.CENTER);
		GridBagLayout gbl_contCampos = new GridBagLayout();
		gbl_contCampos.columnWidths = new int[]{186, 254, 254, 0};
		gbl_contCampos.rowHeights = new int[]{36, 14, 20, 20, 14, 20, 20, 2, 23, 20, 23, 2, 0};
		gbl_contCampos.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contCampos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contCampos.setLayout(gbl_contCampos);
		
		lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.NORTH;
		gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 1;
		contCampos.add(lblEmail, gbc_lblEmail);
		
		campEmail = new JTextField();
		GridBagConstraints gbc_campEmail = new GridBagConstraints();
		gbc_campEmail.anchor = GridBagConstraints.NORTH;
		gbc_campEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_campEmail.insets = new Insets(0, 0, 5, 0);
		gbc_campEmail.gridwidth = 2;
		gbc_campEmail.gridx = 1;
		gbc_campEmail.gridy = 2;
		contCampos.add(campEmail, gbc_campEmail);
		campEmail.setColumns(10);
		
		Component espacioEmailPassword = Box.createVerticalStrut(20);
		GridBagConstraints gbc_espacioEmailPassword = new GridBagConstraints();
		gbc_espacioEmailPassword.anchor = GridBagConstraints.NORTH;
		gbc_espacioEmailPassword.insets = new Insets(0, 0, 5, 5);
		gbc_espacioEmailPassword.gridx = 1;
		gbc_espacioEmailPassword.gridy = 3;
		contCampos.add(espacioEmailPassword, gbc_espacioEmailPassword);
		
		lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.NORTH;
		gbc_lblPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblPassword.gridwidth = 2;
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 4;
		contCampos.add(lblPassword, gbc_lblPassword);
		
		campoPassword = new JTextField();
		GridBagConstraints gbc_campoPassword = new GridBagConstraints();
		gbc_campoPassword.anchor = GridBagConstraints.NORTH;
		gbc_campoPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoPassword.insets = new Insets(0, 0, 5, 0);
		gbc_campoPassword.gridwidth = 2;
		gbc_campoPassword.gridx = 1;
		gbc_campoPassword.gridy = 5;
		contCampos.add(campoPassword, gbc_campoPassword);
		campoPassword.setColumns(10);
		
		Component espacioContrSeparador = Box.createVerticalStrut(20);
		GridBagConstraints gbc_espacioContrSeparador = new GridBagConstraints();
		gbc_espacioContrSeparador.anchor = GridBagConstraints.NORTH;
		gbc_espacioContrSeparador.insets = new Insets(0, 0, 5, 5);
		gbc_espacioContrSeparador.gridx = 1;
		gbc_espacioContrSeparador.gridy = 6;
		contCampos.add(espacioContrSeparador, gbc_espacioContrSeparador);
		
		JSeparator separadorCamposBotones = new JSeparator();
		separadorCamposBotones.setForeground(Color.BLACK);
		GridBagConstraints gbc_separadorCamposBotones = new GridBagConstraints();
		gbc_separadorCamposBotones.anchor = GridBagConstraints.NORTH;
		gbc_separadorCamposBotones.fill = GridBagConstraints.HORIZONTAL;
		gbc_separadorCamposBotones.insets = new Insets(0, 0, 5, 0);
		gbc_separadorCamposBotones.gridwidth = 2;
		gbc_separadorCamposBotones.gridx = 1;
		gbc_separadorCamposBotones.gridy = 7;
		contCampos.add(separadorCamposBotones, gbc_separadorCamposBotones);
		
		btnIniciarSesion = new JButton("Iniciar Sesion");
		GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
		gbc_btnIniciarSesion.anchor = GridBagConstraints.NORTH;
		gbc_btnIniciarSesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIniciarSesion.insets = new Insets(0, 0, 5, 0);
		gbc_btnIniciarSesion.gridwidth = 2;
		gbc_btnIniciarSesion.gridx = 1;
		gbc_btnIniciarSesion.gridy = 8;
		contCampos.add(btnIniciarSesion, gbc_btnIniciarSesion);
		
		Component espacioBotones = Box.createVerticalStrut(20);
		GridBagConstraints gbc_espacioBotones = new GridBagConstraints();
		gbc_espacioBotones.anchor = GridBagConstraints.NORTH;
		gbc_espacioBotones.insets = new Insets(0, 0, 5, 5);
		gbc_espacioBotones.gridx = 1;
		gbc_espacioBotones.gridy = 9;
		contCampos.add(espacioBotones, gbc_espacioBotones);
		
		btnRecuperarContr = new JButton("Recuperar Contrase\u00F1a");
		GridBagConstraints gbc_btnRecuperarContr = new GridBagConstraints();
		gbc_btnRecuperarContr.anchor = GridBagConstraints.NORTH;
		gbc_btnRecuperarContr.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRecuperarContr.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecuperarContr.gridx = 1;
		gbc_btnRecuperarContr.gridy = 10;
		contCampos.add(btnRecuperarContr, gbc_btnRecuperarContr);
		
		btnNuevoUsuario = new JButton("Nuevo Usuario");
		GridBagConstraints gbc_btnNuevoUsuario = new GridBagConstraints();
		gbc_btnNuevoUsuario.anchor = GridBagConstraints.NORTH;
		gbc_btnNuevoUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNuevoUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnNuevoUsuario.gridx = 2;
		gbc_btnNuevoUsuario.gridy = 10;
		contCampos.add(btnNuevoUsuario, gbc_btnNuevoUsuario);
		
		JSeparator separadorBotonesBorde = new JSeparator();
		separadorBotonesBorde.setForeground(Color.BLACK);
		GridBagConstraints gbc_separadorBotonesBorde = new GridBagConstraints();
		gbc_separadorBotonesBorde.anchor = GridBagConstraints.NORTH;
		gbc_separadorBotonesBorde.fill = GridBagConstraints.HORIZONTAL;
		gbc_separadorBotonesBorde.gridwidth = 2;
		gbc_separadorBotonesBorde.gridx = 1;
		gbc_separadorBotonesBorde.gridy = 11;
		contCampos.add(separadorBotonesBorde, gbc_separadorBotonesBorde);
	}

}
