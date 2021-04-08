package Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Usuario;

public class ObterUsuario {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	
	//fazendo busca no bd e pasando a classe como parametro
	Usuario usuario = em.find(Usuario.class, 1l);
	System.out.println(usuario.getNome());
	em.close();
	emf.close();
}
}
