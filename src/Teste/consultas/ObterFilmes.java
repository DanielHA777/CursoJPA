package Teste.consultas;

import java.util.List;

import Infra.DAO;
import Modelo.muitosPraMuitos.Ator;
import Modelo.muitosPraMuitos.Filme;
// orm jpa mapinng file
// tag maping file deppoisde provider
//named query deppois tag query dentro dela a consulta
//nota é parametro na consulta
// join fetch f.atores por padrao buscar os atores na consulta

public class ObterFilmes {
public static void main(String[] args) {
	DAO<Filme> dao = new DAO<>(Filme.class); // passando a classe filme para o construtor
	List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5); // nome do parametro e valor

    for(Filme filme: filmes) {
    	System.out.println(filme.getNome() + " => " + filme.getNota());
    for(Ator ator: filme.getAtores()) {
    	System.out.println(ator.getNome());
    }
    }
} 
}
