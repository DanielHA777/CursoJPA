package Teste.muitosPraMuitos;

import Infra.DAO;
import Modelo.muitosPraMuitos.Ator;
import Modelo.muitosPraMuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmeA = new Filme("star Wars ep4", 8.7);
		Filme filmeB = new Filme("O fugitivo", 8.2);
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizA = new Ator("Carrie Fisher");

		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizA);
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
	}
}
