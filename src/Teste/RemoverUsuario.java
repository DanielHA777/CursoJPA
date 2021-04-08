package Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Usuario;

public class RemoverUsuario {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	//faz a busca
	Usuario usuario = em.find(Usuario.class, 1l);
	//verifica se n é nulo
	if(usuario != null) {
		//inicia a transação
		em.getTransaction().begin();
		//remove o usuario
		em.remove(usuario);
		em.getTransaction().commit();
	}
	em.close();
	emf.close();
}
}
