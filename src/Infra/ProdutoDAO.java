package Infra;

import Modelo.Produto;

public class ProdutoDAO extends DAO<Produto> { // resolvendo a entidade no momento de instanciar o produto
public ProdutoDAO() {
	super(Produto.class);
}
}
