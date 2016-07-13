package br.com.cursoalgaworks.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.cursoalgaworks.model.Cliente;
import br.com.cursoalgaworks.model.Endereco;
import br.com.cursoalgaworks.model.TipoPessoa;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidosVendasPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Carolina Helena");
		cliente.setDocumentoFederal("1111111111111111");
		cliente.setTipo(TipoPessoa.FISICA);
		cliente.setEmail("contato@contato.com.br");
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua dos sonhos");
		endereco.setNumero("10");
		endereco.setUf("DF");
		endereco.setCidade("Brasilia");
		endereco.setComplemento("sonhos dos sonhos");
		endereco.setCliente(cliente);
		
		cliente.getEnderecos().add(endereco);
		
		manager.persist(cliente);
		
		trx.commit();
			
	}

}
