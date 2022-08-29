package model;

import java.util.List;

public class Produto {
	private int id_produto ;
	private String nome_produto;
	private float valor_produto;
	private List<Categoria> categorias;
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public float getValor_produto() {
		return valor_produto;
	}
	public void setValor_produto(float valor_produto) {
		this.valor_produto = valor_produto;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result + id_produto;
		result = prime * result + ((nome_produto == null) ? 0 : nome_produto.hashCode());
		result = prime * result + Float.floatToIntBits(valor_produto);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (id_produto != other.id_produto)
			return false;
		if (nome_produto == null) {
			if (other.nome_produto != null)
				return false;
		} else if (!nome_produto.equals(other.nome_produto))
			return false;
		if (Float.floatToIntBits(valor_produto) != Float.floatToIntBits(other.valor_produto))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Produto [id_produto=" + id_produto + ", nome_produto=" + nome_produto + ", valor_produto="
				+ valor_produto + ", categorias=" + categorias + "]";
	} 
	
}

