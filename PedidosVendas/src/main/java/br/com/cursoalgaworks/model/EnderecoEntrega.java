package br.com.cursoalgaworks.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Embeddable
public class EnderecoEntrega implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@NotBlank @Size(max = 150)
	@Column(length = 150, nullable=false)
	private String logradouro;
	@Size(max = 150)
	@Column(length = 150)
	private String complemento;
	@NotBlank @Size(max = 20)
	@Column(length = 20, nullable=false)
	private String numero;
	@Column(length = 50, nullable=false)
	@NotBlank @Size(max = 60)
	private String cidade;
	@NotBlank @Size(max = 60)
	@Column(length = 2, nullable=false)
	private String uf;
	@NotBlank @Size(max = 9)
	@Column(length = 11, nullable = false)
	private String cep;
	
	public EnderecoEntrega() {
		// TODO Auto-generated constructor stub
	}

	public EnderecoEntrega(String logradouro, String numero,
			String complemento, String cidade, String uf, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
