package br.com.FSSInformatica.CadastroProdutos.Bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "listaProdutos")
public class ListaProdutosBean {

	private List<ProdutosBean> produtos;
	private ProdutosBean produtoSelecionado;

	public ListaProdutosBean() {
		produtos = new ArrayList<>();
		produtoSelecionado = new ProdutosBean();
	}

	public List<ProdutosBean> getProdutos() {
		return produtos;
	}
	
	public void Adicionar(ProdutosBean produto) {
		produtos.add(produto);
	}
	
	public void Remover(ProdutosBean produto) {
		produtos.remove(produto);
	}
	
	public String Selecionar(ProdutosBean produto) {
		produtoSelecionado = produto;
		
		return "detalhe";
	}

	public ProdutosBean getProdutoSelecionado() {
		return produtoSelecionado;
	}

}
