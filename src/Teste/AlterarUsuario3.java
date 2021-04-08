package Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Usuario;

public class AlterarUsuario3 {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
	
	Usuario usuario = em.find(Usuario.class, 1l);
	
	usuario.setNome("daniel");
	usuario.setEmail("daniel@123");
	
	em.detach(usuario); // sai do contexto transacional
	em.merge(usuario);
	em.getTransaction().commit();
	em.close();
	emf.close();
}
}
