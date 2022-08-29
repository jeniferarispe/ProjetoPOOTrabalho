package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnection;
import model.Categoria;
import model.Produto;

public class ClasseDAO {
	
	public Connection connection;

	public ClasseDAO() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Categoria categoria) {
		try {
			String sql = "INSERT INTO categoria(nome_categoria) VALUES (?)";
			PreparedStatement statement = connection.prepareStatement(sql);


			statement.setString(1, categoria.getNome_categoria());	
	

			statement.execute();
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public List<Categoria> listar() throws SQLException {
		List<Categoria> list = new ArrayList<Categoria>();

		String sql = "SELECT * FROM categoria";

		PreparedStatement statement = connection.prepareStatement(sql);
try {
	
	ResultSet resultado = statement.executeQuery();
	while (resultado.next()) {
		Categoria categoria = new Categoria();
		categoria.setId_categoria(resultado.getInt("id_categoria"));
		categoria.setNome_categoria(resultado.getString("nome_categoria"));
		list.add(categoria);
		
	}
}catch (SQLException e) {
	
	list=null;
}
return list;
	


		
		
	}
	
	public void salvarProduto(Produto produto) {
		try {
			String sql = "INSERT INTO produto(nome_produto,valor_produto,id_categoria) VALUES (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);


			statement.setString(1, produto.getNome_produto());	
			statement.setFloat(2, produto.getValor_produto());	
		
	

			statement.execute();
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
}
