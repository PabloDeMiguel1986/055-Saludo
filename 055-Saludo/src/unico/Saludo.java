package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludo {

	private JFrame frmPrincipal;
	private JTextField txtIntro;
	private JButton btnSaludar;
	private JOptionPane optSaludo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludo window = new Saludo();
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Saludo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.setTitle("Saludador");
		frmPrincipal.setBounds(300, 300, 445, 245);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipal.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Escribe un nombre para saludar");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(96, 36, 235, 36);
		frmPrincipal.getContentPane().add(lblNombre);
		
		txtIntro = new JTextField();
		txtIntro.setBounds(96, 83, 235, 20);
		frmPrincipal.getContentPane().add(txtIntro);
		txtIntro.setColumns(10);
		
		JOptionPane optSaludo = new JOptionPane();
		
		btnSaludar = new JButton("!SALUDAR!");
		btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saludar();
			}
		});
		btnSaludar.setBounds(143, 141, 144, 36);
		frmPrincipal.getContentPane().add(btnSaludar);
	}
	private void saludar() {
		
		optSaludo.showMessageDialog(frmPrincipal,("¡Hola " + txtIntro.getText()+" !"),"Saludo",JOptionPane.INFORMATION_MESSAGE);
	}
	}

