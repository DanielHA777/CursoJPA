package Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Usuario;

public class NovoUsuario {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	Usuario novoUsuario = new Usuario("daniel", "Daniel@123");
    
	em.getTransaction().begin();
	em.persist(novoUsuario);
	em.getTransaction().commit();
	em.close();
	emf.close();
}
}
