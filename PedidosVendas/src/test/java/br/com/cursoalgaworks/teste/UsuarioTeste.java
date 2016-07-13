package br.com.cursoalgaworks.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.cursoalgaworks.model.Grupo;
import br.com.cursoalgaworks.model.Usuario;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidosVendasPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Grupo grupo = manager.find(Grupo.class, 1L);
		
		Usuario vendedor = new Usuario();
		vendedor.setNome("Carolina");
		vendedor.setEmail("contato@contato.com.br");
		vendedor.setSenha("12345");
		
		vendedor.getGrupos().add(grupo);
		
		manager.persist(vendedor);
		
		trx.commit();
		
		
	}

}
