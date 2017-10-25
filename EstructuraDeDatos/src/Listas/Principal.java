package Listas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel inicio;
	private JTextField id;
	private JTextField albun;
	private JTextField genero;
	private JTextField artista;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 462);
		inicio = new JPanel();
		inicio.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(inicio);
		inicio.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(45, 37, 46, 14);
		inicio.add(lblId);
		
		JLabel lblAlbun = new JLabel("Albun:");
		lblAlbun.setBounds(45, 72, 46, 14);
		inicio.add(lblAlbun);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(45, 109, 46, 14);
		inicio.add(lblGenero);
		
		JLabel lblArtista = new JLabel("Artista:");
		lblArtista.setBounds(45, 141, 46, 14);
		inicio.add(lblArtista);
		
		id = new JTextField();
		id.setBounds(95, 34, 86, 20);
		inicio.add(id);
		id.setColumns(10);
		
		albun = new JTextField();
		albun.setBounds(95, 69, 86, 20);
		inicio.add(albun);
		albun.setColumns(10);
		
		genero = new JTextField();
		genero.setBounds(95, 106, 86, 20);
		inicio.add(genero);
		genero.setColumns(10);
		
		artista = new JTextField();
		artista.setBounds(95, 138, 86, 20);
		inicio.add(artista);
		artista.setColumns(10);
		
		JButton btinicio = new JButton("Agregar al Inicio");
		btinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btinicio.setBounds(218, 85, 117, 29);
		inicio.add(btinicio);
		
		JButton btnfin = new JButton("Agregar al Final");
		btnfin.setBounds(373, 85, 131, 29);
		inicio.add(btnfin);
		
		textField = new JTextField();
		textField.setBounds(63, 196, 427, 123);
		inicio.add(textField);
		textField.setColumns(10);
		
		JButton btnimprimiri = new JButton("Imprimir De Inicio A Fin");
		btnimprimiri.setBounds(200, 330, 153, 29);
		inicio.add(btnimprimiri);
		
		JButton btnimprimirf = new JButton("Imprimir De Fin A Inicio");
		btnimprimirf.setBounds(200, 381, 153, 31);
		inicio.add(btnimprimirf);
	}
}
