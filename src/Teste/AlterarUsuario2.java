package Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Usuario;

public class AlterarUsuario2 {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
	
	Usuario usuario = em.find(Usuario.class, 1l);
	usuario.setNome("daniel");
	usuario.setEmail("daniel@123");
	//mesmo com o merge comentado ele executa pois esta dentro do contexto transacional
	//alguns dados são atualizados automaticamente conforme as execuções, devido ao contexto transacional
	
	//em.merge(usuario);
	em.getTransaction().commit();
	em.close();
	emf.close();
}
}
