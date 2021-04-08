package Teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Modelo.Usuario;

public class ObterUsuarios {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	
	//string sql
	String jpql = "select u from Usuario u";
	//criando query
	TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
   // maximo de resultados 5
	query.setMaxResults(5);
    List<Usuario> usuarios = query.getResultList();
    for(Usuario usuario: usuarios) {
    	System.out.println("ID: " + usuario.getId() + 
    			" E-mail: "+ usuario.getEmail());
    }
    em.close();
    emf.close();
}
}
