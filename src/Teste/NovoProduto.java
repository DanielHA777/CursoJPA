package Teste;

import Infra.DAO;
import Modelo.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		Produto produto = new Produto(1, "monitor 23", 789.99);

		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fechar(); // salvando produto monitor
		System.out.println("ID do produto: " + produto.getId());
	}
}
