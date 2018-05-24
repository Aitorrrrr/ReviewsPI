package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

import controlador.Controlador;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearReview extends JFrame {

	private JPanel contentPane;
	private JPanel panelTitulo;
	private JPanel panelCrearReview;
	private JLabel lblCrearNuevaReview;
	private JTextArea textReview;
	private JButton btnCrear;
	private JButton buttonReestablecer;
	private JScrollPane scrollPane;

	public CrearReview(Controlador c1) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panelTitulo = new JPanel();
		panelTitulo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		panelCrearReview = new JPanel();
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		buttonReestablecer = new JButton("Reestablecer");
		buttonReestablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textReview.setText("");
			}
		});
		buttonReestablecer.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelCrearReview, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
								.addComponent(panelTitulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
							.addGap(8))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(72)
							.addComponent(btnCrear, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(buttonReestablecer, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelTitulo, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelCrearReview, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonReestablecer, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(btnCrear, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
		);
		panelCrearReview.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane = new JScrollPane();
		panelCrearReview.add(scrollPane);
		
		textReview = new JTextArea();
		scrollPane.setViewportView(textReview);
		panelTitulo.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblCrearNuevaReview = new JLabel("Crear nueva Review");
		panelTitulo.add(lblCrearNuevaReview);
		lblCrearNuevaReview.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCrearNuevaReview.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.setLayout(gl_contentPane);
	}

}
