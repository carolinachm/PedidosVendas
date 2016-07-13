package br.com.cursoalgaworks.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataCriacao;
	@NotNull
	@Column(columnDefinition= "text")
	private String observacao;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataEntrega;
	@NotNull
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal valorFrete;
	@NotNull
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal valorDesconto;
	@NotNull
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable= false)
	private StatusPedido status;
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(length = 10, nullable= false)
	private FormaPagamento formapagamento;
	@NotNull
	@ManyToOne
	@JoinColumn(nullable = false)
	private Usuario vendedor;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente cliente;
	@Embedded
	private EnderecoEntrega enderecoEntrega;
	@OneToMany(mappedBy="pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Long id, Date dataCriacao, String observacao,
			Date dataEntrega, BigDecimal valorFrete, BigDecimal valorDesconto,
			BigDecimal valorTotal, StatusPedido status,
			FormaPagamento formapagamento, Usuario vendedor, Cliente cliente,
			EnderecoEntrega enderecoEntrega, List<ItemPedido> itens) {
		super();
		this.id = id;
		this.dataCriacao = dataCriacao;
		this.observacao = observacao;
		this.dataEntrega = dataEntrega;
		this.valorFrete = valorFrete;
		this.valorDesconto = valorDesconto;
		this.valorTotal = valorTotal;
		this.status = status;
		this.formapagamento = formapagamento;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public FormaPagamento getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(FormaPagamento formapagamento) {
		this.formapagamento = formapagamento;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EnderecoEntrega getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}