package br.com.cursoalgaworks.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.cursoalgaworks.model.Produto;

public class ProdutoTeste {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidosVendasPU");
	EntityManager manager = factory.createEntityManager();
	
	EntityTransaction trx = manager.getTransaction();
	trx.begin();
	
	Produto produto = new Produto();
	produto.set;
	
	trx.

}
