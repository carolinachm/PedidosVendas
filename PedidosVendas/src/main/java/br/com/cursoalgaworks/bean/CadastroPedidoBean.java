package br.com.cursoalgaworks.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import br.com.cursoalgaworks.model.Pedido;
import br.com.cursoalgaworks.service.NegocioException;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Pedido pedido;

	private List<Integer> itens;
	
	public CadastroPedidoBean() {
		pedido = new Pedido();
		itens = new ArrayList<>();
		itens.add(1);
	}
	
	public void salvar() {
		
	}

	public List<Integer> getItens() {
		return itens;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setItens(List<Integer> itens) {
		this.itens = itens;
	}
	
}