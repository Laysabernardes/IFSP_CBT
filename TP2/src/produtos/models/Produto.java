package produtos.models;

/** @author João Paulo e Matheus Palinkas */

public class Produto {
	
	public Produto() {
	}
	
	public Produto(int id, String nome, int unidadeCompra, String descricao, double qtdPrevistoMes, double precoMaxComprado) {
		this.id = id;
		this.nome = nome;
		this.unidadeCompra = unidadeCompra;
		this.descricao = descricao;
		this.qtdPrevistoMes = qtdPrevistoMes;
		this.precoMaxComprado = precoMaxComprado;
	}
	
	private int id;
	private String nome;
	private int unidadeCompra;
	private String descricao;
	private double qtdPrevistoMes;
	private double precoMaxComprado;
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getUnidadeCompra() {
		return unidadeCompra;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPrecoMaxComprado() {
		return precoMaxComprado;
	}
	
	public double getQtdPrevistoMes() {
		return qtdPrevistoMes;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setUnidadeCompra(int unidadeCompra) {
		this.unidadeCompra = unidadeCompra;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPrecoMaxComprado(double precoMaxComprado) {
		this.precoMaxComprado = precoMaxComprado;
	}
	
	public void setQtdPrevistoMes(double qtdPrevistoMes) {
		this.qtdPrevistoMes = qtdPrevistoMes;
	}
}
