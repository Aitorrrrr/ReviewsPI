package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Idioma;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ElegirIdioma extends JFrame {

	private JPanel contentPane;
	Idioma idio;
	
	public ElegirIdioma() {
		this.idio=new Idioma();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ElegirIdioma.class.getResource("/assets/ico.png")));
		setTitle("REVIEWX");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 640);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(38, 38, 38));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(38, 38, 38));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(38, 38, 38));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(38, 38, 38));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel labelLogo = new JLabel("");
	      BufferedImage img = null;
	        try {
	            img = ImageIO.read(Login.class.getResource("/assets/logo.png"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        Image Dimg= img.getScaledInstance(580, 350, Image.SCALE_SMOOTH);
	        ImageIcon iIcon= new ImageIcon(Dimg);
	        labelLogo.setHorizontalAlignment(SwingConstants.CENTER);
	        labelLogo.setIcon(iIcon);
		panel_3.add(labelLogo);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(38, 38, 38));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(200, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setIcon(new ImageIcon(ElegirIdioma.class.getResource("/assets/eng.png")));
		lblEnglish.setForeground(Color.WHITE);
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				idio.langIng();
				Login log = new Login();
				log.setVisible(true);
				log.setExtendedState(log.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				ElegirIdioma.this.dispose();
			}
		});
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblChooseLenguage = new JLabel("Choose a Lenguage");
		lblChooseLenguage.setFont(new Font("Sylfaen", Font.BOLD, 27));
		lblChooseLenguage.setForeground(Color.WHITE);
		lblChooseLenguage.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblChooseLenguage);
		panel_1.add(lblEnglish);
		
		JLabel lblEspaol = new JLabel("Espa\u00F1ol");
		lblEspaol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				idio.langEsp();
				Login log = new Login();
				log.setVisible(true);
				log.setExtendedState(log.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				ElegirIdioma.this.dispose();
			}
		});
		lblEspaol.setIcon(new ImageIcon(ElegirIdioma.class.getResource("/assets/esp.png")));
		lblEspaol.setForeground(Color.WHITE);
		lblEspaol.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblEspaol);
		
		JLabel lblSeleccionaUnIdioma = new JLabel("Selecciona un Idioma");
		lblSeleccionaUnIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionaUnIdioma.setForeground(Color.WHITE);
		lblSeleccionaUnIdioma.setFont(new Font("Sylfaen", Font.BOLD, 27));
		panel_1.add(lblSeleccionaUnIdioma);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
	     
	}
}
