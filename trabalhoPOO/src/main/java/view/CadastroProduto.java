package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class CadastroProduto {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto window = new CadastroProduto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDaProduto = new JLabel("Nome da Produto:");
		lblNomeDaProduto.setBounds(210, 25, 96, 14);
		frame.getContentPane().add(lblNomeDaProduto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(321, 22, 86, 20);
		frame.getContentPane().add(textField);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(10, 51, 96, 23);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(270, 51, 110, 23);
		frame.getContentPane().add(btnListar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(131, 53, 117, 25);
		frame.getContentPane().add(btnLimpar);
		
		JLabel lblNewLabel_1 = new JLabel("Id:");
		lblNewLabel_1.setBounds(10, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(75, 22, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 370, 133);
		frame.getContentPane().add(scrollPane);
	}
}
