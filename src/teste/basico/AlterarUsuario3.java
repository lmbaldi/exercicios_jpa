package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios_jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 6L);
		usuario.setNome("Carlos Lacerda");
		
		 
		
		//nao gera update, objeto associado a um estado sem gerenciamento
		em.detach(usuario);
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
/*
 * obs:
 * quando um objeto criado com dados vindos do front end, ainda estara no estado
 * nao gerenciavel  
 */
