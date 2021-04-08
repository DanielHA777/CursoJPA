package Infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em; 
	private Class<E> classe;
	
	static { // bloco static para gerar a fabrica de conexao
		try {
			emf = Persistence.createEntityManagerFactory("JPA");
		}catch(Exception e) {
			//... logar-> log3
		}
	}
	public DAO() {
		//construtor padrao passando classe nula, depois pode trabalhar com generic
		this(null);
	}
	
	public DAO(Class<E> classe) { // classe como parametro
		this.classe = classe;
		em = emf.createEntityManager(); // iniciando o entittymanager no construtor
	}
	public DAO<E> AbrirT(){ // abrindo a transação
		em.getTransaction().begin();
		return this; // retorna o proprio dao
	}
	public DAO<E> FecharT(){ // fechando transação
		em.getTransaction().commit();;
		return this;
	}
	public DAO<E> incluir(E entidade){ // generic
		em.persist(entidade); // salva
		return this;
	}
	public DAO<E> incluirAtomico(E entidade){ // faz todos os anteriores
		return this.AbrirT().incluir(entidade).FecharT();
	}
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}
	
	public List<E> obterTodos(){
		return this.obterTodos(10,0);
	}
	
	public List<E> obterTodos(int qtd, int deslocamento ){
		if(classe == null) {
			throw new UnsupportedOperationException("classe nula");		
		}
		String jpql = "select e from " + classe.getName() + " e"; // busca pelo objeto e n tabela
	  TypedQuery<E> query = em.createQuery(jpql, classe); // vriando query
	  query.setMaxResults(qtd);
	  query.setFirstResult(deslocamento); // deslocando inicio da consulta
	  return query.getResultList(); // resultado
	}
	public List<E> consultar(String nomeConsulta, Object... params){ // parametro valor
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta,  classe);
		//for para setar os parametros
		for(int i = 0; i < params.length; i +=2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		return query.getResultList();
	}
	public E consultarUm(String nomeConsulta, Object... params) {
	List<E> lista = consultar(nomeConsulta, params);
	return lista.isEmpty() ? null : lista.get(0);
	}
	
	public void fechar() {
		em.close();
	}
}
