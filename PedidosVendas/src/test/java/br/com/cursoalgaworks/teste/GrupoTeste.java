package br.com.cursoalgaworks.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.cursoalgaworks.model.Grupo;

public class GrupoTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidosVendasPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Grupo grupo = new Grupo();
		grupo.setNome("Grupo teste");
		grupo.setDescricao("dffdsfafd");
		
		manager.persist(grupo);
		
		trx.commit();
	}
}
