package produtos.models;

import java.util.*;

public class Banco {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void add(Produto produto) {
		produto.setId(chaveSequencial++);
		lista.add(produto);
	}
	
	public List<Produto> getAll() {
		return Banco.lista;
	}
	
	public Produto getById(Integer id) {
		for(Produto produto : lista) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public void remove(Integer id) {
		Iterator<Produto> it = lista.iterator();
		
		while(it.hasNext()) {
			Produto produto = it.next();
			
			if(produto.getId() == id) {
				it.remove();
			}
		}
	}
	
	public void update(Produto produto) {
		Produto produtoItem = this.getById(produto.getId());
		
		produtoItem.setNome(produto.getNome());
		produtoItem.setDescricao(produto.getDescricao());
		produtoItem.setPrecoMaxComprado(produto.getPrecoMaxComprado());
		produtoItem.setQtdPrevistoMes(produto.getQtdPrevistoMes());
		produtoItem.setUnidadeCompra(produto.getUnidadeCompra());
		
	}
}
