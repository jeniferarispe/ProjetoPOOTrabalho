package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.SQLException;
import java.util.List;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import dao.ClasseDAO;
import model.Categoria;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CadastroCategoria {

	private JFrame frame;
	private JTextField txtNomeCategoria;
	private JButton txtEnviar;
	private JTextField textField;
	private JTable tbDados;
	
;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCategoria window = new CadastroCategoria();
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
	public CadastroCategoria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome da Categoria:");
		lblNewLabel.setBounds(233, 52, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtNomeCategoria = new JTextField();
		txtNomeCategoria.setBounds(344, 49, 86, 20);
		frame.getContentPane().add(txtNomeCategoria);
		txtNomeCategoria.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(33, 78, 96, 23);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(293, 78, 110, 23);
		frame.getContentPane().add(btnListar);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			
				Categoria categoria = new Categoria();
					ClasseDAO classeDao = new ClasseDAO();
				categoria.setNome_categoria(txtNomeCategoria.getText());
                classeDao.salvar(categoria);
	
              //JOptionPane.showMessageDialog(null, "Acessou!");


				}

		});
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
					ClasseDAO classeDao = new ClasseDAO();
				

					List<Categoria> list;
					try {
						list = classeDao.listar();
						DefaultTableModel modelo = (DefaultTableModel) tbDados.getModel();

						modelo.setNumRows(0);

				

						
						for(Categoria categoria : list) {
							

						Object[] dados= {categoria.getId_categoria(),categoria.getNome_categoria()};
						modelo.addRow(dados);
						}

						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		}
					
		});
	
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNomeCategoria.setText(null);
			
			}
		});
		btnLimpar.setBounds(154, 80, 117, 25);
		frame.getContentPane().add(btnLimpar);
		
		JLabel lblNewLabel_1 = new JLabel("Id:");
		lblNewLabel_1.setBounds(33, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(98, 49, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 117, 370, 133);
		frame.getContentPane().add(scrollPane);
		
		tbDados = new JTable();
		tbDados.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Id", "Nome Categoria"
			}
		));
		scrollPane.setViewportView(tbDados);
	}
}
	
	




		
	

